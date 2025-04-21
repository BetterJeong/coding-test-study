while True:
    N = int(input())

    if N == 0:
        break

    li = []

    for i in range(N):
        n, h = input().split()
        h = float(h)

        li.append([n, h])

    li.sort(key=lambda x: x[1], reverse=True)
    m = li[0][1]

    for i in range(N):
        if m == li[i][1]:
            print(li[i][0], end=' ')
    print()
