package defpackage;

import android.os.Looper;
import java.util.ArrayList;

/* renamed from: fg  reason: default package */
public final class fg {
    public static final ThreadLocal i = new ThreadLocal();
    public final qpd a = new qpd(0);
    public final ArrayList b = new ArrayList();
    public final qqd c = new qqd(2, (Object) this);
    public final b d = new b(8, (Object) this);
    public final ph4 e;
    public boolean f = false;
    public float g = 1.0f;
    public y7g h;

    public fg(ph4 ph4) {
        this.e = ph4;
    }

    public final boolean a() {
        ph4 ph4 = this.e;
        ph4.getClass();
        return Thread.currentThread() == ((Looper) ph4.b).getThread();
    }
}
