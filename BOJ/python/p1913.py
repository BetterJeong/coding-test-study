import sys

dx = [0, 1, 0, -1]
dy = [-1, 0, 1, 0]

N = int(sys.stdin.readline().rstrip())
K = int(sys.stdin.readline().rstrip())

x = int((N - 1) / 2)
y = int((N - 1) / 2)
result = [y+1, x+1]

matrix = [[0 for j in range(N)] for i in range(N)]
matrix[y][x] = 1
idx = 1
n = -1
m = 0
p = 0

while idx < N*N:
    m += 1

    for _ in range(0, 2):
        n += 1
        for _ in range(0, m):
            if idx >= N*N:
                break

            idx += 1

            x = x + dx[n % 4]
            y = y + dy[n % 4]
            matrix[y][x] = idx

            if idx == K:
                result = [y+1, x+1]

for i in matrix:
    print(*i)

print(*result)
