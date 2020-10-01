public class StudentManagement {
    int m=0;

    public Student[] students = new Student[100];
    public static boolean sameGroup(Student s1, Student s2){
        return s1.getGroup().equals(s2.getGroup());
    }
    public void addStudent(Student newStudent){
        students[m]= newStudent;
        m++;
    }
    public String studentsByGroup(){
        String temp = "";
        String Group[] = new String[100];
        int numberGroup = 0;
        for(int i = 0; i < m; i++){
            int x = 0;
            for(int j = 0; j < numberGroup; j++){
                if(students[i].getGroup().equals(Group[j])){
                    x = 1;
                    break;
                }
            }
            if(x == 0){
                Group[numberGroup] = students[i].getGroup();
                numberGroup++;
            }
        }
        for(int i = 0;i < numberGroup; i++){
            temp += Group[i] + "\n";
            for (int j=0 ; j < m;j++ ){
                if(students[j].getGroup().equals(Group[i])){
                    temp += students[j].getInfo() + "\n";
                }
            }
        }
        return temp;
    }
    public void removeStudent(String id){
        for(int i = 0;i < m; i++){
            if(students[i].getId().equals(id)){
                for(int j = i; j < m-1;j++){
                    students[j]= students[j+1];
                }
                break;
            }
        }
        m--;
    }

    public static void main(String[] args) {
        prodjfkjdngj;
    }
}
