def binary_search(array, target, start, end):
    while start <= end:
        mid = (start + end) // 2

        if array[mid] == target:
            return mid
        elif array[mid] > target:
            end = mid - 1
        else:
            start = mid + 1
    return None
    

N = int(input())
data_N = list(map(int, input().split()))
data_N.sort()

M = int(input())
data_M = list(map(int, input().split()))

# 이진 탐색 사용
print('이진 탐색 사용')
for i in data_M:
    result = binary_search(data_N, i, 0, N-1)
    if result != None:
        print('yes', end = ' ')
    else:
        print('no', end = ' ')

# 계수 정렬 사용
print('계수 정렬 사용')
array = [0] * 1000001
for i in data_N:
    array[i] = 1

for i in data_M:
    if array[i] == 1:
        print('yes', end = ' ')
    else:
        print('no', end = ' ')

# 집합 자료형 사용
print('집합 자료형 사용')

array = set(data_N)

for i in data_M:
    if i in array:
        print('yes', end = ' ')
    else:
        print('no', end = ' ')
