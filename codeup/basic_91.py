# codeup basic 1093

n = int(input())
l = list(map(int, input().split()))

cnt = []
for i in range(24):
    cnt.append(0)

for i in l:
    cnt[i] += 1

for i in cnt[1:]:
    print(i, end=' ')
