package iterators;

import java.util.Iterator;

import adts.LLQ;

public class BSTIterator<E extends Comparable<E>> implements Iterator<E> {
	
	private LLQ<E> queue;

	public BSTIterator(LLQ<E> queue)
	{ 
		// inherit the queue based on traversal type and then follow the queue
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

}






