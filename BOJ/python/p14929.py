import sys

input = sys.stdin.readline
print = sys.stdout.write

N = int(input())
li = list(map(int, input().split()))
s = 0
r = 0

if N == 1:
    r = 0
else:
    for i in range(N-1):
        s += li[N-i-1]
        r += s * li[N-i-2]

print(str(r))
