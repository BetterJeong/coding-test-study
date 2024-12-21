N = int(input())

for i in range(N):
    li = list(input())
    s = 0
    n = 0
    r = 0
    e = ""

    for j in range(len(li)):
        if 48 <= ord(li[j]) <= 57:
            s += int(ord(li[j]) - 48)
        else:
            s += int(ord(li[j]) - 65 + 10)

        if n < s // 10 and s < 40:
            r += s // 10
            n = s // 10

    if 40 <= s:
        if 40 <= s < 50:
            e = "(weapon)"
        else:
            e = "(09)"

    print(str(r)+e)
