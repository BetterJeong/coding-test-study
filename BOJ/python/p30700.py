S = list(input())
li = ['K', 'O', 'R', 'E', 'A']
r = 0
j = 0

for s in S:
    if s == li[j]:
        r += 1
        j = (j + 1) % 5

print(r)
