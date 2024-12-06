N, M = map(int, input().split())
li = []
r = 0

for i in range(N):
    li.append(list(map(int, input().split())))

for i in range(M):
    k = int(input())

    for j in range(N):
        if li[j][0] <= k:
            t = li[j][0]
            li[j][0] = li[j][1]
            li[j][1] = t

for i in range(N):
    r += li[i][0]

print(r)