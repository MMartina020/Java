package elsoproject;

public class Cat extends Animal implements Pet{
    
        public Cat(){  
            this.getName();
        }
        
        public Cat(String nev){
            this.setName(nev);
        }
        
        public Cat(String nev, int weight){
            this.setName(nev);
            this.setWeigth(weight);
        }
        
        
        public void meow(){
            System.out.println("Meow!");
        }
        
        @Override   //felülírja az őse metódusát
        public void makeSound(){
            System.out.println("Miau");
        }

    @Override
    public void oleles() {
       }

    @Override
    public void leul() {
        }

    @Override
    public void fekszik() {
       }
    
    
}