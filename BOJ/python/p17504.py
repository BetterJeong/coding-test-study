N = int(input())
li = list(map(int, input().split()))
p = li[N-1]
q = li[N-1] * li[N-2] + 1

for i in range(len(li)-3, -1, -1):
    t = p
    p = q
    q = q * li[i] + t

p = q - p

print(p, q)
