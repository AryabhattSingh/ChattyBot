package chattybot;

public class MainClass {

	public static void main(String[] args) {
		
		ChattyBot bot = new ChattyBot();
		
		bot.introMessage();
		bot.askUserName();
		bot.predictAge();
		bot.countNumbers();
		bot.testProgrammingKnowledge();
		bot.outroMessage();
		

	}

}
