n = int(input())
li = list(map(int, input().split()))
t = {}
left = 0
r = 0

for right in range(n):
    if li[right] in t:
        t[li[right]] += 1
    else:
        t[li[right]] = 1

    while len(t) > 2:
        t[li[left]] -= 1
        if t[li[left]] == 0:
            del t[li[left]]
        left += 1

    r = max(r, right - left + 1)

print(r)
