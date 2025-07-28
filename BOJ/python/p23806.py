N = int(input())

for i in range(5 * N):
    for j in range(5 * N):
        if N <= i < 4 * N and N <= j < 4 * N:
            print(" ", end='')
        else:
            print("@", end='')
    print()
