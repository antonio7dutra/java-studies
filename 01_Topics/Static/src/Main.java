public class Main {
    public static void main(String[] args) {

        /*static = Makes a variable or method belong to the class
                   rather than to any specific object.
                   Commonly used for utility methods or shared resources.
         */

        Friend friend1 = new Friend("Spongebob");
        Friend friend2 = new Friend("Patrick");
        Friend friend3 = new Friend("Squid ward");
        Friend friend4 = new Friend("Sandy");
        Friend friend5 = new Friend("Gary");

        Friend.showFriends();

    }
}
