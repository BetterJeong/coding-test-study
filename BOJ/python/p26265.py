import sys

input = sys.stdin.readline
print = sys.stdout.write

N = int(input().rstrip())
li = []

for i in range(N):
    li.append(list(map(str, input().rstrip().split())))

li.sort(key=lambda x:x[1], reverse=True)
li.sort(key=lambda x:x[0])

for i in range(N):
    print(li[i][0] + " " + li[i][1] + "\n")