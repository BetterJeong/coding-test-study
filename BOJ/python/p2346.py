from collections import deque

n = int(input())
deque = deque(enumerate(map(int, input().split())))

while deque:
    i, d = deque.popleft()
    print(i+1, end=' ')
    if d > 0:
        deque.rotate(-(d-1))
    elif d < 0:
        deque.rotate(-d)
