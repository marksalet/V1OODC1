package week1.les1.opdracht3;

public class Student {
	private String studentNaam = "";
	private int studentNummer = 0;
	
	public Student(String sd) {
		studentNaam = sd;
	}
	
	public Student(String sd, int sdnr) {
		studentNaam = sd;
		studentNummer = sdnr;
	}
	
	public String getStudent() {
		return studentNaam;
	}
	
	public String toString() {
		return "Deze student heet " + studentNaam + " en heeft nummer: " + studentNummer;
	}
	
	public void setStudentNummer(int sdnr) {
		studentNummer = sdnr;
	}
	
	public int getStudentNummer() {
		return studentNummer;
	}
}
