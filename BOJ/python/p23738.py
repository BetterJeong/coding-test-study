s = input()
r = ""

for i in s:
    if i == "B":
        r += "v"
    elif i == "E":
        r += "ye"
    elif i == "H":
        r += "n"
    elif i == "P":
        r += "r"
    elif i == "C":
        r += "s"
    elif i == "Y":
        r += "u"
    elif i == "X":
        r += "h"
    else:
        r += chr(ord(i) + 32)

print(r)
