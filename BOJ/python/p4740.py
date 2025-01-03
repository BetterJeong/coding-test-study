while True:
    s = input()

    if s == "***":
        break

    s = list(s)
    s.reverse()

    print(''.join(s))
