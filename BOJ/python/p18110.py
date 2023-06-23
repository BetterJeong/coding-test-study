import sys

input = sys.stdin.readline


def my_round(num):
    if num - int(num) >= 0.5:
        return int(num) + 1
    else:
        return int(num)


n = int(input().rstrip())

if n != 0:
    array = []
    percent = my_round(n * 0.15)
    person = n - percent * 2
    for i in range(n):
        array.append(int(input().rstrip()))

    array.sort()
    sorted_array = array[percent: n - percent]
    print(my_round(sum(sorted_array) / person))
else:
    print(0)
