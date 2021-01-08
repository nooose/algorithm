# codeup basic 1086

w, h, b = map(int, input().split())
print('%.2f MB' % ((w * h * b)/8/1024/1024))