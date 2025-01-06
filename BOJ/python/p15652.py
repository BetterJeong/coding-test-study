N, M = map(int, input().split())
r = []


def dfs(s):
    if len(r) == M:
        print(*r)
        return
    for i in range(s, N+1):
        r.append(i)
        dfs(i)
        r.pop()


dfs(1)
