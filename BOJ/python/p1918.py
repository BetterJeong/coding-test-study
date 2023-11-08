st = input()
stack = []
r = ''

for s in st:
    if s.isalpha():
        r += s
    else:
        if s == '(':
            stack.append(s)
        elif s == '*' or s == '/':
            while stack and (stack[-1] == '*' or stack[-1] == '/'):
                r += stack.pop()
            stack.append(s)
        elif s == '+' or s == '-':
            while stack and stack[-1] != '(':
                r += stack.pop()
            stack.append(s)
        elif s == ')':
            while stack and stack[-1] != '(':
                r += stack.pop()
            stack.pop()

while stack:
    r += stack.pop()

print(r)
