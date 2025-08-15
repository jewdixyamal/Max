package defpackage;

import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.video.ScreenCaptureManager;

/* renamed from: xuc  reason: default package */
public final class xuc {
    public final je7 a;
    public final q0e b = r0e.a(Boolean.FALSE);

    public xuc(je7 je7) {
        this.a = je7;
    }

    public final void a(boolean z) {
        Object value;
        q0e q0e = this.b;
        do {
            value = q0e.getValue();
            ((Boolean) value).getClass();
        } while (!q0e.c(value, Boolean.valueOf(z)));
        Conversation a2 = ((fw3) this.a.getValue()).a();
        ScreenCaptureManager screenCaptureManager = a2 != null ? a2.getScreenCaptureManager() : null;
        if (screenCaptureManager != null) {
            screenCaptureManager.setAudioCaptureEnabled(z);
        }
    }

    public final void b(boolean z) {
        Conversation a2 = ((fw3) this.a.getValue()).a();
        ScreenCaptureManager screenCaptureManager = a2 != null ? a2.getScreenCaptureManager() : null;
        if (screenCaptureManager != null) {
            screenCaptureManager.setScreenCaptureEnabled(z, false);
        }
        if (z) {
            a(((Boolean) this.b.getValue()).booleanValue());
        } else {
            a(false);
        }
    }

    public final boolean c() {
        je7 je7 = this.a;
        Conversation a2 = ((fw3) je7.getValue()).a();
        if (a2 != null && a2.isPrepared()) {
            Conversation a3 = ((fw3) je7.getValue()).a();
            ScreenCaptureManager screenCaptureManager = a3 != null ? a3.getScreenCaptureManager() : null;
            return screenCaptureManager != null && screenCaptureManager.isScreenCaptureEnabled();
        }
    }
}
