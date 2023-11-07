st = input()
stack = []
tmp = 1
r = 0

for i in range(len(st)):
    s = st[i]

    if s == '(':
        tmp *= 2
        stack.append(s)
    elif s == '[':
        tmp *= 3
        stack.append(s)
    elif s == ')':
        if not stack or stack[-1] == '[':
            r = 0
            break
        if st[i-1] == '(':
            r += tmp
        stack.pop()
        tmp //= 2
    else:
        if not stack or stack[-1] == '(':
            r = 0
            break
        if st[i - 1] == '[':
            r += tmp
        stack.pop()
        tmp //= 3

if stack:
    r = 0

print(r)
