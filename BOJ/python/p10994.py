import sys

dx = [1, 0, -1, 0]
dy = [0, 1, 0, -1]

N = int(sys.stdin.readline().rstrip())
matrix = [[" " for _ in range(N*4-3)] for _ in range(N*4-3)]
n = 0
i = int((N*4-3)/2)
matrix[i][i] = "*"

while i >= 0:
    x = i
    y = i

    if n % 2 == 0:
        for j in range(4):
            for k in range(n * 2):
                x += dx[j]
                y += dy[j]
                matrix[y][x] = "*"
    else:
        for j in range(4):
            for k in range(n * 2):
                x += dx[j]
                y += dy[j]
                matrix[y][x] = " "

    n += 1
    i -= 1

for m in matrix:
    print("".join(m))
