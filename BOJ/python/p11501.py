import sys


T = int(sys.stdin.readline().rstrip())

for _ in range(T):
    N = int(sys.stdin.readline().rstrip())
    stock = list(map(int, sys.stdin.readline().split()))
    m = 0
    r = 0

    for i in reversed(stock):
        if i > m:
            m = i
        else:
            r += m - i

    print(r)
