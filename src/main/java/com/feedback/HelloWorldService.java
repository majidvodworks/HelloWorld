package com.feedback;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldService implements IHelloWorldService {

	/* (non-Javadoc)
	 * @see com.feedback.IHelloWorldService#getTextToPrint()
	 */
	@Override
	@Cacheable(value="testCache",  key="#root.methodName")
	public String getTextToPrint() {
		return "Hello world!";
	}
}
