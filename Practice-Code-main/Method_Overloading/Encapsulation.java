package Method_Overloading;

public class Encapsulation {
private long acc_no;
private String cus_name;
private float bal;


public long getAccNo() {
	return acc_no;
}
public void setAccNo(long a_no) {
	this.acc_no=a_no;
}

public String getName() {
	return cus_name;
}
public void setName(String n) {
	this.cus_name=n;
}
public float getBal() {
	return bal;
}
public void setBal(float b) {
	this.bal=b;
}
}
