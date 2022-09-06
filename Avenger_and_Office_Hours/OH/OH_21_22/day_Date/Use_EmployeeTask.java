package OH.OH_21_22.day_Date;

public class Use_EmployeeTask {
    public static void main(String[] args) {

        EmployeeTask onk = new EmployeeTask( "Mike", "M", 26, 150_000 );
        System.out.println( onk );
        //onk.age = 25;//private( set or get need to use
        onk.setName( "" );
        System.out.println( "res name " + onk.getName() );
        onk.setAge( 15 );
        System.out.println( "res age " + onk.getAge() );
        onk.setSalary( 100_000 );
        System.out.println( "res salary " + onk.getSalary() );
        onk.setSalary( onk.getSalary() + 20_000 );
        System.out.println( "res salary adding 20k = " + onk.getSalary() );
        onk.setSalary( onk.getSalary() -40_000 );
        System.out.println( "res salary decrease 40k = " + onk.getSalary() );
    }
}
