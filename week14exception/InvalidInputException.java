public class InvalidInputException extends Exception {
	private String input;

	public InvalidInputException(String input) {
		this.input = input;
	}

	public String getInput() {
		return input;
	}
}
