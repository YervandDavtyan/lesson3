public class Operetions {
    public static void main(String[] args) {
        int x;
        int $x;
        int _x = 9;
        System.out.println(_x);
        int a45 = 92;
        System.out.println(a45);

        String firstName = "Yervand";
        System.out.println(firstName);
        String first_name = "Bob";
        System.out.println(first_name);

        int a = 4,b = 7;
        int c = a + b;
        System.out.println(c);
        c = a - b;
        System.out.println(c);
        System.out.println(a*b);

        int e = 12, f = 5;
        System.out.println(e/f);
        System.out.println(e%f);

        double t = 7.0, p = 5.0;
        System.out.println(t/p);

        x = 8;
        x++;
        ++x;
        System.out.println(x);

        x = 5;
        System.out.println(x++);
        System.out.println(x);

        x = 9;
        e = 7;
        c = x++ - --e; // c = 9 - 6 = 3
        //x = 10, y = 6
        System.out.println("x =" + x);
        System.out.println("e =" + e);
        System.out.println("c =" + c);

        System.out.println("----------------");
        x = 7;
        b = 8;
        c = ++x + b--; // 8 + 8 =16, x = 8, y = 7
        System.out.println(x++); //x = 8
        System.out.println(c); //x = 16
        System.out.println(x); //x = 9
        System.out.println(--b);//y = 6
        System.out.println(b);// y = 6

        boolean bb = x == 12;
        System.out.println(bb);
        System.out.println(x != 45);
        System.out.println(x > 4);
        System.out.println(x <= 44);

        x = 54;
        System.out.println(x % 2 == 0);

        System.out.println(x>=1 && x<=9);

        boolean mianish = x>=1 && x<=9;

        boolean vv = x < 0 || x > 100;

        vv = true;
        System.out.println(!vv);

        x = 7;
        x += 2;// nuyna x = x + 2
        System.out.println(x);
        x = 17;
        x &= 9;
    }
}
