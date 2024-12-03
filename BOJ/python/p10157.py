C, R = map(int, input().split())
K = int(input())
matrix = [[0 for _ in range(C)] for _ in range(R)]
x, y = 0, 0
dx = [1, 0, -1, 0]
dy = [0, 1, 0, -1]
c = 0

if K > C*R:
    print(0)
else:
    for i in range(1, K):
        matrix[x][y] = 1
        nx = x + dx[c]
        ny = y + dy[c]

        if R > nx >= 0 == matrix[nx][ny] and 0 <= ny < C:
            x = nx
            y = ny
        else:
            c = (c + 1) % 4
            x += dx[c]
            y += dy[c]

    print(x + 1, y + 1)

