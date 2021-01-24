from collections import deque # bfs, queue

N, M = map(int, input().split())

maze = []
for i in range(N):
    maze.append(list(map(int, input().split())))

# 상, 하, 좌, 우
dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

def bfs(x, y):
    queue = deque()
    queue.append((x, y))
    
    while queue:
        x, y = queue.popleft()
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]

            # 벗어난 경우
            if nx < 0 or nx >= N or ny < 0 or ny >= M:
                continue
            # 괴물이 있는 경우
            if maze[nx][ny] == 0:
                continue

            # 처음 방문하는 경우 최단 거리 기록
            if maze[nx][ny] == 1: # 괴물이 없어 길이 있는 경우
                maze[nx][ny] = maze[x][y] + 1
                queue.append((nx, ny))
    
    return maze[N-1][M-1]

print(bfs(0, 0))