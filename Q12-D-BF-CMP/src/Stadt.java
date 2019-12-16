/**
 * 
 * @author kast
 * @version 16.12.2019
 */
public class Stadt {
    public String stadt;
    public Stadt(String stadt) {
        this.stadt=stadt;
    }
    public String getStadt() {
        return stadt;
    }
    public String toString() {
        return stadt;
    }
    public boolean equals(Stadt s) {
        return s.getStadt().equals(stadt);
    }
}
