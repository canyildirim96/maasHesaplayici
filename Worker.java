public class Worker {
    String name;
    int workHours;
    int hireYear;
    int result;

    int salary;
    Worker(String name, int workHours, int salary, int hireYear){
        this.name = name;
        this.workHours = workHours;
        this.hireYear = hireYear;
        this.salary = salary;
        
    }
   int tax(){
        if (this.salary > 1000) {
            return result = (this.salary * 3) / 100;
        }
        else return 0;
   }

   int perMinuteSalary(){
       if(workHours > 40){
           return (workHours - 40) * 30;
       }
        else return 0;
   }
    int raiseSalary(){
        int date = 2021;
        if (date - this.hireYear == 10){
            return this.salary * 5 / 100;
        }else if(date - hireYear > 9 && date - hireYear < 20){
            return this.salary * 10 / 100;
        }else if(date - hireYear > 19){
            return  this.salary * 15 / 100;
        }
        return 0;
    }

    void print(){
        System.out.println("Adı: " + this.name);
        System.out.println("Maaşı: " + this.salary);
        System.out.println("Çalışma Saati: " + this.workHours);
        System.out.println("İşe Başlangıç Yılı: " + this.hireYear);
        System.out.println("Vergi Bedeli: " + tax());
        System.out.println("Bonus: " + perMinuteSalary());
        System.out.println("Maaş Artışı: " + raiseSalary());
        System.out.println("Toplam Maaş: " + (this.salary + perMinuteSalary() + raiseSalary() - tax()));
        //System.out.println();
    }

}
