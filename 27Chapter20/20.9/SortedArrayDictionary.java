import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
   A class that implements the ADT dictionary by using a resizable sorted array.
   The dictionary has distinct search keys.
 
   @author Frank M. Carrano
   @author Timothy M. Henry
   @version 4.0
*/
public class SortedArrayDictionary<K extends Comparable<? super K>, V>
             implements DictionaryInterface<K, V>
{
	private Entry<K, V>[] dictionary; // Array of entries sorted by search key
	private int numberOfEntries; 
   private boolean initialized = false;
	private final static int DEFAULT_CAPACITY = 25;
	private static final int MAX_CAPACITY = 10000;

/* < Constructors analogous to those in Listing 20-1. >
   . . . */

   // 20.11
	/** Precondition: key and value are not null. */
   public V add(K key, V value)
	{
		checkInitialization();
      if ((key == null) || (value == null))
         throw new IllegalArgumentException("Cannot add null to a dictionary.");
      else
      {
         V result = null;
         int keyIndex = locateIndex(key);

         if ( (keyIndex < numberOfEntries) && 
               key.equals(dictionary[keyIndex].getKey()) )
         {
            // Key found, return and replace entry's value
            result = dictionary[keyIndex].getValue(); // Old value
            dictionary[keyIndex].setValue(value); 		// Replace value
         }
         else // Key not found; add new entry to dictionary
         {  
            makeRoom(keyIndex); // Make room for new entry
            dictionary[keyIndex] = new Entry<>(key, value); // Insert new entry in array
            numberOfEntries++;
            ensureCapacity(); // Ensure enough room for next add
         } // end if
         
         return result;
      } // end if
	} // end add

   /* < Implementations of other methods in DictionaryInterface. >
    . . . */
   
   // 20.12
	// Returns the index of either the entry that contains key or
   // the location that should contain key, if no such entry exists.
	private int locateIndex(K key)
	{
      // Search until you either find an entry containing key or
      // pass the point where it should be
		int index = 0;
		while ( (index < numberOfEntries) && 
		         key.compareTo(dictionary[index].getKey()) > 0 )
		{
			index++;
		} // end while
		
		return index;
	} // end locateIndex

   // Makes room for a new entry at a given index by shifting
   // array entries towards the end of the array.
   // Precondition: keyIndex is valid; list length is old length.
   private void makeRoom(int keyIndex)
   {
      // . . . To be implemented
   } // end makeRoom

	// Removes an entry at a given index by shifting array
   // entries toward the entry to be removed.
	private void removeArrayEntry(int keyIndex)
	{
      // . . . To be implemented
	}  // end removeArrayEntry

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
} // end SortedArrayDictionary