//Recursion is the process of defining something in terms of itself.
class Factorial{
    //this is a recursive function
    /**
     * @param n
     * @return
     */
    /**
     * josbert 
     * 
     */
    int fact(int n){
        int result;
        if(n==1)
        return 1;
        result = fact(n-1)*n;
        return result;
    }
}
class Recursion{
    public static void main(String[]args){
        Factorial f = new Factorial();

        System.out.println("Factorial of 3 is " + f.fact(3));
        System.out.println("Factorial of 5 is " + f.fact(5));
        System.out.println("Factorial of 7 is " + f.fact(7));

    }
}
