N = int(input())

if N == 0:
    print("divide by zero")
else:
    li = map(int, input().split())
    e = 0.0

    for i in li:
        e += i / N

    if e == 0:
        print("divide by zero")
    else:
        print("1.00")
