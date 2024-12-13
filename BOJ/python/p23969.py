N, K = map(int, input().split())
li = list(map(int, input().split()))
k = 0

for i in range(N):
    for j in range(1, N-i):
        if li[j] < li[j-1]:
            li[j], li[j-1] = li[j-1], li[j]
            k += 1
        if k == K:
            print(*li)
            exit()

print(-1)