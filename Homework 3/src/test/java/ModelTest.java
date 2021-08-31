import game.GlobalConstants;
import game.Model;
import org.junit.Assert;
import org.junit.Test;


public class ModelTest {

    private Model model;

    public ModelTest() {
        this.model = new Model();
        model.setPrimaryBarrier(GlobalConstants.PRIMARY_MIN_BARRIER, GlobalConstants.PRIMARY_MAX_BARRIER);
    }

    @Test
    public void setSecretValueTest() {
        model.setPrimaryBarrier(GlobalConstants.PRIMARY_MIN_BARRIER, GlobalConstants.PRIMARY_MAX_BARRIER);
        model.setSecretValue();
        Assert.assertTrue(model.getSecretValue()>model.getMinBarrier()
                            &&model.getSecretValue() <model.getMaxBarrier());
    }

    @Test
    public void checkValueTest() {
        model.setSecretValue();
        int newMaxBarrier=model.getSecretValue()+2;
        int newMinBarrier=model.getSecretValue()-2;
        Assert.assertTrue(model.checkValue(newMaxBarrier));
        Assert.assertTrue(model.getMaxBarrier()==newMaxBarrier);
        Assert.assertTrue(model.checkValue(newMinBarrier));
        Assert.assertTrue(model.getMinBarrier()==newMinBarrier);
        Assert.assertFalse(model.checkValue(model.getSecretValue()));
    }



}
