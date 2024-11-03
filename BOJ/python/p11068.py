T = int(input())

for _ in range(T):
    n = int(input())
    b = False

    for i in range(2, 65):
        li = []
        t = n

        while t != 0:
            li.append(t % i)
            t = t // i

        rLi = list(reversed(li))

        if li == rLi:
            b = True

    print(1) if b else print(0)