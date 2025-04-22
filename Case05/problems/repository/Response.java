package id.ac.binus.problems.dua.repository;

public abstract class Response {
protected boolean success;
	
	public Response(boolean success) {
		this.success = success;
	}
	
	public boolean isSuccess() {
		return success;
	}
}
