T = int(input())

for _ in range(T):
    N = int(input())
    li = [25, 10, 5, 1]
    r = []

    for i in range(len(li)):
        r.append(int(N / li[i]))
        N %= li[i]

    print(*r)