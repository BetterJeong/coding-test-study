import sys

input = sys.stdin.readline
print = sys.stdout.write

T = int(input())

for i in range(T):
    n = int(input())
    li1 = list(input().split())
    li2 = list(input().split())
    c = list(input().split())
    s = []
    r = []

    for j in li1:
        for k in range(n):
            if j == li2[k]:
                s.append(k)

    for k in s:
        print(c[k] + " ")

    print("\n")

sys.exit(0)
