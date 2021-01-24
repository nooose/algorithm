# codeup basic 1097


array = [[0] * 20 for _ in range(20)]

for i in range(1, 20):
    l = list(map(int, input().split())) # 입력 받을 값
    for j in range(1, 20):
        array[i][j] = l[j-1]

# 좌표 개수 입력
n = int(input()) 

for i in range(n):
    x, y = map(int, input().split())

    for j in range(1, 20):
        if array[x][j] == 0:
            array[x][j] = 1
        else:
            array[x][j] = 0
    for j in range(1, 20):
        if array[j][y] == 0:
            array[j][y] = 1
        else:
            array[j][y] = 0

# 출력
for i in range(1, 20):
    for j in range(1, 20):
        print(array[i][j], end=' ')
    print()
