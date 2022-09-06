package day1_keep_all_folders.homework.Homework_May_10;

public class Runner {
    public static void main(String[] args) {
        System.out.println( "***LinkLink***" );
        Link link = new Link();
        link.click();
        link.getText();
        link.sendKeys( "Alohamora" );
        System.out.println( "***InputInput***" );
        Input input = new Input();
        input.click();
        input.getText();
        input.sendKeys( "Football" );
        System.out.println( "***WebElementLink***" );
        WebElement web_element = new Link();
        web_element.click();
        web_element.getText();
        web_element.sendKeys( "Java" );
        System.out.println( "***WebElementInput***" );
        WebElement web_element1 = new Input();
        web_element1.click();
        web_element1.getText();
        web_element1.sendKeys( "Nadir" );


        WebElement link3 = new Link(); // created a Link object with WebElement reference

        WebElement input3 = new Input(); // created an Input object with WebElement reference

        //WebDriverUtil.clickElement( link );//todo

      //  WebDriverUtil.clickElement( input );//todo

       // WebDriverUtil.clickElement( new Link() );//todo

        /*
        String [] -> array that stores String object

        Link [] --> array that stores Link objects

         */

        WebElement[] allElements = new WebElement[4]; // created an array that will store objects from classes that implement the WebElement interface
        // [null, null, null, null ]

        allElements[0] = link;   // [LINK obj, null, null, null ]
        allElements[1] = input;   // [LINK obj, INPUT obj, null, null ]
        allElements[2] = new Input();  // [LINK obj, INPUT obj, INPUT obj, null ]
        allElements[3] = new Image(); // [LINK obj, INPUT obj, INPUT obj, IMAGE obj ]

    }
}

