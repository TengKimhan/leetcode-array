package src.solution;// 3142. Check if Grid Satisfies Conditions

/*
    You are given a 2D matrix grid of size m x n. You need to check if each cell grid[i][j] is:
        1. Equal to the cell below it, i.e. grid[i][j] == grid[i + 1][j] (if it exists).
        2. Different from the cell to its right, i.e. grid[i][j] != grid[i][j + 1] (if it exists).

    Return true if all the cells satisfy these conditions, otherwise, return false.
*/

public class CheckIfGridSatisfiesConditions {
    public boolean satisfiesConditions(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        for (int i=0; i<row; i++) {
            for (int j=0; j<col; j++) {
                if (i+1 < row && grid[i][j] != grid[i+1][j]) return false;
                if (j+1 < col && grid[i][j] == grid[i][j+1]) return false;
            }
        }
        return true;
    }
}
