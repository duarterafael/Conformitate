package managers;
/* $Id$
 *******************************************************************************
 * Copyright (c) 2014 Contributors - see below
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Rafael
 *******************************************************************************
 */



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class BusinessProcessModelNotationModelerProcessManager {

    private static BusinessProcessModelNotationModelerProcessManager instance = null;
    private Process process;
    private OutputStream stdin;
    private InputStream stderr;
    private InputStream stdout;
    private BufferedReader reader;
    private BufferedReader error;
    private BufferedWriter writer;
    private String command;
    private File usePath = new File("businessProcessModelNotationModeler/Yaoqiang.jar");



    private BusinessProcessModelNotationModelerProcessManager(){
        try {
        	command = "java -Xms64m -Xmx512m -jar "+"\""+usePath.getAbsoluteFile()+"\"";
        	
            process = Runtime.getRuntime().exec(command);

            stdin = process.getOutputStream ();
            stderr = process.getErrorStream ();
            stdout = process.getInputStream ();

            reader = new BufferedReader (new InputStreamReader(stdout));
            error = new BufferedReader (new InputStreamReader(stderr));
            writer = new BufferedWriter(new OutputStreamWriter(stdin));

            receive();


        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static BusinessProcessModelNotationModelerProcessManager getInstance(){
        if(instance == null){
            instance = new BusinessProcessModelNotationModelerProcessManager();
        }
        return instance;
    }

    public void sendCommand(String cmd){
        this.command = cmd;
        Thread T=new Thread(new Runnable() {

            @Override
            public void run() {

                try {
                    command += "\n";
                    writer.write(command);
                    writer.flush();
                } catch (IOException e) {
                    process.destroyForcibly();
                    process = null;
                    System.out.println("O USE foi fechado.");
                    instance = null;
                    getInstance();
                }


            }
        } );
        T.start();
        receive();
    }
    
    

    public void receive(){
        Thread T=new Thread(new Runnable() {
            String line;
            @Override
            public void run() {
                try {
                    while ((line = reader.readLine ()) != null) {
                        System.out.println (line);
                    }
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }


            }
        } );
        T.start();

        receiveError();
    }

    public void receiveError(){
        Thread T=new Thread(new Runnable() {
            String line;
            @Override
            public void run() {
                try {
                    while ((line = error.readLine ()) != null) {
                        System.out.println (line);
                    }
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }


            }
        } );
        T.start();
    }
    
    public boolean isAlive(){
    	return process.isAlive();
    }
    
    public void close(){
    	if(process.isAlive()){
    		process.destroy();
    	}
    }
    
    public static void cleanProcess(){
    	instance = null;
    }


}
