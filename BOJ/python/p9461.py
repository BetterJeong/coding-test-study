p = [0] * 101
p[1] = 1
p[2] = 1
p[3] = 1
p[4] = 2
p[5] = 2
p[6] = 3
p[7] = 4
p[8] = 5
p[9] = 7
p[10] = 9

for i in range(10, 101):
    p[i] = p[i-5] + p[i-1]

T = int(input())

for _ in range(T):
    k = int(input())
    print(p[k])
