n = [0] * 68
n[0] = 1
n[1] = 1
n[2] = 2
n[3] = 4

for i in range(4, len(n)):
    n[i] = n[i-1] + n[i-2] + n[i-3] + n[i-4]

N = int(input())

for _ in range(N):
    k = int(input())
    print(n[k])