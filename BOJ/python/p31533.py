a = int(input())
m, n = map(int, input().split())

if a == 1:
    if m*2 < n:
        print(m*2)
    elif n*2 < m:
        print(n*2)
    else:
        print(max(m, n))
else:
    print(min(m, n)/a*2)
