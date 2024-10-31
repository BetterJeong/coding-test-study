N = int(input())
li = [list(map(int, input().split())) for _ in range(N)]
r = 0
m = 0

for i in range(1000001):
    t = 0

    for j in li:
        if j[0] >= i and i - j[1] > 0:
            t += i - j[1]

    if m < t:
        r = i
        m = t

print(r)