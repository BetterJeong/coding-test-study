N = int(input())
li = list(map(int, input().split()))
y = 0
m = 0

for i in range(N):
    y += (li[i] // 30 + 1) * 10
    m += (li[i] // 60 + 1) * 15

if y < m:
    print("Y", y)
elif y > m:
    print("M", m)
else:
    print("Y M", y)