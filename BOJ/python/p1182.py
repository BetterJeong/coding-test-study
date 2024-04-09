from itertools import combinations
import sys


N, S = map(int, sys.stdin.readline().split())
integer = list(map(int, sys.stdin.readline().rstrip().split()))
r = 0

for i in range(1, N+1):
    com = combinations(integer, i)
    for j in com:
        if sum(j) == S:
            r += 1

print(r)
