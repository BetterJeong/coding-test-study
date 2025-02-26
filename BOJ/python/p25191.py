N = int(input())
A, B = map(int, input().split())
k = A // 2 + B

print(min(N, k))
