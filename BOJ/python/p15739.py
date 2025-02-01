N = int(input())
matrix = [list(map(int, input().split())) for _ in range(N)]
b = True
s = N * (N**2 + 1) // 2
ld = []
rd = []

for i in range(N):
    if matrix[i][i] in ld:
        b = False
        break

    if matrix[i][N-i-1] in rd:
        b = False
        break

    ld.append(matrix[i][i])
    rd.append(matrix[i][N-i-1])

if b:
    if sum(ld) != s or sum(rd) != s:
        b = False

if b:
    for i in range(N):
        if not b:
            break

        r = []
        c = []

        for j in range(N):
            if matrix[i][j] in r:
                b = False
                break
            else:
                r.append(matrix[i][j])

            if matrix[j][i] in c:
                b = False
                break
            else:
                c.append(matrix[j][i])

        if sum(r) != s or sum(c) != s:
            b = False

if b:
    print("TRUE")
else:
    print("FALSE")
