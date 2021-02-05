def dfs(array, direction, initR, initC, finalR, finalC, costRows, costCols, costRows_idx, costCols_idx):
    if initR >= len(costRows)-1 or initC > len(costCols)-1:
        return

    # 아래면
    if direction == 0:
        if array[initR+1][initC] == 100000:
            array[initR+1][initC] = costRows[costRows_idx]
        else:
            array[initR+1][initC] = min(array[initR+1][initC], array[initR][initC] + costRows[costRows_idx])
    else: # 오른쪽이면
        if array[initR][initC+1] == 100000:
            array[initR][initC+1] = costCols[costCols_idx]
        else:
            array[initR][initC+1] = min(array[initR][initC+1], array[initR][initC] + costCols[costCols_idx])
        
    print('---')
    for arr in array:
        print(arr)
    dfs(array, 0, initR+1, initC, finalR, finalC, costRows, costCols, costRows_idx+1, costCols_idx)
    dfs(array, 1, initR, initC+1, finalR, finalC, costRows, costCols, costRows_idx, costCols_idx+1)
    

def minCost(array, rows, cols, initR, initC, finalR, finalC, costRows, costCols):
    # Write your code here
    array[initR][initC] = 0
    print('first', array)
    dfs(array, 0, initR, initC, finalR, finalC, costRows, costCols, 0, 0)
    dfs(array, 1, initR, initC, finalR, finalC, costRows, costCols, 0, 0)
    
    result = array[finalR][finalC]
    return result

if __name__ == '__main__':
    rows = int(input().strip())

    cols = int(input().strip())

    initR = int(input().strip())

    initC = int(input().strip())

    finalR = int(input().strip())

    finalC = int(input().strip())

    costRows_count = int(input().strip())

    costRows = []
    
    array = [[100000]* rows] * rows
    
    for _ in range(costRows_count):
        costRows_item = int(input().strip())
        costRows.append(costRows_item)

    costCols_count = int(input().strip())

    costCols = []

    for _ in range(costCols_count):
        costCols_item = int(input().strip())
        costCols.append(costCols_item)

    result = minCost(array, rows, cols, initR, initC, finalR, finalC, costRows, costCols)

    print(result)
