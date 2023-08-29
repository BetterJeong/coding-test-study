matrix = [[0] * 100 for _ in range(100 + 1)]
s = 0

for i in range(4):
    li = list(map(int, input().split()))
    for x in range(li[0], li[2]):
        for y in range(li[1], li[3]):
            if matrix[x][y] == 0:
                matrix[x][y] = 1
                s += 1

print(s)