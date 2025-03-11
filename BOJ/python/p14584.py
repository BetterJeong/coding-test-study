s = list(input())
N = int(input())
d = [input() for _ in range(N)]
b = False

for i in range(26):
    t = []

    for j in range(len(s)):
        t.append(chr((ord(s[j])-97+i) % 26 + 97))

    for k in range(len(d)):
        if d[k] in ''.join(t):
            print(''.join(t))
            b = True
            break

    if b:
        break
