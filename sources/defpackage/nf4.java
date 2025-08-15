package defpackage;

import android.opengl.EGLDisplay;
import androidx.media3.common.util.GlUtil$GlException;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

/* renamed from: nf4  reason: default package */
public final /* synthetic */ class nf4 implements xff {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nf4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                ((CountDownLatch) this.b).countDown();
                return;
            case 1:
                ((rk5) this.b).flush();
                return;
            case 2:
                rf4 rf4 = (rf4) this.b;
                EGLDisplay eGLDisplay = rf4.c;
                va8 va8 = rf4.b;
                try {
                    rf4.d.a();
                    int i = 0;
                    while (true) {
                        ArrayList arrayList = rf4.j;
                        if (i < arrayList.size()) {
                            ((gd6) arrayList.get(i)).release();
                            i++;
                        } else {
                            rf4.i.release();
                            try {
                                va8.C(eGLDisplay);
                                return;
                            } catch (GlUtil$GlException e) {
                                z04.v("Error releasing GL objects", e);
                                return;
                            }
                        }
                    }
                } catch (Exception e2) {
                    z04.v("Error releasing shader program", e2);
                } catch (Throwable th) {
                    try {
                        va8.C(eGLDisplay);
                    } catch (GlUtil$GlException e3) {
                        z04.v("Error releasing GL objects", e3);
                    }
                    throw th;
                }
            case 3:
                l0f l0f = ((soe) this.b).o;
                l0f.getClass();
                l0f.S();
                d54.a();
                return;
            case 4:
                ((l0f) this.b).h();
                return;
            default:
                ((v2) this.b).i();
                return;
        }
    }
}
