R, C = map(int, input().split())
matrix = [list(input()) for _ in range(R)]
A, B = map(int, input().split())

for i in range(R):
    matrix[i] += matrix[i][::-1]

for i in range(R-1, -1, -1):
    matrix.append(matrix[i][:])

matrix[A-1][B-1] = "." if matrix[A-1][B-1] == "#" else "#"

for i in range(R*2):
    print(''.join(matrix[i]))
