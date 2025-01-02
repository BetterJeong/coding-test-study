n = int(input())
li = list(input())

a = li.count("A")
b = li.count("B")

if a > b:
    print("A")
elif a < b:
    print("B")
else:
    print("Tie")
