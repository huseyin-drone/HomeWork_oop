package homework;

public class oopWork {

	public static void main(String[] args) {
		
		studentInformation student1 = new studentInformation(123456789,"Hüseyin DURAN",92.5) ;
		studentInformation student2 = new studentInformation(253648488,"Kamil KARTOPU",86) ;
		studentInformation student3 = new studentInformation(258741369,"Mahmut KÜÇÜKÇEKMECE",35.5) ;
		
		studentInformation[] students = {student1, student2,student3};
		System.out.println("//////////STUDENT INFORMATION//////////");	
		
		for(studentInformation student : students) {
		
		System.out.println("Student's Name: "+student.name+"\n"+"Student's Number: "+student.number+"\n"+"Student's Point: "+student.point+"\n"+"--------------------------------------");
			
		}
		
		LessonInformation lesson1 = new LessonInformation("Devre Teorisi", "Kamuran KARABAÞ", 6);
		LessonInformation lesson2 = new LessonInformation("Elektromanyetik Teorisi", "Samuray JACK", 7);
		LessonInformation lesson3 = new LessonInformation("Elektronik-1", "Yorgun SAVAÞCI", 3);
		
		LessonInformation[] lessons = {lesson1,lesson2,lesson3};
		
		System.out.println("//////////LESSON INFORMATION//////////");	
		for(LessonInformation lesson : lessons) {
			
		System.out.println("Lesson's Name: "+lesson.name+"\n"+"Teacher's Name: "+lesson.teacher+"\n"+"Lesson's AKTS: "+lesson.AKTS+"\n"+"--------------------------------------");
			
			
		}
		
		LessonManager lessonManager = new LessonManager();	
		System.out.println("***********DERS TAMAMLAMA DURUMU*************");
		lessonManager.lessonCompleted(lesson1);
		lessonManager.lessonCompleted(lesson2);
		lessonManager.lessonCompleted(lesson3);
		System.out.println("**********ÝTÝRAZ DURUMU**************");
		lessonManager.noteObjection(lesson1);
		lessonManager.noteObjection(lesson2);
		lessonManager.noteObjection(lesson3);
		System.out.println("***********ÖÐRENCÝ ONAYI*************");
		lessonManager.confirmResult(student1);
		lessonManager.confirmResult(student2);
		lessonManager.confirmResult(student3);
	}
	   
	    

}
