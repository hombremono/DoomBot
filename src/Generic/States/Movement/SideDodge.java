package Generic.States.Movement;

import Generic.Classes.ContextData;
import Generic.Interfaces.IMovementState;
import Generic.States.Enums.MovementDictionary;
import robocode.AdvancedRobot;
import robocode.ScannedRobotEvent;

public class SideDodge implements IMovementState
{
	double previousEnergy = 100;
	int movementDirection = 1;
	int gunDirection = 1;

    public SideDodge()
    {
        ContextData.getInstance().setMovementActualState(MovementDictionary.SideDodge);
    }

	@Override
	public void Handle(AdvancedRobot pRobot) 
	{

	}

	@Override
	public void onScannedRobotEvent(ScannedRobotEvent pEvent, AdvancedRobot pRobot) 
	{
		// Stay at right angles to the opponent
		pRobot.setTurnRight(pEvent.getBearing()+90-30*movementDirection);
		 // If the bot has small energy drop,assume it fired
	    double changeInEnergy = previousEnergy-pEvent.getEnergy();
	    
	    if (changeInEnergy>0 && changeInEnergy<=3) 
	    {
	            // Dodge!
	             movementDirection = -movementDirection;
	             pRobot.setAhead((pEvent.getDistance()/4+25)*movementDirection);
	    }
	        // Track the energy level
	        previousEnergy = pEvent.getEnergy();
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

