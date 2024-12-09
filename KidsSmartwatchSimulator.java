package FirstProjectOfClass;

import java.util.Scanner;

public class KidsSmartwatchSimulator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Select the number to do what you want to do: ");
        System.out.println("Num 1 = Clock" + "\n" + "Num 2 = Stopwatch" + "\n" + "Num 3 = Game " + "\n" + "Num 4 = Phone function");

        int menu0 = 1;
        while (menu0 == 1) {
            int menu = scan.nextInt();

            switch (menu) {
                case 1://CLOCK
                    long time = System.currentTimeMillis();
                    long time1 = (((((time / 1000) / 60) / 60) % 24) + 3); //hour
                    long time2 = ((((time / 1000) / 60) % (24 * 60)) % 60); //minute
                    //I dont know why should ı add (+ 3) here because it should work without (+ 3)!

                    if (time1 >= 24 && time2 == 60) {
                        System.out.println("Time: " + "0" + (time1 - 24) + ":" + "00");

                    } else if (time1 >= 24 && time2 < 10) {
                        System.out.println("Time: " + "0" + (time1 - 24) + ":" + "0" + time2);
                    } else if (time1 >= 24) {
                        System.out.println("Time: " + "0" + (time1 - 24) + ":" + time2);
                    } else if (time1 < 24 && time2 == 60 && time1 >= 10) {
                        System.out.println("Time: " + time1 + ":" + "00");
                    } else if (time1 < 24 && time2 < 10 && time1 >= 10) {
                        System.out.println("Time: " + time1 + ":" + "0" + time2);
                    } else if (time1 < 24 && time1 >= 10) {
                        System.out.println("Time: " + time1 + ":" + time2);
                        //we should add 0 before the number because if the time2 < 10 there is no 0 before the num.
                        // I wrote (time1 - 24) if time1 >= 24 because the code is continuing like 24 . 25 . 26 after 00.00 .
                    } else if (time1 < 10 && time2 == 60) {
                        System.out.println("Time: " + "0" + time1 + ":" + "00");

                    } else if (time1 < 10 && time2 < 10) {
                        System.out.println("Time: " + "0" + time1 + ":" + "0" + time2);
                    } else if (time1 < 10) {
                        System.out.println("Time: " + "0" + time1 + ":" + time2);

                    } else {q
                        System.out.println("There is an eror, please try it again.");
                    }
                    System.out.println("");
                    System.out.println("Do you want to get back the menu?");
                    System.out.println("1: Yes" + "\n" + "2: No");
                    menu0 = scan.nextInt();//You cannot write int here because this already defined but you can chance the menu0 value without int.
                    System.out.println("");
                    System.out.println("Select the number to do what you want to do: ");
                    System.out.println("Num 1 = Clock" + "\n" + "Num 2 = Stopwatch" + "\n" + "Num 3 = Game " + "\n" + "Num 4 = Phone function");
                    System.out.println("");
                    break;// ı added break after all switch case because ı want to stop code after you selected what you want to do.
                /*break;*/ //I can block to continue this code with (break).
                case 2://STOPWATCH
                    System.out.println("Press one and start to stopwatch: ");

                    int sw = scan.nextInt();

                    if (sw == 1) {
                        System.out.println("press two for stop");
                        long timea = (System.currentTimeMillis() / 1000);//first second times
                        int sw1 = scan.nextInt();

                        if (sw1 == 2) {
                            long timeb = (System.currentTimeMillis() / 1000);// last second times

                            System.out.println((timeb - timea) + " second");
                            System.out.println("");
                            System.out.println("Do you want to get back the menu?");
                            System.out.println("1: Yes" + "\n" + "2: No");
                            menu0 = scan.nextInt();
                            System.out.println("");
                            System.out.println("Select the number to do what you want to do: ");
                            System.out.println("Num 1 = Clock" + "\n" + "Num 2 = Stopwatch" + "\n" + "Num 3 = Game " + "\n" + "Num 4 = Phone function");
                            System.out.println("");
                            break; // if ı didn't write break sout waiting in loop and writen infinitive.
                        }

                    } else {
                        System.out.println("There is an eror, please try it again.");
                    }

                    break;// ı added break after all switch case because ı want to stop code after you selected what you want to do.
                case 3://(GAME)Rock,paper,scissors
                    System.out.println("This game will finish when some of us came to 1");
                    int guess1 = (int) ((Math.random() * 3) + 1);// [1,4)it can gives 1,2,3.

                    System.out.println("1: Rock" + "\n" + "2: Paper" + "\n" + "3: Scissors");
                    System.out.println("Select your move.");
                    int guess2 = scan.nextInt();
                    System.out.println("");

                    switch (guess2) {// I can seperate all situation with switch case code.
                        case 1:
                            if (guess1 == 1 && guess1 == 1) {
                                System.out.println("Rock");
                                System.out.println("");
                                System.out.println("Draw");
                            } else if (guess2 == 1 && guess1 == 2) {
                                System.out.println("Paper");
                                System.out.println("");
                                System.out.println("You Lost");
                            } else if (guess2 == 1 && guess1 == 3) {
                                System.out.println("Scissors");
                                System.out.println("");
                                System.out.println("You Won");

                            }
                        case 2:
                            if (guess2 == 2 && guess1 == 1) {
                                System.out.println("Rock");
                                System.out.println("");
                                System.out.println("You Won");
                            } else if (guess2 == 2 && guess1 == 2) {
                                System.out.println("Paper");
                                System.out.println("");
                                System.out.println("Draw");
                            } else if (guess2 == 2 && guess1 == 3) {
                                System.out.println("Scissors");
                                System.out.println("");
                                System.out.println("You Lost");
                            }
                        case 3:
                            if (guess2 == 3 && guess1 == 1) {
                                System.out.println("Rock");
                                System.out.println("");
                                System.out.println("You Lost");
                            } else if (guess2 == 3 && guess1 == 2) {
                                System.out.println("Paper");
                                System.out.println("");
                                System.out.println("You Won");
                            } else if (guess2 == 3 && guess1 == 3) {
                                System.out.println("Scissors");
                                System.out.println("");
                                System.out.println("Draw");
                            }
                            break;
                    }//End of switch guess2.
                    System.out.println("");
                    System.out.println("Do you want to get back the menu?");
                    System.out.println("1: Yes" + "\n" + "2: No");
                    menu0 = scan.nextInt();
                    System.out.println("");
                    System.out.println("Select the number to do what you want to do: ");
                    System.out.println("Num 1 = Clock" + "\n" + "Num 2 = Stopwatch" + "\n" + "Num 3 = Game " + "\n" + "Num 4 = Phone function");
                    System.out.println("");
                    break;
                case 4://PHONE FUNCTİONS
                    System.out.println(" ");
                    System.out.println("Select what you want to do");
                    System.out.println("1: contact list" + "\n" + "2: Phone Call" + "\n" + "3: Messages");
                    int pF = scan.nextInt();
                    switch (pF) {
                        case 1://contact list
                            System.out.println("  contact List");
                            System.out.println(" ");
                            System.out.println("1 - Mom (05415688456)");
                            System.out.println("2 - Dad (05235645456)");
                            System.out.println("3 - Efe Şap (05238735456)");
                            System.out.println("4 - İrem Akbulut (05238730686)");
                            System.out.println("5 - Ozancan Direk (05291230686)");
                            System.out.println(" ");
                            System.out.println("1 : Add" + "\n" + "2 : Delete" + "\n" + "3 : Edit");

                            System.out.println("choose what you want to do.");

                            int select = scan.nextInt();

                            switch (select) {
                                case 1://add

                                    int variable = 0;
                                    System.out.println("Write how many people you want to add.");
                                    int newV = scan.nextInt();
                                    System.out.println("Enter names");
                                    System.out.println(" ");
                                    System.out.println("Add person for contact List");

                                    while (variable < newV) {//Simple while loop
                                        int num = (variable + 6);/*There is a 5 person in list and variable = 0, after 1, and then 2 so 
                                    it's increasing with value and it's seems like 6- 7- 8- in contact list.*/

                                        String newP = scan.next();
                                        while (variable == 0) {/*This happen write one by one its include
                                        when variable is 0 and writed for once and after makes 6- after comes another 7- 8- ....*/
                                            System.out.println("   -New connect list-");
                                            System.out.println("1 - Mom(05415688456)");
                                            System.out.println("2 - Dad(05235645456)");
                                            System.out.println("3 - Efe'Şap'(05238735456)");//There is a problem that increase if I press space button in console.
                                            System.out.println("4 - İrem'Akbulut(05238730686)");
                                            System.out.println("5 - Ozancan'Direk'(05291230686)");
                                            break;
                                        }//End of loop.
                                        System.out.println(num + "- " + newP);/* you shoul write newP1 (space) newP2 and after the enter
                                    you will get your new persons on your list.*/


                                        variable++;//increasing.

                                    }//End of loop.
                                    System.out.println("");
                                    System.out.println("Do you want to get back the menu?");
                                    System.out.println("1: Yes" + "\n" + "2: No");
                                    menu0 = scan.nextInt();
                                    System.out.println("");
                                    System.out.println("Select the number to do what you want to do: ");
                                    System.out.println("Num 1 = Clock" + "\n" + "Num 2 = Stopwatch" + "\n" + "Num 3 = Game " + "\n" + "Num 4 = Phone function");
                                    System.out.println("");
                                    break;

                                case 2://delete
//This code just delete one person.
                                    System.out.println("There is a contact list.");
                                    System.out.println(" ");

                                    String fP = " - Mom (05415688456)";
                                    String sP = " - Dad (05235645456)";
                                    String tP = " - Efe Şap (05238735456)";
                                    String foP = " - İrem Akbulut (05238730686)";
                                    String fiP = " - Ozancan Direk (05291230686)";

                                    System.out.println(fP);
                                    System.out.println(sP);
                                    System.out.println(tP);
                                    System.out.println(foP);
                                    System.out.println(fiP);

                                    System.out.println(" ");

                                    System.out.println("Which person you want to delete?");
                                    System.out.println("There is a child protect procedure.");

                                    System.out.println("You can delete just one person.");
                                    System.out.println("1: Mom" + "\n" + "2: Dad" + "\n" + "3: Efe Ş." + "\n" + "4: İrem A." + "\n" + "5: Ozancan D.");

                                    int delete = scan.nextInt();

                                    switch (delete) {
                                        case 1://Mom(-)

                                            System.out.println("  - New contact list -");
                                            System.out.println("1- " + sP);
                                            System.out.println("2- " + tP);
                                            System.out.println("3- " + foP);
                                            System.out.println("4- " + fiP);
                                            System.out.println("");
                                            break;
                                        case 2://Dad(-)
                                            System.out.println("  - New contact list -");
                                            System.out.println("1- " + fP);
                                            System.out.println("2- " + tP);
                                            System.out.println("3- " + foP);
                                            System.out.println("4- " + fiP);
                                            System.out.println("");
                                            break;
                                        case 3://Efe Ş.(-)
                                            System.out.println("  - New contact list -");
                                            System.out.println("1- " + fP);
                                            System.out.println("2- " + sP);
                                            System.out.println("3- " + foP);
                                            System.out.println("4- " + fiP);
                                            System.out.println("");
                                            break;
                                        case 4://İrem A.(-)
                                            System.out.println("  - New contact list -");
                                            System.out.println("1- " + fP);
                                            System.out.println("2- " + sP);
                                            System.out.println("3- " + tP);
                                            System.out.println("4- " + fiP);
                                            System.out.println("");
                                            break;
                                        case 5://Ozancan D.(-)
                                            System.out.println("  - New contact list -");
                                            System.out.println("1- " + fP);
                                            System.out.println("2- " + sP);
                                            System.out.println("3- " + tP);
                                            System.out.println("4- " + foP);
                                            System.out.println("");
                                            break;
                                    }//End of switch delete.
                                    System.out.println("");
                                    System.out.println("Do you want to get back the menu?");
                                    System.out.println("1: Yes" + "\n" + "2: No");
                                    menu0 = scan.nextInt();
                                    System.out.println("");
                                    System.out.println("Select the number to do what you want to do: ");
                                    System.out.println("Num 1 = Clock" + "\n" + "Num 2 = Stopwatch" + "\n" + "Num 3 = Game " + "\n" + "Num 4 = Phone function");
                                    System.out.println("");
                                    break;

                                case 3://edit

                                    System.out.println(" - contact List -");
                                    System.out.println(" ");
                                    System.out.println("1 - Mom (05415688456)");
                                    System.out.println("2 - Dad (05235645456)");
                                    System.out.println("3 - Efe Şap (05238735456)");
                                    System.out.println("4 - İrem Akbulut (05238730686)");
                                    System.out.println("5 - Ozancan Direk (05291230686)");
                                    System.out.println(" ");
                                    System.out.println("You can edit contact list one by one.");
                                    System.out.println(" ");
                                    scan.nextLine();// ıf ı didn't write this the result start with 1- (space) 2-... 3-...
                                    String p1 = scan.nextLine();
                                    String p2 = scan.nextLine();
                                    String p3 = scan.nextLine();//You can input new Contact List.
                                    String p4 = scan.nextLine();
                                    String p5 = scan.nextLine();
                                    System.out.println(" - New contact List -");
                                    System.out.println(" ");

                                    System.out.println("1- " + p1);
                                    System.out.println("2- " + p2);

                                    System.out.println("3- " + p3);

                                    System.out.println("4- " + p4);

                                    System.out.println("5- " + p5);

                                    System.out.println("");
                                    System.out.println("Do you want to get back the menu?");
                                    System.out.println("1: Yes" + "\n" + "2: No");
                                    menu0 = scan.nextInt();
                                    System.out.println("");
                                    System.out.println("Select the number to do what you want to do: ");
                                    System.out.println("Num 1 = Clock" + "\n" + "Num 2 = Stopwatch" + "\n" + "Num 3 = Game " + "\n" + "Num 4 = Phone function");
                                    System.out.println("");

                                    break;

                            }//End of switch select.

                            break;

                        case 2://Phone Call

                            
                            String p1 = "Mom";
                            String p2 = "Dad";
                            String p3 = "Efe şap";
                            String p4 = "İrem Akbulut";
                            String p5 = "Ozancan Direk";

                            System.out.println(" - contact List -");
                            System.out.println(" ");
                            System.out.println("1 - " + p1 + " (05415688456)");
                            System.out.println("2 - " + p2 + " (05235645456)");
                            System.out.println("3 - " + p3 + " (05238735456)");
                            System.out.println("4 - " + p4 + " (05238730686)");
                            System.out.println("5 - " + p5 + " (05291230686)");
                            System.out.println(" ");
                            System.out.println("Select which one you want to call.");
                            System.out.println("1: Mom" + "\n" + "2: Dad" + "\n" + "3: Efe Ş." + "\n" + "4: İrem A." + "\n" + "5: Ozancan D.");
                            int call = scan.nextInt();

                            switch (call) {

                                case 1:
                                    System.out.println("Mom called.");
                                    System.out.println("");
                                    System.out.println("do you want to see call log");
                                    System.out.println("1: Yes" + "\n" + "2: No");
                                    int cL = scan.nextInt();
                                    if (cL == 1) {
                                        System.out.println("  - Call logs");
                                        System.out.println("1- " + p1);
                                    }
                                    break;
                                case 2:
                                    System.out.println("Dad called.");
                                    System.out.println("");
                                    System.out.println("do you want to see call log");
                                    System.out.println("1: Yes" + "\n" + "2: No");
                                    int cL1 = scan.nextInt();
                                    if (cL1 == 1) {
                                        System.out.println("  - Call logs");
                                        System.out.println("1- " + p2);
                                    }
                                    break;
                                case 3:
                                    System.out.println("Efe Şap called.");
                                    System.out.println("");
                                    System.out.println("do you want to see call log");
                                    System.out.println("1: Yes" + "\n" + "2: No");
                                    int cL2 = scan.nextInt();
                                    if (cL2 == 1) {
                                        System.out.println("  - Call logs");
                                        System.out.println("1- " + p3);
                                    }
                                    break;
                                case 4:
                                    System.out.println("İrem Akbulut called.");
                                    System.out.println("");
                                    System.out.println("do you want to see call log");
                                    System.out.println("1: Yes" + "\n" + "2: No");
                                    int cL3 = scan.nextInt();
                                    if (cL3 == 1) {
                                        System.out.println("  - Call logs");
                                        System.out.println("1- " + p4);
                                    }
                                    break;
                                case 5:
                                    System.out.println("Ozancan Direk called.");
                                    System.out.println("");
                                    System.out.println("do you want to see call log");
                                    System.out.println("1: Yes" + "\n" + "2: No");
                                    int cL4 = scan.nextInt();
                                    if (cL4 == 1) {
                                        System.out.println("  - Call logs");
                                        System.out.println("1- " + p5);
                                    }
                                    break;
                            }//End of switch call.

                            System.out.println("");
                            System.out.println("Do you want to get back the menu?");
                            System.out.println("1: Yes" + "\n" + "2: No");
                            menu0 = scan.nextInt();
                            System.out.println("");
                            System.out.println("Select the number to do what you want to do: ");
                            System.out.println("Num 1 = Clock" + "\n" + "Num 2 = Stopwatch" + "\n" + "Num 3 = Game " + "\n" + "Num 4 = Phone function");
                            System.out.println("");
                            break;

                        case 3://Message
                            System.out.println(" - contact List -");
                            System.out.println(" ");
                            System.out.println("1 - Mom (05415688456)");
                            System.out.println("2 - Dad (05235645456)");
                            System.out.println("3 - Efe Şap (05238735456)");
                            System.out.println("4 - İrem akbulut (05238730686)");
                            System.out.println("5 - Ozancan Direk (05291230686)");
                            System.out.println(" ");
                            System.out.println("Who do you want to message");
                            System.out.println("1: Mom" + "\n" + "2: Dad" + "\n" + "3: Efe Ş." + "\n" + "4: İrem Akbulut" + "\n" + "5: Ozancan D.");
                            int message = scan.nextInt();
                            scan.nextLine();//its define nextLine.
                            switch (message) {
                                case 1:

                                    System.out.println("What do you want to message?");
                                    String m1 = scan.nextLine();
                                    System.out.println("");
                                    System.out.println("User to mom");
                                    System.out.println("- " + m1);
                                    System.out.println("");

                                    break;
                                case 2:
                                    System.out.println("What do you want to message?");

                                    String m2 = scan.nextLine();
                                    System.out.println("");
                                    System.out.println("User to dad");
                                    System.out.println("- " + m2);
                                    System.out.println("");

                                    break;
                                case 3:
                                    System.out.println("What do you want to message?");

                                    String m3 = scan.nextLine();
                                    System.out.println("");
                                    System.out.println("User to Efe Ş.");
                                    System.out.println("- " + m3);
                                    System.out.println("");

                                    break;
                                case 4:
                                    System.out.println("What do you want to message?");

                                    String m4 = scan.nextLine();
                                    System.out.println("");
                                    System.out.println("User to İrem A.");
                                    System.out.println("- " + m4);
                                    System.out.println("");

                                    break;
                                case 5:
                                    System.out.println("What do you want to message?");

                                    String m5 = scan.nextLine();
                                    System.out.println("");
                                    System.out.println("User to Ozancan D.");
                                    System.out.println("- " + m5);
                                    System.out.println("");

                                    break;
                            }//End of switch message.
                            System.out.println("");
                            System.out.println("Do you want to get back the menu?");
                            System.out.println("1: Yes" + "\n" + "2: No");
                            menu0 = scan.nextInt();
                            System.out.println("");
                            System.out.println("Select the number to do what you want to do: ");
                            System.out.println("Num 1 = Clock" + "\n" + "Num 2 = Stopwatch" + "\n" + "Num 3 = Game " + "\n" + "Num 4 = Phone function");
                            System.out.println("");
                            break;

                    }//End of switch pF(Phone function).
                    break;
                default:
                    System.out.println("There is an eror,Pls try again.");

                    break;

            }//End of switch menu.

        }//End of while loop menu.
        System.out.println("System closed");
    }//End of main.
}//End of class.


