import math

N = int(input())
li = []

for i in range(1, N+1):
    W, H = map(int, input().split())
    li.append([i, math.sqrt(W**2 + H**2)/77])

li.sort(key=lambda x:x[1], reverse=True)

for l in li:
    print(l[0])
