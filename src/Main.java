import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Игрок №1 выберите один из вариантов: ");
        System.out.println("1. Rock");
        System.out.println("2. Scissors");
        System.out.println("3. Paper");

        String FirstGamer = Scanner.nextLine();

        System.out.println("Игрок №2 выберите один из вариантов: ");
        System.out.println("1. Rock");
        System.out.println("2. Scissors");
        System.out.println("3. Paper");

        String SecondGamer = Scanner.nextLine();

        System.out.println(RockScissorsPaper(FirstGamer, SecondGamer));
    }

    public static String RockScissorsPaper (String FirstGamer, String SecondGamer) {
    String Rock = "Rock";
    String Scissors = "Scissors";
    String Paper = "Paper";
    String Winner;

                   if (FirstGamer.equals(Rock) && SecondGamer.equals(Scissors)) {
                Winner = "Winner is - First Gamer!";
            } else if (FirstGamer.equals(Rock) && SecondGamer.equals(Paper)) {
                Winner = "Winner is - Second Gamer!";
            } else if (FirstGamer.equals(Rock) && SecondGamer.equals(Rock)) {
                Winner = "Winner is - Friendship!";
            } else if (FirstGamer.equals(Scissors) && SecondGamer.equals(Rock)) {
                Winner = "Winner is - Second Gamer!";
            } else if (FirstGamer.equals(Scissors) && SecondGamer.equals(Paper)) {
                Winner = "Winner is - First Gamer!";
            } else if (FirstGamer.equals(Scissors) && SecondGamer.equals(Scissors)) {
                Winner = "Winner is - Friendship!";
            } else if (FirstGamer.equals(Paper) && SecondGamer.equals(Rock)) {
                Winner = "Winner is - First Gamer!";
            } else if (FirstGamer.equals(Paper) && SecondGamer.equals(Scissors)) {
                Winner = "Winner is - Second Gamer!";
            } else if (FirstGamer.equals(Paper) && SecondGamer.equals(Paper)) {
                Winner = "Winner is - Friendship!";
            } else {
                       Winner = "Something is wrong. Try again!";
            }
        return Winner;
    }
}

