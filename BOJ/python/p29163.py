n = int(input())
li = list(map(int, input().split()))
a = 0
b = 0

for i in li:
    if i % 2 == 0:
        a += 1
    else:
        b += 1

if a <= b:
    print("Sad")
else:
    print("Happy")