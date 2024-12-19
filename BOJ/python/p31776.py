N = int(input())
r = 0

for i in range(N):
    li = list(map(int, input().split()))

    for j in range(3):
        if li[j] == -1:
            li[j] = 1000

    if li[0] != 1000 and li[0] <= li[1] <= li[2]:
        r += 1

print(r)