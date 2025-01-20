import sys
sys.setrecursionlimit(1000000)

input = sys.stdin.readline
print = sys.stdout.write

Y, X = map(int, input().rstrip().split())
matrix = []
visited = []
dx = [1, 0, -1, 0]
dy = [0, 1, 0, -1]
ix, iy = 0, 0
r = 0
b = False

for i in range(Y):
    matrix.append(list(input().rstrip()))
    visited.append([False for j in range(X)])

    if not b:
        for j in range(X):
            if matrix[i][j] == "I":
                b = True
                ix = j
                iy = i
                break


def dfs(x, y):
    global r

    visited[y][x] = True
    if matrix[y][x] == "P":
        r += 1
    for k in range(4):
        nx = x + dx[k]
        ny = y + dy[k]

        if 0 <= nx < X and 0 <= ny < Y and not visited[ny][nx] and matrix[ny][nx] != "X":
            dfs(nx, ny)


dfs(ix, iy)

if r == 0:
    print("TT")
else:
    print(str(r))
