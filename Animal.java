package elsoproject;

public abstract class Animal {
        private String name; 
        private int weigth;

        
        public void makeSound(){
            System.out.println("AAAAA!");
        }
        
        
        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getWeigth() {
            return this.weigth;
        }

        public void setWeigth(int weigth) {
            this.weigth = weigth;
        }

}

