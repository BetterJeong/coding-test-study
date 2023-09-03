H, W = map(int, input().split())
matrix = [[-1 for _ in range(W)] for _ in range(H)]
for i in range(H):
    s = input()
    exist_c = False
    c = -1
    for j in range(W):
        if s[j] == 'c':
            exist_c = True
            c = 0
            matrix[i][j] = 0
        elif exist_c:
            c += 1
            matrix[i][j] = c

for i in range(H):
    for j in range(W):
        print(matrix[i][j], end=' ')
    print()
