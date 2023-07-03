string = input().split('-')
result = 0

for i in range(len(string)):
    data = string[i].split('+')
    sum_data = 0
    for t in data:
        sum_data += int(t)

    if i == 0:
        result += sum_data
    else:
        result -= sum_data

print(result)
