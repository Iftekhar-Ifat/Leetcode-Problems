class Solution:
    def transpose(self, matrix: List[List[int]]) -> List[List[int]]:

        rows = len(matrix)
        cols = len(matrix[0])
        res = []
        for j in range(cols):
            temp = []
            for i in range(rows):
                temp.append(matrix[i][j])
            res.append(temp)
        return res