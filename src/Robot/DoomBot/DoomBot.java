package Robot.DoomBot;
import Generic.Classes.*;
import Robot.DoomBot.Strategies.TestStrategy;
import robocode.AdvancedRobot;
import robocode.BattleEndedEvent;
import robocode.ScannedRobotEvent;


public class DoomBot extends AdvancedRobot
{
	//IShootingState pShootingState,IMovementState pMovementState ,IGatherInfoState pGaterInfoState
	//private static DoomBot instance = null;
	Strategy oStrategy;



	public void run() 
	{
		oStrategy = new TestStrategy();
		setAdjustGunForRobotTurn(true);
		this.setAdjustRadarForGunTurn(true);
		ContextData.getInstance().setFirePower(1.5f);
		
		while (true) 
		{
			oStrategy.PlanStrategy(this);
			oStrategy.ExecuteStrategy(this);
		}
	}



	@Override
	public void onScannedRobot(ScannedRobotEvent e)
	{
		oStrategy.onScannedRobotEvent(e, this);
		//Actualizo la lista de enemigos en ContextData
		ContextData.getInstance().addOrUpdateEnemy(e, this);

		

	}
	
	private double limit(double value, double min, double max) {
	    return Math.min(max, Math.max(min, value));
	}

}


