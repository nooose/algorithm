# codeup basic 1098

h, w = map(int, input().split())
n = int(input())

array = [[0] * (w+1) for _ in range(h+1)]

for i in range(n):
    l, d, x, y = map(int, input().split())
    if d == 0: # 가로 : y 증가
        for j in range(l):
            array[x][y+j] = 1
    else: # 세로 : x 증가
        for j in range(l):
            array[x+j][y] = 1

for i in range(1, h+1):
    for j in range(1, w+1):
        print(array[i][j], end=' ')
    print()