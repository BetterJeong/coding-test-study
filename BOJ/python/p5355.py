T = int(input())

for i in range(T):
    li = list(input().split())
    n = float(li[0])

    for j in range(1, len(li)):
        if li[j] == '@':
            n *= 3
        elif li[j] == '%':
            n += 5
        elif li[j] == '#':
            n -= 7

    print("{:.2f}".format(n))
