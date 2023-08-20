n = int(input())
arr = [input() for _ in range(n)]
result = arr[0]
result = list(result)

for i in range(len(arr[0])):
    b = True
    for j in range(n-1):
        if arr[j][i] != arr[j+1][i]:
            b = False
            break

    if not b:
        result[i] = '?'

print(''.join(result))