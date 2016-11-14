package fibonnaciReverse;

import java.util.ArrayList;
import java.util.List;

public class FibonnaciReverse {
	@SuppressWarnings("finally")
	
	public static List<Integer> run(final int n) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		if (n < 1)
			try {
				throw new MyOwnException("Numero de entrada invalido. Debe ser mayor que 1");
			} catch (MyOwnException e) {e.printStackTrace();}
		finally {return array;}
		else if (n == 1)
		{
			array.add(1);
			return array;
		} 
		else 
		{
			array.add(1);
			array.add(1);
			for (int i = 2; i < n; i++)
				array.add(array.get(i - 1) + array.get(i - 2));
			
		//
		ArrayList<Integer> out = new ArrayList<Integer>();
		for (int i = 0; i < array.size(); i++)
			out.add(array.get(array.size() - 1 - i));
		return out;
		}

	}

}

class MyOwnException extends Exception {
	private static final long serialVersionUID = -219261622789731020L;

	public MyOwnException(String msg) {
		super(msg);
	}
}
