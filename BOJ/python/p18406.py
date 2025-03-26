N = list(input())
l = 0
r = 0

for i in range(len(N)//2):
    l += int(N[i])

for i in range(len(N)//2, len(N)):
    r += int(N[i])

if l == r:
    print("LUCKY")
else:
    print("READY")
