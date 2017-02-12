package com.redis.string.example;

import redis.clients.jedis.Jedis;

public class StringExample {
	public static void main(String[] args) {

		Jedis jedis = new Jedis("localhost");
		
		System.out.println("Connection to server sucessfully");

		jedis.set("company-name", "BridgeLabz");

		System.out.println("Stored string in redis:: " + jedis.get("company-name"));
	}
}
