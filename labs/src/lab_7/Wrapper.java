package lab_7;

public class Wrapper<Type>
{
    private Type data;
    public Wrapper(Type _data) {
        data = _data;
    }
    public Type getData() { return data; }
    public void swap(Wrapper<Type> obj)
    {
        Type tmp = this.data;
        this.data = obj.data;
        obj.data = tmp;
    }
}