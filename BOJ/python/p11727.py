array = [0] * 1001
array[1] = 1
array[2] = 3
array[3] = 5
array[4] = 11

for i in range(5, 1001):
    array[i] = array[i-1] + array[i-2] * 2

n = int(input())

print(array[n] % 10007)