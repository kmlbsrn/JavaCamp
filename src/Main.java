
public class Main {

	public static void main(String[] args) {
		LessonCategory lessonCategory1 = new LessonCategory("Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + ANGULAR)","kullan�lan dil c#d�r");
		LessonCategory lessonCategory2 = new LessonCategory("Programlamaya Giri� i�in Temel Kurs","Programlamaya ba�lamak i�in basit ve sade bir �ekilde a��kalnm��t�r");
		LessonCategory lessonCategory3 = new LessonCategory("Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)","java ile Programlamaya giri�");
	
		
		CategoryManager categoryManager = new CategoryManager();
		categoryManager.addToCart(lessonCategory1);
		categoryManager.addToCart(lessonCategory2);
		categoryManager.addToCart(lessonCategory3);
	
	
	}

}
