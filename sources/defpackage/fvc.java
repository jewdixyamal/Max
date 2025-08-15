package defpackage;

import android.view.View;
import android.view.Window;
import android.view.WindowManager;

/* renamed from: fvc  reason: default package */
public final class fvc extends View {
    public lw1 a;
    public Window b;
    public evc c;

    /* access modifiers changed from: private */
    public float getBrightness() {
        Window window = this.b;
        if (window == null) {
            return Float.NaN;
        }
        return window.getAttributes().screenBrightness;
    }

    /* access modifiers changed from: private */
    public void setBrightness(float f) {
        if (this.b != null && !Float.isNaN(f)) {
            WindowManager.LayoutParams attributes = this.b.getAttributes();
            attributes.screenBrightness = f;
            this.b.setAttributes(attributes);
        }
    }

    private void setScreenFlashUiInfo(eu6 eu6) {
        lw1 lw1 = this.a;
        if (lw1 != null) {
            cvc cvc = cvc.b;
            dvc dvc = new dvc(cvc, eu6);
            dvc f = lw1.f();
            lw1.C.put(cvc, dvc);
            dvc f2 = lw1.f();
            if (f2 != null && !f2.equals(f)) {
                dvc f3 = lw1.f();
                if (f3 == null) {
                    fu6 fu6 = lw1.d;
                    jw1 jw1 = lw1.D;
                    fu6.getClass();
                    gvc gvc = new gvc(jw1);
                    fu6.u = gvc;
                    fu6.d().g(gvc);
                    return;
                }
                fu6 fu62 = lw1.d;
                fu62.getClass();
                gvc gvc2 = new gvc(f3.b);
                fu62.u = gvc2;
                fu62.d().g(gvc2);
                f3.a.name();
            }
        }
    }

    public eu6 getScreenFlash() {
        return this.c;
    }

    public long getVisibilityRampUpAnimationDurationMillis() {
        return 1000;
    }

    public void setController(lw1 lw1) {
        kq0.e();
        lw1 lw12 = this.a;
        if (!(lw12 == null || lw12 == lw1)) {
            setScreenFlashUiInfo((eu6) null);
        }
        this.a = lw1;
        if (lw1 != null) {
            kq0.e();
            if (lw1.d.H() == 3 && this.b == null) {
                throw new IllegalStateException("No window set despite setting FLASH_MODE_SCREEN in CameraController");
            }
            setScreenFlashUiInfo(getScreenFlash());
        }
    }

    public void setScreenFlashWindow(Window window) {
        kq0.e();
        if (this.b != window) {
            this.c = window == null ? null : new evc(this);
        }
        this.b = window;
        setScreenFlashUiInfo(getScreenFlash());
    }
}
