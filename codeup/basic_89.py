# codeup basic 1091

a, m, d, n = map(int, input().split())

idx = a
cnt = 0
while True:
    cnt += 1
    if cnt == n:
        print(idx)
        break
    idx *= m
    idx += d