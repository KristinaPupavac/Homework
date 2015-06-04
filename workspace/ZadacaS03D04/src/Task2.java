/*
 *  Napisati metodu koja za dati broj bodova vraca koja je to ocjena. Pretpostaviti da ce dati broj bodova uvijek
 *  biti izmedju 0 i 100. Uraditi preko switch komande. A−[94;100] B-[84;93] C−[74;83] D-[64;73] E−[55;63] F−[0;54]
 *  Metoda: char getGrade(int score)
 *  PRIMJERI
 *  getScore(93) = ‘A’
 *  getScore(28) = ‘F’
 *  getScore(76) = ‘C’
 */
public class Task2 {
	public static char getGrade(int score) {
		char finalGrade;
		int switchOutput = 0;

		if (score >= 94 && score <= 100) {
			switchOutput = 0;
		} else if (score >= 84 && score <= 93) {
			switchOutput = 1;
		} else if (score >= 74 && score <= 83) {
			switchOutput = 2;
		} else if (score >= 64 && score <= 73) {
			switchOutput = 3;
		} else if (score >= 55 && score <= 63) {
			switchOutput = 4;
		} else if (score >= 0 && score <= 54) {
			switchOutput = 5;
		}

		switch (switchOutput) {

		case 0:
			return finalGrade = 'A';
		case 1:
			return finalGrade = 'B';
		case 2:
			return finalGrade = 'C';
		case 3:
			return finalGrade = 'D';
		case 4:
			return finalGrade = 'E';
		case 5:
			return finalGrade = 'F';
		}
		return '0';
	}

	public static void main(String[] args) {
		System.out.println(getGrade(91));

	}

}
