# codeup basic 1096

n = int(input())
array = [[0] * 20 for _ in range(20)]
for i in range(n):
    x, y = map(int, input().split())
    array[x][y] = 1

for i in range(1, 20):
    for j in range(1, 20):
        print(array[i][j], end=' ')
    print()
