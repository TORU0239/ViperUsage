package my.liewjuntung.daggerviperusage.model;

/**
 * Created by toruchoi on 08/10/2017.
 */

public class CommentModel {
    private CommentEachModel[] data;
    private int count;

    public CommentEachModel[] getData() {
        return data;
    }

    public void setData(CommentEachModel[] data) {
        this.data = data;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
