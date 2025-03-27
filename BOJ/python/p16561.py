n = int(input())
r = 0

for i in range(3, n):
    for j in range(3, n-i):
        k = n - i - j

        if i % 3 == 0 and j % 3 == 0 and k % 3 == 0:
            r += 1

print(r)
