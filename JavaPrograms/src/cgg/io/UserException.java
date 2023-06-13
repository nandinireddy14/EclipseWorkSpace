package cgg.io;


class ApplicationException extends Exception{
	private int detail;
	public ApplicationException(int detail)
	{
		super();
		this.detail=detail;
	}
	@Override
	public String toString() {
		return "ApplicationException [detail=" + detail + "]";
	}
	
}

public class UserException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			compute(1);
			compute(20);
		}
		catch(ApplicationException e)
		{
			System.out.println(e);
		}
	}
	private static void compute(int i) throws ApplicationException{
		System.out.println("called compute("+i+")");
		if(i>10)
			throw new ApplicationException(i);
		System.out.println("normal exit");
	}

}

