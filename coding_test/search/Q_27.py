from bisect import bisect_left, bisect_right

def count_by_range(a, left_value, right_value):
    right_index = bisect_right(a, right_value)
    left_index = bisect_left(a, left_value)
    return right_index - left_index

N, x = map(int, input().split())

data = list(map(int, input().split()))

result = count_by_range(data, x, x)

if result != 0:
    print(result)
else:
    print(-1)