package Generic.Interfaces;

import robocode.AdvancedRobot;
import robocode.Robot;

public interface IContext 
{
	void setMovementState(IMovementState pMovementState);
	void setShootingState(IShootingState pShootingState);
	void setGatherInfoState(IGatherInfoState IGatherInfoState);
	IMovementState getMovementState();
	IShootingState getShootingState();
	IGatherInfoState getGatherInfoState();
	void MovementStateAction(AdvancedRobot pRobot);
	void ShootingStateAction(AdvancedRobot pRobot);
	void GatherInformationAction(AdvancedRobot pRobot);

}
