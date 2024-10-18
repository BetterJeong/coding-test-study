s = [["northlondo", "NLCS"], ["branksomeh", "BHA"], ["koreainter", "KIS"], ["stjohnsbur", "SJA"]]

name = list(input())

for i in range(26):
    for j in s:
        if j[0] == ''.join(name):
            print(j[1])
            break

    for j in range(len(name)):
        name[j] = chr(97 + (ord(name[j]) + 1 - 97) % 26)
