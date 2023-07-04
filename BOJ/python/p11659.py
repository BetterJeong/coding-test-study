import sys

input = sys.stdin.readline
print = sys.stdout.write

N, M = map(int, input().rstrip().split())
array = list(map(int, input().rstrip().split()))
sum_array = [0] * N
sum_array[0] = array[0]
for i in range(1, len(array)):
    sum_array[i] = array[i] + sum_array[i - 1]

for i in range(M):
    start, end = map(int, input().rstrip().split())
    result = 0
    if start == 1:
        result = sum_array[end - 1]
    else:
        result = sum_array[end - 1] - sum_array[start - 2]
    print(str(result) + "\n")
