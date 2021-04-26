
public class Main {

	public static void main(String[] args) {
		LessonCategory lessonCategory1 = new LessonCategory("Yazýlým Geliþtirici Yetiþtirme Kampý (C# + ANGULAR)","kullanýlan dil c#dýr");
		LessonCategory lessonCategory2 = new LessonCategory("Programlamaya Giriþ için Temel Kurs","Programlamaya baþlamak için basit ve sade bir þekilde açýkalnmýþtýr");
		LessonCategory lessonCategory3 = new LessonCategory("Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)","java ile Programlamaya giriþ");
	
		
		CategoryManager categoryManager = new CategoryManager();
		categoryManager.addToCart(lessonCategory1);
		categoryManager.addToCart(lessonCategory2);
		categoryManager.addToCart(lessonCategory3);
	
	
	}

}
