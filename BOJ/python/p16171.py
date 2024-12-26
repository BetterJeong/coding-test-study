s = list(input())
k = input()
l = ""

for i in range(len(s)):
    if ord(s[i]) > 60:
        l += s[i]

if k in l:
    print("1")
else:
    print("0")
