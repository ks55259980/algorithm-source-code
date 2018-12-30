// Precondition: checkInitialization has been called.private int locate(int index, K key){   boolean found = false;   while ( !found && (hashTable[index] != null) )   {      if ( hashTable[index].isIn() && key.equals(hashTable[index].getKey()) )         found = true; // Key found      else             // Follow probe sequence         index = (index + 1) % hashTable.length;         // Linear probing   } // end while   // Assertion: Either key or null is found at hashTable[index]   int result = -1;   if (found)      result = index;   return result;} // end locate// Version 4.0