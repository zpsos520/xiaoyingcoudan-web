package com.shua1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class RedisUtil {
	
	Logger Log = LoggerFactory.getLogger(RedisUtil.class);
	
	@Autowired 
    private RedisTemplate<String, String> redisTemplate; 
	 
    public void set(String key,String value){
    	redisTemplate.opsForValue().set(key, value);
    }
    
    public String get(String key){
    	return redisTemplate.opsForValue().get(key);
    }
}
