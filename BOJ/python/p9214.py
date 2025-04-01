t = 0

while True:
    t += 1
    n = input()
    p = n

    if n == "0":
        break

    while True:
        nl = list(p)
        p = ""
        r = ""

        for i in range(0, len(nl), 2):
            if i > len(nl) - 2:
                break

            for j in range(int(nl[i])):
                p += nl[i+1]

        i = 0
        while i < len(p):
            l = p[i]
            c = 1

            while i+c < len(p) and p[i+c] == l:
                c += 1

            r += str(c)
            r += l
            i += c

        if r != ''.join(nl):
            p = ''.join(nl)

        if ''.join(nl) == p or len(p) % 2 == 1:
            break

    print("Test", str(t) + ":", p)
