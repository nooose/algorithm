N, M = map(int, input().split())

data = list(map(int, input().split()))

start = 0
end = max(data)

result = 0
while start <= end:
    total = 0
    mid = (start + end) // 2
    for x in data:
        if x > mid:
            total += x - mid
    
    if total < M: # 떡이 부족함
        end = mid - 1 
    else:         # 떡이 충분함
        result = mid
        start = mid + 1

print(result)