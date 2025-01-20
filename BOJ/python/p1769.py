s = list(map(int, input()))
r = 0

while True:
    if len(s) == 1:
        print(r)
        print("YES" if s[0] % 3 == 0 else "NO")
        break

    s = list(map(int, str(sum(s))))
    r += 1
