class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        d = {}
        for i, j in enumerate(nums):
            if j not in d:
                d[j] = [i]
            else:
                d[j].append(i)

        for i in nums:
            t = target - i
            if t in d and t == i and len(d[i]) > 1:
                return [d[i][0], d[i][1]]
            elif t != i and t in d:
                return [d[i][0], d[t][0]]