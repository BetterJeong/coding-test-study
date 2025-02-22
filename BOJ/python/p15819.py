N, I = map(int, input().split())
li = [input() for i in range(N)]

li.sort()

print(li[I-1])
