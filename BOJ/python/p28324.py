N = int(input())
li = list(map(int, input().split()))
k = 1
r = 1

for i in range(N-2, -1, -1):
    if k < li[i]:
        k += 1
    else:
        k = li[i]
    r += k

print(r)
