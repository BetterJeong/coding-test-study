N, M = map(int, input().split())
r = 0
n = list(map(int, input().split()))
m = list(map(int, input().split()))

for i in range(M):
    if i < N:
        r = max(m[i] - n[i], r)
    else:
        r = max(r, m[i])

print(r)