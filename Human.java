public class Human {

    public class Human<T extends Family>{

        private final String name;
        private final int edad;

        public Human(String name, int edad) {
            this.name = name;
            this.edad = edad;
        }

        public void print(){
            System.out.println(this.name + " , " + this.edad);
        }
}
