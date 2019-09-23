package StackAndQueue.two;

public class Test {
    public static void main(String[] args) {
        TwoStackQueue twoStackQueue=new TwoStackQueue();
        int [] elm=new int[]{1,2,3,4,5};
        for(int i=0;i<elm.length;i++){
            twoStackQueue.add(elm[i]);
        }
        System.out.println(twoStackQueue.poll());
        System.out.println(twoStackQueue.peek());

    }
}
