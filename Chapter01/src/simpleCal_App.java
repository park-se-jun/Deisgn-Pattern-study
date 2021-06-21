import Impl.simpleCal_Impl;
import Impl.userInput_Impl;

public class simpleCal_App {
    public static void main(String[] args) {
        userInput_Impl userInput = new userInput_Impl();
        simpleCal_Impl simpleCal = new simpleCal_Impl();

        int result = 0;
        int value1 = userInput.inputValue();
        int value2 = userInput.inputValue();
        int menu = userInput.inputMenu();

        switch (menu){
            case 1 :
                result = simpleCal.add(value1, value2);
                System.out.println("Result = " + result);
                break;

            case 2 :
                result = simpleCal.minus(value1, value2);
                System.out.println("Result = " + result);
                break;

            case 3 :
                result = simpleCal.multiply(value1, value2);
                System.out.println("Result = " + result);
                break;

            case 4 :
                result = simpleCal.divide(value1, value2);
                System.out.println("Result = " + result);
                break;

            default: System.out.println("Input Error!");
        }
    }
}
