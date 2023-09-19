from collections import deque
import sys

input = sys.stdin.readline
print = sys.stdout.write

q = deque()
N = int(input().rstrip())

for _ in range(N):
    s = input().rstrip()
    if s == "pop":
        if q:
            print(str(q.popleft()) + "\n")
        else:
            print("-1\n")
    elif s == "size":
        print(str(len(q)) + "\n")
    elif s == "empty":
        if q:
            print("0\n")
        else:
            print("1\n")
    elif s == "front":
        if q:
            print(str(q[0]) + "\n")
        else:
            print("-1\n")
    elif s == "back":
        if q:
            print(str(q[len(q)-1]) + "\n")
        else:
            print("-1\n")
    else:
        r = s.split()
        q.append(int(r[1]))
