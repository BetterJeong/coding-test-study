N = input()

if len(N) == 1:
    print(1)
else:
    b = False
    for d in range(1, 10):
        if int(str(d) * len(N)) <= int(N):
            b = True
            break

    if b:
        print(len(N))
    else:
        print(len(N) - 1)
