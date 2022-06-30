def buildArray(self, nums: List[int]) -> List[int]:
    ans = []
    for item in range(len(nums)):
        ans.append(nums[nums[item]])
    return ans
