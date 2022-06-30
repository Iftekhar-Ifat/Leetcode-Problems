class Solution:
    def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:

        ans = []
        max_candies = -sys.maxsize

        for i in candies:
            max_candies = max(max_candies, i)

        for i in candies:
            chk = i + extraCandies
            if chk >= max_candies:
                ans.append(True)
            else:
                ans.append(False)

        return ans
