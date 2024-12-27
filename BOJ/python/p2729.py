T = int(input())

for i in range(T):
    a, b = input().split()
    a, b = int(a, 2), int(b, 2)

    print(format(a+b, 'b'))
