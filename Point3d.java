
public class Point3d {
	/* координата X */
	private double xCoord;
	/* координата Y */
	private double yCoord;
	/* координата Z */
	private double zCoord;
	/*Конструктор инициализации*/
	public Point3d ( double x, double y, double z) {
		xCoord = x;
		yCoord = y;
		zCoord = z;
		}

	/*Конструктор по умолчанию*/ 
	public Point3d () { 
		this(0, 0, 0);
	}
	/* Возвращение координаты X */
	public double getX () {
		return xCoord;
	}
	/* Возвращение координаты Y */
	public double getY () {
		return yCoord;
	}
	/* Возвращение координаты Z */ 
	public double getZ () {
		return zCoord;
	}
	/* Установка значения координаты X */
	public void setX ( double val) {
		xCoord = val;
	}
	/* Установка значения координаты Y */
	public void setY ( double val) {
		yCoord = val;
	}
	/* Установка значения координаты Z */
	public void setZ ( double val) {
		zCoord = val;
	}
	/* сравнение значений объектов класса Point3d */
	public boolean compareValues(Object obj) {
		Point3d a = (Point3d) obj;
		return this.xCoord == a.xCoord && this.yCoord == a.yCoord && this.zCoord == a.zCoord;
	}
	/* Вычисление расстояния между двумя точками */
	public double distanceTo(Object obj) {
		Point3d a = (Point3d) obj;
		return Math.sqrt( Math.pow(a.xCoord - this.xCoord,2) + Math.pow(a.yCoord - this.yCoord,2) + Math.pow(a.zCoord - this.zCoord,2));	
	}
}