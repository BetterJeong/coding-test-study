import sys
N, M = map(int, sys.stdin.readline().split())
li = {}

for _ in range(N):
    w = input()
    if len(w) >= M:
        if w in li:
            li[w] += 1
        else:
            li[w] = 1

li = sorted(li.items(), key=lambda x: (x[0]))
li.sort(key=lambda x: -len(x[0]))
li.sort(key=lambda x: -x[1])

for item in li:
    print(item[0])
