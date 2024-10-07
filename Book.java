package library;
public class Book {
    private String title;
    private String author;
    private boolean isAvailable;
    // Constructor
    public Book(String title, String author) {
    this.title = title;
    this.author = author;
    this.isAvailable = true;
    }
    public void borrowBook(){
        if (isAvailable == true){
            isAvailable = false;
            System.out.println("The book is borrowed successfully");
        }
        else{
            System.out.println("The book is already borrowed");
        }
    }
    public void returnBook(){
       isAvailable = true;
       System.out.println("The book is returned successfully");
    }
    public String getBookInfo(){
        return "Title: "+ title + " ,Author: "+ author+ " ,Availability Status:"+ isAvailable;
    }
    }