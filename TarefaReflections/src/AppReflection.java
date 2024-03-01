import java.lang.annotation.Annotation;

public class AppReflection {
	public static void main(String[] args) {
		
		ProducReflection p = new ProducReflection();
		   Annotation[] annotations = p.getClass().getAnnotations();
		   
	        for (Annotation an : annotations) {
	            System.out.println("Annotations: " + an);
	        }
		
	}
}
