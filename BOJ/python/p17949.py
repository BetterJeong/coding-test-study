s = input()
N = int(input())
li = list(input().split())
i = 0

for k in range(N):
    t = ""

    if li[k] == "char":
        for j in range(2):
            t += s[i]
            i += 1
    elif li[k] == "int":
        for j in range(8):
            t += s[i]
            i += 1
    else:
        for j in range(16):
            t += s[i]
            i += 1

    print(int(t, 16), end=' ')
