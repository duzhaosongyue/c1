package ch01;

public class Test {
    public static void main(String[] args) {
        //初始化客户
        Customer c1 = new Customer("程三发");
        //初始化影片
        Movie m1 = new Movie("喜洋洋与灰太狼之虎虎生威", Movie.CHILDRENS);
        Movie m2 = new Movie("阿凡达水之道", Movie.NEW_RELEASE);
        Movie m3 = new Movie("守岛人", Movie.REGULAR);

        c1.addRental(new Rental(m1, 3));
        c1.addRental(new Rental(m2, 3));
        c1.addRental(new Rental(m3, 3));

        System.out.println(c1.statement());

    }
}
