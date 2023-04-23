import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readFile {
    private readFile() throws InvalidNumberException {
        int[] array = FileReading();
    }
    public static int[] FileReading() throws InvalidNumberException {
        int[] array = new int[10];
        try {
            File file = new File("src/text.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextInt()) {
                for(int i=0; i<10; i++){
                    int number = scanner.nextInt();
                    if (number < 0) {
                        throw new InvalidNumberException("Zahl ist negative !!!");
                    }
                    array[i] = number;
                }
            }
            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("File ar moidzebna !!!");
        }
        return array;
    }

    public static int fileSum(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        System.out.println("Jami aris " + sum);
        return sum;
    }
}
