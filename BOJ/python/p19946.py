N = int(input())
li = []

for i in range(1, 65):
    li.append(((2**i)-1)*(2**(64-i)))

print(li.index(N)+1)
