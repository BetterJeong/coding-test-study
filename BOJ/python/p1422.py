import sys

K, N = map(int, sys.stdin.readline().rstrip().split())
li = []

for i in range(K):
    li.append(sys.stdin.readline().rstrip())

m = max(map(int, li))

for i in range(N - K):
    li.append(str(m))

li.sort(key=lambda x: x*10, reverse=True)

print(''.join(li))
