package exercise5;

import java.util.Scanner;

import javax.print.attribute.standard.NumberOfInterveningJobs;

public class Search {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number count: ");
        int numberCount = input.nextInt();

        int[] numbers = new int[numberCount];

        System.out.println("Enter numbers: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
        }

        System.out.print("Search for number: ");
        int number = input.nextInt();

       /* zashto ne proverqvame
          else if (number > middleNumber) {
            leftIndex = middleIndex + 1;
          }
        */
        /* ne mi minava purviq test s toq kod
        int numberIndex = -1;
        int leftIndex = 0;
        int rightIndex = numbers.length - 1;
        int middleIndex;
        do {
            middleIndex = (leftIndex + rightIndex) / 2;
            int middleNumber = numbers[middleIndex];

            if (number == middleNumber) {
                numberIndex = middleIndex;
                break;
            }

            if (number < middleNumber) {
                rightIndex = middleIndex - 1;
            } else {
                leftIndex = middleIndex + 1;
            }
        } while (leftIndex <= rightIndex); */
        int numberIndex = -1;
        for(int index = 0 ; index<numbers.length; index++){
          if(number==numbers[index]){
            numberIndex=index;
            break;
          }
        }


        System.out.println("Number index: " + numberIndex);
    }
}
