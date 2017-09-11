import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.sql.DriverManager;

public class AnnoMain {
	
	//�� ������� �ڵ忡 �߰������� �� ���� ������ �� ���� �ȴ�.
	//Annotation �� ���������?
	public static void main(String[] args){
		UseAnnotation use = new UseAnnotation();
		
		String ano = use.getClass().getAnnotation(CustomAnnotation.class).key();
		
		if(ano.equals("Student")){
			
		}
	}
}

// 4���� �Ӽ�

// �ַ� ���� ��
// Target = ������ ��� : ������, �������, Ÿ��(Ŭ����), �Ķ���� �޼ҵ�
// Retention = Annotation ������ �����ܰ�
//             �ҽ��ڵ�, Ŭ����, ��Ÿ��...

// �ΰ������� ���� ��
// Documented = javadoc�� ����ȭ �Ǿ�� �ϴ� element
// Inherited = ��ӵǴ� Annotation

//1. Annotation�� ����ϸ� �ҽ��ڵ带 ����ϴ� �ͺ��� ������ ��������.
//2. �ڵ忡 ���� ���� ó���� �ʿ����. ������ �̸� ������ �ϱ� ���� ���� ó���� �ȴ�.
//3. 

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME) 
@interface CustomAnnotation{
	public String value() default "��";
	public String key();
	
}

@CustomAnnotation(key = "Student")
class UseAnnotation {
	String key = "student";

}

