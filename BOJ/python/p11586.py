N = int(input())
li = []

for _ in range(N):
    li.append(list(input()))

K = int(input())

if K == 1:
    for i in range(N):
        for j in range(N):
            print(li[i][j], end='')
        print()
elif K == 2:
    for i in range(N):
        for j in range(N):
            print(li[i][N-1-j], end='')
        print()
elif K == 3:
    for i in range(N):
        for j in range(N):
            print(li[N-1-i][j], end='')
        print()
