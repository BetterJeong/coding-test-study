E, S, M = map(int, input().split())

for i in range(7980):
    if i % 15 + 1 == E and i % 28 + 1 == S and i % 19 + 1 == M:
        print(i + 1)
        break
