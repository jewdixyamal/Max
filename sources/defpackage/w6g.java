package defpackage;

import android.view.WindowInsets;

/* renamed from: w6g  reason: default package */
public abstract class w6g {
    public static int a(int i) {
        int a;
        int i2 = 0;
        for (int i3 = 1; i3 <= 256; i3 <<= 1) {
            if ((i & i3) != 0) {
                if (i3 == 1) {
                    a = WindowInsets.Type.statusBars();
                } else if (i3 == 2) {
                    a = WindowInsets.Type.navigationBars();
                } else if (i3 == 4) {
                    a = WindowInsets.Type.captionBar();
                } else if (i3 == 8) {
                    a = WindowInsets.Type.ime();
                } else if (i3 == 16) {
                    a = WindowInsets.Type.systemGestures();
                } else if (i3 == 32) {
                    a = WindowInsets.Type.mandatorySystemGestures();
                } else if (i3 == 64) {
                    a = WindowInsets.Type.tappableElement();
                } else if (i3 == 128) {
                    a = WindowInsets.Type.displayCutout();
                }
                i2 |= a;
            }
        }
        return i2;
    }
}
