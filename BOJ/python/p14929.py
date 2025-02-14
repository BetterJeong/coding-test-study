import sys

input = sys.stdin.readline
print = sys.stdout.write

N = int(input())
li = list(map(int, input().split()))
s = [li[N-1]]
r = 0

if N == 1:
    r = 0
else:
    for i in range(1, N - 1):
        s.append(s[i - 1] + li[N - i - 1])

    for i in range(len(s)):
        r += s[len(s) - i - 1] * li[i]

print(str(r))
