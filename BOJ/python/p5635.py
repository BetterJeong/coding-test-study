li = []
n = int(input())

for i in range(n):
    name, d, m, y = input().split()
    li.append([int(y), int(m), int(d), name])

li.sort()
print(li[-1][3])
print(li[0][3])