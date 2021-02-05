
N = int(input())

array = []
for i in range(N):
    l = input().split()
    array.append((l[0], int(l[1])))


def setting(data):
    return data[1]

array = sorted(array, key=setting)


for i in array:
    print(i[0], end=' ')


