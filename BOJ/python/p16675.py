ml, mr, tl, tr = map(str, input().split())

if ml != mr and tl != tr:
    print("?")
elif ml == mr == tl == tr:
    print("?")
elif ml == mr and tl == tr:
    if ml == "R":
        if tl == "S":
            print("MS")
        else:
            print("TK")
    elif ml == "S":
        if tl == "R":
            print("TK")
        else:
            print("MS")
    else:
        if tl == "R":
            print("MS")
        else:
            print("TK")
elif ml == mr:
    if ml == "R":
        if tl == "P" or tr == "P":
            print("TK")
        else:
            print("?")
    elif ml == "S":
        if tl == "R" or tr == "R":
            print("TK")
        else:
            print("?")
    else:
        if tl == "S" or tr == "S":
            print("TK")
        else:
            print("?")
elif tl == tr:
    if tl == "R":
        if ml == "P" or mr == "P":
            print("MS")
        else:
            print("?")
    elif tl == "S":
        if ml == "R" or mr == "R":
            print("MS")
        else:
            print("?")
    else:
        if ml == "S" or mr == "S":
            print("MS")
        else:
            print("?")
