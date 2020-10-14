package hashTable;

public interface INode<T> {
	INode<T> getNext();

	void setNext(INode<T> myNode);

	T getData();

	void setData(T d);
}