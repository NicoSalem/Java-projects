package study_new;

public interface List_interface <T> {

	public void add(T t);
	
	public void InsertAtIndex(int index, T data);
	
	public void deleteAtIndex(int index, T data);
	
	public int length();
	
	public T print();
	
}
