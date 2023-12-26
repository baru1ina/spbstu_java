package lab_9;
public class MyClass {
    private String val;
    private int count;
    private boolean flag;
    public MyClass(String _val, int _count) {
        val = _val;
        count = _count;
        flag = true;
    }
    public void print() { System.out.println("[ " + val + " - " + count + " - " + flag + " ]"); }

    public String getVal() { return val; }
    public void increaseCount(int step) { this.count+= step; }
    public void switchFlag(int i) {
        if (i==1) this.flag = true;
        else this.flag = false;
    }
}