public class BmiService {
    public float index(float weight, float growht) {
        float myGrowht = growht / 100;
        float bmi = weight / (myGrowht * myGrowht);
        return bmi;
    }


}
