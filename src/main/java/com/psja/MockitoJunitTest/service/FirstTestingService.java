package com.psja.MockitoJunitTest.service;

public class FirstTestingService {

	
	//AABC=>BC
	public String return1( String str ) {
		
		if ( str.substring(0, 2).equals("AA") ) {
			return str.substring(2,str.length());
		}
		return str;
	}

	//ABCDAB=>true ABCD=>false
	public boolean checkFirstTwoCharacterAndLastTwoCharacter( String str ) {
		
		if ( str.length() < 2 )
			return false;
		if ( str.length() == 2 )
			return true;
		
		return str.substring(0,2).equals( str.substring(str.length()-2, str.length()) );
	}
	
}
