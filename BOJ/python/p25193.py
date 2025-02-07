import math

n = int(input())
s = list(input())
c = 0

for i in range(n):
    if s[i] == "C":
        c += 1

print(math.ceil(c/(n-c+1)))
