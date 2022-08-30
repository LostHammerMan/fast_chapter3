package ch08;

import java.util.ArrayList;

class Animal{
    public void move(){
        System.out.println("동물이 움직인다!!");
    }

}

class Human extends Animal{
    @Override
    public void move() {
        System.out.println("사람이 두 발로 걷는다!!");
    }

    public void readBook(){
        System.out.println("사람은 책을 읽는다...");
    }
}

class Tiger extends Animal{
    @Override
    public void move() {
        System.out.println("호랑이는 네 발로 뛴다...");
    }

    public void hunting(){
        System.out.println("호랑이 사냥을 시작한다!!");
    }

}

class Eagle extends Animal{
    @Override
    public void move() {
        System.out.println("독수리가 난다요!!");
    }

    public void flying(){
        System.out.println("떳다 떳다 독수리!");
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        Animal hAnimal= new Human();
        Animal tAnimal = new Tiger();
        Animal eAnimal = new Eagle();

//        AnimalTest test = new AnimalTest();
//        test.moveAnimal(hAnimal);
//        test.moveAnimal(tAnimal);
//        test.moveAnimal(eAnimal);

        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(hAnimal);
        animalList.add(eAnimal);
        animalList.add(tAnimal);

        for (Animal animal : animalList){
            animal.move();
        }

        AnimalTest test = new AnimalTest();
        test.testDownCasting(animalList);
    }

    public void testDownCasting(ArrayList<Animal> list){
        for (int i=0; i<list.size(); i++){
            Animal animal = list.get(i);

            if (animal instanceof Human){
                Human human = (Human) animal;
                human.readBook();
            } else if (animal instanceof Tiger) {
                Tiger tiger = (Tiger) animal;
                tiger.hunting();
            } else if (animal instanceof Eagle){
                Eagle eagle = (Eagle) animal;
                eagle.flying();
            }else {
                System.out.println("unsupported Type......");
            }

        }
    }


    public void moveAnimal(Animal animal){ // 상속을 하게 되면, 하위 클래스는 상위 클래스로 모두 핸들링 가능
                                             // (상속 설계시 신중할 필요 있음)
        animal.move(); // 코드는 한줄, 어떤 인스턴스 형인가에 따라 달라짐
    }
}
