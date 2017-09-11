import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.sql.DriverManager;

public class AnnoMain {
	
	//다 만들어진 코드에 추가적으로 할 것을 정의할 때 쓰면 된다.
	//Annotation 왜 만들었을까?
	public static void main(String[] args){
		UseAnnotation use = new UseAnnotation();
		
		String ano = use.getClass().getAnnotation(CustomAnnotation.class).key();
		
		if(ano.equals("Student")){
			
		}
	}
}

// 4가지 속성

// 주로 쓰는 것
// Target = 적용할 대상 : 생성자, 멤버변수, 타입(클래스), 파라미터 메소드
// Retention = Annotation 정보의 유지단계
//             소스코드, 클래스, 런타임...

// 부가적으로 쓰는 것
// Documented = javadoc에 문서화 되어야 하는 element
// Inherited = 상속되는 Annotation

//1. Annotation을 사용하면 소스코드를 사용하는 것보다 통제가 쉬워진다.
//2. 코드에 대한 예외 처리가 필요없다. 사전에 미리 컴파일 하기 전에 에러 처리가 된다.
//3. 

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME) 
@interface CustomAnnotation{
	public String value() default "값";
	public String key();
	
}

@CustomAnnotation(key = "Student")
class UseAnnotation {
	String key = "student";

}

