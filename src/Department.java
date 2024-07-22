public class Department {
    private String name;
    private Book[] books;
    private int countBooks;

    public Department(String name, int maxBooks) {
        this.name = name;
        this.books = new Book[maxBooks];
        this.countBooks = 0;
    }

    public void addBook(Book book){
        if (countBooks <= books.length) {
            books[countBooks] = book;
            countBooks++;
        }else{
            System.out.println("нельзя добавить еще книг");
        }
    }


    public int countBooks() {
        return countBooks;
    }

    public Book[] getBooks() {
        return books;
    }

    public Book[] findBookByAuthor(String author){
        Book[] foundBooks = new Book[books.length];
        int count = 0;
        for (int i = 0; i < countBooks; i++) {
            if (books[i].getAuthor().equalsIgnoreCase(author)) {
                foundBooks[count] = books[i];
                count++;
            }
        }
        return foundBooks;
    }


}
