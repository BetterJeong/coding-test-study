N = int(input())
li = list(map(int, input().split()))
stack = []
r = []

for i in range(N):
    while stack:
        if stack[-1][1] > li[i]:
            r.append(stack[-1][0] + 1)
            break
        else:
            stack.pop()
    if len(stack) == 0:
        r.append(0)
    stack.append([i, li[i]])

print(*r)
