k = list(input())
n = 0
b = True

if len(k) < 3:
    b = True
else:
    n = int(k[0]) - int(k[1])

    for i in range(1, len(k)-1):
        if int(k[i]) - int(k[i+1]) != n:
            b = False
            break

if b:
    print("◝(⑅•ᴗ•⑅)◜..°♡ 뀌요미!!")
else:
    print("흥칫뿡!! <(￣ ﹌ ￣)>")
