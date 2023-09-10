S = input()
li = [""] * len(S)

for i in range(len(S)):
    li[i] = S[i:len(S)]

li.sort()
print(*li, sep="\n")