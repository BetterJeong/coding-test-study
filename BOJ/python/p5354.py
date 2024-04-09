T = int(input())
matrix = ["#", "##\n##", "###\n#J#\n###", "####\n#JJ#\n#JJ#\n####", "#####\n#JJJ#\n#JJJ#\n#JJJ#\n#####",
          "######\n#JJJJ#\n#JJJJ#\n#JJJJ#\n#JJJJ#\n######",
          "#######\n#JJJJJ#\n#JJJJJ#\n#JJJJJ#\n#JJJJJ#\n#JJJJJ#\n#######",
          "########\n#JJJJJJ#\n#JJJJJJ#\n#JJJJJJ#\n#JJJJJJ#\n#JJJJJJ#\n#JJJJJJ#\n########",
          "#########\n#JJJJJJJ#\n#JJJJJJJ#\n#JJJJJJJ#\n#JJJJJJJ#\n#JJJJJJJ#\n#JJJJJJJ#\n#JJJJJJJ#\n#########",
          "##########\n#JJJJJJJJ#\n#JJJJJJJJ#\n#JJJJJJJJ#\n#JJJJJJJJ#\n#JJJJJJJJ#\n#JJJJJJJJ#\n#JJJJJJJJ#\n#JJJJJJJJ#\n##########"]

for _ in range(T):
    J = int(input())
    print(matrix[J-1] + '\n')
