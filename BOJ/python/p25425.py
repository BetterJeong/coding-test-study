N, M, a, K = map(int, input().split())

if a-K >= N:
    print(N, end=' ')
else:
    print(a-K+1, end=' ')

if (a-K) % M == 0:
    print((a - K) // M + 1)
else:
    print((a - K) // M + 2)
