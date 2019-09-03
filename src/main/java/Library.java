import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList<Book> collection;
    private int capacity;
    private HashMap<String, Integer> genres;

    public Library(int capacity){

        this.collection = new ArrayList<Book>();
        this.capacity = capacity;
        this.genres = new HashMap<String, Integer>();

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


    public int getNumberOfGenres() {
        for (Book book : collection){
            if(genres.containsKey(book.getGenre())){
               genres.put(book.getGenre(), genres.get(book.getGenre())+1);
            } else
            genres.put(book.getGenre(), 1);
        }
        return genres.size();
    }

    public int checkGenre(String genre) {
        getNumberOfGenres();
        return genres.get(genre);
    }
}
