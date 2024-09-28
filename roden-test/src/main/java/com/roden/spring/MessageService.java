package com.roden.spring;
import org.springframework.stereotype.Service;

/**
 * @author Roden
 */
@Service
public class MessageService {
	public void hello(){
		System.out.println("hello world");
	}
}