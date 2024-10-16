import math

i = 1
while True:
    a, b, c = map(int, input().split())

    if a == 0:
        break

    print(f"Triangle #{i}")

    if a == -1:
        if b**2 >= c**2:
            print("Impossible.")
        else:
            a = math.sqrt(c**2 - b**2)
            print(f"a = {a:.3f}")
    elif b == -1:
        if a**2 >= c**2:
            print("Impossible.")
        else:
            b = math.sqrt(c**2 - a**2)
            print(f"b = {b:.3f}")
    elif c == -1:
        c = math.sqrt(a**2 + b**2)
        print(f"c = {c:.3f}")

    i += 1
    print()
