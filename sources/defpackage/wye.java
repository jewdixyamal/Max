package defpackage;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: wye  reason: default package */
public final class wye {
    public final String a;
    public final l7b b;
    public volatile boolean c;
    public final Context d;
    public final je7 e = tu0.r(2, new vye(this, 1));
    public final je7 f = tu0.r(2, new vye(this, 0));
    public final qje g = new qje();
    public final x67 h;
    public final jo7 i;
    public final gaa j;
    public final djb k;

    /* JADX WARNING: type inference failed for: r5v8, types: [jo7, java.lang.Object] */
    public wye(Context context, String str, l7b l7b) {
        this.a = str;
        this.b = l7b;
        this.d = context.getApplicationContext();
        this.h = new x67(context, str);
        ? obj = new Object();
        obj.a = context;
        obj.b = str;
        obj.c = new khe(new ie(12, (Object) obj));
        this.i = obj;
        this.j = new gaa(str, 28);
        this.k = new djb(context, str, false, 9);
    }

    public final yye a() {
        return (yye) this.e.getValue();
    }

    public final void b(String str, String str2) {
        if (!this.c) {
            qje qje = this.g;
            qje.getClass();
            String Y0 = w9e.Y0(31, str);
            String Y02 = w9e.Y0(31, str2);
            synchronized (((ConcurrentHashMap) qje.b)) {
                String str3 = (String) ((ConcurrentHashMap) qje.b).remove(Y0);
                ((ConcurrentHashMap) qje.b).put(Y0, Y02);
                if (str3 == null && ((ConcurrentHashMap) qje.b).size() > 30) {
                    ((ConcurrentHashMap) qje.b).entrySet().iterator().remove();
                }
            }
        }
    }
}
