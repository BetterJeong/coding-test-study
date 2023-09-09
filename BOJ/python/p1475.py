import math

N = input()
nums = [0] * 10
rs = [0] * 9

for i in range(len(N)):
    k = int(N[i])
    nums[k] += 1

for i in range(len(nums)):
    if i == 9:
        rs[6] = math.ceil((nums[6] + nums[9]) / 2)
    else:
        rs[i] = nums[i]

print(max(rs))
