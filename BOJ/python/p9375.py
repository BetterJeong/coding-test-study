T = int(input())

for _ in range(T):
    n = int(input())
    k = dict()
    r = 1

    for i in range(n):
        a, b = input().split()

        if b in k:
            k[b] += 1
        else:
            k[b] = 2

    for w in k:
        r *= k[w]

    print(str(r-1))
