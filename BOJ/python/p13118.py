p = list(map(int, input().split()))
x, y, z = map(int, input().split())

if x in p:
    print(p.index(x)+1)
else:
    print(0)
