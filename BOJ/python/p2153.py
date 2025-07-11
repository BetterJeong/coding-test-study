import math

s = input()
r = 0
b = True

for i in s:
    o = ord(i)
    r += (o - 96) if o >= 97 else (o - 38)

for i in range(2, int(math.sqrt(r))+1):
    if r % i == 0:
        b = False
        break

if b:
    print('It is a prime word.')
else:
    print('It is not a prime word.')
