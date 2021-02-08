/**
 * 
 */
package main;

import java.util.concurrent.ExecutorService;

import infrastructure.ThreadPoolFactory;

/**
 * @author adubrovs
 *
 */
public class W4DHelper 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Hello World !");
		
		ExecutorService w4DThreadPool = ThreadPoolFactory.getInstance().getW4DMessagesThreadPool();

		
		for (int i = 1; i <= 5; i++) 
        {
            Task task = new Task("Task " + i);
            System.out.println("Created : " + task.getName());
 
            w4DThreadPool.execute(task);
        }
	}

}
