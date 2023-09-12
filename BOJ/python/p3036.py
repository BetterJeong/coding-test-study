import math

N = int(input())
li = list(map(int, input().split()))
r = li[0]

for i in range(1, len(li)):
    k = math.gcd(r, li[i])
    print(str(int(r/k))+"/"+str(int(li[i]/k)))
