package com.demo.SpringAI.service;

import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.stereotype.Service;

@Service
public class AIService {
	
	private final OpenAiChatModel openAiChatModel;
	
	public AIService(OpenAiChatModel openAiChatModel){
		this.openAiChatModel = openAiChatModel;
		
	}
	
	public String getResponse(String prompt) {
		return openAiChatModel.call(prompt);
	}
}
