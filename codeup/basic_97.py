# codeup basic 1099

array = [[0] * 11 for _ in range(11)]

for x in range(1, 11):
    l = list(map(int, input().split()))
    for y in range(1, 11):
        array[x][y] = l[y-1]

# 출발
x = 2
y = 2

while True:
    if (array[x][y] == 2): # 위치한 곳이 먹이가 있는 곳인 경우
        array[x][y] = 9
        break

    array[x][y] = 9
    # 오른쪽이 벽인지 체크
    if (array[x][y+1] == 1): # 오른쪽이 벽인 경우
        # 아래로 이동하기 전 이동가능한지 확인
        if (array[x+1][y] == 1): # 불가능
            break
        else:                    # 가능
            x += 1
    else:                   # 오른쪽이 벽이 아닌 경우
        y += 1

for i in range(1, 11):
    for j in range(1, 11):
        print(array[i][j], end=' ')
    print()