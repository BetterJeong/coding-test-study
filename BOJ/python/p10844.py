N = int(input())
matrix = [[0 for _ in range(10)] for _ in range(101)]

matrix[1][0] = 0
matrix[1][1] = 1
matrix[1][2] = 1
matrix[1][3] = 1
matrix[1][4] = 1
matrix[1][5] = 1
matrix[1][6] = 1
matrix[1][7] = 1
matrix[1][8] = 1
matrix[1][9] = 1

for i in range(2, 101):
    matrix[i][0] = matrix[i-1][1]
    for j in range(1, 9):
        matrix[i][j] = matrix[i-1][j-1] + matrix[i-1][j+1]
    matrix[i][9] = matrix[i-1][8]


print(sum(matrix[N]) % 1000000000)
