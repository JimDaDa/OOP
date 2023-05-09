public class NumberOutOfRangeException extends Exception {
private String a;
public NumberOutOfRangeException(String message){
	this.a=message;
}
public String getMessage(){
	return this.a;
}
}