N = int(input())
li = list(map(int, input().split()))
r = []

for i in range(N):
    k = 0
    for j in range(i+1, N):
        if li[i] < li[j]:
            break
        else:
            k += 1
    r.append(k)

print(max(r))
