N = int(input())

x = 1
y = 1
# datas = input().split()

# for data in datas:
#     if data == 'R' and y < N:
#         y += 1
#     elif data == 'L' and y > 1:
#         y -= 1
#     elif data == 'U' and x > 1:
#         x -= 1
#     elif data == 'D' and x < N: # down
#         x += 1

plans = input().split()
dx = [0, 0, -1, 1]
dy = [-1, 1, 0, 0]
move_types = ['L', 'R', 'U', 'D']

for plan in plans:
    for i in range(len(move_types)):
        if plan == move_types[i]:
            nx = x + dx[i]
            ny = y + dy[i]
    if nx < 1 or ny < 1 or nx > N or ny > N:
        continue

    x, y = nx, ny

print(x, y)