package com.kodilla.rps;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class RpsRunner {

    static int win = 0;





    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean end = false;
        int round =0;

        while (!end){


            round++;
            System.out.println("Witaj w grze RPS \n" +
                    "klawisz 1 – zagranie \"kamień\",\n" +
                    "klawisz 2 – zagranie \"papier\",\n" +
                    "klawisz 3 – zagranie \"nożyce\",\n" +
                    "klawisz x – zakończenie gry poprzedzone pytaniem,\n" +
                    "klawisz n – uruchomienie gry od nowa");
            System.out.println("");
            String playerPlay = scanner.next();
            String computerPlay = randomRps()+"";


            if(playerPlay.equals("1") || playerPlay.equals("2") || playerPlay.equals("3")) {
                System.out.println(gameRps(playerPlay, computerPlay));
            }
            if(playerPlay.equals("x"))
            {
                System.out.println("Czy aby na pewno chcesz wyjsc z gry?");
                if(scanner.next().equals("x"));
                end= true;
            }
            if(playerPlay.equals("n"))
            {
                System.out.println("Rozpoczynam nową gre.");
                win = 0;
                round=0;
            }
            else
            {
                System.out.println("");
            }
            System.out.println("liczba gier: "+ round);
            System.out.println("liczba wygranych: " + win);
            System.out.println();

        }



    }

    static int randomRps() {
        Random random = new Random();

        return random.nextInt(3)+1;
    }

    static String gameRps(String playerPlay , String computerPlay ){

        if(playerPlay.equals("1") && computerPlay.equals("1")){
            return "Komputer wybrał kamień \n " +
                    "REMIS ";
        }
        if(playerPlay.equals("1") && computerPlay.equals("2")){
            return "Komputer wybrał papier \n " +
                    "papier bije kamien ";
        }
        if(playerPlay.equals("1") && computerPlay.equals("3")){
            win++;
            return "Komputer wybrał nożyce \n " +
                    "kamien bije nozyce ";
        }
        if(playerPlay.equals("2") && computerPlay.equals("2")){
            return "Komputer wybrał papier \n " +
                    "REMIS ";
        }
        if(playerPlay.equals("2") && computerPlay.equals("1")) {
            win++;
            return "Komputer wybrał kamień \n " +
                    "papier bije kamien ";
        }
        if(playerPlay.equals("2") && computerPlay.equals("3")) {
            return "Komputer wybrał nozyce \n " +
                    "nozyce bija papier ";
        }
        if(playerPlay.equals("3") && computerPlay.equals("3")){
            return "Komputer wybrał nożyce \n " +
                    "REMIS ";
        }
        if(playerPlay.equals("3") && computerPlay.equals("1")){
            return "Komputer wybrał kamien \n " +
                    "kamien bije nozyce ";
        }
        if(playerPlay.equals("3") && computerPlay.equals("2")){
            win++;
            return "Komputer wybrał papier \n " +
                    "nozyce bija papier ";
        }



        return "";

    }
}
