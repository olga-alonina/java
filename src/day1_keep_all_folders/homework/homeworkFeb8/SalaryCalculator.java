package day1_keep_all_folders.homework.homeworkFeb8;

public class SalaryCalculator {
    public static void main(String[] args) {
    long salary = 100_000;
    double stateTaxRate = 0.08;
    double federalTaxRate = 0.21;
        System.out.println("federalTaxRate = " + federalTaxRate);
        System.out.println("stateTaxRate = " + stateTaxRate);
        System.out.println("salary = " + salary);
    System.out.println("*************************************");
    double amountOfStateTax = salary*stateTaxRate;
        System.out.println("Amount Of State Tax = " + amountOfStateTax);
    double amountOfFederalTax = salary*federalTaxRate;
        System.out.println("Amount of Federal Tax = " + amountOfFederalTax);
    double totalAmountOfTax = amountOfStateTax+amountOfFederalTax;
        System.out.println("Total amount of tax = " + totalAmountOfTax);
    double salaryAfterTax = salary-totalAmountOfTax;
        System.out.println("Salary after tax = " + salaryAfterTax);


    //the total tax amount, and your salary after all taxes


}
}
