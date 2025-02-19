T = int(input())

for i in range(T):
    N = input()
    k = int(N[len(N) - 2] + N[len(N) - 1])
    n = int(N) + 1

    if n % k == 0:
        print("Good")
    else:
        print("Bye")
