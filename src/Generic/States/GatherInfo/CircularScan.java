package Generic.States.GatherInfo;

import Generic.Classes.ContextData;
import Generic.Interfaces.IGatherInfoState;
import Generic.States.Enums.GatherInfoDictionary;
import robocode.AdvancedRobot;
import robocode.ScannedRobotEvent;

public class CircularScan implements IGatherInfoState 
{
	public CircularScan()
	{
		ContextData.getInstance().setGatherInfoActualState(GatherInfoDictionary.CircularScan);
	}




	@Override
	public void Handle(AdvancedRobot pRobot) 
	{
		pRobot.turnRadarRight(360);
	}

	@Override
	public void onScannedRobotEvent(ScannedRobotEvent pEvent, AdvancedRobot pRobot) {


	}




	//-----------------UNIMPLEMENTED METHODS----------------------




	@Override
	public void onBulletHitEvent(ScannedRobotEvent pEvent, AdvancedRobot pRobot) {

	}

	@Override
	public void onBulletHitBulletEvent(ScannedRobotEvent pEvent, AdvancedRobot pRobot) {


	}

	@Override
	public void onBulletMissedEvent(ScannedRobotEvent pEvent, AdvancedRobot pRobot) {

	}

	@Override
	public void onDeathEvent(ScannedRobotEvent pEvent, AdvancedRobot pRobot) {


	}

	@Override
	public void onHitByBulletEvent(ScannedRobotEvent pEvent, AdvancedRobot pRobot) {


	}

	@Override
	public void onHitRobotEvent(ScannedRobotEvent pEvent, AdvancedRobot pRobot) {


	}

	@Override
	public void onHitWallEvent(ScannedRobotEvent pEvent, AdvancedRobot pRobot) {


	}

	@Override
	public void onRobotDeathEvent(ScannedRobotEvent pEvent, AdvancedRobot pRobot) {


	}

	@Override
	public void onWinEvent(ScannedRobotEvent pEvent, AdvancedRobot pRobot) {


	}

	@Override
	public void onRoundEndedEvent(ScannedRobotEvent pEvent, AdvancedRobot pRobot) {


	}

	@Override
	public void onBattleEndedEvent(ScannedRobotEvent pEvent, AdvancedRobot pRobot) {


	}


}


