A, B = map(int, input().split())
N = int(input())
li = [[int(input())] for _ in range(N)]

for i in range(N):
    li[i].append(abs(li[i][0] - B))

li.sort(key=lambda x: x[1])

print(min(abs(A - B), li[0][1]+1))
