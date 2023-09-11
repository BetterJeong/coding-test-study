A, B = map(int, input().split())
set_A = set(map(int, input().split()))
set_B = set(map(int, input().split()))

print(len(set_A-set_B) + len(set_B-set_A))
