N, M = map(int, input().split())

if M <= 26:
    print("SN", str(N) + chr(M + 64))
else:
    print("SN", str(N) + chr(96 + (M - 1) // 26) + chr(97 + (M - 1) % 26))
