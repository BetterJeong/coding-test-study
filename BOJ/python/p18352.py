import heapq
INF = int(1e9)


def dijkstra(start):
    q = []
    heapq.heappush(q, (0, start))
    distance[start] = 0

    while q:
        dist, now = heapq.heappop(q)
        if distance[now] < dist:
            continue

        for i in graph[now]:
            cost = dist + i[1]
            if cost < distance[i[0]]:
                distance[i[0]] = cost
                heapq.heappush(q, (cost, i[0]))


N, M, K, X = map(int, input().split())
graph = [[] for i in range(N + 1)]
distance = [INF] * (N + 1)
result = []

for _ in range(M):
    a, b = map(int, input().split())
    graph[a].append((b, 1))  # 가중치를 1로 설정

dijkstra(X)

for i in range(1, N + 1):
    if distance[i] == K:
        result.append(i)

if len(result) == 0:
    print(-1)
else:
    for i in result:
        print(i)
