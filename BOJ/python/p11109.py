T = int(input())

for i in range(T):
    d, n, s, p = map(int, input().split())
    a = n * s
    b = d + n * p

    if a > b:
        print("parallelize")
    elif a < b:
        print("do not parallelize")
    else:
        print("does not matter")
