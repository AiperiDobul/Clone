public class Person implements Cloneable {
    private String name;
//    Класс Object в Java содержит стандартный метод clone(),
//    который создает копию объекта.

//        Для использования клонирования в Java нужно реализовать интерфейс java.lang.Cloneable,
//        иначе будет брошено исключение CloneNotSupportedException.
//        Класс Object определяет метод clone(), который создает копию объекта.
//        Чтобы экземпляр класса можно было клонировать,
//        надо реализовать интерфейс Cloneable.
//        Интерфейс Clonable - это интерфейс маркер, он не содержит ни методов, ни переменных.
//        Интерфейс маркер просто определяет поведение классов.
//        Object.clone() выбрасывает исключение CloneNotSupportedException
//        при попытке клонировать объект не реализующий интерфейс Cloneable.
//        Метод clone() в родительском классе Object является protected,
//        поэтому желательно переопределить его как public.
//        Реализация по умолчанию метода Object.clone() выполняет неполное/поверхностное копирование.


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
