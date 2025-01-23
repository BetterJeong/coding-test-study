K = int(input())

for i in range(K):
    h = int(input())
    action = list(input())

    for a in action:
        if h > 0:
            if a == "c":
                h += 1
            else:
                h -= 1

    print(f"Data Set {i+1}:")
    print(h)
    print()

