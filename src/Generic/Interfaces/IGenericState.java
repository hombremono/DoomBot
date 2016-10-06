package Generic.Interfaces;

import robocode.*;

/**
 * Created by mnicolas on 04/10/16.
 */
public interface IGenericState
{
    void Handle(AdvancedRobot pRobot);
    void onScannedRobotEvent(ScannedRobotEvent pEvent, AdvancedRobot pRobot);
    void onBulletHitEvent(ScannedRobotEvent pEvent,AdvancedRobot pRobot);
    void onBulletHitBulletEvent(ScannedRobotEvent pEvent,AdvancedRobot pRobot);
    void onBulletMissedEvent(ScannedRobotEvent pEvent,AdvancedRobot pRobot);
    void onDeathEvent(ScannedRobotEvent pEvent,AdvancedRobot pRobot);
    void onHitByBulletEvent(ScannedRobotEvent pEvent,AdvancedRobot pRobot);
    void onHitRobotEvent(ScannedRobotEvent pEvent,AdvancedRobot pRobot);
    void onHitWallEvent(ScannedRobotEvent pEvent,AdvancedRobot pRobot);
    void onRobotDeathEvent(ScannedRobotEvent pEvent,AdvancedRobot pRobot);
    void onWinEvent(ScannedRobotEvent pEvent,AdvancedRobot pRobot);
    void onRoundEndedEvent(ScannedRobotEvent pEvent,AdvancedRobot pRobot);
    void onBattleEndedEvent(ScannedRobotEvent pEvent,AdvancedRobot pRobot);
}
