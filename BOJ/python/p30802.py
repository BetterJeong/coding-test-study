N = int(input())
size = list(map(int, input().split()))
T, P = map(int, input().split())
t = 0

for i in range(len(size)):
    t += size[i] // T
    if size[i] % T != 0:
        t += 1

pb = N // P
p = N % P

print(t)
print(pb, p)
