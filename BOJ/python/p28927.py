li1 = list(map(int, input().split()))
li2 = list(map(int, input().split()))

li1[0] *= 3
li2[0] *= 3
li1[1] *= 20
li2[1] *= 20
li1[2] *= 120
li2[2] *= 120

if sum(li1) > sum(li2):
    print("Max")
elif sum(li1) < sum(li2):
    print("Mel")
else:
    print("Draw")