N = int(input())
p = 0
r = 0

for i in range(N):
    n = int(input())

    if p != 0:
        if p < n:
            if p >= n / 2:
                r += 1
            p = 0
        else:
            r += 1
            p = p - n if p - n >= 0 else 0
    else:
        if 30 < n:
            if 30 >= n / 2:
                r += 1
            p = 0
        else:
            r += 1
            p = 30 - n if 30 - n >= 0 else 0

print(r)
