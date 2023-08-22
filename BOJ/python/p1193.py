X = int(input())
s = 0

for i in range(1, 10000000):
    s += i
    if s >= X:
        s -= i
        n = i + 1
        for j in range(1, n):
            s += 1
            if s == X:
                if n % 2 != 0:
                    print(str(j) + "/" + str(n - j))
                else:
                    print(str(n - j) + "/" + str(j))
                break
        break