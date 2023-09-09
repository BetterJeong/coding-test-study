S = int(input())
n, s = 0, 0

for i in range(1, S+1):
    s += i
    if s > S:
        break
    n += 1

print(n)