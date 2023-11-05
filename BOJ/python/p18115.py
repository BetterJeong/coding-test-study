from collections import deque

n = int(input())
li = deque([i for i in range(1, n+1)])
A = list(map(int, input().split()))
r = deque()

li.reverse()
A.reverse()

for a in A:
    if a == 1:
        r.append(li.pop())
    if a == 2:
        r.rotate(1)
        r.append(li.pop())
        r.rotate(-1)
    if a == 3:
        r.appendleft(li.pop())

r.reverse()
print(*r)
