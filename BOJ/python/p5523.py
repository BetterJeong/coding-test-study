import sys

input = sys.stdin.readline
print = sys.stdout.write

N = int(input().rstrip())
a = 0
b = 0

for i in range(N):
    a_score, b_score = map(int, input().rstrip().split())

    if a_score > b_score:
        a += 1
    elif b_score > a_score:
        b += 1

print(str(a) + " " + str(b))
