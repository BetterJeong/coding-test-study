T = int(input())

for _ in range(T):
    li = input()
    l_li = []
    r_li = []

    for s in li:
        if s == '<':
            if l_li:
                r_li.append(l_li.pop())
        elif s == '>':
            if r_li:
                l_li.append(r_li.pop())
        elif s == '-':
            if l_li:
                l_li.pop()
        else:
            l_li.append(s)

    l_li.extend(reversed(r_li))
    print(''.join(l_li))
