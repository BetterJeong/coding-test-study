N, L = map(int, input().split())
li = list(map(int, input().split()))
li.sort()

for i in range(N):
    if li[i] <= L:
        L += 1
    else:
        break

print(L)