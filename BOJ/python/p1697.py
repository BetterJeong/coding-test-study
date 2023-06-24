from collections import deque

N, K = map(int, input().split())
visited = [0] * 100001
q = deque([N])
result = 0

while q:
    v = q.popleft()
    if v == K:
        result = visited[v]
        break
    for i in (v - 1, v + 1, 2 * v):
        if 0 <= i < 100001 and not visited[i]:
            visited[i] = visited[v] + 1
            q.append(i)

print(result)
