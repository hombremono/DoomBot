package Generic.States.GatherInfo;

import Generic.Interfaces.IGatherInfoState;
import Generic.Classes.*;
import Generic.States.Enums.GatherInfoDictionary;
import robocode.AdvancedRobot;
import robocode.Rules;
import robocode.ScannedRobotEvent;
import robocode.util.Utils;

public class WidthLock implements IGatherInfoState
{
	public WidthLock()
	{
		ContextData.getInstance().setGatherInfoActualState(GatherInfoDictionary.WidthLock);
	}
	
	@Override
	public void Handle(AdvancedRobot pRobot) 
	{
		if ( pRobot.getRadarTurnRemaining() == 0.0 )
			pRobot.setTurnRadarRightRadians( Double.POSITIVE_INFINITY );
			//pRobot.setTurnRadarRight(1);




		Enemy oTarget = ContextData.getInstance().getTarget();


		oTarget.bearing;

		double angleToEnemy = pRobot.getHeadingRadians() + pEvent.getBearingRadians();
		double radarTurn = Utils.normalRelativeAngle( angleToEnemy - pRobot.getRadarHeadingRadians() );
		double extraTurn = Math.min( Math.atan( 36.0 / pEvent.getDistance() ), Rules.RADAR_TURN_RATE_RADIANS );
		radarTurn += (radarTurn < 0 ? -extraTurn : extraTurn);
		pRobot.setTurnRadarRightRadians(radarTurn);
		pRobot.execute();


		
	}


	@Override
	public void onScannedRobotEvent(ScannedRobotEvent pEvent, AdvancedRobot pRobot) 
	{

		// Absolute angle towards target

	 
	    // Subtract current radar heading to get the turn required to face the enemy, be sure it is normalized

	 
	    // Distance we want to scan from middle of enemy to either side
	    // The 36.0 is how many units from the center of the enemy robot it scans.

	 
	    // Adjust the radar turn so it goes that much further in the direction it is going to turn
	    // Basically if we were going to turn it left, turn it even more left, if right, turn more right.
	    // This allows us to overshoot our enemy so that we get a good sweep that will not slip.

	 
	    //Turn the radar

	 
	    // ...
		
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
