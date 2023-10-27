class  Test <T> {
    public T value;
    public T next;
    public T prev; 


    Test(T value, T next, T prev){
        this.value =value;
        this.next = value;
        this.prev = value;
    }

    boolean equals(Test<T> t){
        return (value.equals(t.value));
    }

    
}

public class Three {
    public static void main(String[] args) {
        
    }
}
