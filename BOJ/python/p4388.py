while True:
    a, b = input().split()

    if a == '0' and b == '0':
        break

    if len(a) > len(b):
        b = '0' * (len(a) - len(b)) + b
    else:
        a = '0' * (len(b) - len(a)) + a

    c = 0
    r = 0

    for i in range(len(a)):
        if int(a[len(a)-i-1]) + int(b[len(b)-i-1]) + c >= 10:
            c = 1
            r += 1
        else:
            c = 0

    print(r)
