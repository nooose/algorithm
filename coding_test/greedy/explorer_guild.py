N = int(input())

datas = list(map(int, input().split()))

datas.sort()

group_cnt = 0
cnt = 0
for i in datas: # i = 공포도
    cnt += 1
    if cnt >= i:
        group_cnt += 1
        cnt = 0        

print(group_cnt)