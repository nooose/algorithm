def solution(s):
    answer = len(s)

    print(s, '압축')
    for step in range(1, len(s)//2 + 1):
        compressed = ''
        prev = s[0:step]
        count = 1
        print(step, '단계:', prev)

        #
        for j in range(step, len(s), step):
            print(prev, '/', s[j:j+step], '같은지 확인')
            if prev == s[j:j+step]:
                count += 1
            else:
                compressed += str(count) + prev if count >= 2 else prev
                prev = s[j:j+step]
                count = 1
        
        print('압축 전:', compressed)
        compressed += str(count) + prev if count >= 2 else prev
        
        print('압축: 후', compressed)
        answer = min(answer, len(compressed))    
    
    return answer


print(solution('aabbaccc'))
print(solution('ababcdcdababcdcd'))
print(solution('abcabcdede'))
print(solution('abcabcabcabcdededededede'))
print(solution('xababcdcdababcdcd'))