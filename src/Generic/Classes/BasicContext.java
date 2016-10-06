package Generic.Classes;

import Generic.Interfaces.IContext;
import Generic.Interfaces.IGatherInfoState;
import Generic.Interfaces.IMovementState;
import Generic.Interfaces.IShootingState;
import robocode.AdvancedRobot;

public class BasicContext implements IContext
{
	IShootingState oShootingState;
	IMovementState oMovementState;
	IGatherInfoState oGaterInfoState;
	ContextData oData;

	public BasicContext(IShootingState pShootingState,IMovementState pMovementState ,IGatherInfoState pGaterInfoState)
	{
		oShootingState = pShootingState;
		oMovementState = pMovementState;
		oGaterInfoState = pGaterInfoState;
		
	}
	
	public ContextData getoData() 
	{
		return oData;
	}

	public void setoData(ContextData pData) 
	{
		oData = pData;
	}

	@Override
	public void setMovementState(IMovementState pMovementState) 
	{
		oMovementState = pMovementState;
	}

	@Override
	public void setShootingState(IShootingState pShootingState) 
	{
		oShootingState = pShootingState;
	}

	@Override
	public void setGatherInfoState(IGatherInfoState pGaterInfoState) 
	{
		oGaterInfoState = pGaterInfoState;
	}

	@Override
	public IMovementState getMovementState() 
	{
		return oMovementState;
	}

	@Override
	public IShootingState getShootingState() 
	{
		return oShootingState;
	}

	@Override
	public IGatherInfoState getGatherInfoState() 
	{
		return oGaterInfoState;
	}

	@Override
	public void MovementStateAction(AdvancedRobot pRobot) 
	{
		oMovementState.Handle(pRobot);
	}

	@Override
	public void ShootingStateAction(AdvancedRobot pRobot) 
	{
		oShootingState.Handle(pRobot);
	}

	@Override
	public void GatherInformationAction(AdvancedRobot pRobot) 
	{
		oGaterInfoState.Handle(pRobot);
	}

}
