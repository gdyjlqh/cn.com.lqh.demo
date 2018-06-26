package prototype;


/**
 * Created by misu on 2018/1/21.
 */
public abstract class Shape implements Cloneable {
    private int id;
    private String type;

    public int getId() {
        return id;
    }

    public Shape(int id, String type) {
        this.id = id;
        this.type = type;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public abstract void draw();

    @Override
    protected Shape clone() throws CloneNotSupportedException {
        return (Shape) super.clone();
    }

    @Override
    public String toString() {
        return "Shape{" +
                "id=" + id +
                ", type='" + type + '\'' +
                '}';
    }
}
