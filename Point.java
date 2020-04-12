class Point {
	String id
	double x,y;

	//TODO add new variable
        String color;
	//TODO constructor

	//TODO setters and getters

	public Point(String id,double x, double y, String color){
        this.id = id;
        this.x=x;
        this.y=y;
        this.color=color;
    }
    //TODO setters and getters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void move (char xDirection, char yDirection) {
        //TODO
        this.x = this.x + Double.parseDouble(String.valueOf(xDirection));
        this.y = this.y + Double.parseDouble(String.valueOf(yDirection));
    }

    public void draw () {
        //TODO
        System.out.println("Current co-ordinations :" + "("+this.x + "," +this.y+")");
    }



}
class Canvas
{
    private List<Point> points;
    public Canvas() {
        points = new ArrayList<>();
    }

    public void addAPoint(Point p)
    {
        this.points.add(p);
    }
    public void removeAPoint(Point p)
    {
        this.points.remove(p);
    }
    public void moveAPoint(char x,char y)
    {
        Iterator<Point> iterator = points.iterator();
        while (iterator.hasNext()) {
            iterator.next().move(x, y);
        }
    }
}
