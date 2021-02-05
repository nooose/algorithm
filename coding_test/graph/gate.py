def find_parent(parent, x):
    if parent[x] != x:
        parent[x] = find_parent(parent, parent[x])
    return parent[x]

def union_parent(parent, a, b):
    a = find_parent(parent, a)
    b = find_parent(parent, b)
    if a < b:
        parent[b] = a
    else:
        parent[a] = b

G = int(input()) # 탑승구의 수
P = int(input()) # 비행기의 수
parent = [0] * (G+1)

for i in range(1, G + 1):
    parent[i] = i

result = 0
for _ in range(P):
    data = int(input())
    if find_parent(parent, data) == 0:
        break
    union_parent(parent, data, data - 1)
    result += 1

print(result)