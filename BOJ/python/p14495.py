li = [1, 1, 1]
n = int(input())

for i in range(3, 117):
    li.append(li[i-1]+li[i-3])

print(li[n-1])
