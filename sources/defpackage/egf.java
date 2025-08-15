package defpackage;

import android.view.Surface;

/* renamed from: egf  reason: default package */
public abstract class egf {
    public static void a(Surface surface, float f) {
        try {
            surface.setFrameRate(f, f == 0.0f ? 0 : 1);
        } catch (IllegalStateException e) {
            z04.v("Failed to call Surface.setFrameRate", e);
        }
    }
}
