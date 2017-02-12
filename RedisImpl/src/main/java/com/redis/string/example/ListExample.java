package com.redis.string.example;

import java.util.List;

import redis.clients.jedis.Jedis;

public class ListExample {

	 public static void main(String[] args) { 
	     
	      Jedis jedis = new Jedis("localhost"); 
	      System.out.println("Connection to server sucessfully"); 
	      
	     
	      jedis.lpush("cmpany-name","Bridgelabz"); 
	      jedis.lpush("cmpany-name","Greytip"); 
	      jedis.lpush("cmpany-name","Java"); 
	      jedis.lpush("cmpany-name","Product Trainee Engineer"); 
	    
	      List<String> list = jedis.lrange("cmpany-name", 0 ,5); 
	      
	      for(int i = 0; i<list.size(); i++) { 
	         System.out.println("Stored string in redis:: "+list.get(i)); 
	      } 
	   } 
}
