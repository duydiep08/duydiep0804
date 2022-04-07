import java.util.Scanner;

class NhanVien {
     private String name;
     private String address;
     private int time;
     private int age;
     private double salary;
     private double bonus;

     public NhanVien(){
         Scanner scan = new Scanner(System.in);
         System.out.println("Infomation:");
         this.name = scan.nextLine();
         this.age = scan.nextInt();
         this.address = scan.next();
         this.time = scan.nextInt();
         this.salary = scan.nextDouble();
         if(time>=200){
             this.bonus = salary *1.2;
         }else  if(time>=100 && time <200){
             this.bonus = salary*1.1;
         }else if(time>=0 && time<100){
             this.bonus = 0;
         }
     }

     public NhanVien(String name, int age, int time,double salary, String address, double bonus) {
        this.name = name;
        this.age = age;
        this.time = time;
        this.salary = salary;
        this.address = address;

         if(time>=200){
             this.bonus = salary *1.2;
         }else  if(time>=100 && time <200){
             this.bonus = salary*1.1;
         }else if(time>=0 && time<100){
             this.bonus = 0;
         }
     }

     //GETTER
     public String getName(){
         return this.name;
     }
     public int getAge(){
         return  this.age;
     }
     public String getAddress(){
         return  this.address;
     }
     public int getTime(){
        return  this.time;
     }
     public double getSalary() {
        return salary;
     }
     public double getBonus() {
        return bonus;
     }

    //SETTER
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
         this.age = age;
    }
    public void setTime(int time){
         this.time = time;
    }
    public void setAddress(){
         this.address= address;
     }
    public void setSalary() {
        this.salary= salary;
    }
    public void setBonus() {
        this.bonus= bonus;
    }


    void printInfo(){
        System.out.println("Name: "+ this.getName());
        System.out.println("Age: "+ this.getAge());
        System.out.println("Address: "+ this.getAddress());
        System.out.println("Time work: "+ this.getTime());
        System.out.println("Salary: "+ this.getSalary());
        System.out.println("Bonus: "+ this.getBonus());
    }
}

