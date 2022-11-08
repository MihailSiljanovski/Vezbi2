package zadacha5;

public class ClassMain {
	public static void main(String[] args) {
		Predmet predmet1 = new Predmet();
		predmet1.imeP = "OOP";
		predmet1.prof = "Aleksandar";
		predmet1.krediti = 6;
		predmet1.semestar = "IV";
		Predmet predmet2 = new Predmet("JAVA");
		Predmet predmet3 = new Predmet("Vezbi OOP", "Alek", 4);
		//se dodeluvaat vrednosti vo prviot default konstruktor i se ispechatuvaat
		System.out.println("Ime na predmetot e: " + predmet1.imeP + "; Profesor e: " + predmet1.prof + "; krediti: " + predmet1.krediti + "; semestar: " + predmet1.semestar);
		//se dodeluvat vrednosti za vtoriot konstruktor koi prima na vlez samo ime na predmeti i se ispechatuva
		System.out.println("Ime na predmetot e: " + predmet2.imeP);
		//se dodeluvaat vrednostite na tretiot konstruktor koi gi prima na vlez soodvetno i se ispechatuvaat
		System.out.println("Ime na predmetot e: " + predmet3.imeP + "; Profesor e: " + predmet3.prof + "; krediti: " + predmet3.krediti);
	}
}
