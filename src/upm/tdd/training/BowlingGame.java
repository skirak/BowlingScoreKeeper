package upm.tdd.training;
import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	private int totScore = 0;
	
	public BowlingGame(){}
	
	public void addFrame(Frame frame){
		frames.add(frame);
	}
	
	public void setBonus(int firstThrow, int secondThrow) {
		for(int i=0;i<frames.size();i++){
			if(frames.get(i).bonus() == 1)
				frames.get(i).points += frames.get(i+1).getFirstThrow();
			else if(frames.get(i).bonus() == 2)
				frames.get(i).points += (frames.get(i+1).getFirstThrow() + frames.get(i+1).getSecondThrow());
		}
	}
	
	public int score(){
		for(int i=0;i<frames.size();i++){
			totScore += frames.get(i).points;
		}
		return 0;
	}
	
	public boolean isNextFrameBonus(){
		if(frames.bonus() != 0)
			return true;
		return false;
	}
}
