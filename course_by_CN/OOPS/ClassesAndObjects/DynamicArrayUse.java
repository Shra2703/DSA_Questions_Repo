package course_by_CN.OOPS.ClassesAndObjects;
// Day 6(29-01-2024)
// Dynamic array class

class DynamicArray{
    private int data[];
    int count;

    // constructor function
    public DynamicArray(){
        data = new int[5];
    }

    // size of the array function
    public int getSize(){
        return count;
    }

    // adding element in the array
    public void add(int ele){
        if(data.length == count){
            doubleArray();
        }
        data[count] = ele;
        count++;
    }


    // pop out the element from the array
    public int remove(){
        if(count == 0){
            System.out.println("Underflow");
            return -1;
        }
        int temp = data[count - 1];
        count--;
        return temp;
    }

    // getting the element from teh particular index in the array
    public int get(int index){
        if(index >= count){
            System.out.println("Index out od bound");
            return -1;
        }

        return data[index];
    }

    // checking whether the array is emplty or not
    public boolean isEmpty(){
        return count == 0;
    }

    // setting the element at the particular index
    public void set(int ele, int index){
        if(index >= count){
            System.out.println("Index out od bound");
            return;
        }

        data[index] =  ele;
    }

    // doubling the size of the array
    private void doubleArray() {
        int temp[] = new int[count * 2];
        for(int i = 0 ; i <count ; i++){
            temp[i] = data[i];
        }
        data =  temp;
    }
}

public class DynamicArrayUse {
    public static void main(String[] args) {

        DynamicArray d = new DynamicArray();
        for(int i = 0 ; i < 8; i++){
            d.add(i + 10);
        }

        for(int i = 0 ; i < d.getSize(); i++){
            System.out.println(d.get(i));
        }
        System.out.println(d.getSize());
        System.out.println(d.remove());
        System.out.println(d.getSize());


        
    }
}
