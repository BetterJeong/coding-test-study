a, b = map(int, input().split())
li = [0]

for i in range(46):
    for j in range(i):
        li.append(i)

print(sum(li[a:b+1]))