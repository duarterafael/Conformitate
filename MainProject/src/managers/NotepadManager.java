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

public class NotepadManager {

    private static NotepadManager instance = null;
    private Process process;
//    private OutputStream stdin;
//    private InputStream stderr;
//    private InputStream stdout;
//    private BufferedReader reader;
//    private BufferedReader error;
//    private BufferedWriter writer;
    private String command;
  
    private File usePath = new File("Notepad++/notepad++.exe");



    private NotepadManager(){
            




    }

    public static NotepadManager getInstance(){
        if(instance == null){
            instance = new NotepadManager();
        }
        return instance;
    }
    
    public void openModel(File file){
    	try {
			process = Runtime.getRuntime().exec("\""+usePath.getAbsolutePath()+ "\" \""+file.getAbsolutePath()+"\"");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    public void openModel(File[] files){
    	try {
	    	String paths = "";
	    	for (File file : files) {
				paths += "\""+file.getAbsoluteFile()+"\""+", ";
			}
	    	if(paths.endsWith(", ")){
	    		paths = paths.substring(0, paths.length()-2);
	    	}
			process = Runtime.getRuntime().exec("\""+usePath.getAbsolutePath()+"\""+" "+paths);
		} catch (IOException e) {
			e.printStackTrace();
		}
    }




}
