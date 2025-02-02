N = int(input())
r = []

for i in range(N):
    s = list(input())
    t = ""

    for j in range(len(s)):
        if 48 <= ord(s[j]) <= 57:
            t += s[j]
        else:
            if t != "":
                r.append(int(t))
                t = ""

    if t != "":
        r.append(int(t))

r.sort()

for k in r:
    print(k)
