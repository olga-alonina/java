package OH.OH_17_18;

public class lesson {
    String instance_Variable;

    public lesson() {
        System.out.println( "Constr is running" );
        instance_Variable = "Hello dear Constr";
    }

    public void instance_Method() {
        System.out.println( "Instance method is running" );
        instance_Variable = "Instance method from Instance method";
        System.out.println( instance_Variable );
        String localVariable="Instance Variable from Instance Method";
        System.out.println(localVariable);

        if (true) {
            String local_VariableFtomIf = "If statement";

        }
    }

    @Override
    public String toString() {
        return "lesson{" +
                "instance_Variable='" + instance_Variable + '\'' +
                '}';
    }

}

