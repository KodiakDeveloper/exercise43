package loops;

import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Ex43 {

	public static void main(String[] args) {

		String userAnswer;

		ArrayList<Double> salary = new ArrayList<>();

		Double userSalary, salarySum = 0.0, percentual, tax;

		DecimalFormat df = new DecimalFormat("#,##0.00");

		do {

			userSalary = Double.parseDouble(JOptionPane.showInputDialog(null, "Input user salary: "));

			if (userSalary <= 0) {

				JOptionPane.showMessageDialog(null, "Please input a salary greater than zero!");
			} else {

				salary.add(userSalary);
			}

			userAnswer = JOptionPane.showInputDialog(null, "Do You Want To Continue??");

			userAnswer = userAnswer.toLowerCase().trim();

		} while (userAnswer.equals("yes"));

		if (salary.isEmpty()) {

			JOptionPane.showMessageDialog(null, "No salary was entered.");

		}

		else {

			for (int i = 0; i < salary.size(); i++) {

				salarySum += salary.get(i);

				System.out.println("Employee: " + i + " salary : " + df.format(salary.get(i)));
			}

			JOptionPane.showMessageDialog(null, "Salaries summed: " + df.format(salarySum));

			for (int i = 0; i < salary.size(); i++) {

				if (salary.get(i) <= 1556.94) {

					percentual = 8.0 / 100;

				} else if (salary.get(i) >= 1556.95 && salary.get(i) <= 2594.92) {

					percentual = 9.0 / 100;

				} else if (salary.get(i) >= 2594.93 && salary.get(i) <= 5189.82) {

					percentual = 11.0 / 100;

				} else {
					percentual = 0.0;
				}

				tax = percentual * salary.get(i);

				JOptionPane.showMessageDialog(null,

						"Tax for the salary of: " + df.format(salary.get(i)) +

								"\nTax: " + df.format(tax));
			}
		}
	}
}
