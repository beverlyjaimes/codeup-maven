import com.github.javafaker.Faker;
import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

/**
 * Tells whether or not what the user entered is a number
 * Flips the case of the string
 * Reverses the string
 * Example Console Output
 *
 *
 * Enter Something: Life, The Universe, and Everything
 * You Entered: "Life, The Universe, and Everything"
 * "Life, The Universe, and Everything" is not a number
 * Flipped Case: lIFE, tHE uNIVERSE, AND eVERYTHING
 * Reversed: gnihtyrevE dna ,esrevinU eht ,efiL
 */
public class Exercise {
//    StringUtils;
//    isNumeric
//    switchcase
//        reverse

    public static void main(String[] args) {
        System.out.println("Enter something: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println("You entered: " + input);
        if (StringUtils.isNumeric(input)){
            System.out.println(input + " is a number!");
        } else if(!StringUtils.isNumeric(input)){
            System.out.println(input + " is not a number");
        }
        System.out.println("Flipped case:  " + StringUtils.swapCase(input));
        System.out.println("Reverse: " + StringUtils.reverse(input));

        Faker faker = new Faker();

        String name = faker.name().fullName(); // Miss Samanta Schmidt
        System.out.println(name);
        String firstName = faker.name().firstName(); // Emory
        System.out.println(firstName);
        String lastName = faker.name().lastName(); // Barton
        System.out.println(lastName);

        String streetAddress = faker.address().streetAddress(); // 60018 Sawayn Brooks Suite 449

        System.out.println(streetAddress);
    }
}
