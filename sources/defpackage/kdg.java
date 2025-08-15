package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* renamed from: kdg  reason: default package */
public final class kdg implements ge6, he6 {
    public final LinkedList c = new LinkedList();
    public final ok d;
    public final zk e;
    public final aab f;
    public final HashSet g = new HashSet();
    public final HashMap h = new HashMap();
    public final int i;
    public final xdg j;
    public boolean k;
    public final ArrayList l = new ArrayList();
    public ph3 m = null;
    public int n = 0;
    public final /* synthetic */ ie6 o;

    public kdg(ie6 ie6, de6 de6) {
        this.o = ie6;
        Looper looper = ie6.x0.getLooper();
        c8d a = de6.a();
        kad kad = new kad((Account) a.b, (Set) (xs) a.c, (String) a.a, (String) a.o);
        z04 z04 = (z04) de6.c.c;
        fp3.n(z04);
        ok e2 = z04.e(de6.a, looper, kad, de6.o, this, this);
        String str = de6.b;
        if (str != null && (e2 instanceof a)) {
            ((a) e2).C0 = str;
        }
        if (str == null || !(e2 instanceof fr9)) {
            this.d = e2;
            this.e = de6.X;
            this.f = new aab(15);
            this.i = de6.Z;
            if (e2.j()) {
                Context context = ie6.X;
                fc9 fc9 = ie6.x0;
                c8d a2 = de6.a();
                this.j = new xdg(context, fc9, new kad((Account) a2.b, (Set) (xs) a2.c, (String) a2.a, (String) a2.o));
                return;
            }
            this.j = null;
            return;
        }
        au1.r(e2);
        throw null;
    }

    public final void R(int i2) {
        Looper myLooper = Looper.myLooper();
        ie6 ie6 = this.o;
        if (myLooper == ie6.x0.getLooper()) {
            f(i2);
        } else {
            ie6.x0.post(new zj0(i2, 5, this));
        }
    }

    public final void a(ph3 ph3) {
        HashSet hashSet = this.g;
        Iterator it = hashSet.iterator();
        if (it.hasNext()) {
            au1.r(it.next());
            if (s36.l(ph3, ph3.X)) {
                this.d.d();
            }
            throw null;
        }
        hashSet.clear();
    }

    public final void b(Status status) {
        fp3.i(this.o.x0);
        c(status, (RuntimeException) null, false);
    }

    public final void c(Status status, RuntimeException runtimeException, boolean z) {
        fp3.i(this.o.x0);
        boolean z2 = true;
        boolean z3 = status == null;
        if (runtimeException != null) {
            z2 = false;
        }
        if (z3 != z2) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                peg peg = (peg) it.next();
                if (!z || peg.a == 2) {
                    if (status != null) {
                        peg.a(status);
                    } else {
                        peg.b(runtimeException);
                    }
                    it.remove();
                }
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }

