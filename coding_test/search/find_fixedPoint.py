N = int(input())
data = list(map(int, input().split()))

def binary_search(data, start, end):
    if start > end:
        return None
    mid = (start + end) // 2
    
    if data[mid] == mid:
        return mid
    elif data[mid] > mid:
        return binary_search(data, start, mid - 1)
    else:
        return binary_search(data, mid + 1, end)


result = binary_search(data, 0, N-1)

if result != None:
    print(result)
else:
    print(-1)

# 절반 값을 구했는데 인덱스보다 값이 크면 
# 왼쪽을 찾기
# 아니라면
# 오른쪽 검색