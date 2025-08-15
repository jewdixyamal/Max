package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.SparseArray;
import java.util.Iterator;

/* renamed from: k84  reason: default package */
public final class k84 implements Runnable {
    public final Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ int a = 1;
    public final int b;
    public final int c;
    public final Object o;

    public k84(l84 l84, vf vfVar, wn0 wn0, int i, int i2) {
        this.Y = l84;
        this.o = vfVar;
        this.X = wn0;
        this.b = i;
        this.c = i2;
    }

    public boolean a(int i, int i2) {
        o43 o43;
        l84 l84 = (l84) this.Y;
        int i3 = 2;
        vf vfVar = (vf) this.o;
        if (i2 == 1) {
            vfVar.a0();
            vfVar.V();
            o43 = ((wn0) this.X).e();
        } else if (i2 != 2) {
            return false;
        } else {
            try {
                o43 = ((s2b) l84.a).c(vfVar.a0(), vfVar.V(), (Bitmap.Config) l84.c);
                i3 = -1;
            } catch (RuntimeException e) {
                l84.getClass();
                ta5.i(l84.class, "Failed to create frame bitmap", e);
                return false;
            } catch (Throwable th) {
                o43.S((o43) null);
                throw th;
            }
        }
        boolean b2 = b(i, o43, i2);
        o43.S(o43);
        return (b2 || i3 == -1) ? b2 : a(i, i3);
    }

    public boolean b(int i, o43 o43, int i2) {
        if (!o43.n0(o43) || o43 == null || !((te) ((l84) this.Y).b).d((Bitmap) o43.e0(), i)) {
            return false;
        }
        ((l84) this.Y).getClass();
        ta5.d(l84.class, Integer.valueOf(i), "Frame %d ready.");
        synchronized (((SparseArray) ((l84) this.Y).e)) {
            ((wn0) this.X).d(i, o43);
        }
        return true;
    }

    public final void run() {
        SparseArray sparseArray;
        s68 s68;
        switch (this.a) {
            case 0:
                try {
                    if (((wn0) this.X).a(this.b)) {
                        ((l84) this.Y).getClass();
                        ta5.d(l84.class, Integer.valueOf(this.b), "Frame %d is cached already.");
                        l84 l84 = (l84) this.Y;
                        sparseArray = (SparseArray) l84.e;
                        synchronized (sparseArray) {
                            ((SparseArray) l84.e).remove(this.c);
                        }
                    } else {
                        if (a(this.b, 1)) {
                            ((l84) this.Y).getClass();
                            ta5.d(l84.class, Integer.valueOf(this.b), "Prepared frame %d.");
                        } else {
                            ((l84) this.Y).getClass();
                            ta5.b(l84.class, "Could not prepare frame %d.", Integer.valueOf(this.b));
                        }
                        l84 l842 = (l84) this.Y;
                        sparseArray = (SparseArray) l842.e;
                        synchronized (sparseArray) {
                            ((SparseArray) l842.e).remove(this.c);
                        }
                    }
                    return;
                } catch (Throwable th) {
                    l84 l843 = (l84) this.Y;
                    synchronized (((SparseArray) l843.e)) {
                        ((SparseArray) l843.e).remove(this.c);
                        throw th;
                    }
                }
            default:
                b78 b78 = (b78) this.o;
                IBinder binder = ((c78) b78).a.getBinder();
                gaa gaa = (gaa) this.Y;
                ((cj8) gaa.a).X.remove(binder);
                cj8 cj8 = (cj8) gaa.a;
                Iterator it = cj8.o.iterator();
                while (true) {
                    s68 = null;
                    if (it.hasNext()) {
                        s68 s682 = (s68) it.next();
                        if (s682.c == this.b) {
                            if (TextUtils.isEmpty((String) this.X) || this.c <= 0) {
                                s68 = new s68((cj8) gaa.a, s682.a, s682.b, s682.c, (c78) b78);
                            }
                            it.remove();
                        }
                    }
                }
                if (s68 == null) {
                    s68 = new s68((cj8) gaa.a, (String) this.X, this.c, this.b, (c78) b78);
                }
                cj8.X.put(binder, s68);
                try {
                    binder.linkToDeath(s68, 0);
                    return;
                } catch (RemoteException unused) {
                    return;
                }
        }
    }

    public k84(int i, int i2, c78 c78, gaa gaa, Bundle bundle, String str) {
        this.Y = gaa;
        this.o = c78;
        this.b = i;
        this.X = str;
        this.c = i2;
    }
}
