N = int(input())

for _ in range(N):
    li = list(input().split())

    if li[0] == "Simon" and li[1] == "says":
        li.pop(0)
        li.pop(0)
        print("", *li)