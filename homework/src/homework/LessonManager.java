package homework;

public class LessonManager {
	
public void lessonCompleted (LessonInformation lesson ) {
	
	System.out.println("Ders Tamamland�: "+lesson.name+"***"+"(Notunuza itiraz etmek istiyorsan�z itiraz etme se�ene�ine t�klay�n�z!!!)"+"\n");
		
}

public void noteObjection (LessonInformation lesson) {
	
	System.out.println("!!!"+lesson.name+" dersine itiraz talebiniz ger�ekle�tirilmi�tir."+"\n");
	
}

public void confirmResult(studentInformation student) {
	
	System.out.println(student.name+" taraf�ndan onayland�."+"\n");
	
	
}



}
