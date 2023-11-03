n = int(input())
r = 0

for _ in range(n):
    li = list(input())
    stack = []
    for s in li:
        if len(stack) == 0 or stack[-1] != s:
            stack.append(s)
        else:
            stack.pop()
    if len(stack) == 0:
        r += 1

print(r)
