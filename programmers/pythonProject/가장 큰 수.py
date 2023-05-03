def solution(numbers):
    numbers = list(map(str, numbers))
    numbers.sort(key=lambda x: x*3, reverse=True)   # 문자열을 3번 반복하여 내림차순 정렬
    return str(int(''.join(numbers)))   # 0000 방지


numbers = [6, 10, 2]
print(solution(numbers))
