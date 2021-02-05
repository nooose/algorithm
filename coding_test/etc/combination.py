# 조합
# 서로 다른 n개에서 순서에 상관없이 서로 다른 r개를 선택
# 순열에서 중복 제거

import itertools

data = [1, 2, 3, 4]

for x in itertools.combinations(data, 2):
    print(list(x))