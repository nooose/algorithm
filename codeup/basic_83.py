# codeup basic 1085

h, b, c, s = map(int, input().split())
print('%.1f MB' % ((h * b * c * s)/8/1024/1024))