package ch01;

/**
 * 租赁类
 *
 * @author fuping
 */
public class Rental {

    /***
     * 影片
     */
    private Movie _movie;

    /***
     * 租赁天数
     */
    private int _daysRented;

    public Rental(Movie movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }

    public Movie getMovie() {
        return _movie;
    }

    public int getDaysRented() {
        return _daysRented;
    }
}
