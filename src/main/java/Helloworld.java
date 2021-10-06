
public class Helloworld {
    public static void main1(String[] args){
        System.out.println("Hello World");

        try{
            System.out.println(Integer.MAX_VALUE);
            StringBuilder sb = new StringBuilder();
            sb.append("Hello");
            sb.append("how are you ");

            String s = sb.toString();
            System.out.println("String is " + s);

            int i = 10;
            int j = 10;
            if ((i < 20) && (j<11)){
                System.out.println("i is greater than 20 ");
            }
            boolean hello1 = i < 20? true : false;
            System.out.println("Hello" + hello1);

            switch(i){
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.print("two");
                    break;
                default:
                    System.out.println("Default");
                    break;
            }
        }
        catch(Exception e){
            System.out.println("Error assigning" + e);
        }
    }
}
