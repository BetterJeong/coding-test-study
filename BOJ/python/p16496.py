import sys

input = sys.stdin.readline
print = sys.stdout.write

N = int(input().rstrip())
li = list(input().split())
results = []

for i in range(N):
    st = li[i] * 10
    results.append((st, i))

results.sort(key=lambda x: x[0], reverse=True)

if li[results[0][1]] == "0":
    print("0")
else:
    for i in range(N):
        print(li[results[i][1]])
