import math

n = int(input())
r = float('inf')
a = [0, 0, 0]

for i in range(1, int(math.sqrt(n)) + 1):
    for j in range(1, int(math.sqrt(n)) + 1):
        k = n // (i * j)

        if i * j * k == n:
            if r > (i * j + j * k + k * i):
                r = (i * j + j * k + k * i)
                a = [i, j, k]

print(*a)
