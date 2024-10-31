N = int(input())
li = list(input())
consonant = ['q', 'w', 'e', 'r', 't', 'a', 's', 'd', 'f', 'g', 'z', 'x', 'c', 'v']

if li[N-1] in consonant:
    print(1)
else:
    print(0)
