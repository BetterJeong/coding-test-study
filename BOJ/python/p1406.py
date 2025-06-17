import sys

input = sys.stdin.readline
print = sys.stdout.write

l = list(input().rstrip())
r = []
M = int(input().rstrip())

for i in range(M):
    c = list(input().rstrip().split())

    if c[0] == "L" and l:
        r.append(l.pop())
    elif c[0] == "D" and r:
        l.append(r.pop())
    elif c[0] == "B" and l:
        l.pop()
    elif c[0] == "P":
        l.append(c[1])

print(''.join(l+r[::-1]))
