import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Calculator



{
    private static double res=0,x=0,y=0,arg=0;
    private static String op;
    private static String sw;

    static Calculator calc = new Calculator();
    static Scanner reader = new Scanner(System.in);

    double sum(double x,double y)

    {
       return x+y;
    }

    double sub(double x,double y)

    {
        return x-y;
    }

    double mult(double x,double y)
    {
        return x*y;
    }

    double divide(double x,double y)
    {
        return x/y;
    }

    void operation(double x,double y)

    {


        switch (op) {
            case "*":
                res = calc.mult(x, y);
                break;

            case "+":
                res = calc.sum(x, y);
                break;

            case "-":
                res = calc.sub(x, y);
                break;

            case "/":
                res = calc.divide(x, y);
                break;

            default:
                System.out.print("it is no operation!");
                System.exit(777);

        }
    }


        boolean switcher()
        {

            if (Objects.equals(sw, "yes"))
            {
                System.exit(777);
                return false;

            }

             if (Objects.equals(sw, "no")) return true;

            else return false;


        }



    public static void main(String[] args)

    {
        ArrayList<Double> list = new ArrayList<Double>();
        System.out.println("Ввод 1 аргумента: ");

        try
        {
            x = reader.nextDouble();
        }
        catch (Exception ex)
        {
            System.err.print("Incorrect argument!");
            System.exit(777);
        }

        System.out.println("Ввод 2 аргумента: ");

        try
        {
            y = reader.nextDouble();
        }
        catch (Exception ex)
        {
            System.err.print("Incorrect argument!");
            System.exit(777);
        }

        System.out.println("Ввод операции: ");
        op = reader.next();
        calc.operation(x,y);
        System.out.println("Резульат: " + res);
     //   list.add(res);
        System.out.println("Вы желаете выйти? ");
        sw = reader.next();

        while (calc.switcher())

        {
            System.out.println("Введите аргумент! ");

            try
            {
                arg = reader.nextDouble();
            }

            catch (Exception ex)

            {
                System.err.print("Incorrect argument!");
                System.exit(777);
            }

            System.out.println("Ввод операции: ");
            op = reader.next();

            calc.operation(res,arg);
            System.out.println("Резульат: " + res);;

            System.out.println("Вы желаете выйти? ");
            sw = reader.next();
        }


    }

}
