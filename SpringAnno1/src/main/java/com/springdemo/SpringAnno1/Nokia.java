package com.springdemo.SpringAnno1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Nokia {
	@Autowired
	@Qualifier("exynos")
	MobileProcessor pro;
	
    public MobileProcessor getPro() {
		return pro;
	}

	public void setPro(MobileProcessor pro) {
		this.pro = pro;
	}

public void config() {
	 System.out.println("4 GB ram 12px Camera");
	 AppConfig.setUp();
	 pro.process();
 }
}
