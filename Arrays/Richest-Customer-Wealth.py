class Solution:
    def maximumWealth(self, accounts: List[List[int]]) -> int:

        mx = -sys.maxsize

        for i in range(0, len(accounts)):
            temp = 0
            for j in range(0, len(accounts[i])):
                temp += accounts[i][j]
            mx = max(mx, temp)

        return mx
