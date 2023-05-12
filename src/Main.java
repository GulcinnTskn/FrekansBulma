import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Dizi boyutunu alıyoruz ve dizinin index değeri yerine yerleştiriyoruz.
        System.out.print("Dizi Boyutunu Giriniz : ");
        int indexArray = input.nextInt();
        int[] numbers = new int[indexArray];

        // Dizi elemanlarını döngü ile kullanıcıdan alıyoruz.
        System.out.println("Dizinin Elemanlarını Giriniz : ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print((i + 1) + ". Elemanı Gir : ");
            numbers[i] = input.nextInt();
        }

        // Dizideki elemanların frekansını hesaplıyoruz
        int[] frequency = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            int count = 1;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;
                    // Daha önce hesaplanmış bir elemanın tekrar hesaplanmaması için
                    frequency[j] = -1;
                }
            }
            if (frequency[i] != -1) {
                frequency[i] = count;
            }
        }

        // Dizinin frekanslarını ekrana yazdırıyoruz
        System.out.println("Dizinin Frekansları : ");
        for (int i = 0; i < numbers.length; i++) {
            if (frequency[i] != -1) {
                System.out.println(numbers[i] + " sayısı " + frequency[i] + " kez tekrar edildi.");
            }
        }
    }
}
