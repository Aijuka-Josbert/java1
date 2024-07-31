import java.util.Scanner;

public class Trial3 {
    public static void main(String[] args) {
         //Trial3 t = new Trial3();
       Scanner scan = new Scanner(System.in);
       
    }
    String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    String skill;

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    int age;
    private Scanner scan;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        try {
            System.out.print("Enter age: ");
          //  Scanner scan = new Scanner(System.in);
            age = scan.nextInt();
            if (age < 0 || age > 125)
                throw new Exception("Invalid Age");
        } catch (Exception e) {
            System.out.println("Nyonya bano");
        }
        scan.close();
    }

   
}