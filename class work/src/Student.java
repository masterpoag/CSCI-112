public class Student {
        private String name;
        private int ID;
        private float GPA;

        //Contrustors
        public Student() {
        }
        public Student(String name, int ID, float GPA){
            this.name = name;
            this.ID = ID;
            this.GPA = GPA;
        }

        // Setter
        public void setName(String name){
            this.name = name;
        }
        public void setID(int ID){
            this.ID = ID;
        }
        public void setGPA(float GPA){
        this.GPA = GPA;
    }

        // getters
        public String getName(){
            return name;
        }
        public int getID(){
            return ID;
        }
        public float getGPA(){
        return GPA;
    }


}
