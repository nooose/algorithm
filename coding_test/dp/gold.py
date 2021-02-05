# 조약돌 놓기 강화

T = int(input())

for _ in range(T):
    N, M = map(int, input().split())
    array = list(map(int, input().split()))
    
    dp = []
    index = 0
    for i in range(N):
        dp.append(array[index:index+M])
        index += M

    # dp 세팅
    for j in range(1, M):
        # 세로 세팅
        for i in range(N):
            # 왼쪽 위
            if i == 0:
                left_up = 0
            else:
                left_up = dp[i-1][j-1]

            # 왼쪽 아래
            if i == N - 1:
                left_down = 0
            else:
                left_down = dp[i+1][j-1]
            
            # 왼쪽
            left = dp[i][j-1]

            dp[i][j] = dp[i][j] + max(left_up, left, left_down)
    
    result = 0 
    for i in range(N):
        result = max(result, dp[i][M-1])

    print(result)