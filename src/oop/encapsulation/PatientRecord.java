import java.util.Scanner;

public class PatientRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Patient pt1 = new Patient("Brian", 101, "03-15-1992", "Yes");
        System.out.println(pt1.getPtName() + " " + pt1.getPtID() + " " + pt1.getPtDOB() + " " + pt1.getPtFtime() + "\n");

        Patient pt2 = new Patient("Jennifer", 102, "04-19-1994", "No");
        System.out.println(pt2.getPtName() + " " + pt2.getPtID() + " " + pt2.getPtDOB() + " " + pt2.getPtFtime() + "\n");

        Patient pt3 = new Patient("Samwel", 103, "05-25-1990", "No");
        System.out.println(pt3.getPtName() + " " + pt3.getPtID() + " " + pt3.getPtDOB() + " " + pt3.getPtFtime() + "\n");

        Patient pt5 = new Patient("Mike", 105, "07-21-1991", "Yes");
        System.out.println(pt5.getPtName() + " " + pt5.getPtID() + " " + pt5.getPtDOB() + " " + pt5.getPtFtime() + "\n");

        System.out.println("Enter details for a new patient:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("DOB: ");
        String dob = scanner.nextLine();
        System.out.print("First Time Visit (Yes/No): ");
        String firstTime = scanner.nextLine();

        Patient newPatient = new Patient(name, id, dob, firstTime);
        System.out.println(newPatient.getPtName() + " " + newPatient.getPtID() + " " + newPatient.getPtDOB() + " " + newPatient.getPtFtime());
    }
}
