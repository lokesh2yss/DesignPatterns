package behavioral.state;

import behavioral.state.interfaces.MachineState;

public class ItemSelectedState implements MachineState {
    @Override
    public void selectItem(VendingMachine context, String itemCode) {
        System.out.println("Item "+context.getSelectedItem()+"already selected. Please insert coin");
    }

    @Override
    public void insertCoin(VendingMachine context, double amount) {
        System.out.println("Inserted $" + amount + " for item: " + context.getSelectedItem());
        context.setInsertedAmount(amount);
        context.setState(new HasMoneyState());
    }

    @Override
    public void dispenseItem(VendingMachine context) {
        System.out.println("Please insert coin first before dispensing");
    }
}
