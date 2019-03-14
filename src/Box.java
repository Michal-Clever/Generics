public class Box<T> {

    private T type;

    public Box(T toBox) {
        type = toBox;
    }

    public T getFromBox(){
        return type;
    }

}
