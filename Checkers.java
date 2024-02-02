import java.util.*;
public class Checkers {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        pieces[][] board = new pieces[8][8];
        for(int i =0;i<8;i++){
            for(int j =0; j<8;j++){
                board[i][j] = new pieces();
            }
        }
        for(int i =1;i<3;i++){
            for(int j=0;j<8;j++) {
                board[i][j] = new pieces(i, j, "r", false);
            }
        }
        for(int i =5;i<7;i++){
            for(int j=0;j<8;j++) {
                board[i][j] = new pieces(i, j, "b", false);
            }
        }
        String[][] printboard = new String[8][8];
        for(int i =0;i<8;i++){
            for(int j =0; j<8;j++){
                printboard[i][j] = board[i][j].getColor();
            }
        }
        boolean gameStart = true;
        int turn = 0;
        System.out.println("Welcome to Turkish Draughts! Read the readme.txt for the rules and how the program works.");
        while(gameStart){
            ArrayList<Integer> moveList= new ArrayList<Integer>();
            ArrayList<Integer> moveListnoTake= new ArrayList<Integer>();
            if(turn ==1000||turn==1001){
                System.out.println("Go Again!");
            }
            if(turn%2 ==0){
                System.out.println("Red to Move!");
                printTheboard(printboard);
                //Can take a piece
                for(int i =0;i<6;i++){
                    for(int j=0;j<8;j++){
                    if(board[i][j].getColor().equals("r")&&board[i+1][j].getColor().equals("b")&&board[i+2][j].getColor().equals("-")){
                        moveList.add(i);moveList.add(j);moveList.add(i+2);moveList.add(j);
                        }
                    else if(board[i][j].getColor().equals("r")&&board[i+1][j].getColor().equals("B")&&board[i+2][j].getColor().equals("-")){
                        moveList.add(i);moveList.add(j);moveList.add(i+2);moveList.add(j);
                        }
                     else if(board[i][j].getColor().equals("R")&&board[i+1][j].getColor().equals("b")&&board[i+2][j].getColor().equals("-")){
                        moveList.add(i);moveList.add(j);moveList.add(i+2);moveList.add(j);
                    }
                    else if(board[i][j].getColor().equals("R")&&board[i+1][j].getColor().equals("B")&&board[i+2][j].getColor().equals("-")){
                        moveList.add(i);moveList.add(j);moveList.add(i+2);moveList.add(j);
                    }
                }
                }
                for(int i =0;i<7;i++){
                    for(int j=0;j<8;j++) {
                    if (board[i][j].getColor().equals("r") && board[i + 1][j].getColor().equals("-")) {
                            moveListnoTake.add(i);
                            moveListnoTake.add(j);
                            moveListnoTake.add(i + 1);
                            moveListnoTake.add(j);
                        } else if (board[i][j].getColor().equals("R") && board[i + 1][j].getColor().equals("-")) {
                            moveListnoTake.add(i);
                            moveListnoTake.add(j);
                            moveListnoTake.add(i + 1);
                            moveListnoTake.add(j);
                        }
                    }}
                for(int i =0;i<8;i++) {
                    for (int j = 0; j < 6; j++) {
                        if (board[i][j].getColor().equals("r") && board[i][j + 1].getColor().equals("b") && board[i][j + 2].getColor().equals("-")) {
                            moveList.add(i);
                            moveList.add(j);
                            moveList.add(i);
                            moveList.add(j + 2);
                        } else if (board[i][j].getColor().equals("r") && board[i][j + 1].getColor().equals("B") && board[i][j + 2].getColor().equals("-")) {
                            moveList.add(i);
                            moveList.add(j);
                            moveList.add(i);
                            moveList.add(j + 2);
                        } else if (board[i][j].getColor().equals("R") && board[i][j + 1].getColor().equals("b") && board[i][j + 2].getColor().equals("-")) {
                            moveList.add(i);
                            moveList.add(j);
                            moveList.add(i);
                            moveList.add(j + 2);
                        } else if (board[i][j].getColor().equals("R") && board[i][j + 1].getColor().equals("B") && board[i][j + 2].getColor().equals("-")) {
                            moveList.add(i);
                            moveList.add(j);
                            moveList.add(i);
                            moveList.add(j + 2);
                        }
                    }
                }
                for(int i =0;i<8;i++){
                    for(int j=0;j<6;j++) {
                        if (board[i][j].getColor().equals("r") && board[i][j + 1].getColor().equals("-")) {
                            moveListnoTake.add(i);
                            moveListnoTake.add(j);
                            moveListnoTake.add(i);
                            moveListnoTake.add(j + 1);
                        }

                        else if (board[i][j].getColor().equals("R") && board[i][j + 1].getColor().equals("-")) {
                            moveListnoTake.add(i);
                            moveListnoTake.add(j);
                            moveListnoTake.add(i);
                            moveListnoTake.add(j + 1);
                        }
                    }
                }
                for(int i =0;i<8;i++){
                    for(int j=2;j<8;j++){
                        if(board[i][j].getColor().equals("r")&&board[i][j-1].getColor().equals("b")&&board[i][j-2].getColor().equals("-")){
                            moveList.add(i);moveList.add(j);moveList.add(i);moveList.add(j-2);
                        }
                        else if(board[i][j].getColor().equals("r")&&board[i][j-1].getColor().equals("B")&&board[i][j-2].getColor().equals("-")){
                            moveList.add(i);moveList.add(j);moveList.add(i);moveList.add(j-2);
                        }
                        else if(board[i][j].getColor().equals("R")&&board[i][j-1].getColor().equals("b")&&board[i][j-2].getColor().equals("-")){
                            moveList.add(i);moveList.add(j);moveList.add(i);moveList.add(j-2);
                        }
                        else if(board[i][j].getColor().equals("R")&&board[i][j-1].getColor().equals("B")&&board[i][j-2].getColor().equals("-")){
                            moveList.add(i);moveList.add(j);moveList.add(i);moveList.add(j-2);
                        }
                    }
                }
                for(int i =0;i<8;i++){
                    for(int j=1;j<8;j++) {
                        if (board[i][j].getColor().equals("r") && board[i][j - 1].getColor().equals("-")) {
                            moveListnoTake.add(i);
                            moveListnoTake.add(j);
                            moveListnoTake.add(i);
                            moveListnoTake.add(j - 1);
                        }

                        else if (board[i][j].getColor().equals("R") && board[i][j - 1].getColor().equals("-")) {
                            moveListnoTake.add(i);
                            moveListnoTake.add(j);
                            moveListnoTake.add(i);
                            moveListnoTake.add(j - 1);
                        }
                    }
                    }
                for(int i =2;i<8;i++){
                    for(int j=0;j<8;j++){
                        if(board[i][j].getColor().equals("R")&&board[i-1][j].getColor().equals("b")&&board[i-2][j].getColor().equals("-")){
                            moveList.add(i);moveList.add(j);moveList.add(i-2);moveList.add(j);
                        }
                        else if(board[i][j].getColor().equals("R")&&board[i-1][j].getColor().equals("B")&&board[i-2][j].getColor().equals("-")){
                            moveList.add(i);moveList.add(j);moveList.add(i-2);moveList.add(j);
                        }
                    }
                }
                for(int i =1;i<8;i++){
                    for(int j=0;j<8;j++) {
                        if (board[i][j].getColor().equals("R") && board[i-1][j].getColor().equals("-")) {
                            moveListnoTake.add(i);
                            moveListnoTake.add(j);
                            moveListnoTake.add(i-1);
                            moveListnoTake.add(j);
                        }
                    }
                }
                boolean invalidMove = true;
                int move1 = 0; int move2 = 0; int move3=0; int move4=0;
                while(invalidMove) {
                    System.out.println();
                    System.out.println("Y Coordinate of the piece you wish to move: ");
                    move1 = in.nextInt()-1;
                    in.nextLine();
                    System.out.println("X Coordinate of the piece you wish to move: ");
                    move2 = in.nextInt()-1;
                    in.nextLine();
                    System.out.println("Y Coordinate of the square you wish to move to: ");
                    move3 = in.nextInt()-1;
                    in.nextLine();
                    System.out.println("X Coordinate of the square you wish to move to: ");
                    move4 = in.nextInt()-1;
                    in.nextLine();
                    if(moveList.isEmpty()){
                        for (int i = 0; i < moveListnoTake.size(); i += 4) {
                            if (move1 == moveListnoTake.get(i) && move2 == moveListnoTake.get(i + 1) && move3 == moveListnoTake.get(i + 2) && move4 == moveListnoTake.get(i + 3)){
                                invalidMove= false;
                            }
                        }
                        if(invalidMove ==true){
                            System.out.println("Redo Your Move.");
                            printTheboard(printboard);
                        }
                    }
                    else {
                        for (int i = 0; i < moveList.size(); i += 4) {
                            if (move1 == moveList.get(i) && move2 == moveList.get(i + 1) && move3 == moveList.get(i + 2) && move4 == moveList.get(i + 3)){
                                invalidMove = false;
                            }
                        }
                        if(invalidMove ==true){
                            System.out.println("You are forced to take the opponent piece.");
                            printTheboard(printboard);
                        }
                    }
                }
                if(move3==7){
                    board[move1][move2].makeKing(true);
                }
                if(moveList.isEmpty()) {
                    String tempc =board[move1][move2].getColor();
                    boolean tempk = board[move1][move2].kingStatus();
                    board[move3][move4].setColor(tempc);
                    board[move3][move4].setKing(tempk);
                    board[move1][move2].setColor("-");
                    turn =1;
                }
                else{
                    String tempc =board[move1][move2].getColor();
                    boolean tempk = board[move1][move2].kingStatus();
                    board[move3][move4].setColor(tempc);
                    board[move3][move4].setKing(tempk);
                    board[move1][move2].setColor("-");
                    board[(move1+move3)/2][(move4+move2)/2].setColor("-");
                    turn = 1000;
                }
                for(int i =0;i<8;i++){
                    for(int j =0; j<8;j++){
                        printboard[i][j] = board[i][j].getColor();
                    }
                }



            }
            else if(turn%2 ==1) {
                System.out.println("Black to Move!");
                printTheboard(printboard);
                for(int i =2;i<8;i++){
                    for(int j=0;j<8;j++){
                        if(board[i][j].getColor().equals("b")&&board[i-1][j].getColor().equals("r")&&board[i-2][j].getColor().equals("-")){
                            moveList.add(i);moveList.add(j);moveList.add(i-2);moveList.add(j);
                        }
                        else if(board[i][j].getColor().equals("b")&&board[i-1][j].getColor().equals("R")&&board[i-2][j].getColor().equals("-")){
                            moveList.add(i);moveList.add(j);moveList.add(i-2);moveList.add(j);
                        }
                        else if(board[i][j].getColor().equals("B")&&board[i-1][j].getColor().equals("r")&&board[i-2][j].getColor().equals("-")){
                            moveList.add(i);moveList.add(j);moveList.add(i-2);moveList.add(j);
                        }
                        else if(board[i][j].getColor().equals("B")&&board[i-1][j].getColor().equals("R")&&board[i-2][j].getColor().equals("-")){
                            moveList.add(i);moveList.add(j);moveList.add(i-2);moveList.add(j);
                        }
                    }
                }
                for(int i =1;i<8;i++){
                    for(int j=0;j<8;j++) {
                        if (board[i][j].getColor().equals("b") && board[i - 1][j].getColor().equals("-")) {
                            moveListnoTake.add(i);
                            moveListnoTake.add(j);
                            moveListnoTake.add(i - 1);
                            moveListnoTake.add(j);
                        } else if (board[i][j].getColor().equals("B") && board[i - 1][j].getColor().equals("-")) {
                            moveListnoTake.add(i);
                            moveListnoTake.add(j);
                            moveListnoTake.add(i - 1);
                            moveListnoTake.add(j);
                        }
                    }}
                for(int i =0;i<8;i++) {
                    for (int j = 0; j < 6; j++) {
                        if (board[i][j].getColor().equals("b") && board[i][j + 1].getColor().equals("r") && board[i][j + 2].getColor().equals("-")) {
                            moveList.add(i);
                            moveList.add(j);
                            moveList.add(i);
                            moveList.add(j + 2);
                        } else if (board[i][j].getColor().equals("b") && board[i][j + 1].getColor().equals("R") && board[i][j + 2].getColor().equals("-")) {
                            moveList.add(i);
                            moveList.add(j);
                            moveList.add(i);
                            moveList.add(j + 2);
                        } else if (board[i][j].getColor().equals("B") && board[i][j + 1].getColor().equals("r") && board[i][j + 2].getColor().equals("-")) {
                            moveList.add(i);
                            moveList.add(j);
                            moveList.add(i);
                            moveList.add(j + 2);
                        } else if (board[i][j].getColor().equals("B") && board[i][j + 1].getColor().equals("R") && board[i][j + 2].getColor().equals("-")) {
                            moveList.add(i);
                            moveList.add(j);
                            moveList.add(i);
                            moveList.add(j + 2);
                        }
                    }
                }
                for(int i =0;i<8;i++){
                    for(int j=0;j<6;j++) {
                        if (board[i][j].getColor().equals("b") && board[i][j + 1].getColor().equals("-")) {
                            moveListnoTake.add(i);
                            moveListnoTake.add(j);
                            moveListnoTake.add(i);
                            moveListnoTake.add(j + 1);
                        }

                        else if (board[i][j].getColor().equals("B") && board[i][j + 1].getColor().equals("-")) {
                            moveListnoTake.add(i);
                            moveListnoTake.add(j);
                            moveListnoTake.add(i);
                            moveListnoTake.add(j + 1);
                        }
                    }
                }
                for(int i =0;i<8;i++){
                    for(int j=2;j<8;j++){
                        if(board[i][j].getColor().equals("b")&&board[i][j-1].getColor().equals("r")&&board[i][j-2].getColor().equals("-")){
                            moveList.add(i);moveList.add(j);moveList.add(i);moveList.add(j-2);
                        }
                        else if(board[i][j].getColor().equals("b")&&board[i][j-1].getColor().equals("R")&&board[i][j-2].getColor().equals("-")){
                            moveList.add(i);moveList.add(j);moveList.add(i);moveList.add(j-2);
                        }
                        else if(board[i][j].getColor().equals("B")&&board[i][j-1].getColor().equals("r")&&board[i][j-2].getColor().equals("-")){
                            moveList.add(i);moveList.add(j);moveList.add(i);moveList.add(j-2);
                        }
                        else if(board[i][j].getColor().equals("B")&&board[i][j-1].getColor().equals("R")&&board[i][j-2].getColor().equals("-")){
                            moveList.add(i);moveList.add(j);moveList.add(i);moveList.add(j-2);
                        }
                    }
                }
                for(int i =0;i<8;i++){
                    for(int j=1;j<8;j++) {
                        if (board[i][j].getColor().equals("b") && board[i][j - 1].getColor().equals("-")) {
                            moveListnoTake.add(i);
                            moveListnoTake.add(j);
                            moveListnoTake.add(i);
                            moveListnoTake.add(j - 1);
                        }

                        else if (board[i][j].getColor().equals("B") && board[i][j - 1].getColor().equals("-")) {
                            moveListnoTake.add(i);
                            moveListnoTake.add(j);
                            moveListnoTake.add(i);
                            moveListnoTake.add(j - 1);
                        }
                    }
                }
                for(int i =0;i<6;i++){
                    for(int j=0;j<8;j++){
                        if(board[i][j].getColor().equals("B")&&board[i+1][j].getColor().equals("r")&&board[i+2][j].getColor().equals("-")){
                            moveList.add(i);moveList.add(j);moveList.add(i+2);moveList.add(j);
                        }
                        else if(board[i][j].getColor().equals("B")&&board[i+1][j].getColor().equals("R")&&board[i+2][j].getColor().equals("-")){
                            moveList.add(i);moveList.add(j);moveList.add(i+2);moveList.add(j);
                        }
                    }
                }
                for(int i =0;i<7;i++){
                    for(int j=0;j<8;j++) {
                        if (board[i][j].getColor().equals("B") && board[i+1][j].getColor().equals("-")) {
                            moveListnoTake.add(i);
                            moveListnoTake.add(j);
                            moveListnoTake.add(i+1);
                            moveListnoTake.add(j);
                        }
                    }
                }
                boolean invalidMove = true;
                int move1 = 0; int move2 = 0; int move3=0; int move4=0;
                while(invalidMove) {
                    System.out.println();
                    System.out.println("Y Coordinate of the piece you wish to move: ");
                    move1 = in.nextInt()-1;
                    in.nextLine();
                    System.out.println("X Coordinate of the piece you wish to move: ");
                    move2 = in.nextInt()-1;
                    in.nextLine();
                    System.out.println("Y Coordinate of the square you wish to move to: ");
                    move3 = in.nextInt()-1;
                    in.nextLine();
                    System.out.println("X Coordinate of the square you wish to move to: ");
                    move4 = in.nextInt()-1;
                    in.nextLine();
                    if(moveList.isEmpty()){
                        for (int i = 0; i < moveListnoTake.size(); i += 4) {
                            if (move1 == moveListnoTake.get(i) && move2 == moveListnoTake.get(i + 1) && move3 == moveListnoTake.get(i + 2) && move4 == moveListnoTake.get(i + 3)){
                                invalidMove= false;
                            }
                        }
                        if(invalidMove ==true){
                            System.out.println("Redo Your Move.");
                            printTheboard(printboard);
                        }
                    }
                    else {
                        for (int i = 0; i < moveList.size(); i += 4) {
                            if (move1 == moveList.get(i) && move2 == moveList.get(i + 1) && move3 == moveList.get(i + 2) && move4 == moveList.get(i + 3)){
                                invalidMove = false;
                            }
                        }
                        if(invalidMove ==true){
                            System.out.println("You are forced to take the opponent piece.");
                            printTheboard(printboard);
                        }
                    }
                }
                if(move3==7){
                    board[move1][move2].makeKing(true);
                }
                if(moveList.isEmpty()) {
                    String tempc =board[move1][move2].getColor();
                    boolean tempk = board[move1][move2].kingStatus();
                    board[move3][move4].setColor(tempc);
                    board[move3][move4].setKing(tempk);
                    board[move1][move2].setColor("-");
                    turn =0;
                }
                else{
                    String tempc =board[move1][move2].getColor();
                    boolean tempk = board[move1][move2].kingStatus();
                    board[move3][move4].setColor(tempc);
                    board[move3][move4].setKing(tempk);
                    board[move1][move2].setColor("-");
                    board[(move1+move3)/2][(move4+move2)/2].setColor("-");
                    turn = 1001;
                }
                for(int i =0;i<8;i++){
                    for(int j =0; j<8;j++){
                        printboard[i][j] = board[i][j].getColor();
                    }
                }
            }
            gameStart = gameEnd(board);
            Winner(board);
        }
    }





    public static void printTheboard(String[][]a){
        System.out.println("  1 2 3 4 5 6 7 8");
        for(int i =0;i<8;i++){
            System.out.print(i+1+" ");
            for(int j =0; j<8;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static boolean gameEnd(pieces[][] a) {
        int red = 0;
        int black = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (a[i][j].getColor().equals("b") || a[i][j].getColor().equals("B")) {
                    black++;
                } else if (a[i][j].getColor().equals("r") || a[i][j].getColor().equals("R")) {
                    red++;
                }
            }
        }
        if (red == 0 || black == 0) {
            return false;
        } else
            return true;
    }

    public static void Winner(pieces[][] a) {
        int red = 0;
        int black = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (a[i][j].getColor().equals("b") || a[i][j].getColor().equals("B")) {
                    black++;
                } else if (a[i][j].getColor().equals("r") || a[i][j].getColor().equals("R")) {
                    red++;
                }
            }
        }
        if ( black == 0) {
            System.out.println("Red Wins!");
        }
        else if (red ==0 ){
            System.out.println("Black Wins!");
        }

    }
}

