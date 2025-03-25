import sys
import math

input = sys.stdin.readline
print = sys.stdout.write

T = int(input())

for i in range(T):
    N = input()

    n = int(N)
    rn = int(N[::-1])

    if n == math.isqrt(n) ** 2 and rn == math.isqrt(rn) ** 2:
        print("YES\n")
    else:
        print("NO\n")
