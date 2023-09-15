from collections import deque

N, K = map(int, input().split())
queue = deque()
a = 0

for i in range(1, N+1):
    queue.append(i)

print("<", end="")
while True:
    if a % K == K-1:
        if len(queue) == 1:
            print(queue.popleft(), end=">")
            break
        print(queue.popleft(), end=", ")
    else:
        queue.append(queue.popleft())
    a += 1
