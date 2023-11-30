package com.techkonnect.swetha;

import org.springframework.beans.factory.annotation.Autowired;

import com.techkonnect.java.List;
import com.techkonnect.pranay.PranayList;
import com.techkonnect.siva.SivaList;

public class Main {
	
	
	@Autowired
	List list;
	
	
	public void main(String[] args) {
		
		list.count();
		
		
		
	}

}
