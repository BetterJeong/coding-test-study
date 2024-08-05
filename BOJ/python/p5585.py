n = 1000 - int(input())
li = [500, 100, 50, 10, 5, 1]
r = 0

for i in li:
    if n == 0: break;

    r += n // i
    n = n % i

print(r)
