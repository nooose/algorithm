INF = int(1e9)
N, M = map(int, input().split())
graph = [[INF] * (N + 1) for _ in range(N+1)]

for A in range(1, N+1):
    for B in range(1, N+1):
        if A == B:
            graph[A][B] = 0
    
for _ in range(M):
    # A < B
    A, B = map(int, input().split())
    graph[A][B] = 1

for k in range(1, N+1):
    for A in range(1, N+1):
        for B in range(1, N+1):
            graph[A][B] = min(graph[A][B], graph[A][k]+graph[k][B])

result = 0
for i in range(1, N+1):
    count = 0
    for j in range(1, N+1):
        if graph[i][j] != INF or graph[j][i] != INF:
            count += 1
            # print(i, j, graph[i][j], '/', j, i, graph[j][i])
    if count == N:
        # print('Node:', i)
        result += 1

print(result)