import itertools

li = [int(input()) for _ in range(9)]

for i in itertools.combinations(li, 7):
    if sum(i) == 100:
        for j in sorted(i):
            print(j)
        break
