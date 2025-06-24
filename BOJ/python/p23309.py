import sys
input = sys.stdin.readline

def main():
    N, M = map(int, input().split())
    t = list(map(int, input().split()))

    MAX_ID = 1000000
    prev = [0] * (MAX_ID + 1)
    nxt  = [0] * (MAX_ID + 1)

    for i, cur in enumerate(t):
        prev[cur] = t[i-1] if i > 0 else t[-1]
        nxt[cur]  = t[i+1] if i < N-1 else t[0]

    out = []
    for _ in range(M):
        parts = input().split()
        cmd = parts[0]
        i = int(parts[1])

        if cmd == 'BN':
            j = int(parts[2])
            out.append(str(nxt[i]))
            r = nxt[i]
            nxt[i] = j
            prev[j] = i
            nxt[j] = r
            prev[r] = j

        elif cmd == 'BP':
            j = int(parts[2])
            out.append(str(prev[i]))
            l = prev[i]
            prev[i] = j
            nxt[j] = i
            prev[j] = l
            nxt[l] = j

        elif cmd == 'CN':
            r = nxt[i]
            out.append(str(r))
            nr = nxt[r]
            nxt[i] = nr
            prev[nr] = i

        elif cmd == 'CP':
            l = prev[i]
            out.append(str(l))
            nl = prev[l]
            prev[i] = nl
            nxt[nl] = i

    sys.stdout.write('\n'.join(out) + '\n')

if __name__ == '__main__':
    main()
