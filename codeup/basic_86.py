# codeup basic 1088

n = int(input())

for i in range(1, n+1):
    if (i % 3 != 0) and i <= n:
        print(i, end=' ')
