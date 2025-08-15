package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.media.MediaCodec;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsetsController;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.work.WorkRequest;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import javax.inject.Provider;
import kotlin.coroutines.Continuation;
import one.me.calllist.ui.page.CallHistoryPageScreen;
import one.me.calls.ui.ui.call.panels.CallTopPanelWidget;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.keyboardmedia.stickers.KeyboardStickersWidget;
import ru.ok.tamtam.errors.TamErrorException;
import ru.ok.tamtam.nano.Protos;

/* renamed from: o9g  reason: default package */
public final class o9g implements y2a, ah9, ku6, ln1, qj3, m18, fj9, q1b, Provider, t5e, a76, o1f {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ o9g(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public static Object p(String str) {
        ClassLoader classLoader = o9g.class.getClassLoader();
        if (classLoader == null) {
            classLoader = ClassLoader.getSystemClassLoader();
        }
        return classLoader.loadClass(str).getField("INSTANCE").get((Object) null);
    }

    public static void u(List list) {
        Iterator it = list.iterator();
        if (it.hasNext()) {
            au1.r(it.next());
            throw null;
        }
    }

    public static o9g v() {
        boolean z;
        synchronized (em9.class) {
            z = em9.a;
        }
        if (z || em9.class.getClassLoader() == ClassLoader.getSystemClassLoader()) {
            try {
                synchronized (o9g.class) {
                    y("JNI");
                    throw null;
                }
            } catch (Throwable unused) {
                w();
                throw null;
            }
        } else {
            w();
            throw null;
        }
    }

    public static o9g w() {
        if (!paf.b) {
            synchronized (o9g.class) {
                y("JavaSafe");
                throw null;
            }
        }
        try {
            synchronized (o9g.class) {
                y("JavaUnsafe");
                throw null;
            }
        } catch (Throwable unused) {
            synchronized (o9g.class) {
                y("JavaSafe");
                throw null;
            }
        }
    }

    public static o9g x(xv1 xv1) {
        DynamicRangeProfiles h;
        int i = Build.VERSION.SDK_INT;
        o9g o9g = null;
        if (i >= 33 && (h = e4.h(xv1.a(CameraCharacteristics.REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES))) != null) {
            c54.p("DynamicRangeProfiles can only be converted to DynamicRangesCompat on API 33 or higher.", i >= 33);
            o9g = new o9g(14, (Object) new ju4(h));
        }
        return o9g == null ? ku4.a : o9g;
    }

    public static void y(String str) {
        try {
            new o9g(str);
            throw null;
        } catch (Exception e) {
            throw new AssertionError(e);
        }
    }

    public void A(nnf nnf) {
        bc7[] bc7Arr = CallTopPanelWidget.o;
        pnf.o(((CallTopPanelWidget) this.b).n0().b.M0, new bj1(nnf));
    }

    public void B(long j, boolean z) {
        buc buc = CallHistoryPageScreen.u0;
        m81 p0 = ((CallHistoryPageScreen) this.b).p0();
        al6 q = p0.q(j);
        if (q != null) {
            boolean z2 = q instanceof yk6;
            zs1 zs1 = zs1.HISTORY;
            je7 je7 = p0.t0;
            rg1 rg1 = p0.c;
            if (z2) {
                rg1.l(((yk6) q).a, z, new k81(q, z, 0));
                ((bt1) je7.getValue()).e(zs1, z);
                return;
            }
            if (q instanceof wk6) {
                wk6 wk6 = (wk6) q;
                if (wk6.c) {
                    rg1.j(wk6.e, true, z, false, new l81(q, 0));
                    bt1 bt1 = (bt1) je7.getValue();
                    String valueOf = String.valueOf(j);
                    bt1.getClass();
                    bt1.c(bt1, "GROUP_CALL_JOIN", valueOf, (String) null, (Long) null, (String) null, (String) null, true, 52);
                    return;
                }
            }
            if (q instanceof xk6) {
                rg1.j(((xk6) q).a, true, z, false, new l81(q, 1));
                ((bt1) je7.getValue()).e(zs1, z);
            }
        }
    }

    public bg1 C(int i) {
        fp1 fp1 = (fp1) ((ConcurrentHashMap) this.b).get(Integer.valueOf(i));
        if (fp1 != null) {
            return fp1.b;
        }
        return null;
    }

    public int D(qy5 qy5) {
        String str = qy5.n;
        return (str == null || !ia9.i(str)) ? vj0.b(0, 0, 0, 0) : oaf.K(qy5.n) ? vj0.b(4, 0, 0, 0) : vj0.b(1, 0, 0, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void E() {
        /*
            r3 = this;
            java.lang.Object r3 = r3.b
            fu6 r3 = (defpackage.fu6) r3
            java.util.concurrent.atomic.AtomicReference r0 = r3.q
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicReference r1 = r3.q     // Catch:{ all -> 0x0014 }
            r2 = 0
            java.lang.Object r1 = r1.getAndSet(r2)     // Catch:{ all -> 0x0014 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x0014 }
            if (r1 != 0) goto L_0x0016
            monitor-exit(r0)     // Catch:{ all -> 0x0014 }
            goto L_0x0024
        L_0x0014:
            r3 = move-exception
            goto L_0x0025
        L_0x0016:
            int r1 = r1.intValue()     // Catch:{ all -> 0x0014 }
            int r2 = r3.H()     // Catch:{ all -> 0x0014 }
            if (r1 == r2) goto L_0x0023
            r3.K()     // Catch:{ all -> 0x0014 }
        L_0x0023:
            monitor-exit(r0)     // Catch:{ all -> 0x0014 }
        L_0x0024:
            return
        L_0x0025:
            monitor-exit(r0)     // Catch:{ all -> 0x0014 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o9g.E():void");
    }

    public x6g P(View view, x6g x6g) {
        boolean z;
        boolean z2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        x6g x6g2 = x6g;
        int d = x6g.d();
        dn dnVar = (dn) this.b;
        dnVar.getClass();
        int d2 = x6g.d();
        ActionBarContextView actionBarContextView = dnVar.G0;
        int i2 = 0;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) dnVar.G0.getLayoutParams();
            boolean z3 = true;
            if (dnVar.G0.isShown()) {
                if (dnVar.n1 == null) {
                    dnVar.n1 = new Rect();
                    dnVar.o1 = new Rect();
                }
                Rect rect = dnVar.n1;
                Rect rect2 = dnVar.o1;
                rect.set(x6g.b(), x6g.d(), x6g.c(), x6g.a());
                opf.a(dnVar.L0, rect, rect2);
                int i3 = rect.top;
                int i4 = rect.left;
                int i5 = rect.right;
                ViewGroup viewGroup = dnVar.L0;
                WeakHashMap weakHashMap = zmf.a;
                x6g a2 = pmf.a(viewGroup);
                int b2 = a2 == null ? 0 : a2.b();
                int c = a2 == null ? 0 : a2.c();
                if (marginLayoutParams2.topMargin == i3 && marginLayoutParams2.leftMargin == i4 && marginLayoutParams2.rightMargin == i5) {
                    z2 = false;
                } else {
                    marginLayoutParams2.topMargin = i3;
                    marginLayoutParams2.leftMargin = i4;
                    marginLayoutParams2.rightMargin = i5;
                    z2 = true;
                }
                Context context = dnVar.v0;
                if (i3 <= 0 || dnVar.N0 != null) {
                    View view2 = dnVar.N0;
                    if (!(view2 == null || ((marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()).height == (i = marginLayoutParams2.topMargin) && marginLayoutParams.leftMargin == b2 && marginLayoutParams.rightMargin == c))) {
                        marginLayoutParams.height = i;
                        marginLayoutParams.leftMargin = b2;
                        marginLayoutParams.rightMargin = c;
                        dnVar.N0.setLayoutParams(marginLayoutParams);
                    }
                } else {
                    View view3 = new View(context);
                    dnVar.N0 = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams2.topMargin, 51);
                    layoutParams.leftMargin = b2;
                    layoutParams.rightMargin = c;
                    dnVar.L0.addView(dnVar.N0, -1, layoutParams);
                }
                View view4 = dnVar.N0;
                if (view4 == null) {
                    z3 = false;
                }
                if (z3 && view4.getVisibility() != 0) {
                    View view5 = dnVar.N0;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? lt3.a(context, itb.abc_decor_view_status_guard_light) : lt3.a(context, itb.abc_decor_view_status_guard));
                }
                if (!dnVar.S0 && z3) {
                    d2 = 0;
                }
                boolean z4 = z3;
                z3 = z2;
                z = z4;
            } else if (marginLayoutParams2.topMargin != 0) {
                marginLayoutParams2.topMargin = 0;
                z = false;
            } else {
                z = false;
                z3 = false;
            }
            if (z3) {
                dnVar.G0.setLayoutParams(marginLayoutParams2);
            }
        }
        View view6 = dnVar.N0;
        if (view6 != null) {
            if (!z) {
                i2 = 8;
            }
            view6.setVisibility(i2);
        }
        if (d != d2) {
            int b3 = x6g.b();
            int c2 = x6g.c();
            int a3 = x6g.a();
            m6g n6g = Build.VERSION.SDK_INT >= 30 ? new n6g(x6g2) : new m6g(x6g2);
            n6g.f(v27.b(b3, d2, c2, a3));
            x6g2 = n6g.b();
        }
        return zmf.f(view, x6g2);
    }

    public void a(Object obj) {
        Void voidR = (Void) obj;
        ((Runnable) this.b).run();
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 8:
                Throwable th = (Throwable) obj;
                s12 s12 = (s12) this.b;
                hm9.p(s12.Z, "onUploadFailed: failed", th);
                eoe s = s12.s();
                long j = s12.b;
                s.d(j);
                s12.z();
                s12.y();
                s12.t().c(new oi0(j, th instanceof TamErrorException ? ((TamErrorException) th).a : new pke("internal-error", th.toString(), (String) null)));
                return;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                Throwable th2 = (Throwable) obj;
                m56 m56 = ((r44) this.b).c;
                if (m56 != null) {
                    m56.invoke(th2);
                    return;
                }
                return;
            default:
                hm9.p(((jy8) this.b).getClass().getName(), "fail restore uploads", (Throwable) obj);
                return;
        }
    }

    public void b() {
        ((cb5) this.b).c(50);
    }

    public void c(w3e w3e) {
        ad7 ad7 = ((m4e) this.b).Y;
        ad7.getClass();
        bc7[] bc7Arr = KeyboardStickersWidget.t0;
        b8e o0 = ad7.a.o0();
        vxd S = j47.S(o0.a, ((w9a) o0.b).b(), vx3.b, new y7e(o0, w3e, (Continuation) null));
        o0.z0.o1(o0, b8e.B0[1], S);
    }

    public void close() {
        ((fj9) this.b).close();
    }

    public void d(Throwable th) {
    }

    public void e(d99 d99) {
        ((fj9) this.b).e(d99);
    }

    public void f(g36 g36, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        ((fj9) this.b).f(g36, byteBuffer, bufferInfo);
    }

    public void g(z2e z2e) {
        ((m4e) this.b).Y.a(z2e);
    }

    public Object get() {
        d9f d9f = (d9f) ((Provider) this.b).get();
        HashMap hashMap = new HashMap();
        z8b z8b = z8b.a;
        Set emptySet = Collections.emptySet();
        if (emptySet != null) {
            Long l = 86400000L;
            hashMap.put(z8b, new qb0(Long.valueOf(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS).longValue(), l.longValue(), emptySet));
            z8b z8b2 = z8b.c;
            Set emptySet2 = Collections.emptySet();
            if (emptySet2 != null) {
                Long l2 = 1000L;
                Long l3 = 86400000L;
                hashMap.put(z8b2, new qb0(l2.longValue(), l3.longValue(), emptySet2));
                z8b z8b3 = z8b.b;
                if (Collections.emptySet() != null) {
                    Long l4 = 86400000L;
                    Long l5 = 86400000L;
                    Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(new cuc[]{cuc.b})));
                    if (unmodifiableSet != null) {
                        hashMap.put(z8b3, new qb0(l4.longValue(), l5.longValue(), unmodifiableSet));
                        if (d9f == null) {
                            throw new NullPointerException("missing required property: clock");
                        } else if (hashMap.keySet().size() >= z8b.values().length) {
                            new HashMap();
                            return new pb0(d9f, hashMap);
                        } else {
                            throw new IllegalStateException("Not all priorities have been configured");
                        }
                    } else {
                        throw new NullPointerException("Null flags");
                    }
                } else {
                    throw new NullPointerException("Null flags");
                }
            } else {
                throw new NullPointerException("Null flags");
            }
        } else {
            throw new NullPointerException("Null flags");
        }
    }

    public void h() {
        t50.c((t50) this.b);
    }

    public g36 i(qy5 qy5) {
        return ((fj9) this.b).i(qy5);
    }

    public void j() {
        t50.c((t50) this.b);
    }

    public void k(z2e z2e) {
        cc8 cc8 = (cc8) ((m4e) this.b).Y.a.b.getValue();
        cc8.getClass();
        zb8 zb8 = new zb8(z2e.a);
        s35 s35 = cc8.X;
        pnf.o(s35, zb8);
        pnf.o(s35, yb8.a);
    }

    public void l() {
        t50.c((t50) this.b);
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [z18] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.p1f m(android.content.Context r14, defpackage.i63 r15, defpackage.xw0 r16, defpackage.pgf r17, defpackage.crd r18, java.util.List r19, long r20) {
        /*
            r13 = this;
            nk4 r6 = defpackage.nk4.a
            r0 = 0
            r1 = 0
            r9 = r0
        L_0x0005:
            int r0 = r19.size()
            if (r1 >= r0) goto L_0x001d
            r0 = r19
            java.lang.Object r2 = r0.get(r1)
            z18 r2 = (defpackage.z18) r2
            boolean r3 = r2 instanceof defpackage.b8b
            if (r3 == 0) goto L_0x001a
            r9 = r2
            b8b r9 = (defpackage.b8b) r9
        L_0x001a:
            int r1 = r1 + 1
            goto L_0x0005
        L_0x001d:
            n1f r12 = new n1f
            r0 = r13
            java.lang.Object r0 = r0.b
            r2 = r0
            zff r2 = (defpackage.zff) r2
            r8 = 1
            r0 = r12
            r1 = r14
            r3 = r15
            r4 = r17
            r5 = r16
            r7 = r18
            r10 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o9g.m(android.content.Context, i63, xw0, pgf, crd, java.util.List, long):p1f");
    }

    public void n(int i, boolean z) {
        rm5 rm5 = (rm5) this.b;
        if (z) {
            rm5.a(i);
        } else {
            rm5.getClass();
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [e14, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v3, types: [javax.inject.Provider, java.lang.Object, jc6] */
    /* JADX WARNING: type inference failed for: r3v2, types: [java.lang.Object, c8d] */
    /* JADX WARNING: type inference failed for: r6v1, types: [qp4, java.lang.Object] */
    public e14 o() {
        Context context = (Context) this.b;
        if (context != null) {
            ? obj = new Object();
            obj.a = sm4.a(j1e.b);
            sy4 sy4 = new sy4(18, (Object) context);
            obj.b = sy4;
            obj.c = sm4.a(new h7b(sy4, new k8g(sy4), false, 25));
            sy4 sy42 = obj.b;
            obj.o = new nw4(sy42);
            Provider a2 = sm4.a(new i45(sy42, 0));
            obj.X = a2;
            nw4 nw4 = obj.o;
            c32 c32 = z04.c;
            nd2 nd2 = a14.g;
            qq9 qq9 = mqd.b;
            ? obj2 = new Object();
            obj2.a = c32;
            obj2.b = nd2;
            obj2.c = qq9;
            obj2.o = nw4;
            obj2.X = a2;
            Provider a3 = sm4.a(obj2);
            obj.Y = a3;
            o9g o9g = new o9g(24);
            sy4 sy43 = obj.b;
            nd2 nd22 = a14.g;
            ? obj3 = new Object();
            obj3.a = sy43;
            obj3.b = a3;
            obj3.c = o9g;
            obj3.o = nd22;
            Provider provider = obj.a;
            Provider provider2 = obj.c;
            x3c x3c = new x3c(provider, provider2, obj3, a3, a3);
            c32 c322 = z04.c;
            nd2 nd23 = a14.g;
            ? obj4 = new Object();
            obj4.b = sy43;
            obj4.c = provider2;
            obj4.a = a3;
            obj4.o = obj3;
            obj4.X = provider;
            obj4.Y = a3;
            obj4.Z = c322;
            obj4.s0 = nd23;
            obj4.t0 = a3;
            obj.Z = sm4.a(new bg4(x3c, obj4, new die(provider, a3, obj3, a3)));
            return obj;
        }
        throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
    }

    public void q() {
        t50.c((t50) this.b);
    }

    public void r() {
        t50.c((t50) this.b);
    }

    public void s() {
        t50.c((t50) this.b);
    }

    public void t() {
        t50.c((t50) this.b);
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return o9g.class.getSimpleName() + ":" + ((String) this.b);
            default:
                return super.toString();
        }
    }

    public void z() {
        m1f m1f = (m1f) this.b;
        m1f.D0 = true;
        if (m1f.w0.isEmpty()) {
            rf4 rf4 = m1f.z0;
            rf4.getClass();
            rf4.f();
            return;
        }
        m1f.b();
    }

    public /* synthetic */ o9g(int i, boolean z) {
        this.a = i;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [rud, java.lang.Object, rxd] */
    public o9g(View view) {
        this.a = 25;
        if (Build.VERSION.SDK_INT >= 30) {
            ? rxd = new rxd(28, view);
            rxd.c = view;
            this.b = rxd;
            return;
        }
        this.b = new rxd(28, view);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [rud, java.lang.Object, rxd] */
    public o9g(WindowInsetsController windowInsetsController) {
        this.a = 25;
        ? rxd = new rxd(28, (Object) null);
        rxd.o = windowInsetsController;
        this.b = rxd;
    }

    public o9g(int i) {
        this.a = i;
        switch (i) {
            case 19:
                this.b = new ConcurrentHashMap();
                return;
            case 23:
                this.b = new rm5(0);
                return;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                this.b = z04.c;
                return;
            case 28:
                this.b = new SparseArray();
                return;
            default:
                this.b = new un0(0);
                return;
        }
    }

    public o9g(String str) {
        this.a = 0;
        this.b = str;
        au1.r(p("net.jpountz.xxhash.XXHash32".concat(str)));
        au1.r(p("net.jpountz.xxhash.StreamingXXHash32" + str + "$Factory"));
        au1.r(p("net.jpountz.xxhash.XXHash64".concat(str)));
        au1.r(p("net.jpountz.xxhash.StreamingXXHash64" + str + "$Factory"));
        Random random = new Random();
        random.nextBytes(new byte[100]);
        random.nextInt();
        throw null;
    }
}
