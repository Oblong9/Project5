package iterators;

import java.util.Iterator;

import adts.LLQ;
import interfaces.BSTInterface.TraversalType;
import nodes.BSTNode;

public class BSTIterator<E extends Comparable<E>> implements Iterator<E> {

	/*private LLQ<BSTNode<E>> queue = new LLQ<BSTNode<E>>();
	private TraversalType trav;

	public BSTIterator(BSTNode<E> root, TraversalType trav)
	{
		this.trav = trav;
		queue.enqueue(root);

	}

	@Override
	public boolean hasNext() {
		return queue.isEmpty();
	}

	@Override
	public E next()
	{
		BSTNode<E> currentNode = queue.dequeue();
		if(currentNode.getLeft() != null)
		{
			queue.enqueue(currentNode.getLeft());
		}
		if(currentNode.getRight() != null)
		{
			queue.enqueue(currentNode.getRight());
		}
		return currentNode.getData();
	}
	*/

	// inherit the queue based on traversal type and then follow the queue
	
	private LLQ<E> queue;
	
	public BSTIterator(LLQ<E> queue)
	{
		this.queue = queue;
	}

	@Override
	public boolean hasNext() {
		return !queue.isEmpty();
	}

	@Override
	public E next() {
		return queue.dequeue();
	}
	
	
	/*protected E rootData;
	protected int size;
	protected int counter;

	
	public BSTIterator(E rootData, int size) {
		this.rootData = rootData;
		this.size = size;
		counter = 0;
	}

	@Override
	public boolean hasNext() {
		return counter < size;
	}

	@Override
	public E next() {
		counter++;
		return rootData;
	}
	*/

}






