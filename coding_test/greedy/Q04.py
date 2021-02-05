def minCalc(N, data):
    target = 1
    for x in data:
        if target < x:
            break
        target += x

    return target

if __name__ == '__main__':
    N = int(input())
    data = list(map(int, input().split()))
    data.sort()
    
    result = minCalc(N, data)
    print(result)