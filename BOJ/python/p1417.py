N = int(input())
li = [int(input()) for i in range(N)]
b = True
r = 0

if N == 1:
    print(0)
else:
    while b:
        m = max(li[1:])
        if li[0] > m:
            break

        for i in range(1, N):
            if li[i] == m:
                li[i] -= 1
                li[0] += 1
                r += 1
                break

    print(r)
