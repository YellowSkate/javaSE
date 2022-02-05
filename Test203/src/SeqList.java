import java.util.Arrays;

/**
 * Created with Intellij IDEA.
 * Description
 * User: Boss
 * Date: 2022-02-05
 * Time: 16:20
 */


public class SeqList {
    public int [] list;
    public int usedSize;
    public static  final int capacity = 2;  //一般情况下定义常量 都放在static,显而易见,可以节约空间
    public SeqList(){
        this.list=new int[capacity];
        this.usedSize=0;
    }
    //判断pos合法性
    private void checkPos(int pos){
        if(pos<0 ||pos>this.usedSize){
            throw new RuntimeException("pos is illegal");
        }
    }
    //判断顺序表满否
    private boolean isFull(){
//        if(this.usedSize==this.list.length)
//            return true;
//        else
//            return false;
        return this.usedSize==this.list.length;
    }
    //打印顺序表
    public void display(){
        for (int i=0;i<usedSize;i++) {
            System.out.printf("%d ", this.list[i]);
        }
        System.out.printf("\n");
    }
    //在pos位置增加元素
    public void add(int pos,int data){
        if(isFull()){
            this.list= Arrays.copyOf(this.list,(this.list.length)+2);
        }
        if(pos>=0 &&pos <=usedSize) {
            int i = 0;
            for (i = usedSize;i>pos;i--){
                this.list[i]=this.list[i-1];
            }
            this.list[pos]=data;
            usedSize++;
        }
        else
            throw new RuntimeException("pos is illegal");
    }
    //判断元素是否在表中
    public boolean contains(int toFind){
        for(int i=0;i<usedSize;i++){
            if(toFind==this.list[i])
                return true;
        }
        return false;
    }
    //查找某个元素
    public int search(int toFind){
        for (int i = 0; i <this.usedSize ; i++) {
            if(toFind==this.list[i])
                return i;
        }
        return -1;
    }
//    public boolean isPos(int pos){
//        if(pos)
//
//    }
    //获取POS位置的元素
    public int getPos(int pos){
        if(this.usedSize==0)
            throw new RuntimeException("seqList is null");
//        if(pos>=0 &&pos <usedSize)
//            return this.list[pos];
//        else
//            throw new RuntimeException("pos is illegal");
        checkPos(pos);
        return this.list[pos];
    }
    //修改pos位置的value
    public  void setPos(int pos,int value){
//        if(pos>=0 && pos<this.usedSize){
//            this.list[pos]=value;
//
//        }
//        else
//            System.out.println("pos is illegal");
        checkPos(pos);
        this.list[pos]=value;
    }
    //删除第一次出现的关键字key
    public void remove(int toRemove){
        int pos=-1;
        for (int i = 0; i < this.usedSize ; i++) {
            if (toRemove == this.list[i]) {
                pos = i;
                break;
            }
        }
        if(pos!=-1){
            this.usedSize--;
            for (int i = pos; i <this.usedSize ; i++) {
                this.list[i]=this.list[i+1];
            }
            this.list[usedSize+1]=0;
        }
    }
    //获取顺序表的长度
    public int size(){
        return this.usedSize;
    }
    //清空顺序表
    public void clear(){
        this.usedSize=0;
    }
}
