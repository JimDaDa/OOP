public class Student {
    private String name;
    private String address;
    private String sex;
    private int score;
 
    public Student() {
        this.name = "Ky Duyen";
        this.address = "Quan 7 HCM ";
        this.sex = "female";
        this.score = 7;
    }
 
    class StudentOperator {
         void print() {
            System.out.println("Student [" + name + ", " + address + ", " + sex +", " + score + "]: ");
        }
 
        String type() {
            if(score >8) {
                return "A";
            }
			else { 
			 if (score >= 5 ) 
				 
			 return "B";
                else return "C";			
				
                
                }
            
            }
        }
    
 
    public void typefStudent() {
        Student.StudentOperator studentOperator = this.new StudentOperator();
        studentOperator.print();
        studentOperator.type();
    }
}