class Solution:
    def shuffle(self, nums: List[int], n: int) -> List[int]:
        ans = []
        remInd = 0

        for i in range(0, len(nums), 2):
            ans.insert(i, nums[remInd])
            ans.insert(i + 1, nums[remInd + n])
            remInd += 1

        return ans
