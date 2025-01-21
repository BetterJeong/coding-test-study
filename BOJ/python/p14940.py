from collections import deque

Y, X = map(int, input().split())
matrix = []
visited = []
result = []
dx, dy = [-1, 0, 1, 0], [0, 1, 0, -1]
x, y = 0, 0
b = True

for i in range(Y):
    matrix.append(list(map(int, input().split())))
    visited.append([False for _ in range(X)])
    result.append([0 for _ in range(X)])

    if b:
        for j in range(X):
            if matrix[i][j] == 2:
                x = j
                y = i
                b = False
                break


def bfs(sx, sy):
    queue = deque()
    queue.append((sx, sy))
    visited[sy][sx] = True

    while queue:
        vx, vy = queue.popleft()

        for k in range(4):
            nx = vx + dx[k]
            ny = vy + dy[k]

            if 0 <= nx < X and 0 <= ny < Y and not visited[ny][nx]:
                if matrix[ny][nx] != 0:
                    result[ny][nx] = result[vy][vx] + 1
                    visited[ny][nx] = True
                    queue.append((nx, ny))


bfs(x, y)

for i in range(Y):
    for j in range(X):
        if result[i][j] == 0 and matrix[i][j] == 1:
            result[i][j] = -1
        print(result[i][j], end=" ")
    print()
