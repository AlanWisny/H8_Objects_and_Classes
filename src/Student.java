
//        P8.7 Implement a class Student. For the purpose of this exercise, a student has a name and a total quiz score.
//        Supply an appropriate constructor and methods getName(), addQuiz(int score), getTotalScore(), and getAvgScore().
//        To compute the latter, you also need to store the number of quizzes that the student took.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Student {
    private String name;
    private int totalScore;
    private int avgScore;
    private int timesTaken;
    Scanner in = new Scanner(System.in);
    private String ready = "R";
    private String quit = "Q";
    private String[] array1 = {"Question no.1: How many teeth do normal adult dogs have?", "Question no.2: Through what part of the body do dogs sweat?", "Question no.3: Which of the following colors doges can NOT see?", "" };
    private String[] array2 = {"Question no.1: ", "Question no.2: ", "Question no.3: " };
    private String[] Q01 = {" A. 24 \n B. 38 \n C. 42 \n D. 32", " A. Mouth \n B. Ears \n C. Nose \n D. Paws", " A. Blue \n B. Yellow \n C. Red \n D. Green", ""};
    private int i = 0;
    private ArrayList<String> answers1 = new ArrayList<String>(5);
    private ArrayList<String> answers2 = new ArrayList<String>(3);
    private ArrayList<String> cheatSheet1 = new ArrayList<String>(Arrays.asList("C", "A", "C"));
    private ArrayList<String> cheatSheet2 = new ArrayList<String>(3);
    private String answer = String.valueOf(in.next());


    public Student(String name, int totalScore) {
        this.name = name;
        this.totalScore = totalScore;
    }


    public void addQuizz(int score) {
        System.out.println("Type a 1 or a 2 to choose the version of your quiz.");
        if (in.nextInt() == 1) {
            System.out.println("Welcome to version 1 of the quiz! Type a R if you are Ready, or a Q if you want to Quit.");
            if (in.next().equalsIgnoreCase(ready)){
                System.out.println(array1[i]);
                System.out.println(Q01[i]);
                    do {
                        i++;
                        answers1.add(in.next());
                        System.out.println(array1[i]);
                        System.out.println(Q01[i]);
//                        System.out.println(answers1);
                        if(i == 3) {
                            System.out.println(answers1);
                         for (int i = 0; i <=2; i++){
                             if (answers1.get(i).equalsIgnoreCase(cheatSheet1.get(i)) ){
                                 score++;
                             }
                             System.out.println("The amount of points you scored on the last quiz was: " + score);
                             this.totalScore = totalScore + score;
                         }
                        }
                    } while (in.hasNext() && i <= array1.length -1);
            } if (in.next().equalsIgnoreCase(quit)) {
                System.out.println("Thank you for playing!");
            }
        } if (in.nextInt() == 2) {
            System.out.println("Welcome to version 2 of the quiz! Type a R if you are Ready, or a Q if you want to Quit.");
        }
    }

















    public String getName() { return name; }

    public int getTotalScore() { return totalScore; }

    public int getAvgScore() { return avgScore; }

    public int getTimesTaken() { return timesTaken; }
}
