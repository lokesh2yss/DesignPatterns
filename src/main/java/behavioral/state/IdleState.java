package behavioral.state;

import behavioral.state.interfaces.MachineState;

public class IdleState implements MachineState {
    @Override
    public void selectItem(VendingMachine context, String itemCode) {
        System.out.println("Item selected: "+itemCode);
        context.setSelectedItem(itemCode);
        context.setState(new ItemSelectedState());
    }

    @Override
    public void insertCoin(VendingMachine context, double amount) {
        System.out.println("Please select an item before inserting a coin");
    }

    @Override
    public void dispenseItem(VendingMachine context) {
        System.out.println("No item selected. Nothing to dispense");
    }
}
