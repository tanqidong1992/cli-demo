package com.tqd.test;

import lombok.Data;
import picocli.CommandLine;
import picocli.CommandLine.Parameters;

public class App {
    public static void main( String[] args ){
    	Cli cli=new Cli();
    	new CommandLine(cli).execute(args);

    }

    public static class Cli implements Runnable {
    	
    	@Parameters(paramLabel = "name",description = "the name of you",defaultValue = "Bob")
    	private String name;

        @Override
        public void run() {
            System.out.printf( "Hello %s!\n",name);
        }
    }
}
