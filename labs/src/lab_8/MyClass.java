package lab_8;
public class MyClass {
    private String val;
    public int count;
    protected boolean flag;
    public MyClass(String _val, int _count) {
        val = _val;
        count = _count;
        flag = true;
    }
    private MyClass(int _count){
        val = "DATA";
        count = _count;
        flag = true;
    }
    protected MyClass(String _val){
        val = _val;
        count = 10000;
        flag = true;
    }

    public void print() { System.out.println("[ " + val + " - " + count + " ]"); }
    public String getVal() { return val; }
    public int getCount() { return count; }
    public boolean getFlag() { return flag;}
}