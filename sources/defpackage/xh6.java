package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;

/* renamed from: xh6  reason: default package */
public abstract class xh6 {
    private static volatile Choreographer choreographer;

    static {
        Object obj;
        try {
            obj = new wh6(a(Looper.getMainLooper()));
        } catch (Throwable th) {
            obj = new njc(th);
        }
        if (obj instanceof njc) {
            obj = null;
        }
        wh6 wh6 = (wh6) obj;
    }

    public static final Handler a(Looper looper) {
        return (Handler) Handler.class.getDeclaredMethod("createAsync", new Class[]{Looper.class}).invoke((Object) null, new Object[]{looper});
    }
}
