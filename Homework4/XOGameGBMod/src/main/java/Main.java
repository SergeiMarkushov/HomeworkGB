import java.util.Random;
import java.util.Scanner;

public class Main {
        public static char map[][];
        public static int SIZE = 3;
        public static int DOTS_TO_WIN = 3;
        public static final char DOT_EMPTY = '•';
        public static final char DOT_X = 'X';
        public static final char DOT_O = 'O';
        public static Scanner sc = new Scanner(System.in);
        public static Random rand = new Random();

        public static void main(String[] args) {

                play();
        }

        private static void play() {
                initMap();
                printMap();
                while (true) {
                        humanTurn();
                        printMap();
                        if (checkWin(DOT_X)) {
                                System.out.println("The human win!");
                                break;
                        }
                        if (isMapFull()) {
                                System.out.println("DRAW");
                                break;
                        }
                        aiTurn();
                        printMap();
                        if (checkWin(DOT_O)) {
                                System.out.println("AI win!");
                                break;
                        }
                        if (isMapFull()) {
                                System.out.println("Nobody wins");
                                break;
                        }
                }
                System.out.println(" Game over ");
        }

        public static void initMap() {
                map = new char[SIZE][SIZE];
                for (int i = 0; i < SIZE; i++) {
                        for (int j = 0; j < SIZE; j++) {
                                map[i][j] = DOT_EMPTY;
                        }
                }
        }

        public static void printMap() {
                for (int i = 0; i < SIZE + 1; i++) {
                        if (i == 0) {
                                System.out.print("  ");
                        } else {
                                System.out.print((i) + " ");
                        }
                }
                System.out.println();
                for (int i = 0; i < SIZE; i++) {
                        System.out.print((i + 1) + " ");
                        for (int j = 0; j < map[i].length; j++) {
                                System.out.print(map[i][j] + " ");
                        }
                        System.out.println();
                }
        }

        public static void humanTurn() {
                System.out.println("Set the point in format X Y");
                int x, y;
                do {
                        x = sc.nextInt() - 1;
                        y = sc.nextInt() - 1;
                } while (!isCellValid(x, y));
                map[y][x] = DOT_X;
        }

        public static boolean isCellValid(int x, int y) {
                if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
                if (map[y][x] == DOT_EMPTY) return true;
                return false;
        }

        public static boolean isMapFull() {
                for (int i = 0; i < SIZE; i++) {
                        for (int j = 0; j < SIZE; j++) {
                                if (map[i][j] == DOT_EMPTY)
                                        return false;
                        }
                }
                return true;
        }

        public static void aiTurn() {
                int x, y;
                do {
                        x = rand.nextInt(SIZE);
                        y = rand.nextInt(SIZE);
                } while (!isCellValid(x, y));
                System.out.println("Computer set the point in " + (x + 1) + " " + (y + 1));
                map[y][x] = DOT_O;
        }

        public static boolean checkWin(char symb) {
                //Проверяем горизонталь и вертикаль
                int diagonal1, diagonal2, horizontal, vertical;
                for (int i = 0; i < SIZE; i++) {
                        horizontal = 0; vertical = 0;
                        for (int j = 0; j < SIZE; j++) {
                                if (map[i][j] == symb) {
                                        horizontal++;
                                }
                                if (map[j][i] == symb) {
                                        vertical++;
                                }
                        }
                        if (horizontal == DOTS_TO_WIN || vertical == DOTS_TO_WIN) {
                                return true;
                        }
                }
                diagonal1 = 0; diagonal2 = 0;
                //Диагонали
                for (int i = 0; i < SIZE; i++)
                {
                        if (map[i][i] == symb) {
                                diagonal1++;
                        }
                        if (map[i][(SIZE-1) - i] == symb) {
                                diagonal2++;
                        }
                }
                if (diagonal1 == DOTS_TO_WIN || diagonal2 == DOTS_TO_WIN) {
                        return true;
                }
                return false;
        }
}
