public class threeinone{

    public static void main(String[] args){
        Stacks a = new Stacks();
        Stacks b = new Stacks();
        Stacks c = new Stacks();
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};

        int length = arr.length;
        int limit = length/3;

        if((length%3) == 0){
            System.out.println("Phase A");
            for(int i = 0; i < limit; i++){
                a.push(arr[i]);
                b.push(arr[i+limit]);
                c.push(arr[i+limit+limit]);   
            }
            a.print();
            b.print();
            c.print();
            System.out.println();
        }

        else{
            System.out.println("Phase B");
            System.out.println("limit = " + limit);
            for(int i = 0; i < limit; i++){
                a.push(arr[i]);
                b.push(arr[i+limit]);
                c.push(arr[i+limit+limit]);   
            }
            for(int i = 0; i < (length%3);i++){
                c.push(arr[(3*limit)+i]);
            }
            
            a.print();
            b.print();
            c.print();
            System.out.println();
        }
    }
}