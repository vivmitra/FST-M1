package Test;

public class Activity5 {

    public static void main(String[] args) {

        String title= "Hounds of Baskerville";

        MyBook newNovel = new MyBook();

        newNovel.setTitle(title);

//Print result
        System.out.println("The title is: " + newNovel.getTitle());
    }
}
