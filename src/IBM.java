public class IBM {
    public double height;
    public double weight;

    public IBM(){
    }

    public IBM(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getBMI(){
        double BMI = this.weight/Math.pow(height, 2);
        return BMI;
    }

    public void displayResult(){
        if (this.getBMI() < 18.5) {
            System.out.println("Underweight");
        } else if (this.getBMI() <25) {
            System.out.println("Normal");
        } else if (this.getBMI() <30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
