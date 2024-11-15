while True:
    try:
        s, t = input().split()
        k = 0

        for i in t:
            if k == len(s):
                break
            elif i == s[k]:
                k += 1

        print("Yes" if k == len(s) else "No")
    except EOFError:
        break