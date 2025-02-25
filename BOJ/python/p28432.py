N = int(input())
S = [input() for _ in range(N)]
M = int(input())
A = [input() for _ in range(M)]
s = ""
e = ""

if len(S) == 1:
    print(A[0])
else:
    if S[0] == "?":
        e = S[1][0]

        for i in range(M):
            if A[i][len(A[i])-1] == e and not A[i] in S:
                print(A[i])
                break
    elif S[N-1] == "?":
        s = S[N-2][len(S[N-2]) - 1]

        for i in range(M):
            if A[i][0] == s and not A[i] in S:
                print(A[i])
                break
    else:
        for i in range(1, N-1):
            if S[i] == "?":
                s = S[i-1][len(S[i-1]) - 1]
                e = S[i+1][0]

        for i in range(M):
            if A[i][0] == s and A[i][len(A[i])-1] == e and not A[i] in S:
                print(A[i])
