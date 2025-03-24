N = int(input())
li = []

for i in range(2, 10000):
    b = True

    for k in li:
        if i % k == 0:
            b = False

    if b:
        li.append(i)

for i in range(len(li)-1):
    r = li[i] * li[i+1]
    if r > N:
        print(r)
        break
