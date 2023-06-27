import sys

input = sys.stdin.readline


def factorial(k):
    fact = 1
    for i in range(1, k+1):
        fact *= i
    return fact


def nCr(n, r):
    return int(factorial(n) / (factorial(r) * factorial(n - r)))


T = int(input().rstrip())

for i in range(T):
    n, m = map(int, input().rstrip().split())
    print(nCr(m, n))
