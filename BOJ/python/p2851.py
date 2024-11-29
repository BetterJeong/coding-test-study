n = int(input())
li = [[n, abs(100-n)]]

for i in range(1, 10):
    k = li[i-1][0] + int(input())
    li.append([k, abs(100-k)])

li.sort(reverse=True)
li.sort(key=lambda x: x[1])

print(li[0][0])
