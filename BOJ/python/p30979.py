T = int(input())
N = int(input())
s = sum(list(map(int, input().split())))

if T <= s:
    print("Padaeng_i Happy")
else:
    print("Padaeng_i Cry")
