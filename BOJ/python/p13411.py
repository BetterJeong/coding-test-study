import math
import sys

input = sys.stdin.readline
print = sys.stdout.write

N = int(input().rstrip())
li = []

for i in range(N):
    x, y, v = map(int, input().rstrip().split())

    li.append([i, math.sqrt(x**2+y**2)/v])

li.sort(key=lambda k: k[1])

for i in range(N):
    print(str(li[i][0]+1)+"\n")
