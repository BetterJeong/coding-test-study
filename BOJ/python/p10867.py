n = int(input())
li = list(map(int, input().split()))
li.sort()
r = []

for l in li:
    if l not in r:
        r.append(l)

print(*r)
