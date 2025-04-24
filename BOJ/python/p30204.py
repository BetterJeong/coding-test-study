N, X = map(int, input().split())
li = list(map(int, input().split()))

if sum(li) % X == 0:
    print(1)
else:
    print(0)
