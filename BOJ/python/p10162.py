li = [300, 60, 10]
r = []
T = int(input())

if T % 10 != 0:
    print(-1)
else:
    for i in range(len(li)):
        r.append(T//li[i])
        T %= li[i]

    print(*r)
