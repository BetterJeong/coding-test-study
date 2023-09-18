N, K = map(int, input().split())
li = [False, False] + [True]*(N-1)
results = []

for i in range(2, N+1):
    if li[i]:
        results.append(i)
        for j in range(2*i, N+1, i):
            if li[j]:
                li[j] = False
                results.append(j)
                if len(results) > K:
                    break
    if len(results) >= K:
        break

print(results[K-1])
