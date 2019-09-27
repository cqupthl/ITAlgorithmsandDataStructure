package StackAndQueue.four;

public class PetEnterQueue {
    private Pet pet;
    private int Count;

    public PetEnterQueue(Pet pet, int count) {
        this.pet = pet;
        this.Count = count;
    }

    public Pet getPet() {
        return pet;
    }

    public int getCount() {
        return Count;
    }
    public String getEnterPetType(){
        return this.pet.getType();
    }
}
