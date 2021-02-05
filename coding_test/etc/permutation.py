# 순열
# 서로 다른 n개에서 r개를 선택하여 일렬로 나열
import itertools

data = [1, 2, 3, 4]

# 1~4 수 중에서 2개를 뽑는 모든 경우의 수를 출력
for x in itertools.permutations(data, 2):
    print(list(x))

