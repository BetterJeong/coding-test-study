A, B, C = map(int, input().split())
C += int(input())

B += C // 60
A += B // 60

A %= 24
B %= 60
C %= 60

print(A, B, C)
