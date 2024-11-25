N, K = map(int, input().split())
li = [[0, 0] for i in range(7)]
r = 0

for i in range(1, N+1):
    S, Y = map(int, input().split())
    li[Y][S] += 1

for i in range(1, 7):
    r += li[i][0] // K
    r += li[i][1] // K

    if li[i][0] % K != 0:
        r += 1
    if li[i][1] % K != 0:
        r += 1

print(r)