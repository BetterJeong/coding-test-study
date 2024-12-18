N, M = map(int, input().split())
r = 0

for i in range(N):
    s = list(input())
    t = 0

    for j in range(M):
        if s[j] == "O":
            t += 1

    if t > M//2:
        r += 1

print(r)