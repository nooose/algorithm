# codeup basic 1070

n = int(input())
if n == 1 or n == 2 or n == 12:
    print('winter')
elif n >= 3 and n <=5:
    print('spring')
elif n >= 6 and n <=8:
    print('summer')
else:
    print('fall')