T = int(input())

for _ in range(T):
    N, M, k, D = map(int, input().split())
    b = 0

    while True:
        if M*(M-1)/2*N*k*(b+1) + M**2*N*(N-1)/2*(b+1) > D:
            break

        b += 1

    if b == 0:
        print(-1)
    else:
        print(int(M*(M-1)/2*N*k*b + M**2*N*(N-1)/2*b))
