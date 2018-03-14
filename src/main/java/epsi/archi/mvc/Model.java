package epsi.archi.mvc;

public class Model {

    private Double amount = 0.0;
    private Double usdChangeRate = 1.23072;
    private Double gbpChangeRate = 0.88855;
    private Double jpyChangeRate = 131.431;
    private Double chfChangeRate = 1.17071;

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getUsdChangeRate() {
        return usdChangeRate;
    }

    public void setUsdChangeRate(Double usdChangeRate) {
        this.usdChangeRate = usdChangeRate;
    }

    public Double getGbpChangeRate() {
        return gbpChangeRate;
    }

    public void setGbpChangeRate(Double gbpChangeRate) {
        this.gbpChangeRate = gbpChangeRate;
    }

    public Double getJpyChangeRate() {
        return jpyChangeRate;
    }

    public void setJpyChangeRate(Double jpyChangeRate) {
        this.jpyChangeRate = jpyChangeRate;
    }

    public Double getChfChangeRate() {
        return chfChangeRate;
    }

    public void setChfChangeRate(Double chfChangeRate) {
        this.chfChangeRate = chfChangeRate;
    }
}
