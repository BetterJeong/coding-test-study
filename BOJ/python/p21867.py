N = int(input())
S = list(input())
r = ""

for i in range(N):
    if S[i] != "J" and S[i] != "A" and S[i] != "V":
        r += S[i]

if len(r) != 0:
    print(r)
else:
    print("nojava")
