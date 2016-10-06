package Generic.Classes;

import Generic.Classes.ContextData;
import Generic.Interfaces.IGenericState;
import robocode.AdvancedRobot;
import robocode.ScannedRobotEvent;

public abstract class Strategy  implements IGenericState
{
	 public void PlanStrategy(AdvancedRobot pRobot){}
	 public void ExecuteStrategy(AdvancedRobot pRobot){}


	@Override
	public void Handle(AdvancedRobot pRobot)
	{

	}

	@Override
	public void onScannedRobotEvent(ScannedRobotEvent pEvent, AdvancedRobot pRobot)
	{

	}

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
