s = list(input())
a = ["c'", "j'", "n'", "m'", "t'", "s'", "l'", "d'", "qu'"]
v = ["a", "e", "i", "o", "u", "h"]
t = ""
r = 0

for i in range(len(s)):
    t += s[i]

    if s[i] == "-" or s[i] == " ":
        r += 1
        t = ""
    elif len(t) > 1 and i+1 < len(s):
        if t in a and s[i+1] in v:
            r += 1
            t = ""

print(r+1)
