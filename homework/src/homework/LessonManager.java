package homework;

public class LessonManager {
	
public void lessonCompleted (LessonInformation lesson ) {
	
	System.out.println("Ders Tamamlandı: "+lesson.name+"***"+"(Notunuza itiraz etmek istiyorsanız itiraz etme seçeneğine tıklayınız!!!)"+"\n");
		
}

public void noteObjection (LessonInformation lesson) {
	
	System.out.println("!!!"+lesson.name+" dersine itiraz talebiniz gerçekleştirilmiştir."+"\n");
	
}

public void confirmResult(studentInformation student) {
	
	System.out.println(student.name+" tarafından onaylandı."+"\n");
	
	
}



}
