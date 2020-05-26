package com.kodilla.rps;

import java.awt.event.KeyListener;
import java.util.Random;
import java.util.Scanner;

public class Game {
    private final String rock = "kamień";
    private final String paper =  "papier";
    private final String scissors = "nożyce";

    private String name;
    private int numberOfRound;
    private int currendRound = 1;

    private String humanChoice;
    private String computerChoice;
    private int humanScore = 0;
    private int computerScore = 0;

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź imię: ");
        name = scanner.nextLine();

        enterTheNumberOfRound();
        System.out.println(name + ", zagrasz " + numberOfRound + " rund przeciwko komputerowi");


        System.out.println("\nklawisz 1 - zagranie \"kamień\", " +
                "\nklawisz 2 - zagranie \"papier\", " +
                "\nklawisz 3 - zagranie \"nożyce\", " +
                "\nklawisz x - zakończenie gry, " +
                "\nklawisz n - uruchomienie gry od nowa\n");

        humanPlay();
    }


    private void enterTheNumberOfRound(){
        System.out.println("Wprowadź ilość rund do rozegrania: ");
        try {
            Scanner scanner = new Scanner(System.in);
            numberOfRound = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Bład, wprowadź liczbę.");
            enterTheNumberOfRound();
        }
    }


    private void humanPlay(){
        Scanner scanner = new Scanner(System.in);

        boolean end = false;
        while (!end){
            if (numberOfRound <= 0){
                end = true;
                endGame();
            }else {
                System.out.println("Twoje zagranie: ");
                String choice = scanner.next();

                switch (choice) {
                    case "1":
                        numberOfRound -= 1;
                        humanChoice = rock;
                        computerPlay();
                        break;
                    case "2":
                        numberOfRound -= 1;
                        humanChoice = paper;
                        computerPlay();
                        break;
                    case "3":
                        numberOfRound -= 1;
                        humanChoice = scissors;
                        computerPlay();
                        break;
                    case "x":
                        endGame();
                        break;
                    case "n":
                        startNewGame();
                        break;
                    default:
                        System.out.println("Wprowadzono zły znak");
                        humanPlay();
                        break;
                }
                break;
            }
        }
    }


    private void computerPlay(){
        Random random = new Random();
        int i  = random.nextInt(3);

        switch(i){
            case 0:
                computerChoice = rock;
                break;
            case 1:
                computerChoice = paper;
                break;
            case 2:
                computerChoice = scissors;
                break;
        }

        System.out.println("Zagrałeś: " + humanChoice + ", a komputer: " + computerChoice);
        roundScore();
        humanPlay();
    }


    private void roundScore(){
        String wynik;
        if (humanChoice.equals(rock)){
            if (computerChoice.equals(rock)){
                wynik = "Runda: " + currendRound + " zakończona remisem";
            } else if (computerChoice.equals(paper)){
                wynik = "Przegrałeś rundę " + currendRound;
                computerScore += 1;
            } else {
                wynik = "Wygrałeś rundę " + currendRound;
                humanScore += 1;
            }
        } else if (humanChoice.equals(paper)){
            if (computerChoice.equals(rock)){
                wynik = "Wygrałeś rundę " + currendRound;
                humanScore += 1;
            } else if (computerChoice.equals(paper)){
                wynik = "Runda: " + currendRound + " zakończona remisem";
            } else {
                wynik = "Przegrałeś rundę " + currendRound;
                computerScore += 1;
            }
        } else {
            if (computerChoice.equals(rock)){
                wynik = "Przegrałeś rundę " + currendRound;
                computerScore += 1;
            } else if (computerChoice.equals(paper)){
                wynik = "Wygrałeś rundę " + currendRound;
                humanScore += 1;
            } else {
                wynik = "Runda: " + currendRound + " zakończona remisem";
            }
        }
        System.out.println(wynik);
        currendRound++;
    }


    private void endGame(){
        System.out.println("Wynik gry: " + name + " - " + humanScore + ", komputer - " + computerScore);
        if (humanScore> computerScore){
            System.out.println("WYGRALEŚ");
        } else if(humanScore<computerScore){
            System.out.println("PRZEGRALEŚ");
        } else {
            System.out.println("Gra zakończona remisem.");
        }
        //System.exit(1);
    }


    private void startNewGame(){
        System.out.println("Czy chcesz zacząć od nowa?");
        System.out.println("Y - tak, N - nie");
        Scanner scanner = new Scanner(System.in);
        String startNewOrNot = scanner.next();

        loop:
        switch (startNewOrNot) {
            case "Y":
                start();
                break loop;
            case "N":
                humanPlay();
                break loop;
            default:
                System.out.println("wybierz Y lub N");
                break;
        }
    }
}
