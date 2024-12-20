N, M = map(int, input().split())

print("SN", str(N) + chr(M + 64) if M <= 26 else str(N) + chr(96 + (M - 1) // 26) + chr(97 + (M - 1) % 26))
