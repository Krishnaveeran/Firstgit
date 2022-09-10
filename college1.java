
 class college1{
  int year;
  String university;

 
   public college1(int passedout, String college)
{
   year=passedout;
   university=college;
  }

  public static void main(String[] args) {
    college1 myObj = new college1(2018,"Annauniv");
    System.out.println(myObj.year + " " +myObj.university);
}
}
