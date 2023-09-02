N = int(input())
for _ in range(N):
    li = list(map(int, input().split()))
    li.sort(reverse=True)
    print(li[2])
