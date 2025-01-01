li = list(input())

if len(li) == 2:
    print(int(li[0]) + int(li[1]))
elif len(li) == 3:
    if li[2] != "0":
        print(int(li[0])*10 + int(li[1]) + int(li[2]))
    else:
        print(int(li[0]) + int(li[1])*10 + int(li[2]))
elif len(li) == 4:
    print(int(li[0])*10 + int(li[1]) + int(li[2])*10 + int(li[3]))
