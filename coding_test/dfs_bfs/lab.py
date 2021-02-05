# DFS
N, M = map(int, input().split())

lab = []
temp = [[0] * M for _ in range(N)]

for _ in range(N):
    lab.append(list(map(int, input().split())))

# 상하좌우
dx = [0, 0, -1, 1]
dy = [-1, 1, 0, 0]

result = 0

# 현재 위치에서 바이러스 퍼지기
def virus(x, y):
    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]
        # 범위가 알맞은 경우
        if nx >= 0 and nx < N and ny >= 0 and ny < M:
            if temp[nx][ny] == 0:
                temp[nx][ny] = 2
                virus(nx, ny)

def get_score():
    score = 0
    for i in range(N):
        for j in range(M):
            if temp[i][j] == 0:
                score += 1
    return score

# 벽 세우고 카운트
def dfs(count):
    global result

    if count == 3:
        # 초기값 복사(초기화)
        for i in range(N):
            for j in range(M):
                temp[i][j] = lab[i][j]
        
        # 바이러스 퍼지기
        for i in range(N):
            for j in range(M):
                if temp[i][j] == 2:
                    virus(i, j)

        # 최대값 구해서 적용
        result = max(result, get_score())
        return 

    # 벽 설치
    for i in range(N):
        for j in range(M):
            if lab[i][j] == 0:
                lab[i][j] == 1
                count += 1
                dfs(count)
                lab[i][j] = 0
                count -= 1

dfs(0)
print(result)
    