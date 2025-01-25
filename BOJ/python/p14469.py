N = int(input())
li = [list(map(int, input().split())) for _ in range(N)]
r = 0

li.sort()

for i in range(N):
    if r < li[i][0]:
        r = li[i][0]

    r += li[i][1]

print(r)
