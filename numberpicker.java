package numberpicker;
import java.awt.im.InputContext;
import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

class NumberPicker {
	 {

			public class List {

				public class Shuffle {
					    public static void main(String[] args) {
				        List<String> list = new ArrayList<String>();
				        for (String a : args)
				        list.add(a);
				        Collections.shuffle(list, new Random());
				        System.out.println(list);
				    }

  static enum Result {
    Win, Lose, Draw
  }

  private int valueOfListImpl(List<Integer> input) {
    
	  if (input.size() == 0) {
	        int zero = 0 ;
	                return zero ;
	        }
	  
	      
	  else if (input.size() == 1) {
	        return input.get(0);
	    }  
	 
    else 
    {
    	int leftHead = input.first() ;
    			      input.remove(0);
    			        List<Integer> leftTail = input ;
    			        int rightHead = input.last() ;
    			        input.remove(input.size() - 1) ;
    			        List<Integer> rightTail = input ;

    			        int headVal = leftHead - valueOfList(leftTail) ;
    			        int tailVal = rightHead - valueOfList(rightTail) ;

    			        Math.max(headVal, tailVal) ;
    			    }
    			}

  public Result findWinner(List<Integer> input) {
    
	  System.out.println("list 1 before modification"+input);
	    int firstPlayerValue = valueOfListImpl(input);


	    List<Integer> inputTwo = input;

	    System.out.println("list 2 befor modification"+inputTwo);

	    int secondPlayerValue = valueOfListImpl(inputTwo); 

	    	    System.out.println("1st value--- "+firstPlayerValue);
	    	    System.out.println("2nd value--- "+secondPlayerValue);

	    	    System.out.println("Invalid Pick");

  }
  
	    	
				}
			}
