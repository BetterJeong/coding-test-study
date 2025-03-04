import sys

input = sys.stdin.readline

N = int(input())
li = [list(input().split()) for _ in range(N)]
p = []
r = []
c = 0

for i in range(N):
    if li[i][1] == "jaehak" and li[i][2] == "notyet" and (li[i][3] == "-1" or int(li[i][3]) > 3):
        p.append([int(li[i][4]), li[i][0]])

p.sort()

if len(p) > 10:
    c = 10
else:
    c = len(p)

for i in range(c):
    r.append(p[i][1])

r.sort()

print(c)
for n in r:
    print(n)
