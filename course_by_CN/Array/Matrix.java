// Day 5(08-02-2023)
// matrix class


class mat {
	int[][] matrix;

	mat(int[][] mat) {
		matrix = mat;
	}

	public static mat add(mat a, mat b) {
		int ans[][] = new int[a.matrix.length][a.matrix[0].length];
		for (int i = 0; i < a.matrix.length; i++) {
			for (int j = 0; j < a.matrix[0].length; j++) {
				ans[i][j] = a.matrix[i][j] + b.matrix[i][j];
			}
		}
		mat c = new mat(ans);
		return c;

	}

	public static mat multiply(mat a, mat b) {
		int ans[][] = new int[a.matrix.length][b.matrix[0].length];
		for (int i = 0; i < a.matrix.length; i++) {
			for (int j = 0; j < b.matrix[0].length; j++) {

				for (int k = 0; k < a.matrix[0].length; k++) {

					ans[i][j] += a.matrix[i][k] * b.matrix[k][j];
				}

			}
		}

		return (new mat(ans));
	}

	public static mat transpose(mat m) {
		int ans[][] = new int[m.matrix.length][m.matrix.length];
		for (int i = 0; i < m.matrix.length; i++) {
			for (int j = 0; j < m.matrix[0].length; j++) {
				ans[i][j] = m.matrix[j][i];
			}
		}
		mat answer = new mat(ans);
		return answer;
	}

	public static mat rotate(mat m) {
		int ans[][] = new int[m.matrix.length][m.matrix.length];
		int answer[][] = new int[m.matrix.length][m.matrix.length];
		for (int i = 0; i < m.matrix.length; i++) {
			for (int j = 0; j < m.matrix[0].length; j++) {
				ans[i][j] = m.matrix[m.matrix.length - i - 1][m.matrix[0].length - j - 1];
			}
		}

		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[0].length; j++) {
				answer[i][j] = ans[j][i];
			}
		}

		// for (int i = 0; i < answer.length; i++) {
		// 	for (int j = 0; j < answer[0].length; j++) {
		// 		ans[i][j] = answer[answer.length - i - 1][answer[0].length - j - 1];
		// 	}
		// }


		return (new mat(ans));

	}

	public void print() {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
public class Matrix {
    
}
