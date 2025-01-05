while True:
    try:
        li = list(map(int, input().split()))
        k = [i for i in range(1, li[0])]

        if li[0] == 1:
            print("Jolly")
            continue

        for i in range(1, li[0]):
            if abs(li[i] - li[i+1]) in k:
                k.remove(abs(li[i] - li[i+1]))
        if k:
            print("Not jolly")
        else:
            print("Jolly")
    except EOFError:
        break
