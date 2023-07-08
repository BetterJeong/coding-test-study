from collections import deque
import sys

input = sys.stdin.readline
print = sys.stdout.write

M, N, H = map(int, input().rstrip().split())
storage = [[list(map(int, input().rstrip().split())) for _ in range(N)] for _ in range(H)]
q = deque([])
result = 0
b = True
dx = [-1, 1, 0, 0, 0, 0]
dy = [0, 0, -1, 1, 0, 0]
dz = [0, 0, 0, 0, -1, 1]

for i in range(H):
    for j in range(N):
        for k in range(M):
            if storage[i][j][k] == 1:
                q.append([i, j, k])

while q:
    xyz = q.popleft()
    for i in range(6):
        nx = xyz[2] + dx[i]
        ny = xyz[1] + dy[i]
        nz = xyz[0] + dz[i]
        if 0 <= nx < M and 0 <= ny < N and 0 <= nz < H:
            if storage[nz][ny][nx] == 0:
                storage[nz][ny][nx] = storage[xyz[0]][xyz[1]][xyz[2]] + 1
                q.append([nz, ny, nx])

for i in range(H):
    for j in range(N):
        for k in range(M):
            if storage[i][j][k] == 0:
                b = False
            result = max(result, storage[i][j][k])

if b:
    print(str(result - 1))
else:
    print(str(-1))
