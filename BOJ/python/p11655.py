s = list(input())

for i in range(len(s)):
    if 65 <= ord(s[i]) <= 90:
        s[i] = chr((ord(s[i]) + 13 - 65) % 26 + 65)
    elif 97 <= ord(s[i]) <= 122:
        s[i] = chr((ord(s[i]) + 13 - 97) % 26 + 97)

print(''.join(s))
