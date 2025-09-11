package behavioral.mediator;

import behavioral.mediator.interfaces.UIMediator;

public class FormMediator implements UIMediator {
    private TextField usernameField;
    private TextField passwordField;
    private Button loginButton;
    private Label statusLabel;

    public void setUsernameField(TextField usernameField) {
        this.usernameField = usernameField;
    }
    public void setPasswordField(TextField passwordField) {
        this.passwordField = passwordField;
    }
    public void setLoginButton(Button button) {
        this.loginButton = button;
    }
    public void setStatusLabel(Label label) {
        this.statusLabel = label;
    }
    @Override
    public void componentChanged(UIComponent component) {
        if (component == usernameField || component == passwordField) {
            boolean enableButton = !usernameField.getText().isEmpty() &&
                    !passwordField.getText().isEmpty();
            loginButton.setEnabled(enableButton);
        } else if (component == loginButton) {
            String username = usernameField.getText();
            String password = passwordField.getText();

            if ("admin".equals(username) && "1234".equals(password)) {
                statusLabel.setText("✅ Login successful!");
            } else {
                statusLabel.setText("❌ Invalid credentials.");
            }
        }
    }
}
