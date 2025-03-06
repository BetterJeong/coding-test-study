N, L, H = map(int, input().split())
li = list(map(int, input().split()))

li.sort()
r = li[L:N-H]

print(sum(r)/len(r))
