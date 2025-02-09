n = int(input())
li = [0, 1, 2]

for i in range(3, n+1):
    li.append((li[i-1]%10 + li[i-2]%10)%10)

print(li[n])
