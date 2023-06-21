n = int(input())
array = [[0] * 2 for _ in range(n)]
for i in range(n):
    a, b = map(int, input().split())
    array[i][0] = a
    array[i][1] = b

array.sort(key=lambda x: (x[1], x[0]))

result = 1
end = array[0][1]
for i in range(1, n):
    if array[i][0] >= end:
        result += 1
        end = array[i][1]

print(result)
