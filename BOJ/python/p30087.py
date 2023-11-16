li = [["Algorithm", "204"], ["DataAnalysis", "207"], ["ArtificialIntelligence", "302"],
      ["CyberSecurity", "B101"], ["Network", "303"], ["Startup", "501"], ["TestStrategy", "105"]]

N = int(input())

for _ in range(N):
    s = input()
    for i in range(len(li)):
        if li[i][0] == s:
            print(li[i][1])
            break
