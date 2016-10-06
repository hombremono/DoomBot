package Robot.DoomBot.Strategies;

import java.awt.Color;

import Generic.Classes.*;
import Generic.Interfaces.*;
import Generic.States.Enums.GatherInfoDictionary;
import Generic.States.GatherInfo.*;
import Generic.States.Movement.*;
import Generic.States.Shoot.*;
import robocode.AdvancedRobot;
import robocode.ScannedRobotEvent;

public class TestStrategy extends Strategy
{
	
	private IContext oContext;
	private int nextUpdateTick = 0;
	private int tickInterval = 50;
	
	
	public TestStrategy ()
	{
		 oContext = new BasicContext(new AngularIntercept(),new SideDodge(),new WidthLock());
	}



	@Override
	public void PlanStrategy(AdvancedRobot pRobot) 
	{
		System.out.println(pRobot.getTime());
		if (updateTick(pRobot))
		{
			oContext.setGatherInfoState(new CircularScan());
		}
		else if (!ContextData.getInstance().getGatherInfoActualState().equals(GatherInfoDictionary.WidthLock))
		{
			oContext.setGatherInfoState(new WidthLock());
		}
		ContextData.getInstance().setTarget(ContextData.getInstance().getClosestEnemy());

	}

	@Override
	public void ExecuteStrategy(AdvancedRobot pRobot)
	{
		oContext.GatherInformationAction(pRobot);
		oContext.ShootingStateAction(pRobot);
		oContext.MovementStateAction(pRobot);
	}

	@Override
	public void onScannedRobotEvent(ScannedRobotEvent pEvent, AdvancedRobot pRobot)
	{
		ContextData Data = ContextData.getInstance();
		Data.setFirePower(Math.min(500 / pEvent.getDistance(), 3));

		oContext.getGatherInfoState().onScannedRobotEvent(pEvent, pRobot);
		oContext.getShootingState().onScannedRobotEvent(pEvent, pRobot);
		oContext.getMovementState().onScannedRobotEvent(pEvent, pRobot);
	}

	private boolean updateTick (AdvancedRobot pRobot)
	{
		if (pRobot.getTime() > nextUpdateTick)
		{
			nextUpdateTick = (int)pRobot.getTime() + tickInterval;
			return true;
		}
		return false;
	}


}
