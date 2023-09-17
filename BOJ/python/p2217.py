import sys

input = sys.stdin.readline
print = sys.stdout.write

N = int(input())
li = [int(input()) for _ in range(N)]
li.sort(reverse=True)
r = li[0]

for i in range(N):
    r = max(r, li[i] * (i + 1))

print(str(r))
