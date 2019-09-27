package StackAndQueue.four;

import java.util.LinkedList;
import java.util.Queue;

public class DogCatQueue {
    private Queue<PetEnterQueue> dogQ;
    private Queue<PetEnterQueue> catQ;
    private int count;

    public DogCatQueue() {
        this.dogQ=new LinkedList<PetEnterQueue>();
        this.catQ=new LinkedList<PetEnterQueue>();
        this.count= 0;
    }
 public void add(Pet pet){
        if(pet.getType().equals("dog")){
            this.dogQ.add(new PetEnterQueue(pet,this.count++));
        }else if(pet.getType().equals("cat")){
            this.catQ.add(new PetEnterQueue(pet,this.count++));
        }else{
            throw new RuntimeException("not cat or dog");
        }
    }
    public Pet pollAll(){
        if(!dogQ.isEmpty()&&!catQ.isEmpty()){
            if(this.dogQ.peek().getCount()<this.catQ.peek().getCount()){
              return this.dogQ.poll().getPet();
            }else{
                return this.catQ.poll().getPet();
            }
        }else{
            if(!this.dogQ.isEmpty()){
                return this.dogQ.poll().getPet();
            }else{
                if(!this.catQ.isEmpty()){
                    return this.catQ.poll().getPet();
                }else {
                    throw new RuntimeException("null");
                }
            }
        }
    }
    public Dog PollDog(){
     if(!dogQ.isEmpty()){
         return (Dog) dogQ.poll().getPet();
     }else{
         throw new RuntimeException("dog null");
     }
    }

    public Cat pollCat(){
        if(!catQ.isEmpty()){
            return (Cat) catQ.poll().getPet();
        }else{
            throw new RuntimeException(" cat null");
        }

    }
}
