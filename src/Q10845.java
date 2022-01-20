import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Queue{
    private Data front;
    private Data back;
    private int size = 0;

    Queue(){
        front = null;
        back = null;
    }

    static class Data{
        int value;
        Data next;
        Data(int value){
            this.value = value;
        }
    }

    void push(int X){
        Data newData = new Data(X);
        newData.next = back;
        back = newData;
        size++;
        if(size==1){
            front = newData;
        }
    }

    int pop(){
        if(size==0){
            return -1;
        }
        int returnData = front.value;
        if(size==1){
            front = null;
            back = null;
            size--;
            return returnData;
        }
        Data temp = back;
        while(temp.next!=front){
            temp = temp.next;
        }
        front = temp;
        size--;
        return returnData;
    }
    int size(){
        return size;
    }
    int empty(){
        if(size==0){
            return 1;
        }else{
            return 0;
        }
    }
    int front(){
        if(size==0){
            return -1;
        }
        return front.value;
    }
    int back(){
        if(size==0){
            return -1;
        }
        return back.value;
    }
}

public class Q10845 {

    public static void main(String[] args) throws IOException { // 큐
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue q = new Queue();
        int N = Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++){
            String[] ins = br.readLine().split(" ");
            switch (ins[0]) {
                case "push" -> {
                    int value = Integer.parseInt(ins[1]);
                    q.push(value);
                }
                case "pop" -> System.out.println(q.pop());
                case "size" -> System.out.println(q.size());
                case "empty" -> System.out.println(q.empty());
                case "front" -> System.out.println(q.front());
                case "back" -> System.out.println(q.back());
            }
        }
    }
}