package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* renamed from: go9  reason: default package */
public class go9 implements xt {
    public static go9 f;
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public final Object d;
    public final Object e;

    public go9(ArrayList arrayList, String str, String str2, int i) {
        this.a = 3;
        this.d = arrayList;
        this.e = str;
        this.c = str2;
        this.b = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x000e, code lost:
        r0 = ((java.util.concurrent.CopyOnWriteArrayList) r3.e).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001a, code lost:
        if (r0.hasNext() == false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001c, code lost:
        r1 = (java.lang.ref.WeakReference) r0.next();
        r2 = (defpackage.f84) r1.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
        if (r2 == null) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002a, code lost:
        r2.a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002e, code lost:
        ((java.util.concurrent.CopyOnWriteArrayList) r3.e).remove(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(defpackage.go9 r3, int r4) {
        /*
            java.lang.Object r0 = r3.c
            monitor-enter(r0)
            int r1 = r3.b     // Catch:{ all -> 0x0009 }
            if (r1 != r4) goto L_0x000b
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            goto L_0x0036
        L_0x0009:
            r3 = move-exception
            goto L_0x0037
        L_0x000b:
            r3.b = r4     // Catch:{ all -> 0x0009 }
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            java.lang.Object r0 = r3.e
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0016:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0036
            java.lang.Object r1 = r0.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r2 = r1.get()
            f84 r2 = (defpackage.f84) r2
            if (r2 == 0) goto L_0x002e
            r2.a(r4)
            goto L_0x0016
        L_0x002e:
            java.lang.Object r2 = r3.e
            java.util.concurrent.CopyOnWriteArrayList r2 = (java.util.concurrent.CopyOnWriteArrayList) r2
            r2.remove(r1)
            goto L_0x0016
        L_0x0036:
            return
        L_0x0037:
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.go9.b(go9, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0099 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.go9 h(defpackage.gy8 r13) {
        /*
            r0 = 2
            r1 = 0
            r2 = 1
            int r3 = defpackage.lz7.N(r13)
            r4 = 0
            if (r3 != 0) goto L_0x000b
            return r4
        L_0x000b:
            r7 = r1
            r8 = r7
            r5 = r4
            r6 = r5
        L_0x000f:
            if (r7 >= r3) goto L_0x00aa
            java.lang.String r9 = r13.z0()
            r9.getClass()
            r10 = -1
            int r11 = r9.hashCode()
            switch(r11) {
                case -683415465: goto L_0x0037;
                case -265713450: goto L_0x002c;
                case 3598564: goto L_0x0021;
                default: goto L_0x0020;
            }
        L_0x0020:
            goto L_0x0041
        L_0x0021:
            java.lang.String r11 = "urls"
            boolean r9 = r9.equals(r11)
            if (r9 != 0) goto L_0x002a
            goto L_0x0041
        L_0x002a:
            r10 = r0
            goto L_0x0041
        L_0x002c:
            java.lang.String r11 = "username"
            boolean r9 = r9.equals(r11)
            if (r9 != 0) goto L_0x0035
            goto L_0x0041
        L_0x0035:
            r10 = r2
            goto L_0x0041
        L_0x0037:
            java.lang.String r11 = "credential"
            boolean r9 = r9.equals(r11)
            if (r9 != 0) goto L_0x0040
            goto L_0x0041
        L_0x0040:
            r10 = r1
        L_0x0041:
            switch(r10) {
                case 0: goto L_0x00a3;
                case 1: goto L_0x009e;
                case 2: goto L_0x0049;
                default: goto L_0x0044;
            }
        L_0x0044:
            r13.z()
            goto L_0x00a7
        L_0x0049:
            int r4 = defpackage.lz7.G(r13)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r4)
            r9 = r1
        L_0x0053:
            if (r9 >= r4) goto L_0x005e
            java.lang.String r10 = defpackage.lz7.P(r13)
            r8.add(r10)
            int r9 = r9 + r2
            goto L_0x0053
        L_0x005e:
            boolean r4 = r8.isEmpty()
            if (r4 != 0) goto L_0x0099
            java.util.Iterator r4 = r8.iterator()
        L_0x0068:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto L_0x0099
            java.lang.Object r9 = r4.next()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r10 = "stun:"
            boolean r10 = r9.startsWith(r10)
            if (r10 != 0) goto L_0x0097
            java.lang.String r10 = "stuns:"
            boolean r10 = r9.startsWith(r10)
            if (r10 == 0) goto L_0x0085
            goto L_0x0097
        L_0x0085:
            java.lang.String r10 = "turn:"
            boolean r10 = r9.startsWith(r10)
            if (r10 != 0) goto L_0x0095
            java.lang.String r10 = "turns:"
            boolean r9 = r9.startsWith(r10)
            if (r9 == 0) goto L_0x0068
        L_0x0095:
            r4 = r0
            goto L_0x009a
        L_0x0097:
            r4 = 3
            goto L_0x009a
        L_0x0099:
            r4 = r2
        L_0x009a:
            r12 = r8
            r8 = r4
            r4 = r12
            goto L_0x00a7
        L_0x009e:
            java.lang.String r5 = defpackage.lz7.P(r13)
            goto L_0x00a7
        L_0x00a3:
            java.lang.String r6 = defpackage.lz7.P(r13)
        L_0x00a7:
            int r7 = r7 + r2
            goto L_0x000f
        L_0x00aa:
            go9 r13 = new go9
            r13.<init>(r4, r5, r6, r8)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.go9.h(gy8):go9");
    }

    public int a(fm5 fm5) {
        if (this.b == 2) {
            u75 u75 = (u75) this.c;
            fm5.b = Math.min((int) ((u75.k() * 100) / u75.c()), 99);
        }
        return this.b;
    }

    public h3b c() {
        return new h3b((String) this.d, (CharSequence) this.e, this.b, (Bundle) this.c);
    }

    public Object d() {
        Object removeLast;
        synchronized (this.c) {
            removeLast = ((ArrayDeque) this.d).removeLast();
        }
        return removeLast;
    }

    public cx6 e() {
        jn jnVar = new jn(4);
        glc glc = (glc) this.e;
        String str = (String) glc.c;
        if (str != null) {
            jnVar.I(1, str);
        }
        String str2 = (String) glc.o;
        if (str2 != null) {
            jnVar.I(2, str2);
        }
        return jnVar.j();
    }

    public void f(Object obj) {
        Object d2;
        synchronized (this.c) {
            try {
                d2 = ((ArrayDeque) this.d).size() >= this.b ? d() : null;
                ((ArrayDeque) this.d).addFirst(obj);
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (((av1) this.e) != null && d2 != null) {
            ((ov6) d2).close();
        }
    }

    public boolean g() {
        boolean isEmpty;
        synchronized (this.c) {
            isEmpty = ((ArrayDeque) this.d).isEmpty();
        }
        return isEmpty;
    }

    public void i(Bundle bundle) {
        this.c = bundle;
    }

    public void release() {
        ((u75) this.c).release();
        this.b = 0;
    }

    public void start() {
        tb8 tb8 = ((lv4) this.d).a;
        u75 u75 = (u75) this.c;
        u75.getClass();
        u75.O0(zw6.n(tb8));
        u75.prepare();
        this.b = 1;
    }

    public String toString() {
        switch (this.a) {
            case 3:
                StringBuilder sb = new StringBuilder("{urls=");
                sb.append((List) this.d);
                sb.append(", username='");
                sb.append((String) this.e);
                sb.append("', credential='");
                sb.append((String) this.c);
                sb.append("', type=");
                int i = this.b;
                sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "STUN" : "TURN" : "UNKNOWN");
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public go9(int i, av1 av1) {
        this.a = 1;
        this.c = new Object();
        this.b = i;
        this.d = new ArrayDeque(i);
        this.e = av1;
    }

    public go9(Context context) {
        this.a = 0;
        this.d = new Handler(Looper.getMainLooper());
        this.e = new CopyOnWriteArrayList();
        this.c = new Object();
        this.b = 0;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new an(8, this), intentFilter);
    }

    public go9(Context context, lv4 lv4, wj8 wj8, pkg pkg, int i, Looper looper, wt wtVar, she she) {
        Context context2 = context;
        lv4 lv42 = lv4;
        she she2 = she;
        this.a = 2;
        this.d = lv42;
        glc glc = new glc(3, (Object) pkg);
        this.e = glc;
        cf4 cf4 = new cf4(context2);
        me4 me4 = new me4(context2);
        me4.z = true;
        me4.M = false;
        cf4.b(new oe4(me4));
        fc4.l("bufferForPlaybackMs", 250, 0, "0");
        fc4.l("bufferForPlaybackAfterRebufferMs", 500, 0, "0");
        fc4.l("minBufferMs", 50000, 250, "bufferForPlaybackMs");
        fc4.l("minBufferMs", 50000, 500, "bufferForPlaybackAfterRebufferMs");
        fc4.l("maxBufferMs", 50000, 50000, "minBufferMs");
        fc4 fc4 = new fc4(new n64(1), 50000, 50000, 250, 500, false);
        x65 x65 = new x65(context2, new lc4(6, new a75(lv42.b, lv42.c, lv42.d, glc, i, wtVar)), new v65(context2, 4));
        fm9.k(!x65.v);
        x65.d = new lc4(2, wj8);
        fm9.k(!x65.v);
        x65.e = new lc4(3, cf4);
        fm9.k(!x65.v);
        x65.f = new lc4(7, fc4);
        fm9.k(!x65.v);
        looper.getClass();
        x65.i = looper;
        fm9.k(!x65.v);
        x65.u = false;
        long j = oaf.O() ? MultiFileUploader.UPLOAD_NEXT_INTERVAL : 500;
        fm9.k(!x65.v);
        x65.s = j;
        if (she2 != she.a) {
            fm9.k(!x65.v);
            x65.b = she2;
        }
        u75 a2 = x65.a();
        this.c = a2;
        a2.x0.a(new z65(this, wtVar));
        this.b = 0;
    }

    public go9(y7g y7g, Toolbar toolbar) {
        this.a = 5;
        this.b = xxb.toolbar_title;
        this.d = y7g;
        this.e = toolbar;
    }

    public go9(String str, CharSequence charSequence, int i) {
        this.a = 4;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("You must specify an action to build a CustomAction");
        } else if (TextUtils.isEmpty(charSequence)) {
            throw new IllegalArgumentException("You must specify a name to build a CustomAction");
        } else if (i != 0) {
            this.d = str;
            this.e = charSequence;
            this.b = i;
        } else {
            throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
        }
    }
}
