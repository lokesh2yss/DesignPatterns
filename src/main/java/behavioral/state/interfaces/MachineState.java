package behavioral.state.interfaces;

import behavioral.state.VendingMachine;

public interface MachineState {
    void selectItem(VendingMachine context, String itemCode);
    void insertCoin(VendingMachine context, double amount);
    void dispenseItem(VendingMachine context);
}
