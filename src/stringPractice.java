public class stringPractice {
    public static void main(String[] args) {

       // String str = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin nisl ex, ultricies vitae egestas et, lobortis sit amet velit. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Vivamus placerat sem quis semper rhoncus. Aenean lacus nisi, dictum vitae pulvinar et, mattis et mi. Quisque ut arcu in elit rutrum ultricies. Proin iaculis mauris consequat leo luctus, eget porttitor tortor mattis. Vestibulum ut euismod nulla, ac tempus libero. Aenean molestie, odio a ornare rhoncus, ipsum purus eleifend lacus, et accumsan sem enim eu nisl. Duis condimentum, nunc a aliquet semper, ipsum sapien aliquet mi, luctus commodo velit turpis sit amet quam. Etiam felis nisi, ornare et condimentum id, pharetra ut ante. Ut vehicula scelerisque dapibus. Curabitur blandit quis erat vel tempor. Donec fermentum purus eget eros porta malesuada";
        String str="Lorem ipsum dolor sit amet";
        int length = str.length();
        char arr[] = str.toCharArray();
        int countA = 0, countW = 0, temp = 0;
        for (int i = 0; i < length; i++) {
            if (arr[i] == 'a' || arr[i] == 'A') {
                countA++;
            }
            if (arr[i] != ' ') {
                temp++;
            }
                if (temp >= 5) {
                    temp = 0;
                    countW++;
                }
            }

        System.out.println("Number of A's in string are " + countA);
        System.out.println("Number of words greater than length 5 = " + countW);
    }
}