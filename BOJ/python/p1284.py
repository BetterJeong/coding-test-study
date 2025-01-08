while True:
    N = list(input())
    r = 1

    if N[0] == '0':
        break

    for i in range(len(N)):
        if N[i] == '1':
            r += 2
        elif N[i] == '0':
            r += 4
        else:
            r += 3
        r += 1

    print(r)
