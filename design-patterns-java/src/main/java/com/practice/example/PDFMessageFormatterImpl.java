package com.practice.example;

public class PDFMessageFormatterImpl implements IMessageFormatter{

	@Override
	public String formatMessage(String message) {
		return "<pdf>"+message+" </pdf>";
	}

}
