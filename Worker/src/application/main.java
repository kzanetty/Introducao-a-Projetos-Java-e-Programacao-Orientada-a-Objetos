package application;

import entities.Department;
import entities.Enum.WorkerLevel;
import entities.HourContract;
import entities.Worker;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Salary base: ");
        double salaryBase = sc.nextDouble();
        System.out.print("Worker Level (Junior, Mid_Level,Senior): ");
        WorkerLevel wl = WorkerLevel.valueOf(sc.next());
        System.out.print("Department: ");
        String department = sc.next();
        Worker worker = new Worker(name, wl, salaryBase, new Department(department));
        System.out.println(worker);

        jumpLine();
        System.out.print("Number of contracts: ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            System.out.println("Contract #" + (i+1));
            System.out.print("Date: ");
            Date date = sdf.parse(sc.next());
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Hour of work: ");
            int hourOfWork = sc.nextInt();
            HourContract hw = new HourContract(date, valuePerHour, hourOfWork);
            worker.addContract(hw);
            jumpLine();
        }
        System.out.println("List of contracts: ");
        for(HourContract x: worker.getList()){
            System.out.println(x);
        }

        System.out.println("what Date of contract do you want: ");
        Date dateContract = sdf.parse(sc.next());
        dayAndMonthAndYear(dateContract);
        double totalIncome =  worker.income(dayAndMonthAndYear(dateContract));
        System.out.println("Total income: " + totalIncome);

        sc.close();
    }
    public static void jumpLine(){
        System.out.print("\n");
    }

    public static String dayAndMonthAndYear(Date date){
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int day = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;
        int year = cal.get(Calendar.YEAR);


        return day+" "+month+" "+year;
    }
}
