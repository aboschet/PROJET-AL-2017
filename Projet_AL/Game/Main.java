
import java.util.ArrayList;

import gameframework.core.*;

public class Main {

	public static void main(String[] args) {
		GameDefaultImplStr g = new GameDefaultImplStr();
		
		ArrayList<GameLevel> levels = new ArrayList<>();
		
		GameLevelOne level_1 = new GameLevelOne(g);
		levels.add(level_1);
		
		g.setLevels(levels);
		g.start();
	}

}


/// SPRITE
////https://www.spriters-resource.com/mobile/thebattlecats/?source=genre