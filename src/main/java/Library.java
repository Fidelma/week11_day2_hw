import java.util.ArrayList;

public class Library {

    private ArrayList<Book> collection;
    private int capacity;

    public Library(int capacity){

        this.collection = new ArrayList<Book>();
        this.capacity = capacity;

    }

    public int getCollectionSize() {
        return collection.size();
    }

    public void addBook(Book book) {
        if (collection.size() < capacity) {
            this.collection.add(book);
        }
    }


    public Book loanBook(Book book) {
        int index = collection.indexOf(book);
        return collection.remove(index);
    }
}
