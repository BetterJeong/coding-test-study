N = int(input())

for i in range(N):
    s = list(input())
    r = 0

    for j in range(len(s)):
        if 65 <= ord(s[j]) <= 90:
            r += ord(s[j]) - 64

    if r == 100:
        print("PERFECT LIFE")
    else:
        print(r)
