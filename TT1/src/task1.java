//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class task1 {
    public static void main(String[] args) {
        String string = "Kayak";
        boolean flag = true;

        //Converts the given string into lowercase
        string = string.toLowerCase();

        //Iterate the string forward and backward, compare one character at a time
        //till middle of the string is reached
        for (int i = 0; i < string.length() / 2; i++) {
            if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
                flag = false;
                break;

            }
        }
        if (flag)
            System.out.println("Given string is palindrome");
        else
            System.out.println("Given string is not a palindrome");
    }
}