package day13.practice;

public class Acorn{

    String id;
    String name;
    String phone;

   public Acorn(  String id, String name, String phone ) {
      this.id =id;
      this.name =name;
      this.phone =phone;
  }

  public void printInfo( ){
    System.out.println( id ) ;
    System.out.println( name );
    System.out.println( phone );
 }
}

