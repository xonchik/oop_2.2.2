public class Bicycle implements ServiceStation{
    private String modelName;
    private int wheelsCount;

    public Bicycle(String modelName, int wheelsCount) {
        if (modelName != null) {
            this.modelName = modelName;
        } else {
            throw new RuntimeException("Название модели не может быть null!");
        }
        this.wheelsCount = wheelsCount;
    }

    public void check() {
        System.out.println("Обслуживаем " + this.getModelName());
        for (int i = 0; i < this.getWheelsCount(); i++) {
            this.updateTyre();
        }
        System.out.println();
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public String toString() {
        return "Model Name : " + getModelName() + ";  Wheels Count = " + getWheelsCount();
    }
}
