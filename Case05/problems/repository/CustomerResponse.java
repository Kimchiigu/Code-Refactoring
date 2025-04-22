package id.ac.binus.problems.dua.repository;

public class CustomerResponse<T> extends Response {
	private String message;
	private T payload;
	
	public CustomerResponse(boolean success, String message, T payload) {
		super(success);
		this.message = message;
		this.payload = payload;
	}
	
	public String getMessage() {
		return message;
	}
	public T getPayload() {
		return payload;
	}
}
