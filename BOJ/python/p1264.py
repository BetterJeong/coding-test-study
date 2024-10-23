while True:
    string = list(input())
    vowel = ['a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U']
    r = 0

    if string[0] == "#":
        break

    for s in string:
        if s in vowel:
            r += 1

    print(r)