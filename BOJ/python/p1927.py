import heapq
import sys

input = sys.stdin.readline
print = sys.stdout.write

heap = []

N = int(input().rstrip())
for i in range(N):
    k = int(input().rstrip())
    if k == 0:
        if len(heap) == 0:
            print("0\n")
        else:
            print(str(heapq.heappop(heap))+"\n")
    else:
        heapq.heappush(heap, k)
