package defpackage;

import java.text.SimpleDateFormat;

/* renamed from: x44  reason: default package */
public abstract class x44 {
    public static final boolean a = true;
    public static final yd3 b = new yd3(true);
    public static final /* synthetic */ w44 c = new Object();

    /* JADX WARNING: type inference failed for: r0v4, types: [w44, java.lang.Object] */
    static {
        Object obj;
        s5c.d(new Exception(), pag.class.getSimpleName());
        new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        new yd3(false);
        Object obj2 = null;
        try {
            Object newInstance = Class.forName("kotlinx.coroutines.debug.internal.ByteBuddyDynamicAttach").getConstructors()[0].newInstance((Object[]) null);
            f8.c(1, newInstance);
            obj = (m56) newInstance;
        } catch (Throwable th) {
            obj = new njc(th);
        }
        if (!(obj instanceof njc)) {
            obj2 = obj;
        }
        m56 m56 = (m56) obj2;
    }
}
