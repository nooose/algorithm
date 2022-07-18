# N가지 화폐
# M원이 되도록
N, M = map(int, input().split())


# array = [2, 3, 5]
array = []
for i in range(N):
    array.append(int(input()))

d = [10001] * (M+1)

d[0] = 0
for i in range(N): 
    # 0, 1, 2
    for j in range(array[i], M+1): # 2, 3, 5
        if d[j - array[i]] != 10001:
            d[j] = min(d[j], d[j - array[i]] + 1)


if d[M] == 10001:
    print(-1)
print(d[M])