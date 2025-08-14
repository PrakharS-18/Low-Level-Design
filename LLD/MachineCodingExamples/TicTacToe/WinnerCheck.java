package LLD.MachineCodingExamples.TicTacToe;

public class WinnerCheck {

    static boolean winCheck(char[][] arr) {
        return checkRowsCols(arr) || checkDiagonals(arr);
    }


    static boolean checkRowsCols(char[][] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            // Row check
            char rowChar = arr[i][0];
            boolean rowSame = rowChar != '-';
            // Column check
            char colChar = arr[0][i];
            boolean colSame = colChar != '-';

            for (int j = 1; j < n; j++) {
                if (rowSame && arr[i][j] != rowChar) rowSame = false;
                if (colSame && arr[j][i] != colChar) colSame = false;
                if (!rowSame && !colSame) break;
            }
            if (rowSame || colSame) return true;
        }
        return false;
    }

    static boolean checkDiagonals(char[][] arr) {
        int n = arr.length;

        // Main diagonal (\)
        char mainChar = arr[0][0];
        boolean mainSame = mainChar != '-';
        // Anti-diagonal (/)
        char antiChar = arr[0][n - 1];
        boolean antiSame = antiChar != '-';

        for (int i = 1; i < n; i++) {
            if (mainSame && arr[i][i] != mainChar) mainSame = false;
            if (antiSame && arr[i][n - 1 - i] != antiChar) antiSame = false;
            if (!mainSame && !antiSame) break;
        }

        return mainSame || antiSame;
    }
}
