K = int(input())
li = [[0] * 2 for i in range(46)]
li[1][0] = 0
li[1][1] = 1
li[2][0] = 1
li[2][1] = 1

for i in range(3, 46):
    li[i][0] = li[i - 1][0] + li[i - 2][0]
    li[i][1] = li[i - 1][1] + li[i - 2][1]
    if i >= K:
        break

print(str(li[K][0]) + " " + str(li[K][1]))
