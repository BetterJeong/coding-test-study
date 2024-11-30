import math

n = int(input())
li = []

if n == 0:
    print("NO")
else:
    for i in range(21):
        li.append(math.factorial(i))

    li.reverse()

    for f in li:
        if f <= n:
            n -= f

    print("YES") if n == 0 else print("NO")
