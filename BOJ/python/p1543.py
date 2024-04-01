import sys

d = sys.stdin.readline().rstrip()
w = sys.stdin.readline().rstrip()
r = 0
i = 0

while i <= len(d) - len(w):
    b = True

    for j in range(len(w)):
        if d[i+j] != w[j]:
            b = False
            break

    if b:
        r += 1
        i += len(w)
    else:
        i += 1

print(r)
