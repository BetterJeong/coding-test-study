from itertools import combinations_with_replacement

N, M = map(int, input().split())
li = list(map(int, input().split()))
li.sort()
r = list(combinations_with_replacement(li, M))

for i in range(len(r)):
    print(*r[i])
