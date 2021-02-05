
# N X M (N: 세로, M: 가로)

N, M = map(int, input().split())
d = [[0] * M for _ in range(N)] # 방문 위치 기록

x, y, direction = map(int, input().split())
d[x][y] = 1

array = []
for i in range(N):
    array.append(list(map(int, input().split())))

# 북, 동, 남, 서
dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]

def turn_left():
    global direction
    direction -= 1
    if direction == -1:
        direction = 3
    
count = 1
turn_time = 0
while True:
    turn_left()
    nx = x + dx[direction]
    ny = y + dy[direction]

    # 가보지않았고 육지인경우
    if d[nx][ny] == 0 and array[nx][ny] == 0:
        d[nx][ny] = 1 # 갔다
        x = nx
        y = ny
        count += 1
        turn_time = 0
        continue
    # 가봤거나 바다인경우
    else:
        turn_time += 1
    
    if turn_time == 4:
        nx = x - dx[direction]
        ny = y - dy[direction]
        if array[nx][y] == 0:
            x = nx
            y = ny
        else:
            break
        turn_time = 0

print(count)