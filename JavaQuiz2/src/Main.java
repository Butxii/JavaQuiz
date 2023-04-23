public class Main {
    public static void main(String[] args) {
        try{

            int masivi[] = readFile.FileReading();

            readFile.fileSum(masivi);
        }
        catch (InvalidNumberException k){
            System.out.println(k);
        }

    }

}

