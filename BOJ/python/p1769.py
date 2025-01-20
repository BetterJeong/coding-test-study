s = list(map(int, input()))
r = 0

while True:
    if len(s) == 1:
        print(r)
        if s[0] % 3 == 0:
            print("YES")
        else:
            print("NO")
        break

    t = sum(s)
    s = list(map(int, str(t)))
    r += 1
