x, y = map(int, input().split())
days = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]

d = 0
if x > 1:
    for i in range(0, x-1):
        d += days[i]
d += y
d %= 7

if d == 0:
    print("SUN")
elif d == 1:
    print("MON")
elif d == 2:
    print("TUE")
elif d == 3:
    print("WED")
elif d == 4:
    print("THU")
elif d == 5:
    print("FRI")
elif d == 6:
    print("SAT")
