n = 1
li = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

for i in range(3):
    n *= int(input())

s = list(str(n))

for i in range(len(s)):
    li[int(s[i])] += 1

for i in range(len(li)):
    print(li[i])