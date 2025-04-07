s = list(input())
r = 0

for i in range(len(s)):
    r += (ord(s[i]) - 64) * 26**(len(s)-i-1)

print(r)
