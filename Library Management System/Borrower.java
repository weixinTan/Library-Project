public abstract class Borrower{
  int ISBN;
  String BookName,category;
  public Borrower(int number,String Name, String Category){
    ISBN= number;
    BookName=name;
    category=Category;
  }
  
  abstract void PrintReceipt(String name，String Category, int number ){}
  
}
