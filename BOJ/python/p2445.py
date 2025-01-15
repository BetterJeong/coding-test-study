n = int(input())

for i in range(1, 2*n):
    if i > n:
        print('*'*(2*n - i) + ' '*(i-n)*2 + '*'*(2*n - i))
    elif i == n:
        print('*'*2*n)
    else:
        print('*'*i + ' '*(n-i)*2 + '*'*i)
