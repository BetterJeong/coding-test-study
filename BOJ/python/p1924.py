x, y = map(int, input().split())
days = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
w = ["SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"]
d = 0

for i in range(0, x - 1):
    d += days[i]

print(w[(d + y) % 7])
