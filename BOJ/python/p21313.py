N = int(input())
li = []

for i in range(N):
    if i % 2 == 0:
        if i == N-1:
            li.append(3)
        else:
            li.append(1)
    else:
        li.append(2)

print(*li)
