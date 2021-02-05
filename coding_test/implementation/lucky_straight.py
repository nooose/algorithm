
# N = list(input())

# left = sum(map(int, N[:len(N)//2]))
# right = sum(map(int, N[len(N)//2:]))

# if left == right:
#     print('LUCKY')
# else:
#     print('READY')

n = input()
length = len(n)
summary = 0

for i in range(length // 2):
    summary += int(n[i])

for i in range(length // 2, length):
    summary -= int(n[i])

if summary == 0:
    print('LUCKY')
else:
    print('READY')

    