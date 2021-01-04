package com.test.util;

import redis.clients.jedis.Jedis;

public class TestRedis {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost", 6379);
        String test001 = jedis.get("test001");
        System.out.println(test001);
    }
}
