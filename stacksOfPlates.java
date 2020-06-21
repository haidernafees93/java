import java.util.ArrayList;

public class stacksOfPlates {
    ArrayList<stack> list = new ArrayList<stack>();

    public stack getLastStack(){
        if(list.size() == 0){
            return null;
        }
        return list.get(list.size()-1);
    }

    public void push(int x){
        stack last = getLastStack();
        if(last != null && !last.isFull()){
            last.push(x);
        }
        else{
            stack veryNew = new stack();
            veryNew.push(x);
            list.add(veryNew);
        }
    }

    public int pop(){
        stack last = getLastStack();
        int temp = last.pop();
        if(last.isEmpty()){
            list.remove(list.size()-1);
        }
        return temp;
    }

    public void print(){
        stack last = getLastStack();
        last.print();
    }

}