import sys
input = sys.stdin.readline
INF = int(1e9)

N, M, K, X = map(int, input().split())

graph = [[] for i in range(N + 1)]
visited = [False] * (N + 1)
distance = [INF] * (N + 1)

for _ in range(M):  # 간선 정보 입력
    a, b = map(int, input().split())
    graph[a].append((b, c))
