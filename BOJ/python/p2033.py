import math

n = int(input())
k = 10

while n > k:
    n = math.floor(n/k + 0.5) * k
    k *= 10

print(n)
