package Generic.States.Shoot;

import Generic.Classes.ContextData;
import Generic.Interfaces.IShootingState;
import Generic.States.Enums.ShootDictionary;
import robocode.AdvancedRobot;
import robocode.ScannedRobotEvent;

public class DirectFire implements IShootingState
{

	public DirectFire()
	{
		ContextData.getInstance().setShootActualState(ShootDictionary.DirectFire);
	}

	@Override
	public void Handle(AdvancedRobot pRobot) 
	{
		//Enemy e = ContextData.getInstance().getTarget();
		

	}

	@Override
	public void onScannedRobotEvent(ScannedRobotEvent pEvent, AdvancedRobot pRobot) 
	{
		double absoluteBearing = pRobot.getHeadingRadians() + pEvent.getBearingRadians();
		pRobot.setTurnGunRightRadians(robocode.util.Utils.normalRelativeAngle(absoluteBearing - pRobot.getGunHeadingRadians()));
		pRobot.fire(ContextData.getInstance().getFirePower());
		
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
