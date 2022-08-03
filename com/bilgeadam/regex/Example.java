package com.bilgeadam.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example
{

	public static void main(String[] args)
	{
		// "[abc]" a, b or c
		// "[^abc]" anything but abc
		// "[bcr]at" bat, cat or rat
		// "[^c]at" not cat
		// "[a-z]" all lowercase letters
		// "[a-zA-Z]" all letters
		// "[1-3[7-9]]" same as "[1-37-9]" numbers between 1 to 3 and 7 to 9
		// "." means anything can come here
		// "*" anything and nothing can come here
		// "[1-6&&[3-9]]" intersection, result is "[3-6]"
		// "[0-9&&[^2468]]" equals "[013579]"
		// "\\d" number of digits, equals "[0123456789]"
		// "\\d\\d" number of double digits
		// "\\D" number of anything but digits
		// "\\s" number of space characters
		// "\\S" number of non-space characters
		// "\\w" word characters, equals [a-zA-Z0-9]
		// "\\W" non-word characters
		// "a{3}" equals "aaa"
		// "a{2,3}" searches "aaa" first than "aa"
		// "a{2,3}?" searches "aa" first than "aaa"
		// ".\\1" \\1 checks if the previously found character repeats, if "." is "a" searches "aa"
		// "^a" checks if strings starts with "a" .startsWith()
		// "a$" check if strings ends with "a"
		
		Pattern pattern = Pattern.compile("Java", Pattern.CASE_INSENSITIVE);
		
		Matcher matcher = pattern.matcher("JavasdasdfsJaVaasdagasfajavAasdjava");
		
		int found = 0;
		while (matcher.find())
		{
			found++;
		}
		
		if (found != 0)
		{
			System.out.println(found + " Found");
		}
		else
		{
			System.out.println("Not Found");
		}
		
	}

}
