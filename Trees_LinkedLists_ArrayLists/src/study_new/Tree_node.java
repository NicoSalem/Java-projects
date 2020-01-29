package study_new;

public class Tree_node <T>{
	
	T data;
	Tree_node right;
	Tree_node left;
	Tree_node prev;
	
	public Tree_node(T data) {
		this.data = data;
	}
}