    public final void d() {
        LinkedList linkedList = this.c;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            peg peg = (peg) arrayList.get(i2);
            if (this.d.isConnected()) {
                if (h(peg)) {
                    linkedList.remove(peg);
                }
                i2++;
            } else {
                return;
            }
        }
    }

    public final void e() {
        ok okVar = this.d;
        ie6 ie6 = this.o;
        fp3.i(ie6.x0);
        this.m = null;
        a(ph3.X);
        if (this.k) {
            fc9 fc9 = ie6.x0;
            zk zkVar = this.e;
            fc9.removeMessages(11, zkVar);
            ie6.x0.removeMessages(9, zkVar);
            this.k = false;
        }
        Iterator it = this.h.values().iterator();
        while (it.hasNext()) {
            vdg vdg = (vdg) it.next();
            vdg.a.getClass();
            try {
                bdb bdb = vdg.a;
                ((ofc) ((pkg) bdb.c).a).accept(okVar, new qne());
            } catch (DeadObjectException unused) {
                R(3);
                okVar.b("DeadObjectException thrown while calling register listener method.");
            } catch (RemoteException unused2) {
                it.remove();
            }
        }
        d();
        g();
    }

    public final void f(int i2) {
        ie6 ie6 = this.o;
        fp3.i(ie6.x0);
        this.m = null;
        this.k = true;
        String i3 = this.d.i();
        aab aab = this.f;
        aab.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i2 == 1) {
            sb.append(" due to service disconnection.");
        } else if (i2 == 3) {
            sb.append(" due to dead object exception.");
        }
        if (i3 != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(i3);
        }
        aab.r(true, new Status(20, sb.toString(), (PendingIntent) null, (ph3) null));
        fc9 fc9 = ie6.x0;
        zk zkVar = this.e;
        fc9.sendMessageDelayed(Message.obtain(fc9, 9, zkVar), MultiFileUploader.UPLOAD_NEXT_INTERVAL);
        fc9 fc92 = ie6.x0;
        fc92.sendMessageDelayed(Message.obtain(fc92, 11, zkVar), 120000);
        ((SparseIntArray) ie6.Z.b).clear();
        for (vdg vdg : this.h.values()) {
            vdg.c.run();
        }
    }

    public final void g() {
        ie6 ie6 = this.o;
        fc9 fc9 = ie6.x0;
        zk zkVar = this.e;
        fc9.removeMessages(12, zkVar);
        fc9 fc92 = ie6.x0;
        fc92.sendMessageDelayed(fc92.obtainMessage(12, zkVar), ie6.a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean h(defpackage.peg r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof defpackage.odg
            java.lang.String r1 = "DeadObjectException thrown while running ApiCallRunner."
            r2 = 1
            if (r0 != 0) goto L_0x001d
            ok r0 = r14.d
            boolean r3 = r0.j()
            aab r4 = r14.f
            r15.d(r4, r3)
            r15.c(r14)     // Catch:{ DeadObjectException -> 0x0016 }
            goto L_0x001c
        L_0x0016:
            r14.R(r2)
            r0.b(r1)
        L_0x001c:
            return r2
        L_0x001d:
            r0 = r15
            odg r0 = (defpackage.odg) r0
            pe5[] r3 = r0.g(r14)
            r4 = 0
            r5 = 0
            if (r3 == 0) goto L_0x0072
            int r6 = r3.length
            if (r6 != 0) goto L_0x002c
            goto L_0x0072
        L_0x002c:
            ok r6 = r14.d
            pe5[] r6 = r6.h()
            if (r6 != 0) goto L_0x0036
            pe5[] r6 = new defpackage.pe5[r4]
        L_0x0036:
            us r7 = new us
            int r8 = r6.length
            r7.<init>(r8)
            r8 = r4
        L_0x003d:
            int r9 = r6.length
            if (r8 >= r9) goto L_0x0052
            r9 = r6[r8]
            java.lang.String r10 = r9.a
            long r11 = r9.b()
            java.lang.Long r9 = java.lang.Long.valueOf(r11)
            r7.put(r10, r9)
            int r8 = r8 + 1
            goto L_0x003d
        L_0x0052:
            int r6 = r3.length
            r8 = r4
        L_0x0054:
            if (r8 >= r6) goto L_0x0072
            r9 = r3[r8]
            java.lang.String r10 = r9.a
            java.lang.Object r10 = r7.get(r10)
            java.lang.Long r10 = (java.lang.Long) r10
            if (r10 == 0) goto L_0x0073
            long r10 = r10.longValue()
            long r12 = r9.b()
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L_0x006f
            goto L_0x0073
        L_0x006f:
            int r8 = r8 + 1
            goto L_0x0054
        L_0x0072:
            r9 = r5
        L_0x0073:
            if (r9 != 0) goto L_0x008b
            ok r0 = r14.d
            boolean r3 = r0.j()
            aab r4 = r14.f
            r15.d(r4, r3)
            r15.c(r14)     // Catch:{ DeadObjectException -> 0x0084 }
            goto L_0x008a
        L_0x0084:
            r14.R(r2)
            r0.b(r1)
        L_0x008a:
            return r2
        L_0x008b:
            ok r15 = r14.d
            r15.getClass()
            ie6 r15 = r14.o
            boolean r15 = r15.y0
            if (r15 == 0) goto L_0x00fe
            boolean r15 = r0.f(r14)
            if (r15 == 0) goto L_0x00fe
            zk r15 = r14.e
            ldg r0 = new ldg
            r0.<init>(r15, r9)
            java.util.ArrayList r15 = r14.l
            int r15 = r15.indexOf(r0)
            r1 = 5000(0x1388, double:2.4703E-320)
            r3 = 15
            if (r15 < 0) goto L_0x00ca
            java.util.ArrayList r0 = r14.l
            java.lang.Object r15 = r0.get(r15)
            ldg r15 = (defpackage.ldg) r15
            ie6 r0 = r14.o
            fc9 r0 = r0.x0
            r0.removeMessages(r3, r15)
            ie6 r14 = r14.o
            fc9 r14 = r14.x0
            android.os.Message r15 = android.os.Message.obtain(r14, r3, r15)
            r14.sendMessageDelayed(r15, r1)
            goto L_0x00fd
        L_0x00ca:
            java.util.ArrayList r15 = r14.l
            r15.add(r0)
            ie6 r15 = r14.o
            fc9 r15 = r15.x0
            android.os.Message r3 = android.os.Message.obtain(r15, r3, r0)
            r15.sendMessageDelayed(r3, r1)
            ie6 r15 = r14.o
            fc9 r15 = r15.x0
            r1 = 16
            android.os.Message r0 = android.os.Message.obtain(r15, r1, r0)
            r1 = 120000(0x1d4c0, double:5.9288E-319)
            r15.sendMessageDelayed(r0, r1)
            ph3 r15 = new ph3
            r0 = 2
            r15.<init>(r0, r5)
            boolean r0 = r14.i(r15)
            if (r0 != 0) goto L_0x00fd
            ie6 r0 = r14.o
            int r14 = r14.i
            r0.b(r15, r14)
        L_0x00fd:
            return r4
        L_0x00fe:
            com.google.android.gms.common.api.UnsupportedApiCallException r14 = new com.google.android.gms.common.api.UnsupportedApiCallException
            r14.<init>(r9)
            r0.b(r14)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kdg.h(peg):boolean");
    }

    public final boolean i(ph3 ph3) {
        synchronized (ie6.B0) {
            this.o.getClass();
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [od, ri0, java.lang.Object] */
    public final void j() {
        ie6 ie6 = this.o;
        fp3.i(ie6.x0);
        ok okVar = this.d;
        if (!okVar.isConnected() && !okVar.c()) {
            try {
                l7b l7b = ie6.Z;
                Context context = ie6.X;
                l7b.getClass();
                fp3.n(context);
                int g2 = okVar.g();
                SparseIntArray sparseIntArray = (SparseIntArray) l7b.b;
                int i2 = sparseIntArray.get(g2, -1);
                if (i2 == -1) {
                    i2 = 0;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= sparseIntArray.size()) {
                            i2 = -1;
                            break;
                        }
                        int keyAt = sparseIntArray.keyAt(i3);
                        if (keyAt > g2 && sparseIntArray.get(keyAt) == 0) {
                            break;
                        }
                        i3++;
                    }
                    if (i2 == -1) {
                        i2 = ((fe6) l7b.c).b(context, g2);
                    }
                    sparseIntArray.put(g2, i2);
                }
                if (i2 != 0) {
                    ph3 ph3 = new ph3(i2, (PendingIntent) null);
                    ph3.toString();
                    m(ph3, (RuntimeException) null);
                    return;
                }
                zk zkVar = this.e;
                ? obj = new Object();
                obj.Y = ie6;
                obj.o = null;
                obj.X = null;
                obj.a = false;
                obj.b = okVar;
                obj.c = zkVar;
                if (okVar.j()) {
                    xdg xdg = this.j;
                    fp3.n(xdg);
                    iod iod = xdg.i;
                    if (iod != null) {
                        iod.disconnect();
                    }
                    Integer valueOf = Integer.valueOf(System.identityHashCode(xdg));
                    kad kad = xdg.h;
                    kad.Z = valueOf;
                    Handler handler = xdg.e;
                    xdg.i = (iod) xdg.f.e(xdg.d, handler.getLooper(), kad, (jod) kad.Y, xdg, xdg);
                    xdg.j = obj;
                    Set set = xdg.g;
                    if (set == null || set.isEmpty()) {
                        handler.post(new gwe(11, (Object) xdg));
                    } else {
                        xdg.i.w();
                    }
                }
                try {
                    okVar.e(obj);
                } catch (SecurityException e2) {
                    m(new ph3(10), e2);
                }
            } catch (IllegalStateException e3) {
                m(new ph3(10), e3);
            }
        }
    }

    public final void k(ph3 ph3) {
        m(ph3, (RuntimeException) null);
    }

    public final void l(peg peg) {
        fp3.i(this.o.x0);
        boolean isConnected = this.d.isConnected();
        LinkedList linkedList = this.c;
        if (!isConnected) {
            linkedList.add(peg);
            ph3 ph3 = this.m;
            if (ph3 == null || ph3.b == 0 || ph3.c == null) {
                j();
            } else {
                m(ph3, (RuntimeException) null);
            }
        } else if (h(peg)) {
            g();
        } else {
            linkedList.add(peg);
        }
    }

    public final void m(ph3 ph3, RuntimeException runtimeException) {
        iod iod;
        fp3.i(this.o.x0);
        xdg xdg = this.j;
        if (!(xdg == null || (iod = xdg.i) == null)) {
            iod.disconnect();
        }
        fp3.i(this.o.x0);
        this.m = null;
        ((SparseIntArray) this.o.Z.b).clear();
        a(ph3);
        if ((this.d instanceof seg) && ph3.b != 24) {
            ie6 ie6 = this.o;
            ie6.b = true;
            fc9 fc9 = ie6.x0;
            fc9.sendMessageDelayed(fc9.obtainMessage(19), 300000);
        }
        if (ph3.b == 4) {
            b(ie6.A0);
        } else if (this.c.isEmpty()) {
            this.m = ph3;
        } else if (runtimeException != null) {
            fp3.i(this.o.x0);
            c((Status) null, runtimeException, false);
        } else if (this.o.y0) {
            c(ie6.c(this.e, ph3), (RuntimeException) null, true);
            if (!this.c.isEmpty() && !i(ph3) && !this.o.b(ph3, this.i)) {
                if (ph3.b == 18) {
                    this.k = true;
                }
                if (this.k) {
                    ie6 ie62 = this.o;
                    zk zkVar = this.e;
                    fc9 fc92 = ie62.x0;
                    fc92.sendMessageDelayed(Message.obtain(fc92, 9, zkVar), MultiFileUploader.UPLOAD_NEXT_INTERVAL);
                    return;
                }
                b(ie6.c(this.e, ph3));
            }
        } else {
            b(ie6.c(this.e, ph3));
        }
    }

    public final void n(ph3 ph3) {
        fp3.i(this.o.x0);
        ok okVar = this.d;
        String name = okVar.getClass().getName();
        String valueOf = String.valueOf(ph3);
        okVar.b("onSignInFailed for " + name + " with " + valueOf);
        m(ph3, (RuntimeException) null);
    }

    public final void o() {
        fp3.i(this.o.x0);
        Status status = ie6.z0;
        b(status);
        this.f.r(false, status);
        for (hm7 ieg : (hm7[]) this.h.keySet().toArray(new hm7[0])) {
            l(new ieg(ieg, new qne()));
        }
        a(new ph3(4));
        ok okVar = this.d;
        if (okVar.isConnected()) {
            okVar.f(new y7f(3, this));
        }
    }

    public final void onConnected() {
        Looper myLooper = Looper.myLooper();
        ie6 ie6 = this.o;
        if (myLooper == ie6.x0.getLooper()) {
            e();
        } else {
            ie6.x0.post(new gwe(9, (Object) this));
        }
    }
}
