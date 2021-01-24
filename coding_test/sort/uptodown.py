N = int(input())

number = []
for i in range(N):
    number.append(int(input()))

number = sorted(number, reverse=True)

for i in number:
    print(i, end=' ')
