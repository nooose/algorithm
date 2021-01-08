# codeup basic 1080

n = int(input())
sum = 0
for i in range(1, n+1):
    sum += i
    if (sum >= n):
        print(i)
        break