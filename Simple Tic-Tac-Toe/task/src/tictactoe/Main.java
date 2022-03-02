package tictactoe;

import java.util.Scanner;

import static java.lang.Math.abs;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = "_________";

        char[][] arrayCh = new char[3][3];

        int symbol = 0;
        int symbolSpace = 0;
        for (int i = 0; i < arrayCh.length; i++) {
            for (int j = 0; j < arrayCh[i].length; j++) {
                if (str.charAt(symbol) == '_') {
                    symbolSpace++;
                }
                arrayCh[i][j] = str.charAt(symbol);
                symbol++;
            }
        }

        System.out.println("---------");
        System.out.println("| " + arrayCh[0][0] + " " + arrayCh[0][1] + " " + arrayCh[0][2] + " |");
        System.out.println("| " + arrayCh[1][0] + " " + arrayCh[1][1] + " " + arrayCh[1][2] + " |");
        System.out.println("| " + arrayCh[2][0] + " " + arrayCh[2][1] + " " + arrayCh[2][2] + " |");
        System.out.println("---------");

        while (symbolSpace != 0) {

            int coordinateX = 0;
            int coordinateY = 0;
            boolean notNumberX;
            boolean notNumberY;
            do {
                notNumberX = false;
                notNumberY = false;

                System.out.print("Enter the coordinates: ");
                if (scanner.hasNextInt()) {
                    coordinateX = scanner.nextInt();
                } else {
                    notNumberX = true;
                }

                if (scanner.hasNextInt()) {
                    coordinateY = scanner.nextInt();
                } else {
                    notNumberY = true;
                }

                if (notNumberX || notNumberY) {
                    System.out.println("You should enter numbers!");
                    scanner.nextLine(); // clean
                }

            } while (notNumberX || notNumberY);

            if ((coordinateX <= 0 || coordinateX >= 4)
                    || (coordinateY <= 0 || coordinateY >= 4)) {
                System.out.println("Coordinates should be from 1 to 3!");
            } else {

                if (arrayCh[coordinateX - 1][coordinateY - 1] == '_') {

                    if ((symbolSpace + 1) % 2 == 0) {
                        arrayCh[coordinateX - 1][coordinateY - 1] = 'X';
                    } else {
                        arrayCh[coordinateX - 1][coordinateY - 1] = 'O';
                    }

                    System.out.println("---------");
                    System.out.println("| " + arrayCh[0][0] + " " + arrayCh[0][1] + " " + arrayCh[0][2] + " |");
                    System.out.println("| " + arrayCh[1][0] + " " + arrayCh[1][1] + " " + arrayCh[1][2] + " |");
                    System.out.println("| " + arrayCh[2][0] + " " + arrayCh[2][1] + " " + arrayCh[2][2] + " |");
                    System.out.println("---------");

                    symbolSpace--;

                } else {
                    System.out.println("This cell is occupied! Choose another one!");
                }

                if (symbolSpace < 5) {

                    boolean isSpace = false;
                    boolean winX = false;
                    boolean winO = false;

                    // for Diagonal sum X = 264; O = 237
                    int sumX = (int) 'X' + (int) 'X' + (int) 'X';
                    int sumO = (int) 'O' + (int) 'O' + (int) 'O';
                    int mainDiagonal = arrayCh[0][0] + arrayCh[1][1] + arrayCh[2][2];
                    int secondaryDiagonal = arrayCh[0][2] + arrayCh[1][1] + arrayCh[2][0];

                    if (mainDiagonal == sumX || secondaryDiagonal == sumX) {
                        winX = true;
                    }

                    if (mainDiagonal == sumO || secondaryDiagonal == sumO) {
                        winO = true;
                    }

                    int countX = 0;
                    int countO = 0;
                    for (int i = 0; i < arrayCh.length; i++) {
                        int countRowX = 0;
                        int countColX = 0;
                        int countRowO = 0;
                        int countColO = 0;

                        for (int j = 0; j < arrayCh[i].length; j++) {

                            if (arrayCh[i][j] == '_') {
                                isSpace = true;
                            }

                            // for X row and colum
                            if (arrayCh[i][j] == 'X') {
                                countRowX++;
                                countX++;
                            }
                            if (arrayCh[j][i] == 'X') {
                                countColX++;
                            }

                            // for O row and colum
                            if (arrayCh[i][j] == 'O') {
                                countRowO++;
                                countO++;
                            }
                            if (arrayCh[j][i] == 'O') {
                                countColO++;
                            }

                            if (countRowX == 3 || countColX == 3) {
                                winX = true;
                            }

                            if (countRowO == 3 || countColO == 3) {
                                winO = true;
                            }

                        }
                    }

                    boolean isImpossible = abs(countX - countO) >= 2;

                    if (!winX && !winO && !isImpossible) {

                        if (isSpace) {
                            System.out.println("Game not finished");
                        } else {
                            System.out.println("Draw");
                            break;
                        }

                    } else if ((winX && winO) || isImpossible) {
                        System.out.println("Impossible");
                        break;
                    } else if (winX) {
                        System.out.println("X wins");
                        break;
                    } else if (winO) {
                        System.out.println("O wins");
                        break;
                    }

                }
            }
        }
    }
}
