package org.ah.libgdx.rpi.desktop;

import org.ah.libgdx.rpi.RPiLibGDXExample;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class TestDesktopLauncher {
    public static void main(String[] arg) {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.width = 640;
        config.height = 480;
        new LwjglApplication(new RPiLibGDXExample(), config);
    }
}
