N = int(input())
G = []

for _ in range(N):
    G.append(list(map(int, input().split())))

for i in range(N):
    for a in range(N):
        for b in range(N):
            if G[a][i] == 1 and G[i][b] == 1:
                G[a][b] = 1

for row in G:
    for col in row:
        print(col, end=" ")
    print()
