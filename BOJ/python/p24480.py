import sys
sys.setrecursionlimit(10**6)

input = sys.stdin.readline
print = sys.stdout.write

N, M, R = map(int, input().split())
li = [[] for _ in range(N+1)]
r = [0 for _ in range(N+1)]
s = 1

for i in range(M):
    u, v = map(int, input().split())
    li[u].append(v)
    li[v].append(u)

for i in li:
    i.sort(reverse=True)


def dfs(n):
    global s
    r[n] = s

    for i in li[n]:
        if r[i] > 0:
            continue
        s += 1
        dfs(i)


dfs(R)

for i in r[1:]:
    print(str(i) + "\n")
