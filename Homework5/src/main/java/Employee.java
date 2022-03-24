    public class Employee {
       String fullName;
       String position;
       String mail;
       int salary;
       long telephone;
       int age;
    public Employee(String fullName, String position, String mail, long telephone, int salary, int age){
        this.fullName = fullName;
        this.position = position;
        this.mail = mail;
        this.salary = salary;
        this.telephone = telephone;
        this.age = age;
    }

    public void info(){
        System.out.println("Full name: " + fullName + "; Position: " + position + "; E-mail: " + mail + "; Phone number: " + telephone + "; Salary: " + salary + "; Age: " + age);
    }
}
