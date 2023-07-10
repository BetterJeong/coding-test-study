import sys
sys.setrecursionlimit(100000)

dx = [0, 0, -1, 1]
dy = [-1, 1, 0, 0]

N = int(input())
painting = [list(input()) for _ in range(N)]
visited = [[False] * N for _ in range(N)]
weakness, none = 0, 0


def dfs(x, y):
    visited[x][y] = True
    color = painting[x][y]

    for d in range(4):
        nx = x + dx[d]
        ny = y + dy[d]
        if 0 <= nx < N and 0 <= ny < N:
            if not visited[nx][ny]:
                if painting[nx][ny] == color:
                    dfs(nx, ny)


for i in range(N):
    for j in range(N):
        if not visited[i][j]:
            dfs(i, j)
            none += 1

visited = [[False] * N for i in range(N)]
for i in range(N):
    for j in range(N):
        if painting[i][j] == 'R':
            painting[i][j] = 'G'

for i in range(N):
    for j in range(N):
        if not visited[i][j]:
            dfs(i, j)
            weakness += 1

print(none, weakness)
