import sys


N = list(sys.stdin.readline().strip())
N.sort(reverse=True)
ns = ''.join(N)

if int(ns) % 30 == 0:
    print(ns)
else:
    print("-1")
