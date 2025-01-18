import re

s = input()
s = re.sub("(pi|ka|chu)", "", s)

if s:
    print("NO")
else:
    print("YES")
