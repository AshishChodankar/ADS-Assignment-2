import java.util.*;
class Student implements Comparable<Student>
{
    private int Hall_Ticket_No;
    private String Name;                        //Candidate Name
    private String Date;                        //Exam Date
    private String Exam_Name;                   //Exam Name                    
    private String Centre_Adress;               //Exam centre Name & Adress       

    Student(int Hall_Ticket_No,String Name,String Date,String Exam_Name,String Centre_Adress)
        {
                this.Hall_Ticket_No=Hall_Ticket_No;
                this.Name=Name;
                this.Date=Date;
                this.Exam_Name=Exam_Name;
                this.Centre_Adress=Centre_Adress;
        }
    
    public int compareTo(Student obj)
        {
            return this.Hall_Ticket_No-obj.Hall_Ticket_No;
        } 
    
    public int getNo()
    {
        return Hall_Ticket_No;
    }

    public String getName()
    {
        return Name;
    }

    public String getDate()
    {
        return Date;
    }

    public String getExamName()
    {
        return Exam_Name;
    }

    public String getCentreAdress()
    {
        return Centre_Adress;
    }

}
class ExamManagementSystem
{
    public static void main(String args[])
    {
        List<Student>list1=new ArrayList<Student>();
        Student s1=new Student(12,"Ashish Chodankar","07-01-2022","CCAT","MIT KOTHRUD,PUNE");
        list1.add(s1);
        list1.add(new Student(11,"Ganesh Palawe","08-01-2020","CCAT","AISSMS SHIVAJINAGAR,PUNE"));
        list1.add(new Student(13,"Abhimanyu Desai","07-01-2020","CCAT","KIT KOLHAPUR"));

        Collections.sort(list1);
        for(Student s:list1)
            {
                System.out.println("Hall_Ticket_No:"+s.getNo()+"\t"+"Name:"+s.getName()+"\t"+"Date:"+s.getDate()+"\t   "+"Exam Name:"+s.getExamName()+"\t   "+"Exam Centre Adress:"+s.getCentreAdress());
            }

    }
}