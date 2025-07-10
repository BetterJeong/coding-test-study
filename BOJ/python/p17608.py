N = int(input())
li = []

for i in range(N):
    li.append(int(input()))

m = li[N-1]
r = 1

for i in range(N-1, -1, -1):
    if li[i] > m:
        m = li[i]
        r += 1

print(r)
