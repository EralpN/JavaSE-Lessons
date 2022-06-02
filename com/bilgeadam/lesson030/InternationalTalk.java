package com.bilgeadam.lesson030;

public class InternationalTalk
{
	// you can run program with arguments 
	// run configurations / arguments / program arguments
	// every String given is written in args array
	// data is separated by space
	// strings that have space in between are written between ""
	// strings given can be accessed with index number ex: args[0]
	public static void main(String[] args)
	{
		System.out.println(Messages.getString("InternationalTalk.HI")); //$NON-NLS-1$
		System.out.println(Messages.getString("InternationalTalk.HOW_ARE_YOU")); //$NON-NLS-1$
		System.out.println(Messages.getString("InternationalTalk.IM_FINE_THANKS")); //$NON-NLS-1$
		System.out.println(Messages.getString("InternationalTalk.HOW_ABOUT_YOU")); //$NON-NLS-1$
		System.out.println();
		
		Messages.setLocale("tr");
		System.out.println(Messages.getString("InternationalTalk.HI")); //$NON-NLS-1$
		System.out.println(Messages.getString("InternationalTalk.HOW_ARE_YOU")); //$NON-NLS-1$
		System.out.println(Messages.getString("InternationalTalk.IM_FINE_THANKS")); //$NON-NLS-1$
		System.out.println(Messages.getString("InternationalTalk.HOW_ABOUT_YOU")); //$NON-NLS-1$
		System.out.println();
		
		Messages.setLocale("de");
		System.out.println(Messages.getString("InternationalTalk.HI")); //$NON-NLS-1$
		System.out.println(Messages.getString("InternationalTalk.HOW_ARE_YOU")); //$NON-NLS-1$
		System.out.println(Messages.getString("InternationalTalk.IM_FINE_THANKS")); //$NON-NLS-1$
		System.out.println(Messages.getString("InternationalTalk.HOW_ABOUT_YOU")); //$NON-NLS-1$
		System.out.println();
		
		Messages.setLocale("tr", "US");
		System.out.println(Messages.getString("InternationalTalk.HI")); //$NON-NLS-1$
		System.out.println(Messages.getString("InternationalTalk.HOW_ARE_YOU")); //$NON-NLS-1$
		System.out.println(Messages.getString("InternationalTalk.IM_FINE_THANKS")); //$NON-NLS-1$
		System.out.println(Messages.getString("InternationalTalk.HOW_ABOUT_YOU")); //$NON-NLS-1$
		System.out.println();
	}

}
