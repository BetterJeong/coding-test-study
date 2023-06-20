n = int(input())
score = [0] * n
dp = [0] * n
for i in range(n):
    score[i] = int(input())

dp[0] = score[0]

if n > 1:
    dp[1] = score[0] + score[1]

    if n > 2:
        dp[2] = max(score[1] + score[2], score[0] + score[2])

        if n > 3:
            for i in range(3, n):
                dp[i] = max(dp[i-3] + score[i-1] + score[i], dp[i-2] + score[i])

print(dp[n-1])
