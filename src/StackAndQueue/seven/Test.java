package StackAndQueue.seven;

public class Test {
    public static void main(String[] args) {
        MaxWindow maxWindow=new MaxWindow();
        int []arr=new int[]{4,3,5,4,3,3,6,7};
        int w=3;
//        maxWindow.getMaxWindowOne(arr,w);
        maxWindow.getMaxWindowTwo(arr,w);
    }
}
