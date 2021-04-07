package Library_Manager;

import java.util.Scanner;

public class SchoolBook extends Library{
    private int bookPageNumber;
    private String status;
    private int borrowBook;

    public SchoolBook() {
        
    }
    
    public SchoolBook(int bookPageNumber, String status, int borrowBook) {
        this.bookPageNumber = bookPageNumber;
        this.status = status;
        this.borrowBook = borrowBook;
    }

    public SchoolBook(int bookId, String bookName, String publishingHouse, int publishingYear, int amount,
            int bookPageNumber, String status, int borrowBook) {
        super(bookId, bookName, publishingHouse, publishingYear, amount);
        this.bookPageNumber = bookPageNumber;
        this.status = status;
        this.borrowBook = borrowBook;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
      
        super.input();

        System.out.println("Số trang: ");
        bookPageNumber = Integer.parseInt(sc.nextLine());
        System.out.println("Tình trạng: ");
        status = sc.nextLine();
        System.out.println("Số lượng mượn: ");
        borrowBook = sc.nextInt();
    }

    @Override
    public String toString() {
       return super.toString() + ", bookPageNumber= " + bookPageNumber + ", borrowBook= " + borrowBook + ", status= " + status + ", Inventory= " + inventory() + "]";
    }

    public int inventory() {
        return getAmount() - this.borrowBook;
    }



    public int getBookPageNumber() {
        return bookPageNumber;
    }

    public void setBookPageNumber(int bookPageNumber) {
        this.bookPageNumber = bookPageNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getBorrowBook() {
        return borrowBook;
    }

    public void setBorrowBook(int borrowBook) {
        this.borrowBook = borrowBook;
    }

    
   

    


}
