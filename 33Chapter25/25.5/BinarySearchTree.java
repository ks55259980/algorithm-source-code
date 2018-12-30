package TreePackage;import java.util.Iterator;/**   A class that implements the ADT binary search tree by extending BinaryTree.   Recursive version.    @author Frank M. Carrano   @author Timothy M. Henry   @version 4.0*/public class BinarySearchTree<T extends Comparable<? super T>>             extends BinaryTree<T> implements SearchTreeInterface<T>{   public BinarySearchTree()   {      super();   } // end default constructor      public BinarySearchTree(T rootEntry)   {      super();      setRootNode(new BinaryNode<>(rootEntry));   } // end constructor      public void setTree(T rootData) // Disable setTree (see Segment 25.6)   {      throw new UnsupportedOperationException();   } // end setTree      public void setTree(T rootData, BinaryTreeInterface<T> leftTree,                       BinaryTreeInterface<T> rightTree)   {      throw new UnsupportedOperationException();   } // end setTree/* < Implementations of contains, getEntry, add, and remove are here. Their     definitions appear in subsequent sections of this chapter. Other methods     in SearchTreeInterface are inherited from BinaryTree. >    . . . */  } // end BinarySearchTree