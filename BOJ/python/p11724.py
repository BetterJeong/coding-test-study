def dfs(graph, v, visited):
    visited[v] = True
    for i in graph[v]:
        if not visited[i]:
            dfs(graph, i, visited)


N, M = map(int, input().split())
array = [[] for i in range(N+1)]
visited = [False] * (N+1)
result = 0
for i in range(M):
    a, b = map(int, input().split())
    array[b].append(a)
    array[a].append(b)

for i in range(1, N+1):
    if not visited[i]:
        dfs(array, i, visited)
        result += 1

print(result)
