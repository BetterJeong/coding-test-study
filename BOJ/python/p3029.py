h1, m1, s1 = map(int, input().split(":"))
h2, m2, s2 = map(int, input().split(":"))
n = h1 * 60 * 60 + m1 * 60 + s1
t = h2 * 60 * 60 + m2 * 60 + s2
r = 0

if n == t:
    print("24:00:00")
else:
    if n > t:
        r = 24 * 60 * 60 - (n - t)
    else:
        r = t - n

    print(str(r//(60*60)).zfill(2) + ":" + str(r % (60*60) // 60).zfill(2) + ":" + str(r % (60*60) % 60).zfill(2))
