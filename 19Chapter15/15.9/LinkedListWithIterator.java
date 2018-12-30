import java.util.Iterator;
import java.util.NoSuchElementException;
/**
   A class that implements the ADT list by using a chain of nodes.
   The list has an iterator. The class is similar to LList.
   
   @author Frank M. Carrano
   @author Timothy M. Henry
   @version 4.0
*/
public class LinkedListWithIterator<T> implements ListWithIteratorInterface<T>
{
   private Node firstNode;
   private int  numberOfEntries;;

   public LinkedListWithIterator()
   {
      initializeDataFields();
   } // end default constructor

/*	< Implementations of the methods of the ADT list go here;
     you can see them in Chapter 14, beginning at Segment 14.7 >
   . . . */
   
   public Iterator<T> iterator()
   {
	   return new IteratorForLinkedList();
   } // end iterator

	public Iterator<T> getIterator()
	{
	   return iterator();
	} // end getIterator
   
	private class IteratorForLinkedList implements Iterator<T>
	{
      private Node nextNode;

		private IteratorForLinkedList()
		{
			nextNode = firstNode;
		} // end default constructor
		
      // 15.11
		public T next()
		{
			if (hasNext())
			{
				Node returnNode = nextNode;        // Get next node
				nextNode = nextNode.getNextNode(); // Advance iterator
				
				return returnNode.getData();       // Return next entry in iteration
			}
			else
				throw new NoSuchElementException("Illegal call to next(); " +
		                                       "iterator is after end of list.");
		} // end next

      // 15.12
		public boolean hasNext()
		{
			return nextNode != null;
		} // end hasNext
      
      // 15.13
		public void remove()
		{
			throw new UnsupportedOperationException("remove() is not " +
		                                           "supported by this iterator");
		} // end remove
	} // end IteratorForLinkedList
	
	private class Node
	{
      private T    data; // Entry in list
      private Node next; // Link to next node
      
      private Node(T dataPortion)
      {
         data = dataPortion;
         next = null;
      } // end constructor
      
      private Node(T dataPortion, Node nextNode)
      {
         data = dataPortion;
         next = nextNode;
      } // end constructor
      
      private T getData()
      {
         return data;
      } // end getData
      
      private void setData(T newData)
      {
         data = newData;
      } // end setData
      
      private Node getNextNode()
      {
         return next;
      } // end getNextNode
      
      private void setNextNode(Node nextNode)
      {
         next = nextNode;
      } // end setNextNode
	} // end Node
} // end LinkedListWithIterator



