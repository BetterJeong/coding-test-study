from itertools import combinations_with_replacement

n = int(input())
li = [1, 5, 10, 50]
t = list(combinations_with_replacement(li, n))
r = []

for i in t:
    r.append(sum(i))

print(len(set(r)))
