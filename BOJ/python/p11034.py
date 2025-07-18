while True:
    try:
        a, b, c = map(int, input().split())
        print((b-a-1) if b-a > c-b else (c-b-1))
    except EOFError:
        break
