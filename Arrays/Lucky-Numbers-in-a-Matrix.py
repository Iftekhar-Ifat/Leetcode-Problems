class Solution:
    def luckyNumbers(self, matrix: List[List[int]]) -> List[int]:

        ans = []

        for i in range(0, len(matrix)):
            k = 0
            small = sys.maxsize
            for j in range(0, len(matrix[0])):
                if small > matrix[i][j]:
                    small = matrix[i][j]
                    k = j

            big = -sys.maxsize

            for j in range(len(matrix)):
                big = max(matrix[j][k], big)

            if big == small:
                ans.append(big)

        return ans
