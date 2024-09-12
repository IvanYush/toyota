import components.*;
import enums.WheelDiameterEnum;
import model.Camry;
import exception.StartCarException;

public class Runner {
    public static void main(String[] args) throws StartCarException {

        Wheel[] wheelsForCamry = {new Wheel(false, WheelDiameterEnum.WHEEL_DIAMETER_17),
                new Wheel(false, WheelDiameterEnum.WHEEL_DIAMETER_17),
                new Wheel(false, WheelDiameterEnum.WHEEL_DIAMETER_17),
                new Wheel(false, WheelDiameterEnum.WHEEL_DIAMETER_17)};

        Headlights headlightsCamry = new Headlights(false);
        GasTank gasTankCamry = new GasTank(100);
        Electricity electricityCamry = new Electricity(true);
        Engine engineCamry = new Engine(true);

        Camry camry2 = new Camry("black", 300, "auto", false, headlightsCamry,
                wheelsForCamry, gasTankCamry, electricityCamry, engineCamry, false, false);

        try {
            camry2.startMoving();
        } catch (StartCarException e) {
            System.out.println(e.getMessage());
        }

        camry2.setCruise(true);
        camry2.setMusicOn(true);
        camry2.headlihtsSwitchOn();
        camry2.stopMoving();

    }
}