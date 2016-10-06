package Generic.States.Shoot;

import Generic.Classes.ContextData;
import Generic.Classes.Intercept;
import Generic.Classes.MathHelper;
import Generic.Interfaces.IShootingState;
import Generic.States.Enums.ShootDictionary;
import robocode.AdvancedRobot;
import robocode.ScannedRobotEvent;

public class LinearIntercept implements IShootingState
{

	public LinearIntercept()
	{
		ContextData.getInstance().setShootActualState(ShootDictionary.LinearIntercept);
	}

	@Override
	public void Handle(AdvancedRobot pRobot) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onScannedRobotEvent(ScannedRobotEvent pEvent, AdvancedRobot pRobot) 
	{
		 Intercept intercept = new Intercept();

	        intercept.calculate
	                (
	                		pRobot.getX(),
	                		pRobot.getY(),
	                		pRobot.getX() + Math.sin(Math.toRadians(pRobot.getHeading() + pEvent.getBearing())) * pEvent.getDistance(),
	                		pRobot.getY() + Math.cos(Math.toRadians(pRobot.getHeading() + pEvent.getBearing())) * pEvent.getDistance(),
	                		pEvent.getHeading(),
	                		pEvent.getVelocity(),
	                		ContextData.getInstance().getFirePower(),
	                        0 // Angular velocity
	                );

	        double turnAngle = MathHelper.normalizeBearing
	                (intercept.bulletHeading_deg - pRobot.getGunHeading());
	        pRobot.setTurnGunRight(turnAngle);

	        if (Math.abs(turnAngle) <= intercept.angleThreshold) {
	            // Ensure that the gun is pointing at the correct angle
	            if (
	                    (intercept.impactPoint.x > 0) &&
	                            (intercept.impactPoint.x < pRobot.getBattleFieldWidth()) &&
	                            (intercept.impactPoint.y > 0) &&
	                            (intercept.impactPoint.y < pRobot.getBattleFieldHeight())
	                    ) {
	                // Ensure that the predicted impact point is within
	                // the battlefield
	            	pRobot.fire(intercept.bulletPower);
	            }
	        }
		
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
