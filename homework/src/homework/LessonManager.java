package homework;

public class LessonManager {
	
public void lessonCompleted (LessonInformation lesson ) {
	
	System.out.println("Ders Tamamlandý: "+lesson.name+"***"+"(Notunuza itiraz etmek istiyorsanýz itiraz etme seçeneðine týklayýnýz!!!)"+"\n");
		
}

public void noteObjection (LessonInformation lesson) {
	
	System.out.println("!!!"+lesson.name+" dersine itiraz talebiniz gerçekleþtirilmiþtir."+"\n");
	
}

public void confirmResult(studentInformation student) {
	
	System.out.println(student.name+" tarafýndan onaylandý."+"\n");
	
	
}



}
