package BigVending.view;

import BigVending.controller.VendController;

public interface View {
    void answer(String message);

    void setController(VendController controller);

    void init();
}
