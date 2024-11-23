while True:
    n = int(input())
    li = []
    s = []

    if n == -1:
        break

    for i in range(1, int(n/2)+1):
        if n % i == 0:
            li.append(i)
            s.append(str(i))

    if sum(li) == n:
        print(n, "=", " + ".join(s))
    else:
        print(n, "is NOT perfect.")