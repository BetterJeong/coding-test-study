N = int(input())
li = list(map(int, input().split()))
r = sum(li) + 8 * (len(li)-1)
print(r // 24, r % 24)
