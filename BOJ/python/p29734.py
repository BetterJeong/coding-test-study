N, M = map(int, input().split())
T, S = map(int, input().split())

z = N + (N - 1) // 8 * S
d = M + (M - 1) // 8 * (S + 2 * T) + T

if z < d:
    print("Zip")
    print(z)
else:
    print("Dok")
    print(d)
