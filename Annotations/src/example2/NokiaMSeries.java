package example2;

@interface Smartphone{
	String os() default "Oreo";
	int version() default 9;
}

@Smartphone(os="Android",version=10)
public class NokiaMSeries {

}
