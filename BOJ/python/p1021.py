from collections import deque

N, M = map(int, input().split())
li = list(map(int, input().split()))
deque = deque([i for i in range(1, N+1)])
r = 0

for i in li:
    while True:
        if deque[0] == i:
            deque.popleft()
            break
        else:
            if deque.index(i) < len(deque) / 2:
                deque.rotate(-1)
                r += 1
            else:
                deque.rotate(1)
                r += 1

print(r)
