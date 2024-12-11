N = int(input())
s = list(input())
li = [0, 0, 0, 0, 0]

for i in range(N):
    if s[i] == "u":
        li[0] += 1
    elif s[i] == "o":
        li[1] += 1
    elif s[i] == "s":
        li[2] += 1
    elif s[i] == "p":
        li[3] += 1
    elif s[i] == "c":
        li[4] += 1

print(min(li))
