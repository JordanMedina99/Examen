public class Dog {
    public class Dog<T extends Family>{

        private final String name;
        private final int edad;

        public Dog(String name, int edad) {
            this.name = name;
            this.edad = edad;
        }

        public void print(){
            System.out.println(this.name + " , " + this.edad);
        }
}
