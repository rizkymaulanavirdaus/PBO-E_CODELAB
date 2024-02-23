import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class modul1{
    public static void main(String[] args){
        LocalDateTime timeNow = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-mm-dd");

        int tahun,bulan,hari;
        String nama,huruf,tanggal;
        Scanner scan = new Scanner(System.in);

        //input
        System.out.print("Nama: ");
        nama = scan.nextLine();
        System.out.print("Jenis Kelamin (L/P): ");
        huruf = scan.nextLine();
        System.out.print("Tanggal Lahir (yyyy-mm-dd) : ");
        tanggal = scan.nextLine();

        LocalDate ttl = LocalDate.parse(tanggal);
        LocalDate today = LocalDate.now();
        Period period = Period.between(ttl,today);
        tahun = period.getYears();
        bulan = period.getMonths();
        hari = period.getDays();

        //output
        System.out.println(("Nama: " +nama));
        switch (huruf){
            case "l":
                System.out.println("Jenis Kelamin: Laki-laki");
                break;
            case "L":
                System.out.println("Jenis Kelamin: Laki-laki");
                break;
            case "p":
                System.out.println("Jenis Kelamin: Perempuan");
                break;
            case "P":
                System.out.println("Jenis Kelamin: Perempuan");
                break;
            default:
                System.out.println("Jenis kelamin tidak diketahui" );
        }
        System.out.println("Tanggal Lahir:" + tanggal);
        System.out.println("Umur anda:" + tahun + " Tahun " + bulan + " Bulan " + hari + " Hari");


        }

    }

