
public class Point3d {
	/* ���������� X */
	private double xCoord;
	/* ���������� Y */
	private double yCoord;
	/* ���������� Z */
	private double zCoord;
	/*����������� �������������*/
	public Point3d ( double x, double y, double z) {
		xCoord = x;
		yCoord = y;
		zCoord = z;
		}

	/*����������� �� ���������*/ 
	public Point3d () { 
		this(0, 0, 0);
	}
	/* ����������� ���������� X */
	public double getX () {
		return xCoord;
	}
	/* ����������� ���������� Y */
	public double getY () {
		return yCoord;
	}
	/* ����������� ���������� Z */ 
	public double getZ () {
		return zCoord;
	}
	/* ��������� �������� ���������� X */
	public void setX ( double val) {
		xCoord = val;
	}
	/* ��������� �������� ���������� Y */
	public void setY ( double val) {
		yCoord = val;
	}
	/* ��������� �������� ���������� Z */
	public void setZ ( double val) {
		zCoord = val;
	}
	/* ��������� �������� �������� ������ Point3d */
	public boolean compareValues(Object obj) {
		Point3d a = (Point3d) obj;
		return this.xCoord == a.xCoord && this.yCoord == a.yCoord && this.zCoord == a.zCoord;
	}
	/* ���������� ���������� ����� ����� ������� */
	public double distanceTo(Object obj) {
		Point3d a = (Point3d) obj;
		return Math.sqrt( Math.pow(a.xCoord - this.xCoord,2) + Math.pow(a.yCoord - this.yCoord,2) + Math.pow(a.zCoord - this.zCoord,2));	
	}
}