import sys

input = sys.stdin.readline

N, S = input().split()
N = int(N)
r = 0

for i in range(N):
    n, c = input().split()

    if S in n.split("_"):
        r += int(c)

print(r)
