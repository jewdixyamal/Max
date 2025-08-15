package defpackage;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: yg8  reason: default package */
public final class yg8 extends Handler {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final /* synthetic */ ah8 c;

    public yg8(ah8 ah8) {
        this.c = ah8;
    }

    public static void a(xg8 xg8, int i, Object obj) {
        eh8 eh8 = xg8.a;
        int i2 = 65280 & i;
        lz7 lz7 = xg8.b;
        if (i2 == 256) {
            dh8 dh8 = (i == 264 || i == 262) ? (dh8) ((mpa) obj).b : (dh8) obj;
            if (i == 264 || i == 262) {
                dh8 dh82 = (dh8) ((mpa) obj).a;
            }
            if (dh8 == null) {
                return;
            }
            if ((xg8.d & 2) != 0 || dh8.h(xg8.c)) {
                switch (i) {
                    case 257:
                        lz7.v();
                        return;
                    case 258:
                        lz7.x();
                        return;
                    case 259:
                        lz7.w(dh8);
                        return;
                    case 260:
                        lz7.A(dh8);
                        return;
                    case 261:
                        lz7.getClass();
                        return;
                    case 262:
                        lz7.y(dh8);
                        return;
                    case 263:
                        lz7.z();
                        return;
                    case 264:
                        lz7.y(dh8);
                        return;
                    default:
                        return;
                }
            } else {
                eh8.c();
            }
        } else if (i2 == 512) {
            ch8 ch8 = (ch8) obj;
            switch (i) {
                case 513:
                    lz7.s();
                    return;
                case 514:
                    lz7.u();
                    return;
                case 515:
                    lz7.t();
                    return;
                default:
                    return;
            }
        } else if (i2 == 768 && i == 769) {
            au1.r(obj);
            lz7.B();
        }
    }

    public final void b(int i, Object obj) {
        obtainMessage(i, obj).sendToTarget();
    }

    public final void handleMessage(Message message) {
        int l;
        ArrayList arrayList = this.a;
        int i = message.what;
        Object obj = message.obj;
        ah8 ah8 = this.c;
        if (i == 259 && ah8.f().c.equals(((dh8) obj).c)) {
            ah8.n(true);
        }
        ArrayList arrayList2 = this.b;
        if (i == 262) {
            dh8 dh8 = (dh8) ((mpa) obj).b;
            ah8.c.r(dh8);
            if (ah8.p != null && dh8.d()) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ah8.c.q((dh8) it.next());
                }
                arrayList2.clear();
            }
        } else if (i != 264) {
            switch (i) {
                case 257:
                    ah8.c.p((dh8) obj);
                    break;
                case 258:
                    ah8.c.q((dh8) obj);
                    break;
                case 259:
                    jie jie = ah8.c;
                    dh8 dh82 = (dh8) obj;
                    jie.getClass();
                    if (dh82.c() != jie && (l = jie.l(dh82)) >= 0) {
                        jie.w((mie) jie.C0.get(l));
                        break;
                    }
            }
        } else {
            dh8 dh83 = (dh8) ((mpa) obj).b;
            arrayList2.add(dh83);
            ah8.c.p(dh83);
            ah8.c.r(dh83);
        }
        try {
            int size = ah8.f.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ArrayList arrayList3 = ah8.f;
                    eh8 eh8 = (eh8) ((WeakReference) arrayList3.get(size)).get();
                    if (eh8 == null) {
                        arrayList3.remove(size);
                    } else {
                        arrayList.addAll(eh8.b);
                    }
                } else {
                    int size2 = arrayList.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        a((xg8) arrayList.get(i2), i, obj);
                    }
                    arrayList.clear();
                    return;
                }
            }
        } catch (Throwable th) {
            arrayList.clear();
            throw th;
        }
    }
}
