from collections import deque

M, N = map(int, input().split())
storage = [list(map(int, input().split())) for _ in range(N)]
q = deque([])
result = 0
b = True
dx = [-1, 0, 1, 0]
dy = [0, -1, 0, 1]

for i in range(N):
    for j in range(M):
        if storage[i][j] == 1:
            q.append([i, j])

while q:
    xy = q.popleft()
    for i in range(4):
        nx = xy[1] + dx[i]
        ny = xy[0] + dy[i]
        if 0 <= nx < M and 0 <= ny < N:
            if storage[ny][nx] == 0:
                storage[ny][nx] = storage[xy[0]][xy[1]] + 1
                q.append([ny, nx])

for i in range(N):
    for j in range(M):
        if storage[i][j] == 0:
            b = False
        result = max(result, storage[i][j])

if b:
    print(result - 1)
else:
    print(-1)
