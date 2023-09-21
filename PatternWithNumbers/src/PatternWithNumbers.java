import java.util.Scanner;

public class PatternWithNumbers {
    public static void main(String[] args) {
        int number = -1; //ilk değer vermek zorundaydım, while'ın içine girmesi için negatif verdim
        boolean errorCheck = true; //aynı şekilde while'ın içine girmek adına böyle tanımladım

        Scanner inp = new Scanner(System.in);

        while (errorCheck) {
            if (number <= 0) {
                System.out.print("Please enter possitive integer: ");
                number = inp.nextInt();
            } else {
                errorCheck = false; //while burada  bitiyor.
            }
        }
        patternCreator(number); //chain reaction activated (o.0)
    }

    //inanması güç ama aşağıdaki metot istenilen çıktıyı verecek.
    static int patternCreator(int number) {
        if (number > 0) {
            System.out.print(number + " ");
            patternCreator(number - 5); //if'deki condition bozulana kadar recursion sürecek.
        }

        System.out.print(number + " ");
        return 1; //işte fonksiyon bu noktaya geldiğinde tam tersi yönde dönmeye başlıyor
                    //return 0'da yazılsa, return number'da yazılsa aynı olay gerçekleşecek!

    }
}

