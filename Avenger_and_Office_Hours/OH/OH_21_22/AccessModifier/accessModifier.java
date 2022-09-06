package OH.OH_21_22.AccessModifier;

public class accessModifier extends Person {
    /*
    How many access modifier we have ?
    - public    --> ALWAYS Reachable
    - protected --> Same package OR subclasses (inheritance) in different packages
    - default   --> Same package     ( PACKAGE - PRIVATE   )
    - private   --> Same class
    NOTE :
        - We can use access modifiers with variables | Constr | Methods
        - A top level class can have public OR default
     */

        public static void main(String[] args) {

            Person person=new Person();

            // 1- PUBLIC
            person.name="Mike";

            // 2- PRIVATE
            // Person.age=0;   it is not visible

            // 3- DEFAULT --> in same package
            person.ID=1;

            //4- PROTECTED

            // - SAME PACKAGE
            person.DoB="06.06.2006";

            // - INHERITANCE  -- There is no inheritance
            accessModifier accessModifier=new accessModifier();
            //accessModifier.DoB="";







        }
    }