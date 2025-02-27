R, C = map(int, input().split())
li = [list(map(int, input().split())) for i in range(C)]
li90 = [list(map(int, input().split())) for j in range(R)]
b = True

for i in range(C):
    if not b:
        break

    for j in range(R):
        if li[i][j] != li90[j][C-i-1]:
            b = False
            break

if b:
    print("|>___/|        /}")
    print("| O < |       / }")
    print("(==0==)------/ }")
    print("| ^  _____    |")
    print("|_|_/     ||__|")
else:
    print("|>___/|     /}")
    print("| O O |    / }")
    print("( =0= )\"\"\"\"  \\")
    print("| ^  ____    |")
    print("|_|_/    ||__|")
