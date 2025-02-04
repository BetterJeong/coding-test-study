import sys
from collections import deque

N, M = map(int, input().split())
graph = [[] for _ in range(N + 1)]
r = [sys.maxsize]

for i in range(M):
    a, b = map(int, input().split())
    graph[a].append(b)
    graph[b].append(a)


def bfs(start):
    queue = deque([start])

    while queue:
        v = queue.popleft()

        for u in graph[v]:
            if start != u and visited[u] == 0:
                visited[u] = visited[v] + 1
                queue.append(u)


for i in range(1, N+1):
    visited = [0] * (N + 1)
    bfs(i)
    r.append(sum(visited))

print(r.index(min(r)))
