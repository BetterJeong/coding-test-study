A, B, N = map(int, input().split())
li = []

for i in range(1, N+1):
    li.append(A*(N-i)+(A+B)*i)

li.sort()
print(*li)