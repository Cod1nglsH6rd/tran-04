import java.util.Scanner;

public class Solution04 {
    public static void main(String[] args){
        /*
        Print - "Enter a noun"
            Input = noun
        Print - "Enter a verb"
            Input = verb
        Print - "Enter an adjective"
            Input = adjective
        Print - "Enter an adverb"
            Input = adverb
        Print - "Do you -verb- your -adjective- -noun- -verb-? That's hilarious!"
         */
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a noun. ");
        String noun = input.nextLine();

        System.out.println("Enter a verb. ");
        String verb = input.nextLine();

        System.out.println("Enter an adjective. ");
        String adjective = input.nextLine();

        System.out.println("Enter an adverb. ");
        String adverb = input.nextLine();

        System.out.printf("Do you %s your %s %s %s? That's hilarious!", verb, adjective, noun, adverb);

    }
}
