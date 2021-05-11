package ro.ase.csie.cts.dp.chain;

public class TestChain {

	public static void main(String[] args) {
		
		ChatHandler broadcastNode = new BroadcastMessageHandler();
		ChatHandler privateNode = new PrivateMessageHandler();
		ChatHandler filterNode = new EnglishFilter(7);
		
		//going from more specific to more generic
		
		filterNode.setNext(privateNode);
		privateNode.setNext(broadcastNode);
		
		ChatHandler chatServer = filterNode;
		chatServer.processMessage(new ChatMessage("@everyone","Hello !",0));
		chatServer.processMessage(new ChatMessage("@everyone"," hit Superman. It's a bot",0));
		chatServer.processMessage(new ChatMessage("@john", "Hello!let's join the party", 0));
		
		
	}

}
