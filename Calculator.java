// Vanessa Lu
// Sep. 29, 2021
// Problem Set 2-A

class Calculator {
    //instance variables:
    
    //Quadratic variables
    private double a = 1; //coeff of x^2
    private double b = 5; //coeff of x
    private double c = 6; //y intercept
    private double i = 0;   //intermediate values
    
    //Slope and Midpoint variables
    private double x1 = 0; //x value of first point
    private double y1 = 0; //y vallue of first point
    private double x2 = 2; //x value of second point
    private double y2 = 3; //y value of second point
    
    //Arithmetic Series variables
    private double Ka = 5;  //first k terms in the arith. series to be added together
    private double a1 = 1; //value of first term of the arith. series
    private double inc = 1; //the amount each term in the arith. series increases by
    private double ak; //value of last term of the arith. series
    
    //Finite Geometric Series variables
    private double r = 2; //rate the terms of the geo. series increase by, AKA common ratio
    private double Kg = 3; //first k terms in the geo. series to be added together
    private double g1 = 3; //value of first term in the geo. series 
    
    //Constructor for objects of class Problem_Set_2A
    public Calculator()
    {
      //nothing to do :/
    }
    
    public void display() {
        
        //Quadratic
        System.out.println("QUADRATIC FORMULA"); //print output of solutions
        System.out.println("The solutions for " + (int)a + "x^2 + " + (int)b + "x + " + (int)c + " are " + quadraticPlus(a, b, c) + " and " + quadraticMinus(a,b,c) + ".");
        System.out.println();
        
        //Slope
        System.out.println("SLOPE FORMULA"); //print output of slope
        System.out.println("A line connecting the points ("+(int)x1+", "+(int)y1+") and ("+(int)x2+", "+(int)y2+") has a slope of " + slope(x1, y1, x2, y2));
        System.out.println();
        
        //Midpoint
        System.out.println("MIDPOINT FORMULA"); //print output of midpoint
        System.out.println("The midpoint between ("+(int)x1+", "+(int)y1+") and ("+(int)x2+", "+(int)y2+") is (" + midpointX(x1, x2) + ", " + midpointY(y1, y2) + ")");
        System.out.println();
        
        //Sum of Arithmetic Series
        System.out.println("SUM OF AN ARITHMETIC SERIES"); //print output of sum
        System.out.println("The sum of the first "+ (int)Ka +" terms of an arithmetic series that starts with "+ a1 +" and increases by " + inc + " is " + arithmeticSum(Ka, a1, ak, inc));
        System.out.println();
        
        //Sum of Finite Geometric Series
        System.out.println("SUM OF A FINITE GEOMETRIC SERIES"); //print output of sum
        System.out.println("The sum of the first "+ (int)Kg +" terms of a finite geometric series that starts with "+ g1 +" and increases by a rate of " + r + " is " + geometricSum(r, Kg, g1));
        System.out.println();
    }

    double quadraticPlus(double a, double b, double c) {
        i = (b*b)-(4*a*c); //calculate inside of square root
        i = Math.sqrt(i);  //calculate output of square root
        return (-b-i)/(2*a); //calculate solution 1
    }
    
    double quadraticMinus(double a, double b, double c) {
        i = (b*b)-(4*a*c); //calculate inside of square root
        i = Math.sqrt(i);  //calculate output of square root
        return (-b+i)/(2*a); //calculate solution 2
    }
    
    double slope(double x1, double y1, double x2, double y2) {
        return (y2 - y1)/(x2 - x1); //calculate slope
    }
    
    double midpointX(double x1, double x2) {       
        return (x1+x2)/2; //calculate x value of midpoint
    }
    
    double midpointY(double y1, double y2) {
        return (y1+y2)/2; //calculate y value of midpoint
    }
    
    double arithmeticSum(double Ka, double a1, double ak, double inc) {
        ak = a1 + (inc*(Ka-1)); //calculate value of last term in the arith. series
        return (Ka/2)*(a1+ak); //calculate the sum of the arith. series
    }
    
    double geometricSum(double r, double Kg, double g1) {
        return g1*((1-(Math.pow(r,Kg)))/(1-r)); //calculate sum of geo. series
    }
}
