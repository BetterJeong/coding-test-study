T = int(input())

for _ in range(T):
    N = int(input())
    li = [int(input()) for _ in range(N)]
    n = 0
    r = 0
    b = False

    for _ in range(N):
        if n != N - 1:
            n = li[n] - 1
            r += 1
        else:
            b = True
            break

    print(r if b else 0)
