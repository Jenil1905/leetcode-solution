class Solution {
    int m, n;
    char[][] grid;
    Boolean[][][] dp;

    public boolean hasValidPath(char[][] grid) {
        this.grid = grid;
        m = grid.length;
        n = grid[0].length;

        // Path length must be even
        if ((m + n - 1) % 2 != 0) {
            return false;
        }

        // First must be '(' and last must be ')'
        if (grid[0][0] == ')' || grid[m - 1][n - 1] == '(') {
            return false;
        }

        dp = new Boolean[m][n][m + n + 1];

        return dfs(0, 0, 0);
    }

    private boolean dfs(int row, int col, int balance) {

        // Process current cell
        if (grid[row][col] == '(') {
            balance++;
        } else {
            balance--;
        }

        // More closing brackets than opening brackets
        if (balance < 0) {
            return false;
        }

        // Destination
        if (row == m - 1 && col == n - 1) {
            return balance == 0;
        }

        // Remaining cells
        int remaining = (m - 1 - row) + (n - 1 - col);

        // Even if all remaining cells are ')',
        // we cannot close all our open brackets
        if (balance > remaining) {
            return false;
        }

        // Same state already calculated
        if (dp[row][col][balance] != null) {
            return dp[row][col][balance];
        }

        boolean result = false;

        // Down
        if (row + 1 < m) {
            result = dfs(row + 1, col, balance);
        }

        // Right
        if (!result && col + 1 < n) {
            result = dfs(row, col + 1, balance);
        }

        dp[row][col][balance] = result;

        return result;
    }
}