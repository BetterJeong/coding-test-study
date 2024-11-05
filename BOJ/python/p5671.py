import sys

lines = sys.stdin.readlines()

for line in lines:
    N, M = map(int, line.split())
    r = 0

    for i in range(N, M+1):
        li = list(str(i))

        while li:
            if li.pop() in li:
                r += 1
                break

    print(M - N + 1 - r)
