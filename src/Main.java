import com.thai.intelliexpcab.bean.admin.AdminQueryBean;
import com.thai.intelliexpcab.bean.admin.SettingsBean;
import com.thai.intelliexpcab.initdevice.ui.InitStart;
import com.thai.intelliexpcab.maingui.ui.MainPageUI;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URISyntaxException;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        checkInitStatus();
    }

    private static void checkInitStatus() {
        File file = new File("D:\\Settings.txt");
        if (!file.exists()) {
            new InitStart().setVisible(true);
        } else {
            new MainPageUI().setVisible(true);
        }
    }
}
