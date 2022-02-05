/**
 * Created with Intellij IDEA.
 * Description
 * User: Boss
 * Date: 2022-02-07
 * Time: 15:42
 */

public class Test {

    public static void main(String[] args) {
        LinkList l1=new LinkList();
//        System.out.println(l1.contains(2));
//        System.out.println(l1.size());
//        l1.addLast(1);
//        l1.addLast(2);
//        l1.addFirst(93);
//        l1.addFirst(92);
//        l1.addFirst(39);
//        l1.addFirst(59);
//
//        System.out.println(l1.contains(2));
//
//
//        l1.display();
//        System.out.println("\n"+l1.size());
//        l1.addLast(1);
//        l1.addLast(2);
//        l1.addLast(3);
//        System.out.println();
//        l1.display();
//        System.out.println();
        l1.addIndex(0,0);

        System.out.println();
        l1.addIndex(1,1);
        l1.addIndex(0,9);
        l1.addIndex(0,9);
        l1.addIndex(0,9);
        l1.addIndex(3,7);
        l1.addFirst(4);
        l1.addFirst(4);
        l1.addFirst(9);
        l1.addFirst(9);
        l1.addLast(9);
        l1.addLast(9);
        l1.addLast(9);


        l1.display();
        l1.removeAll(9);
        l1.display();
        LinkList l2= new LinkList();
        l2.addLast(9);
        l2.addLast(9);
        l2.addLast(9);
        l2.addLast(9);
        l2.addLast(9);
        l2.addLast(9);
        l2.addLast(9);
        l2.addLast(9);
        l2.addLast(9);
        l2.display();
        l2.removeAll(9);
        l2.display();

    }
}
///https://leetcode-cn.com/tag/linked-list/problemset/
//https://www.nowcoder.com/exam/oj?tab=%E7%AE%97%E6%B3%95%E7%AF%87&topicId=196&page=1