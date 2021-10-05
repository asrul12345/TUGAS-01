import java.util.Scanner; //inport scanner ke program

public class Tugas02 { //membuat nama class dengan nama Tugas 2
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // memebuat variable untuk menyimpan nilai
        int Nilaiawal = 0;
        int NilaiSkr = 1;
        int NilaiFib = 0;

        //membuat kalimat yang akan dicetak pertama
        System.out.println("Inputkan jumlah baris Fibonacci : ");
        int deret = input.nextInt();
        System.out.println("====================");

        for (int i = 0; i < deret; i++)
        {
            NilaiFib=NilaiSkr+Nilaiawal;
            Nilaiawal=NilaiSkr;
            NilaiSkr=NilaiFib;
            System.out.println(NilaiFib + " ");

            if (NilaiFib > 500)
            {
                System.out.println(" NILAI LEBIH DARI 500 ");
            }
        }
    }
}
