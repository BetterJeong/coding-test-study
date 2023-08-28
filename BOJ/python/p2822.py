li = [int(input()) for _ in range(8)]
sorted_li = sorted(li, reverse=True)
r = []
s = 0

for i in range(5):
    for j in range(8):
        if sorted_li[i] == li[j]:
            r.append(j+1)
            s += sorted_li[i]
            break

r.sort()

print(s)
print(*r)