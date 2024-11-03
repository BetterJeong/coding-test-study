N, M = map(int, input().split())
r = [[-1, -1] for _ in range(N)]
sr = 0
br = 0

for i in range(M):
    a, b, c = map(str, input().split())
    a = int(a)
    c = int(c)

    if b == 'P':
        r[a-1][0] = c
    else:
        r[a-1][1] = c

for i in range(N):
    if not r[i][0] == 0 and not r[i][1] == 1:
        br += 1
        if r[i][0] == 1 and r[i][1] == 0:
            sr += 1

print(sr, br)