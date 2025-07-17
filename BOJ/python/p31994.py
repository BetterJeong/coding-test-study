s, m = input().split()

for i in range(6):
    ns, nm = input().split()

    if int(m) < int(nm):
        s = ns
        m = nm

print(s)
