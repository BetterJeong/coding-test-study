N, M = map(int, input().split())
P = [list(map(int, input().split())) for _ in range(N)]
Q = [list(map(int, input().split())) for _ in range(M)]
m = 0

for i in Q:
    for j in P:
        t = 0

        for k in range(2):
            t += abs(i[k]-j[k])**2

        m = t if t > m else m

print(m)