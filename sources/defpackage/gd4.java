package defpackage;

import android.content.Context;
import android.os.Handler;
import java.util.ArrayList;

/* renamed from: gd4  reason: default package */
public final class gd4 implements mgc {
    public final Context a;
    public final qqd b;

    public gd4(Context context) {
        this.a = context;
        this.b = new qqd(10, (Object) context);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [s74, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v9, types: [jo7, java.lang.Object] */
    public final vj0[] a(Handler handler, o75 o75, o75 o752, o75 o753, o75 o754) {
        ArrayList arrayList = new ArrayList();
        qqd qqd = this.b;
        Context context = this.a;
        Handler handler2 = handler;
        o75 o755 = o75;
        arrayList.add(new t88(context, qqd, handler, o75));
        ? obj = new Object();
        obj.d = context;
        obj.e = t30.c;
        obj.g = yb9.b;
        obj.a = false;
        obj.b = false;
        fm9.k(!obj.c);
        obj.c = true;
        if (((jo7) obj.f) == null) {
            m60[] m60Arr = new m60[0];
            m60 lpd = new lpd();
            m60 vud = new vud();
            ? obj2 = new Object();
            m60[] m60Arr2 = new m60[(m60Arr.length + 2)];
            obj2.a = m60Arr2;
            System.arraycopy(m60Arr, 0, m60Arr2, 0, m60Arr.length);
            obj2.b = lpd;
            obj2.c = vud;
            m60Arr2[m60Arr.length] = lpd;
            m60Arr2[m60Arr.length + 1] = vud;
            obj.f = obj2;
        }
        if (((ph4) obj.h) == null) {
            obj.h = new ph4(context, 15);
        }
        e84 e84 = new e84(obj);
        arrayList.add(new v78(this.a, this.b, handler, o752, e84));
        arrayList.add(new xpe(o753, handler.getLooper()));
        arrayList.add(new r99(o754, handler.getLooper()));
        arrayList.add(new ix1());
        arrayList.add(new tv6(ku6.y));
        return (vj0[]) arrayList.toArray(new vj0[0]);
    }
}
