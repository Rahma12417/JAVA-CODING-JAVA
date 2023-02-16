public class CalculationG {
    public static double multiplication(double num1,double num2){
        return num1*num2;
    }
    public static double square(double num1) {
        return num1*num1;
    }
    public static double sum(double num1,double num2){
        return num1+num2;
    }
    public static void outline(String message,double results){
        System.out.println(message+results);
    }
    public static void main(String[] args) {
        double gravity=-9.81;
        double fallingTime =30;
        double initialVelocity=0.0;
        double finalVelocity;
        double initialPosition=0.0;
        double finalPosition=0.0;
        double num=0.5;
        System.out.println("The object's position after "+fallingTime+"seconds is "+finalPosition+"m.");
        //x(t)=0.5*at^2+vit+xi

        finalPosition=(num*(gravity*fallingTime*fallingTime)+(initialVelocity*fallingTime)+initialPosition)/fallingTime;
        System.out.println("finalPosition:"+finalPosition);
        //v(t)=at+vi
        finalVelocity=gravity*fallingTime/fallingTime;
        System.out.println("finalVelocity area:"+finalVelocity);
        double num1=10;
        double num2=15;
        double c=multiplication(num1,num2);
        outline("multiplication",c);
        double d=square(num1);
        outline("powering to square:",d);
        double e=sum(num1,num2);
        outline("sum",e);
    }
}

