N = int(input())
s = input()
stack = []
numbers = []

for _ in range(N):
    numbers.append(int(input()))

for i in range(len(s)):
    if s[i] == '+':
        stack.append(stack.pop() + stack.pop())
    elif s[i] == '-':
        a = stack.pop()
        b = stack.pop()
        stack.append(b - a)
    elif s[i] == '*':
        stack.append(stack.pop() * stack.pop())
    elif s[i] == '/':
        a = stack.pop()
        b = stack.pop()
        stack.append(b / a)
    else:
        stack.append(numbers[ord(s[i])-65])

print(format(stack.pop(), ".2f"))
