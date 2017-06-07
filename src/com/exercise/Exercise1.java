package com.exercise;

public class Exercise1 {
	
	public String getPath(String path){
		String[] newPath = path.split("/");
		path="/";
		for (int i=0 ; i < newPath.length-1 ; i++){
			if(newPath[i].matches("[a-z]+")){	
				if(!newPath[i+1].matches("[.]{2}"))
					path += newPath[i]+"/";
			}
		}
		path += (newPath[newPath.length-1].matches("[a-z]+") ? newPath[newPath.length-1] : "");
		return path;
	}
	
	
	
}
