package com.redis.keys;

import java.util.List;

import redis.clients.jedis.Jedis;

public class RedisKeys {
	 public static void main(String[] args) { 
		 

	      Jedis jedis = new Jedis("localhost"); 
	     
	      System.out.println("Connection to server sucessfully"); 
	  
	     
	      List<String> list =(List<String>) jedis.keys("*"); 
	      
	      for(int i = 0; i<list.size(); i++) { 
	         System.out.println("List of stored keys:: "+list.get(i)); 
	      } 
	   }
}
