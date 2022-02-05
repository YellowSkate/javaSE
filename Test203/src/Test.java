/**
 * Created with Intellij IDEA.
 * Description
 * User: Boss
 * Date: 2022-02-05
 * Time: 16:46
 */
public class Test {
    public static void main(String[] args) {
        SeqList l1=new SeqList();
        SeqList l2=new SeqList();//新建2 个顺序 表
        l1.add(0,2);
        l1.add(0,3);
        l1.add(0,24);
        l1.add(0,224);
        l1.add(0,214);
        l1.add(0,244);
        l1.add(0,254);

        l1.display();
        l1.remove(254);
        l1.display();


    }
}
