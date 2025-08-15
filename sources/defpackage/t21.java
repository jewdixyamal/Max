package defpackage;

import android.content.Context;
import android.os.Trace;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import java.util.Arrays;
import java.util.LinkedHashSet;

/* renamed from: t21  reason: default package */
public final class t21 extends FrameLayout {
    public final q8b a;
    public final je7 b = tu0.r(3, new x5(21, this));

    public t21(Context context) {
        super(context, (AttributeSet) null, 0);
        q8b q8b = new q8b(context);
        this.a = q8b;
        addView(q8b, -1, -1);
        s21 cameraPreviewController = getCameraPreviewController();
        cameraPreviewController.getClass();
        k9b k9b = k9b.f;
        k12 p = s36.p(context);
        p.d(new c(cameraPreviewController, 14, p), ot3.a(context));
    }

    private final s21 getCameraPreviewController() {
        return (s21) this.b.getValue();
    }

    public final void a(boolean z, boolean z2) {
        int i = 0;
        if (tpa.f((Object) null, Boolean.valueOf(z)) && tpa.f((Object) null, Boolean.valueOf(z2))) {
            return;
        }
        if (z) {
            s21 cameraPreviewController = getCameraPreviewController();
            k9b k9b = cameraPreviewController.b;
            if (k9b != null) {
                if (k9b != null) {
                    k9b.f();
                }
                boolean z3 = !z2;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                c54.p("The specified lens facing is invalid.", !z3);
                linkedHashSet.add(new tf7(z3 ? 1 : 0));
                px1 px1 = new px1(linkedHashSet);
                h8b b2 = new mt6(2).b();
                b2.G(this.a.getSurfaceProvider());
                eh7 eh7 = cameraPreviewController.a;
                l9f[] l9fArr = {b2};
                Trace.beginSection(c37.F("CX:bindToLifecycle"));
                try {
                    ay1 ay1 = k9b.d;
                    if (ay1 != null) {
                        yg2 yg2 = ay1.f;
                        if (yg2 != null) {
                            i = ((l0f) yg2.c).b;
                        } else {
                            throw new IllegalStateException("CameraX not initialized yet.");
                        }
                    }
                    if (i != 2) {
                        k9b.b(k9b, 1);
                        k9b.d(eh7, px1, (uof) null, nz4.a, (l9f[]) Arrays.copyOf(l9fArr, 1));
                        return;
                    }
                    throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first");
                } finally {
                    Trace.endSection();
                }
            }
        } else {
            k9b k9b2 = getCameraPreviewController().b;
            if (k9b2 != null) {
                k9b2.f();
            }
        }
    }
}
