package StackAndQueue.seven;

import java.util.LinkedList;

public class MaxWindow {
    public void getMaxWindowOne(int []arr,int w){
        int n=arr.length;
        int length=n-w+1;
        int []res=new int[length];
        for(int i=0;i<n-w+1;i++){
            int temp=arr[i];
            for(int j=i+1;j<i+w;j++){
                if(temp<arr[j]){
                    temp=arr[j];
                }
            }
            res[i]=temp;
        }
   for(int x=0;x<length;x++){
       System.out.print(res[x]);
   }
    }
    public void getMaxWindowTwo(int []arr,int w){
        int n=arr.length;
        int length=n-w+1;
        int []res=new int[length];
        int index=0;
        LinkedList<Integer> list=new LinkedList<>();

        while(arr==null||n<w||w<1){
            System.out.println("空");
        }
        for(int i=0;i<n;i++){
            while(!list.isEmpty()&&arr[list.getLast()]<=arr[i]){
                list.pollLast();
            }
            list.add(i);
           if(list.getFirst()==i-w){
               list.pollFirst();
           }
           if(i>=w-1){
               res[index++]=arr[list.getFirst()];
           }
        }

        for(int j=0;j<res.length;j++){
            System.out.print(res[j]);
        }



    }
}
