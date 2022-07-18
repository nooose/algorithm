# 8 X 8
 
data = input() # a1

x = int(data[1])
y = ord(data[0]) - ord('a') + 1

possible = [[2, 1], [2, -1], [-2, 1], [-2, -1], [1, 2], [1, -2], [-1, 2], [-1, -2]]

cnt = 0
for p in possible:
    next_x = x + p[0]
    next_y = y + p[1]

    if next_x <= 8 and next_x >= 1 and next_y <= 8 and next_y >= 1:
        cnt += 1

print(cnt)