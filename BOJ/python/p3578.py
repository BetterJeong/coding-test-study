h = int(input())

if h == 0:
    print(1)
elif h == 1:
    print(0)
elif h % 2 == 0:
    print("8"*(h//2))
else:
    print("4" + "8"*(h//2))