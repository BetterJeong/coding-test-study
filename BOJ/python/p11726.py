n = int(input())
array = [0] * 1001

array[0] = 1
array[1] = 2

for i in range(2, 1001):
    array[i] = (array[i-1] + array[i-2]) % 10007

print(array[n-1])