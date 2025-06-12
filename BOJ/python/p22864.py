A, B, C, M = map(int, input().split())
t = 0
p = 0

for i in range(24):
    if p + A > M:
        p = p - C if p - C > 0 else 0
    else:
        t += B
        p += A

print(t)
