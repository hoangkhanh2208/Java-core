package Library_Manager;

import java.util.Scanner;

public class Library {
    private int bookId;
    private String bookName;
    private String publishingHouse;
    private int publishingYear;
    private int amount;

    public Library() {
    }

    public Library(int bookId, String bookName, String publishingHouse, int publishingYear, int amount) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.publishingHouse = publishingHouse;
        this.publishingYear = publishingYear;
        this.amount = amount;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mã sách: ");
        bookId = Integer.parseInt(sc.nextLine());
        System.out.println("Tên sách: ");
        bookName = sc.nextLine();
        System.out.println("Nhà xuất bản: ");
        publishingHouse = sc.nextLine();
        System.out.println("Năm xuất bản: ");
        publishingYear = sc.nextInt();
        System.out.println("Số lượng: ");
        amount = sc.nextInt();
    }

    @Override
    public String toString() {
        return "Library [amount= " + amount + ", bookId= " + bookId + ", bookName= " + bookName + ", publishingHouse= " + publishingHouse + ", publishingYear= " + publishingYear + "]";
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    

    

    
    

}
