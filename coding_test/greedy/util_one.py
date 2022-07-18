# 1이 될 때 까지 - 2018 E 기업 알고리즘 대회

N, K = map(int, input().split())

cnt = 0
while N!=1:
    if (N % K == 0):
        N /= K
        cnt += 1
        print("나눌때: ", N)
    else:
        N -= 1
        cnt += 1
        print("뺄때: ", N)

print(cnt)

