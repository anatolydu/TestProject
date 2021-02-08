package infrastructure;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public final class ThreadPoolFactory 
{
	private final static int ms_iAmountW4DMessagesThreads = 10;
	
	private static class ThreadPoolFactoryHolder 
	{
		private static final ThreadPoolFactory ms_ThreadPoolFactory = new ThreadPoolFactory();
	}
	
	public static ThreadPoolFactory getInstance() 
	{
		return ThreadPoolFactoryHolder.ms_ThreadPoolFactory;
	}

	private ThreadPoolFactory() 
	{ 
		System.out.println("Constructor ThreadPoolFactory !");
		m_W4DMessagesThreadPool = (ThreadPoolExecutor )Executors.newFixedThreadPool(ms_iAmountW4DMessagesThreads);
	}
	
	
	public ExecutorService getW4DMessagesThreadPool()
	{
		return m_W4DMessagesThreadPool;
	}
	
	private ThreadPoolExecutor m_W4DMessagesThreadPool; 
	
}
