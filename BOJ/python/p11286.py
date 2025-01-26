import sys, heapq

input = sys.stdin.readline
print = sys.stdout.write

N = int(input().rstrip())
li = []

for i in range(N):
    c = int(input().rstrip())

    if c == 0:
        if len(li) == 0:
            print("0\n")
        else:
            print(str(heapq.heappop(li)[1])+"\n")
    else:
        heapq.heappush(li, (abs(c), c))
