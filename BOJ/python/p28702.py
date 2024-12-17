s = []
li = ["FizzBuzz", "Fizz", "Buzz"]
r = 0

for i in range(3):
    s.append(input())

for i in range(3):
    if s[i] not in li:
        r = int(s[i]) + (3 - i)

if r % 15 == 0:
    print("FizzBuzz")
elif r % 3 == 0:
    print("Fizz")
elif r % 5 == 0:
    print("Buzz")
else:
    print(r)