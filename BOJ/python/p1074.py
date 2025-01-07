def solution(n, r, c):
    if n == 0:
        return 0
    else:
        return 2*(r % 2) + c % 2 + 4*solution(n-1, r//2, c//2)


N, r, c = map(int, input().split())
print(solution(N, r, c))
