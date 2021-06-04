package cn.cstube.queue;

/**
 * @author Heling
 * @date 2021/6/4
 */
public class ArrayQueueDemo {
    public static void main(String[] args) {

    }


}


/**
 * 使用数组模拟队列-编写一个ArrayQueue类
 */
class ArrayQueue {
    /**
     * 表示数组的最大容量
     */
    private int maxSize;
    /**
     * 表示队列头
     */
    private int front;
    /**
     * 表示队列尾
     */
    private int rear;
    /**
     * 该数据用于存放数据，模拟队列
     */
    private int[] arr;


    /**
     * 构建队列的构造器
     *
     * @param maxSize
     */
    public ArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        arr = new int[maxSize];
        //指向队列头部，分析出front是指向队列头的前一个位置
        front = -1;
        //指向队列尾，指向队列尾的数据（即就是队列最后一个数据）
        rear = -1;

    }

    /**
     * 判断队列是否满
     *
     * @return boolean
     */
    public boolean isFull() {
        return rear == maxSize - 1;
    }

    /**
     * 判断队列是否为空
     *
     * @return boolean
     */
    public boolean isEmpty() {
        return rear == front;
    }

    /**
     * 添加数据到队列
     *
     * @param n
     */
    public void addQueue(int n) {
        //判断队列是否为空
        if (isFull()) {
            System.out.println("队列满，不能加入数据");
            return;
        }
        rear++;
        arr[rear] = n;
    }


    /**
     * 获取队列的数据，出队列
     *
     * @return int
     */
    public int getQueue() {
        //判断队列是否为空
        if (isEmpty()) {
            throw new RuntimeException("队列为空，无法取出数据");
        }
        front++;
        return arr[front];
    }

    /**
     * 显示队列的所有数据
     */
    public void showQueue(){
        //遍历
        if(isEmpty()){
            System.out.println("队列是空的，没有数据");
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d]=%d\n",i,arr[i]);
        }
    }

    /**
     * 显示队列的头数据，注意不是取数据
     * @return int
     */
    public int headQueue(){
        //判断
        if(isEmpty()){
            throw new RuntimeException("队列空的，没有数据");
        }
        return arr[front + 1];
    }

}