public class Dog extends Animals{
    public Dog(String name, double max_length, double max_length_swim, double max_height){
        super(name, max_length, max_length_swim, max_height); // ссылаемся на экземпляр в Animals
    }
}
