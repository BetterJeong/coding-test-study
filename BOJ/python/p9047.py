import sys

input = sys.stdin.readline
print = sys.stdout.write

T = int(input())

for i in range(T):
    n = input().rstrip()
    c = 0

    while n != "6174":
        c += 1

        l = int(''.join(sorted(n, reverse=True)))
        r = int(''.join(sorted(n)))
        n = str(l - r)

        while len(n) < 4:
            n += "0"

    print(str(c)+"\n")
