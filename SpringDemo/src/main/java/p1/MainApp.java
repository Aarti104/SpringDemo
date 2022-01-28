package p1;
import java.util.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext spring=new ClassPathXmlApplicationContext("spring-conf.xml");
		
		/*Stock s=(Stock)spring.getBean("stock");
		System.out.println(s);
		Stock s1=(Stock)spring.getBean("stock1");
		System.out.println(s1);
		Stock s2=(Stock)spring.getBean("stock2");
		System.out.println(s2);
		*/
		Account a1=(Account)spring.getBean("acc1");
		System.out.println(a1);
		Account a2=(Account)spring.getBean("acc2");
		System.out.println(a2);
		Account a3=(Account)spring.getBean("acc3");
		System.out.println(a3);
		
		TreeMap<String,List<Stock>> map=new TreeMap<String,List<Stock>>();
		map.put(a1.getAccountName(), a1.getStocks());
		map.put(a2.getAccountName(), a2.getStocks());
		map.put(a3.getAccountName(), a3.getStocks());
		for(Map.Entry m:map.entrySet()) {
			 System.out.println(m.getKey()+" "+m.getValue());   
		}
		
		TreeMap<String,List<Policy>> map2=new TreeMap<String,List<Policy>>();
		map2.put(a1.getAccountName(), a1.getPolicy());
		map2.put(a2.getAccountName(), a2.getPolicy());
		map2.put(a3.getAccountName(), a3.getPolicy());
		for(Map.Entry<String,List<Policy>> m:map2.entrySet()) {
			   System.out.println(m.getKey());
			   for (Policy policy : m.getValue()) {
				System.out.println(policy);
			}
		}
	}

}
