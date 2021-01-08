# codeup basic 1064

a, b, c = map(int, input().split())
num = a if a<b else b
print(num if num<c else c)