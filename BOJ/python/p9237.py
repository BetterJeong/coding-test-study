N = int(input())
li = list(map(int, input().split()))
li.sort(reverse=True)

for i in range(N):
    li[i] -= (N - i - 1)

print(max(li)+N+1)