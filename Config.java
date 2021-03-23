package com.klu.StudentInfo.StudentInfo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

class Config {
	StandardServiceRegistry ssr;
	Metadata meta;
	SessionFactory factory;
	Session session;
	Transaction t;
 Config() {
	this.ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
	this.meta = new MetadataSources(ssr).getMetadataBuilder().build();
	this.factory = meta.getSessionFactoryBuilder().build();
	this.session = factory.openSession();
	this.t = session.beginTransaction();
}
}
