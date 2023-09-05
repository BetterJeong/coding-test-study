def gcd(n, m):
    if m == 0:
        return n
    return gcd(m, n % m)


n, m = map(int, input().split(':'))
k = gcd(max(n, m), min(n, m))
print(str(n//k) + ':' + str(m//k))