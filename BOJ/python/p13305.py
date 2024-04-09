import sys


N = int(sys.stdin.readline().rstrip())
road = list(map(int, sys.stdin.readline().split()))
city = list(map(int, sys.stdin.readline().split()))
cost = 0
i = 0

while i < len(road):
    now = city[i]
    c = 0

    for j in range(i, len(road)):
        if city[j] < now:
            break
        else:
            c += 1

    if c > 0:
        for j in range(i, i+c):
            cost += now * road[j]
        i += c
    else:
        cost += now * road[i]
        i += 1

print(cost)
