from itertools import combinations

vowels = ('a', 'e', 'i', 'o', 'u') # 모음
L, C = map(int, input().split())


data = input().split()
data.sort()

for password in combinations(data, L):
    count = 0
    for i in password:
        if i in vowels:
            count += 1

    if count >= 1 and count <= L - 2:
        print(''.join(password))
