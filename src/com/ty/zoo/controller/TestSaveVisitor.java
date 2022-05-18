package com.ty.zoo.controller;

import com.ty.zoo.dao.VisitorDao;
import com.ty.zoo.dto.Visitor;

public class TestSaveVisitor {
	public static void main(String[] args) {
		Visitor visitor=new Visitor();
		visitor.setId(1);
		visitor.setName("mohit");
		visitor.setEmail("mohit@mail.com");
		visitor.setAge(24);
		visitor.setPhone("123467");
		visitor.setGender("male");
		
		VisitorDao visitordao=new VisitorDao();
		visitordao.saveVisitor(visitor);
	}

}
