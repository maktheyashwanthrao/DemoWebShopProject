package com.dws.constants;

public class FrameworkConstants {
	
	//Storing all framworklevel constants
	private static final String expectedWelComeMessage = "Welcome, Please Sign In!";	
	private static final String expectedCartMessage = "Your Shopping Cart is empty!";
	private static final String expectedAddtoCartMessage = "The product has been added to your shopping cart";
	private static final String expectedCashonDeliveryMessage = "You will pay by COD";
	private static final String expectedorderConfirmationMessage = "Your order has been successfully processed!";
	private static final String expectedUserID = "maktheyashwanthrao@gmail.com";
	
	//Getting UserId
	public static String getExpecteduserid() {
		return expectedUserID;
	}
	
	//Getting ExpectedWelcomeMessage
	public static String getExpectedWelcomeMessage() {
		return expectedWelComeMessage;
	}
	
	//Getting ExpectedCartMessage
	public static String getExpectedCartMessage() {
		return expectedCartMessage;
	}

	//Getting ExpectedAddtoCartMessage
	public static String getExpectedAddtoCartMessage() {
		return expectedAddtoCartMessage;
	}

	//Getting ExpectedCashonDeliveryMessage
	public static String getExpectedCashonDeliveryMessage() {
		return expectedCashonDeliveryMessage;
	}

	//Getting ExpectedorderConfirmationMessage
	public static String getExpectedorderConfirmationMessage() {
		return expectedorderConfirmationMessage;
	}
}
