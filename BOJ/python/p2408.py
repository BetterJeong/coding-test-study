import sys

input = sys.stdin.readline
print = sys.stdout.write

N = int(input().rstrip())
s = ""

for i in range(2*N - 1):
    s += input().rstrip()

print(str(eval(s.replace("/", "//"))))
