import sys

input = sys.stdin.readline

Q = int(input())

for i in range(Q):
    a, b = map(int, input().split())

    if b % a == 0 and b > a:
        print("1")
    else:
        print("0")
