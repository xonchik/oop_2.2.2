public class Vehicle {
    private String modelName;
    private int wheelsCount;

    public Vehicle(String modelName, int wheelsCount) {
        if (modelName != null) {
            this.modelName = modelName;
        } else {
            throw new RuntimeException("Название модели не может быть null!");
        }
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        if (modelName != null) {
            this.modelName = modelName;
        } else {
            throw new RuntimeException("Название модели не может быть null!");
        }
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    public String toString() {
        return "Model Name : " + getModelName() + ";  Wheels Count = " + getWheelsCount();
    }
}
