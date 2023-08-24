m = [64, 32, 16, 8, 4, 2, 1]
X = int(input())
r = 0

for i in m:
    if X >= i:
        X -= i
        r += 1

print(r)