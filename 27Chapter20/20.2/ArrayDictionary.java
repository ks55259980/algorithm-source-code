import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
   A class that implements the ADT dictionary by using a resizable array.
   The dictionary is unsorted and has distinct search keys.
  
   @author Frank M. Carrano
   @author Timothy M. Henry
   @version 4.0
*/
public class ArrayDictionary<K, V> implements DictionaryInterface<K, V>
{
	private Entry<K, V>[] dictionary; // Array of unsorted entries
	private int numberOfEntries;
   private boolean initialized = false;
	private final static int DEFAULT_CAPACITY = 25;
	private static final int MAX_CAPACITY = 10000;
	
	public ArrayDictionary()
	{
		this(DEFAULT_CAPACITY);        // Call next constructor
	} // end default constructor
	
	public ArrayDictionary(int initialCapacity)
	{
      checkCapacity(initialCapacity);

		// The cast is safe because the new array contains null entries
      @SuppressWarnings("unchecked")
      Entry<K, V>[] tempDictionary = (Entry<K, V>[])new Entry[initialCapacity];
      dictionary = tempDictionary;
		numberOfEntries = 0;
      initialized = true;
	} // end constructor

/* < Implementations of methods in DictionaryInterface. >
   . . . */
   
	private class Entry<S, T> 
	{
		private S key;
		private T value;
		
		private Entry(S searchKey, T dataValue)
		{
         key = searchKey;
         value = dataValue;
		} // end constructor
		
		private S getKey()
		{
			return key;
		} // end getKey
		
		private T getValue()
		{
			return value;
		} // end getValue
		
		private void setValue(T dataValue)
		{
		 	value = dataValue;
		} // end setValue
	} // end Entry
} // end ArrayDictionary
