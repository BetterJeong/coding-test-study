T = int(input())

for i in range(T):
    A, B = map(int, input().split())
    A **= 2
    B **= 2
    print(A//B if A % B == 0 else A//B+1)
