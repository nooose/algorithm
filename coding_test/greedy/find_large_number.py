# 큰 수의 법칙 - 2019 국가 교육기관 코딩 테스트

N, M, K = map(int, input().split())

data = list(map(int, input().split()))

data.sort()

count = M // (K+1)
result = count * ((data[N-1]*K) + data[N-2])
count = M % (K+1)
result += count * data[N-1]

print(result)