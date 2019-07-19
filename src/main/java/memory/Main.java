package memory;

import memory.control.ControlFasade;
import memory.model.ModelFasade;
import memory.model.ProxyReadOnlyModelFasade;
import memory.view.ViewFasade;

public class Main {
	//TODO: siec - rozgrawka na dwóch komputerach
	//TODO: popodmienic widoki - Jbuttons,JAVA 8, HTML
	
	public static void main(String[] args) {
		ModelFasade modelFasade = new ModelFasade();
		ProxyReadOnlyModelFasade promf = new ProxyReadOnlyModelFasade(modelFasade);
		
		ViewFasade wievFasade = new ViewFasade(promf);
		
		new ControlFasade(wievFasade,modelFasade);
		
	}
	
	
}
