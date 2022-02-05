import com.sun.java.swing.plaf.windows.WindowsDesktopIconUI;

/**
 * Created with Intellij IDEA.
 * Description
 * User: Boss
 * Date: 2022-02-07
 * Time: 15:43
 */
class  Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
    }
}
public class LinkList {
    public Node head;
    public boolean isHead(){
        return this.head==null?true:false;    //判断头节点是否为空
    }
    public void addFirst(int data){
        Node node=new Node(data);
        if(isHead()){  //头节点为空
            this.head=node;
         }
        else{
            node.next=this.head;
            this.head=node;
        }
    }
    public  void  display(){
        Node cur =this.head;
        if(isHead()){
            System.out.println("null");
        }
        while (cur!=null){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();
    }
    public void addLast(int data){

        Node node=new Node(data);

        if(isHead()){
            this.head=node;
            return;
        }
        Node cur=this.head;
        while(cur.next!=null){
            cur=cur.next;
        }
        cur.next=node;

    }
    public void printList(Node head){
        while (head.next!=null){
            System.out.printf("%d ", head.data);
            head=head.next;
        }
        System.out.printf("%d ", head.data);
        System.out.println("");
    }
    //查找是否包含关键字Key
    public boolean contains(int key){
//        if(isHead()){
//            return false;
//        }
        Node cur=this.head;
        while(cur!=null){
            if(cur.data==key)return true;
            cur=cur.next;
        }
        return false;
    }
    //判断长度
    public int size(){
        Node cur=this.head;
        int s=0;
        while(cur!=null){
            s++;
            cur=cur.next;
        }
        return s;
    }
    //插入节点,第一个节点下标为0
    public void addIndex(int index,int data){
        if(index<0){
//            System.out.println("\nIndex Err");
//            return;
            throw new RuntimeException("index不合法");
        }
        Node cur=this.head;
        int count=0;
        while(count!=index){
            if(cur.next==null) {
                break;
            }
            cur=cur.next;
            count++;
        }
        if(count==index) {
            if (cur != null) {
                Node tmp = new Node(0);
                tmp.data = cur.data;
                tmp.next = cur.next;
                cur.data = data;
                cur.next = tmp;
            } else {
                Node head = new Node(data);
                this.head = head;
            }
        }
        else if(count==index-1){  //被break了
            Node node=new Node(data);
            cur.next=node;
        }
        else{
//            System.out.println("\nIndex Err");
            throw new RuntimeException("index不合法");

        }
    }
    //删除第一次出现的key节点
    public void  remove(int key){

        Node prev=this.head;
        if(prev==null) return;
        if(prev.data==key ){
            if(prev.next==null) {
                this.head = null;
                return;
            }
            else {
                this.head = prev.next;
                return;
            }

        }
        else{
            if(prev==null||prev.next==null)
                return;
        }

        while(prev.next.data!=key){
          if(prev.next.next==null){ return;}
          prev=prev.next;
        }           //寻找KEY的前驱
        prev.next=prev.next.next;

    };
    //寻找前驱
    private Node searchPrev(int key){
        Node prev=this.head;
        while(prev.next!=null){
            if(prev.next.data==key){return prev;}
            else prev=prev.next;
        }
        return null;
    }
    //删除所有key节点
    public void removeAll(int key){
        if(isHead())return;

        Node prev=this.head;
        Node cur=prev.next;
        while(cur!=null){
            if(cur.data==key){
                cur=cur.next;
                continue;
            }
            else {
                prev.next = cur;
                prev=prev.next;
                cur = cur.next;

            }
        }
        prev.next=cur;
        if(this.head.data==key){
            this.head=this.head.next;
        }
    };
    //置空
    public void clear(){this.head=null;};
}
