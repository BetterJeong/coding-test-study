N, M = map(int, input().split())
book = list(map(int, input().split())) if N > 0 else []
now = 0
r = 0

if N > 0:
    r += 1

for i in range(N):
    if now + book[i] > M:
        now = book[i]
        r += 1
    else:
        now += book[i]

print(r)
