N, M = map(int, input().split())
li = []
j = 0

for i in range(N+1):
    if i == 0:
        li.append([900000000,0])
        j = sum(map(int,input().split()))
    else:
        n = sum(map(int,input().split()))
        if j >= n:
            li.append([n, i])
        else:
            li.append([-1, i])

li.sort(reverse=True)

for i in range(M):
    if li[i][0] > 0:
        print(li[i][1],end=" ")