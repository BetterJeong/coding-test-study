import math

N = int(input())
a = sum(map(int, input().split()))
b = sum(map(int, input().split()))

k = math.gcd(a, b)

print(b//k, a//k)
