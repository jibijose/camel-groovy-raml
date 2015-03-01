package com.jibi

import org.apache.camel.main.Main;

import cc.notsoclever.examples.MyRouteBuilder;

class GroovyMain {

	static main(args) {
		System.out.println("Camel Groovy Raml starting")
		
		Main main = new Main();
		main.enableHangupSupport();
		main.addRouteBuilder(new MyRouteBuilder());
		main.run(args);
		
		System.out.println("Camel Groovy Raml Ending")
	}

}
