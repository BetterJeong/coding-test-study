while True:
    s = input()
    m = len(s)
    r = 0

    if s == "0":
        break

    while True:
        n = int(s)
        s = str(n).zfill(m)
        rs = ''.join(reversed(s))

        if s == rs:
            print(r)
            break

        r += 1
        s = str(n+1).zfill(m)
