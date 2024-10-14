N, M = map(int, input().split())
matrix = [list(map(int, input().split())) for _ in range(N)]
K = int(input())

for _ in range(K):
    i, j, x, y = map(int, input().split())
    r = 0

    for k in range(1, N+1):
        for l in range(1, M+1):
            if i <= k <= x and j <= l <= y:
                r += matrix[k-1][l-1]

    print(r)
