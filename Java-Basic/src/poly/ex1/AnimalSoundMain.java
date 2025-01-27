package poly.ex1;

public class AnimalSoundMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();
/*
        Caw[] cawArr = {dog, cat, caw}; // 컴파일 오류 발생
        System.out.println("동물 소리 테스트 시작");
        for (Caw caw : cawArr) {
            cawArr.sound();
        }
*/
        System.out.println("동물 소리 테스트 종료");

        System.out.println("동물 소리 테스트 시작");
        dog.sound();
        System.out.println("동물 소리 테스트 종료");

        System.out.println("동물 소리 테스트 시작");
        cat.sound();
        System.out.println("동물 소리 테스트 종료");

        System.out.println("동물 소리 테스트 시작");
        caw.sound();
        System.out.println("동물 소리 테스트 종료");
        sound(caw);
    }

    private static void sound(Caw caw) {
        System.out.println("동물 소리 테스트 시작");
        caw.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
