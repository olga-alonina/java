package OH.OH_21_22.AccessModifier;

public class Encapsulation{
     /*
     Main Point : Data hiding -- Protect Data -- Security of Data
        How can we perform encapsulation ?
            - Make instance variable PRIVATE
            - Create a PUBLIC GETTER
            - Create a PUBLIC SETTER
        Benefits
            - Protect our data from INVALID input / values
            - Use conditions for setter method to verify our data same with requested format
               Ex: Strong password -> Lowercase / upperCase / Numbers etc
            -  Customize getter method to return our data in certain format
               Ex: Decoding password
                    12345    ---> Encrypt -->   ABCDE  --->  Decoding ---> 12345
        How to make one instance variable READ_ONLY ?
            - Use only GETTER method for this variable
        How to make one instance variable WRITE_ONLY ?
            - Use only SETTER method for this variable
        Do we need to use both (setter | constr ) in same class ?
            - Yes, They have sligtly difference
            CONSTR --> It will run ONCE when Object is created
            SETTER --> To UPDATE the value of instance variable
        What is boiler plate ?
    TODO: REREAD AND SEARCH
boilerplate code, or simply boilerplate, are sections
of code that are repeated in multiple places with little to no variation.
         Lombok libraries
     */
}
