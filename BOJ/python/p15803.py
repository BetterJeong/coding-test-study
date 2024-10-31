x1, y1 = map(int, input().split())
x2, y2 = map(int, input().split())
x3, y3 = map(int, input().split())

if abs(y1 - y2) * abs(x2 - x3) == abs(y2 - y3) * abs(x1 - x2):
    print("WHERE IS MY CHICKEN?")
elif abs(y1 - y2) * abs(x1 - x3) == abs(y1 - y3) * abs(x1 - x2) :
    print("WHERE IS MY CHICKEN?")
elif abs(y3 - y2) * abs(x1 - x3) == abs(y1 - y3) * abs(x3 - x2):
    print("WHERE IS MY CHICKEN?")
else:
    print("WINNER WINNER CHICKEN DINNER!")
