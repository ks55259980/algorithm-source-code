// Since iterators implement Iterator, methods must be public
private class KeyIterator implements Iterator<K>
{
   private Node nextNode;
   
   private KeyIterator()
   {
      nextNode = firstNode;
   } // end default constructor
   
   public boolean hasNext() 
   {
      return nextNode != null;
   } // end hasNext
   
   public K next()
   {
      K result;
      
      if (hasNext())
      {
         result = nextNode.getKey();
         nextNode = nextNode.getNextNode();
      }
      else
      {
         throw new NoSuchElementException();
      } // end if
   
      return result;
   } // end next
   
   public void remove()
   {
      throw new UnsupportedOperationException();
   } // end remove
} // end KeyIterator 
