import string

N = int(input())
S = list(input())
n = [str(i) for i in range(10)]
l = list(string.ascii_lowercase)
u = list(string.ascii_uppercase)
s = list("!@#$%^&*()-+")
r = [False] * 4

for i in range(N):
    if S[i] in n:
        r[0] = True
    elif S[i] in l:
        r[1] = True
    elif S[i] in u:
        r[2] = True
    elif S[i] in s:
        r[3] = True

print(max(6-N, r.count(False)))
