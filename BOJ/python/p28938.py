N = input()
li = list(map(int, input().split()))
if sum(li) > 0:
    print("Right")
elif sum(li) < 0:
    print("Left")
else:
    print("Stay")