package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){

        Scanner scan = new Scanner(System.in); // importieren nicht vergessen
        float input; // float Variable names "input" deklariert
        float max = 0; // float Variable names "max" deklariert & initialisiert
        int count = 1; // int Variable names "count" zum Mitzählen deklariert & initialisiert

        do {
            System.out.print("Number " + count + ": ");
            input = scan.nextFloat(); // "input" initialisiert, Wert von Scanner zugewiesen, ,in der Schleife for update
            count++; // "count" in der Schleife for update

            if (input > 0) { // Verflixtes first "input" Zero ausgeschlossen
                if (input > max)
                    max = input; // Max wird jede Schleife mitgenomen
                    }

        } while (input > 0);

            if (max == 0) {
                System.out.println("No number entered."); // Verflixtes first "input" Zero
            } else {
                System.out.printf("The largest number is %.2f", max); //printf > Format "max" like 0,00
                }
    }

    //todo Task 2
    public void stairs(){

        int n; // Input Variable
        int count = 1; // Zahlen Variable
        Scanner scanner = new Scanner(System.in);

        System.out.print("n: ");
        n = scanner.nextInt(); // Eingabe n eingescannt

        if (n <= 0) {
        System.out.print("Invalid number!");
        } else {
            for (int i = 1; i <= n; i++) { // äußere Schleife für Reihen 1 - n
                for (int j = 0; j < i; j++) { // innere Schleife für Zeilen /i-te Reihe => i Zahlen sollen rausgegeben werden
                    System.out.print(count+ " "); // Herausgegeben sollen Zahlen werden, die wir dynamisch mit zählen
                    count++; // Wir zählen weiter
                }
                System.out.println(); // Zeilenumbruch der äußeren Schleife
            }
        }
    }

    //todo Task 3
    public void printPyramid(){

        final int n = 6; // Angabe
        int i, j;

        for (i=1;  i<=n; i++) { // i-n (1-6) Reihen

            for (j=i; j<n; j++) { // i-n Zeichen in der Reihe / decreasing triangle
                System.out.print(" "); // welche Zeichen ? => (Leerzeichen)
                }

            for (j = 1; j<i; j++) { // 1-i Zeichen (*) / increasing triangle
                System.out.print("*"); // Welche Zeichen? => (*)
                }

            for (j=1; j<=i; j++){ // 1-i Zeichen (*) / decreasing triangle
                System.out.print("*");
                }
            System.out.println(); // Zeilenumbruch der äußeren Schleife
        }
        // or  final int rows = 6;
        //        for (int i = 0; i < rows; i++) {
        //            for (int j = rows - 1 - i; j > 0; j--) {
        //                System.out.print(" ");
        //            }
        //            for (int k = 1; k <= i * 2 + 1; k++) {
        //                System.out.print("*");
        //            }
        //            System.out.println();
        //        }
        // shorter solution brought to you by funtutorials87 on youtube
    }

    //todo Task 4
    public void printRhombus(){

        Scanner scan = new Scanner(System.in);

        System.out.print("h: ");
        int h = scan.nextInt();

        System.out.print("c: ");
        char c = scan.next().charAt(0);


        int k, i, j; // k für unsere Zeichen, i Reihen Elemente, j Spalten Elemente

        if (h % 2 == 0) { // wenn gerade zahl
            System.out.println("Invalid number!");

        } else { // sonst leg los
            for (i = 1; i < h / 2 + 2; i++) {
                for (j = 0; j < h / 2 - i + 1; j++) {
                    System.out.print(" ");
                }
                for (k = i; k >= 1; k--) {
                    char a = (char) (c + 1 - k);
                    System.out.print(a);
                }
                for (int l = 2; l <= i; l++) {
                    char b = (char) (c + 1 - l);
                    System.out.print(b);
                }
                System.out.println();
            }

            for (i = 0; i < h / 2; i++) {
                for (j = 0; j <= i; j++) {
                    System.out.print(" ");
                }
                for (k = i; k <= h / 2 - 1; k++) {
                    char a = (char) ((c - h / 2 + 1) + k);
                    System.out.print(a);
                }
                for (k = i; k <= h / 2 - 2; k++) {
                    char b = (char) (c - 1 - k);
                    System.out.print(b);
                }
                System.out.println();
            }
        }
    } // brought to you by https://www.youtube.com/watch?v=AAAVJB9Bz1Q


    //todo Task 5
    public void marks(){
        // input your solution here
        //math.average
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int con = 1;
        boolean input = true;

        while (input) {
            System.out.print("Mark " + con + ": ");
            int num = scan.nextInt();

            if (num > 0 && num <= 5) {
                sum = sum + num;
                con++;

                if (num == 5) {
                    count++;
                    }

            } else if (num < 0 || num > 5) {
                System.out.println("Invalid mark!");
                }

            if (num == 0) {
                float mean;
                if (con == 1){
                    mean = (float) sum / (con);
                } else {
                    mean = (float) sum / (con - 1);
                    }
                System.out.printf("Average: " + "%.2f", mean);
                System.out.println();
                System.out.println("Negative marks: " + count);
                input = false;
                }
            }
        }

    //todo Task 6
    public void happyNumbers(){
        // input your solution here
        // set number? 4
        // 1 oder 4 am Ende der Schleife?

        System.out.println("n: Happy number!");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int rem, sum = 0;

        while (num != 1 && num != 4) {
            while (num > 0) {
                rem = num % 10;
                sum = sum + rem * rem;
                num = num / 10;
            }
            num = sum;
            sum = 0;
        }

        if (sum == 1)
            System.out.println("Happy Number!");
        if (sum == 4)
            System.out.println("Sad Number :(");
    }

//

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}