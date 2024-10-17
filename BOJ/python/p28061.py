N = int(input())
li = list(map(int, input().split()))
r = 0

for i in range(N):
    t = li[i] - (N-i)
    if r < t:
        r = t

print(r)
