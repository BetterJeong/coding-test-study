n = int(input())

for i in range(n):
    s = int(input())
    b = True

    for j in range(2, 1000001):
        if s % j == 0:
            b = False
            break

    print("YES") if b else print("NO")
    