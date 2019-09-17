package StackAndQueue;

public class Test {
    public static void main(String[] args) {
        GetMinOne getMinOne=new GetMinOne();
        int [] elm=new int[]{3,4,5,1,2,1};
        for(int i=0;i<6;i++){
            getMinOne.push(elm[i]);
        }
        System.out.println(getMinOne.getMin());
    }
}
