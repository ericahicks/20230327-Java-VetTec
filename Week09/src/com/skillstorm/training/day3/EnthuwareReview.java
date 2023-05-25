package com.skillstorm.training.day3;

public class EnthuwareReview {

	public static void main(String[] args) {
		/* Problem 21 -- eXceptions
		 * Consider that you are writing a set of classes related to a new Data Transmission Protocol and have created your own exception hierarchy derived from java.lang.Exception as follows:
enthu.trans.ChannelException
              +-- enthu.trans.DataFloodingException, enthu.trans.FrameCollisionException


You have a TransSocket class that has the following method: 
   long connect(String ipAddr) throws ChannelException
 Now, you also want to write another "AdvancedTransSocket" class, derived from "TransSocket" which overrides the above mentioned method. Which of the following are valid declaration of the overriding method?
		 */
	}
}
// Create three custom exceptions
// 1. To make a custom Unchecked aka RuntimeException -- extend RuntimeException (or its child)
// 2. To make a custom Checked Exception -- extend Exception (or any other checked exception)
class MyException extends Exception {
	public MyException() { }
	public MyException(String message) { super(message);}
}

class MyChildException1 extends MyException0 {
	
}

class MyChildException2 extends MyException0 {
	
}

class TransSocket {
	 long connect(String ipAddr) throws MyException0 {
		 return 0;
	 }
}

class AdvancedTransSocket extends TransSocket {
	/*              Exception
	 *                  |
	 *             MyException
	 *                 /\
	 *                /  \
	 *               /    \
	 *  MyChildException1  MyChildException2
	 *               
	 */
	
	// catch or specify requirement only applies to checked exceptions
	@Override
	long connect(String ipAddr) throws MyChildException1, MyChildException2, NullPointerException { // What can I do differently in terms of the throws clause?
		 return 0;                                   // Option 1: identical throws clause
	 }                                               // Option 2: fewer or more specific exceptions
}