N = int(input())

dp = []
for i in range(N):
    dp.append(list(map(int, input().split())))

dp[1][0] = dp[1][0] + dp[0][0]
dp[1][1] = dp[1][1] + dp[0][0]

for i in range(2, N):
    for j in range(len(dp[i])):
        if j==0:    # 왼쪽 끝
            dp[i][j] = dp[i][j] + dp[i-1][0] 
        elif j==len(dp[i]) - 1: # 오른쪽 끝
            dp[i][j] = dp[i][j] + dp[i-1][len(dp[i]) - 2] 
        else:
            dp[i][j] = dp[i][j] + max(dp[i-1][j-1], dp[i-1][j])

print(max(dp[N-1]))