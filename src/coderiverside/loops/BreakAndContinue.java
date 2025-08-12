package coderiverside.loops;

public class BreakAndContinue {

    public static void main(String... args) {
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                break; // Sale del bucle cuando i es 3
            }
            System.out.println(i);
        }

        System.out.println();

        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                continue; // Salta la iteración cuando i es 3
            }
            System.out.println(i);
        }

        char[][] matrix = {
                {'A', 'B', 'C', 'D', 'E'},
                {'F', 'G', 'H', 'I', 'J'},
                {'K', 'L', 'M', 'N', 'O'},
                {'P', 'Q', 'R', 'S', 'T'},
                {'U', 'V', 'W', 'X', 'Y'}
        };

        StringBuilder text = new StringBuilder();

        forLabel:
        for (char[] row : matrix) {
            for (char ch : row) {
                if(ch == 'C'){ continue; }
                if(ch == 'H'){ continue forLabel; }
                if(ch == 'M'){ break; }
                if(ch == 'R'){ break forLabel; }
                text.append(ch);
            }
            text.append('\n');
        }
        System.out.println("text = " + text);

    }
}
