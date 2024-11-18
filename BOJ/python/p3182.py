N = int(input())
li = [0]
m = 0
k = 0

for i in range(1, N+1):
    li.append(int(input()))

for i in range(1, N+1):
    b = [False] * (N+1)
    b[i] = True
    n = i
    c = 0

    for j in range(1, N+1):
        b[li[n]] = True
        n = li[n]

    for j in range(1, N+1):
        if b[j]:
            c += 1

    if m < c:
        m = c
        k = i

print(k)