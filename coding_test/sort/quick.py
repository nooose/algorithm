
array_1 = [5, 7, 9, 0, 3, 1, 6, 2, 4, 8]
array_2 = [5, 7, 9, 0, 3, 1, 6, 2, 4, 8]

def quick_sort_1(array, start, end):
    if start >= end:
        return

    pivot = start
    left = start + 1
    right = end
    
    while left <= right:
        # 피벗보다 큰 데이터를 찾을 때까지
        while left <= end and array[left] <= array[pivot]:
            left += 1

        # 피벗보다 작은 데이터를 찾을 때까지
        while right > start and array[right] >= array[pivot]:
            right -= 1

        # 엇 갈린 경우
        if left > right:
            array[right], array[pivot] = array[pivot], array[right]
        # 엇갈리지 않은 경우
        else:
            array[left], array[right] = array[right], array[left]
    
    quick_sort_1(array, start, right - 1)
    quick_sort_1(array, right + 1, end)

def quick_sort_2(array):
    if len(array) <= 1:
        return array
    
    pivot = array[0]
    tail = array[1:]

    left_side = [x for x in tail if x <= pivot]
    right_side = [x for x in tail if x > pivot]

    return quick_sort_2(left_side) + [pivot] + quick_sort_2(right_side)



quick_sort_1(array_1, 0, len(array_1) - 1)
print(array_1)
print(quick_sort_2(array_2))
