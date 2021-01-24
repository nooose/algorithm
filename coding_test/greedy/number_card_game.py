# 숫자 카드 게임 - 2019 국가 교육기관 코딩 테스트

# n 행, m 열
n, m = map(int, input().split())


l = []

for i in range(n):
    data = list(map(int, input().split()))
    l.append(min(data))

print(max(l))