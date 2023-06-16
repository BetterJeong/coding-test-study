def solution(citations):
    citations.sort(reverse=True)
    for i in range(len(citations)):  # 배열 길이만큼 반복
        if i >= citations[i]:  # 인용 횟수가 i개 이상인 것이 i개
            return i
    return len(citations)


citations = [25, 8, 5, 3, 3]
print(solution(citations))
