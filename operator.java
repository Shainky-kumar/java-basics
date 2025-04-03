public class operator {

    public static void main(String[] args) {
        // 1. Binary operators
        /*
         * int A = 10;
         * int B = 30;
         * System.out.println(A + B);
         * System.out.println("sum = " + (A + B));
         * System.out.println(A - B);
         * System.out.println("sub = " + (A - B));
         * System.out.println(A * B);
         * System.out.println(" mul = " + (A * B));
         * System.out.println(A / B);
         * System.out.println(" div = " + (A + B));
         * System.out.println(A % B);
         * System.out.println("mod = " + (A % B));
         */

        // unary operator(also two type (1) preincreent operator (2) postincrement )
        /*
         * int a = 8;
         * // [preincrement ]
         * // int b = ++a;
         * // [postincrement ]
         * // int b = a++;
         * // System.out.println(a);
         * // System.out.println(b);
         * // [predicrement]
         * // int b = --a;
         * // [postdecrement]
         * int b = a--;
         * System.out.println(a);
         * System.out.println(b);
         */

        // relational operators (==,!=,>,<,>=,<=)
        /*
         * int a = 90;
         * int b = 80;
         * System.out.println(a == b);
         * System.out.println(a != b);
         * System.out.println(a > b);
         * System.out.println(a < b);
         * System.out.println(a >= b);
         * System.out.println(a <= b);
         */

        // logical operator(&&,||,!)
        // int a = 4;
        // int b = 5;
        // AND operator
        /*
         * System.out.println((a < b) && (a < b));
         * System.out.println((a < b) && (a > b));
         * System.out.println((a > b) && (a < b));
         * System.out.println((a > b) && (a > b));
         */
        // OR operator
        /*
         * System.out.println((a < b) || (a < b));
         * System.out.println((a < b) || (a > b));
         * System.out.println((a > b) || (a < b));
         * System.out.println((a > b) || (a > b));
         */

        // NOT operator(it i used to change the condition such as (true to false) and
        // (false to true))
        /*
         * System.out.println(a < b);
         * System.out.println(!(a < b));
         * System.out.println(a > b);
         * System.out.println(!(a > b));
         */

        // assignment operstor(=,+=,-=,*=,/=)
        int a = 8;
        // a = a + 5;
        // int sum = a + b;
        // System.out.println(sum);
        // a += a;
        // a += 2;
        // System.out.println(a);
        // 2.
        // int b = a;
        // System.out.println(b);
        // 3.
        // int sub = a - 6;
        // System.out.println(sub);
        // a -= a;
        // a -= 2;
        // System.out.println(a);

        // 3.*=
        // int mul = a * 4;
        // a *= a;67890-=
        // a *= 2;
        // System.out.println(a);
        // int div = a / 2;
        // System.out.println(div);
        // a /= a;
        a /= 2;
        System.out.println(a);

    }

}
// thanks operator lecture complete