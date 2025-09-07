package behavioral.state;

import behavioral.state.interfaces.MachineState;

public class VendingMachine {
    private MachineState currentState;
    private String selectedItem;
    private double insertedAmount;

    public VendingMachine() {
        this.currentState = new IdleState();
    }
    public void setState(MachineState state) {
        this.currentState = state;
    }

    public void setSelectedItem(String itemCode) {
        this.selectedItem = itemCode;
    }

    public void setInsertedAmount(double insertedAmount) {
        this.insertedAmount = insertedAmount;
    }
    public String getSelectedItem() {
        return selectedItem;
    }

    public void selectItem(String itemCode) {
        currentState.selectItem(this, itemCode);
    }
    public void insertCoin(double amount) {
        currentState.insertCoin(this, amount);
    }
    public void dispenseItem() {
        currentState.dispenseItem(this);
    }
    public void reset() {
        this.selectedItem = "";
        this.insertedAmount = 0.0;
        this.currentState = new IdleState();
    }
}
