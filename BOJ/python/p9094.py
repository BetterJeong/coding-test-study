T = int(input())

for _ in range(T):
    n, m = map(int, input().split())
    r = 0

    for a in range(1, n):
        for b in range(a+1, n):
            if (a**2 + b**2 + m) % (a*b) == 0:
                r += 1

    print(r)
