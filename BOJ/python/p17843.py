T = int(input())

for _ in range(T):
    h, m, s = map(int, input().split())

    rs = s * 6
    rm = m * 6 + s * 0.1
    rh = h * 30 + m * 0.5 + s * (1 / 120)

    d1 = abs(rh - rm)
    d2 = abs(rm - rs)
    d3 = abs(rh - rs)

    r = min(d1, 360 - d1, d2, 360 - d2, d3, 360 - d3)

    print(r)
