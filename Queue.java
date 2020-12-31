import java.util.Random;

public class Queue {
    private Card[] array;
    private int front;
    private int back;
    private int size;

    public Queue(int capacity) {
        this.array = new Card[capacity];
        this.front = 0;
        this.back = 0;
        this.size = 0;
    }

    public Card getFront() {
        try {
            if (this.size == 0) {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("This is empty");
        }
        return this.array[this.front];
    }


    public Card getBack() {
        try {
            if (this.size == 0) {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("This is empty");
        }
        return this.array[this.back - 1];
    }


    public int size() {
        return this.size;
    }

    public void enqueue(Card value) {
        this.array[this.back] = value;
        this.back++;
        this.size++;
    }

    public Card dequeue() {
        try {
            if (this.size == 0) {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("This is empty");
        }
        Card value = this.array[this.front];
        this.array[this.front] = null;
        this.front++;
        this.size--;
        return value;
    }
    
    public void shuffle() {
        Random random = new Random();
        for (Card item : this.array) {
            int randint = random.nextInt(this.array.length);
            Card temp = this.array[randint];
            this.array[randint] = item;
            item = temp;
        }
    }

    public String toString() {
        String str = "";
        for(Card item : this.array) {
            str += item.toString() + " ";
        }
        return str;
    }
}
