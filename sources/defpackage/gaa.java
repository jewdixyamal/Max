package defpackage;

import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Process;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.a;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import one.me.calls.ui.view.mode.grid.CallGridLayoutManager;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.chatmedia.viewer.video.VideoViewerWidget;
import one.me.profile.ProfileScreen;
import ru.ok.android.api.core.ApiInvocationException;

/* renamed from: gaa  reason: default package */
public final class gaa implements s7c, za7, e71, p21, ar8, oy1, y2a, co7, wm4, a76, hmf, n9f, dke {
    public Object a;

    public /* synthetic */ gaa(Object obj) {
        this.a = obj;
    }

    public foc A(bc7 bc7) {
        foc foc = (foc) this.a;
        if (foc != null) {
            return foc;
        }
        String name = bc7.getName();
        throw new IllegalStateException(("Property " + name + " should be initialized before get.").toString());
    }

    public boolean B() {
        rg8 rg8 = (rg8) this.a;
        return rg8 != null && rg8.d;
    }

    public boolean C(String str) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.a;
        if (!linkedHashMap.containsKey(str)) {
            return false;
        }
        return ((m9f) linkedHashMap.get(str)).e;
    }

    public void D() {
        ((z06) this.a).w0.S();
    }

    /* JADX WARNING: type inference failed for: r3v18, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void E(android.graphics.Rect r4, android.view.View r5, androidx.recyclerview.widget.RecyclerView r6) {
        /*
            r3 = this;
            androidx.recyclerview.widget.a r6 = r6.getLayoutManager()
            if (r6 != 0) goto L_0x0007
            return
        L_0x0007:
            int r6 = androidx.recyclerview.widget.RecyclerView.R(r5)
            java.lang.Object r3 = r3.a
            android.util.SparseArray r3 = (android.util.SparseArray) r3
            r0 = -1
            if (r6 != r0) goto L_0x0016
            r3.remove(r6)
            return
        L_0x0016:
            java.lang.Object r0 = r3.get(r6)
            int[] r0 = (int[]) r0
            if (r0 != 0) goto L_0x0025
            r0 = 8
            int[] r0 = new int[r0]
            r3.put(r6, r0)
        L_0x0025:
            android.view.ViewGroup$LayoutParams r3 = r5.getLayoutParams()
            boolean r6 = r3 instanceof android.view.ViewGroup.MarginLayoutParams
            r1 = 0
            if (r6 == 0) goto L_0x0031
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            goto L_0x0032
        L_0x0031:
            r3 = r1
        L_0x0032:
            r6 = 0
            if (r3 == 0) goto L_0x0038
            int r3 = r3.leftMargin
            goto L_0x0039
        L_0x0038:
            r3 = r6
        L_0x0039:
            android.view.ViewGroup$LayoutParams r2 = r5.getLayoutParams()
            pdc r2 = (defpackage.pdc) r2
            android.graphics.Rect r2 = r2.b
            int r2 = r2.left
            int r3 = r3 + r2
            r2 = 1
            r0[r2] = r3
            int r2 = r4.left
            int r3 = r3 + r2
            r0[r6] = r3
            android.view.ViewGroup$LayoutParams r3 = r5.getLayoutParams()
            boolean r2 = r3 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r2 == 0) goto L_0x0057
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            goto L_0x0058
        L_0x0057:
            r3 = r1
        L_0x0058:
            if (r3 == 0) goto L_0x005d
            int r3 = r3.topMargin
            goto L_0x005e
        L_0x005d:
            r3 = r6
        L_0x005e:
            android.view.ViewGroup$LayoutParams r2 = r5.getLayoutParams()
            pdc r2 = (defpackage.pdc) r2
            android.graphics.Rect r2 = r2.b
            int r2 = r2.top
            int r3 = r3 + r2
            r2 = 3
            r0[r2] = r3
            int r2 = r4.top
            int r3 = r3 + r2
            r2 = 2
            r0[r2] = r3
            android.view.ViewGroup$LayoutParams r3 = r5.getLayoutParams()
            boolean r2 = r3 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r2 == 0) goto L_0x007d
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            goto L_0x007e
        L_0x007d:
            r3 = r1
        L_0x007e:
            if (r3 == 0) goto L_0x0083
            int r3 = r3.rightMargin
            goto L_0x0084
        L_0x0083:
            r3 = r6
        L_0x0084:
            android.view.ViewGroup$LayoutParams r2 = r5.getLayoutParams()
            pdc r2 = (defpackage.pdc) r2
            android.graphics.Rect r2 = r2.b
            int r2 = r2.right
            int r3 = r3 + r2
            r2 = 5
            r0[r2] = r3
            int r2 = r4.right
            int r3 = r3 + r2
            r2 = 4
            r0[r2] = r3
            android.view.ViewGroup$LayoutParams r3 = r5.getLayoutParams()
            boolean r2 = r3 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r2 == 0) goto L_0x00a3
            r1 = r3
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
        L_0x00a3:
            if (r1 == 0) goto L_0x00a7
            int r6 = r1.bottomMargin
        L_0x00a7:
            android.view.ViewGroup$LayoutParams r3 = r5.getLayoutParams()
            pdc r3 = (defpackage.pdc) r3
            android.graphics.Rect r3 = r3.b
            int r3 = r3.bottom
            int r6 = r6 + r3
            r3 = 7
            r0[r3] = r6
            int r3 = r4.bottom
            int r6 = r6 + r3
            r3 = 6
            r0[r3] = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gaa.E(android.graphics.Rect, android.view.View, androidx.recyclerview.widget.RecyclerView):void");
    }

    public vh9 F() {
        return (mi9) this.a;
    }

    public void G(String str, lk7 lk7) {
        ProfileScreen profileScreen = (ProfileScreen) ((qlb) this.a).X;
        profileScreen.r0().x(1, str, lk7);
        int ordinal = lk7.ordinal();
        if (ordinal != 0) {
            if (ordinal == 4) {
                cnb r0 = profileScreen.r0();
                String a2 = ((fl7) r0.x0.getValue()).a(str);
                if (a2 != null) {
                    r0.v(a2);
                    return;
                }
                return;
            } else if (ordinal != 6) {
                return;
            }
        }
        profileScreen.r0().v(str);
    }

    public void H(String str, lk7 lk7, MotionEvent motionEvent) {
        List list;
        ProfileScreen profileScreen = (ProfileScreen) ((qlb) this.a).X;
        ejb ejb = (ejb) profileScreen.r0().H0.getValue();
        ejb.getClass();
        int ordinal = lk7.ordinal();
        if (ordinal == 0 || ordinal == 4 || ordinal == 6) {
            int s = au1.s(ju0.B(str) ? 3 : ju0.C(str) ? 2 : 1);
            c8d c8d = ejb.a;
            if (s != 0) {
                if (s == 1) {
                    wva wva = (wva) c8d.c;
                    list = y53.M((tt3) wva.b, (tt3) wva.c);
                } else if (s == 2) {
                    djb djb = (djb) c8d.b;
                    list = y53.M((tt3) djb.b, (tt3) djb.c);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (lk7 == lk7.X) {
                b9b b9b = (b9b) ((re6) c8d.o).b;
                list = y53.M((tt3) b9b.b, (tt3) b9b.c);
            } else {
                l7b l7b = (l7b) c8d.a;
                list = y53.M((tt3) l7b.b, (tt3) l7b.c);
            }
        } else {
            list = null;
        }
        if (list != null && !list.isEmpty()) {
            profileScreen.r0().x(2, str, lk7);
            dy7.c(1).d0().L(motionEvent.getRawX(), motionEvent.getRawY()).S(dy7.g(new kpa("profile:contextmenu:link", str), new kpa("profile:contextmenu:link_type", Integer.valueOf(lk7.ordinal())))).U(new iqe(str)).I(list).build().q(profileScreen);
            View view = profileScreen.getView();
            if (view != null) {
                pag.F(view, ni6.LONG_PRESS);
            }
        }
    }

    public void I(String str, fad fad, o9f o9f, vb0 vb0, List list) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.a;
        if (linkedHashMap.containsKey(str)) {
            m9f m9f = new m9f(fad, o9f, vb0, list);
            m9f m9f2 = (m9f) linkedHashMap.get(str);
            m9f.e = m9f2.e;
            m9f.f = m9f2.f;
            linkedHashMap.put(str, m9f);
        }
    }

    public o9f J() {
        return new d9e(wma.a((mi9) this.a));
    }

    public x6g P(View view, x6g x6g) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.a;
        if (!Objects.equals(coordinatorLayout.A0, x6g)) {
            coordinatorLayout.A0 = x6g;
            boolean z = x6g.d() > 0;
            coordinatorLayout.B0 = z;
            coordinatorLayout.setWillNotDraw(!z && coordinatorLayout.getBackground() == null);
            v6g v6g = x6g.a;
            if (!v6g.m()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    WeakHashMap weakHashMap = zmf.a;
                    if (childAt.getFitsSystemWindows() && ((rw3) childAt.getLayoutParams()).a != null && v6g.m()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return x6g;
    }

    public /* bridge */ /* synthetic */ Object T0(Object obj, bc7 bc7) {
        return A(bc7);
    }

    public /* bridge */ /* synthetic */ void a(Object obj) {
        Void voidR = (Void) obj;
    }

    public void b() {
        u5e u5e = (u5e) ((zm4) this.a).e;
        u5e.getClass();
        bc7[] bc7Arr = VideoViewerWidget.u0;
        dmf o0 = ((VideoViewerWidget) u5e.a).o0();
        if (o0 != null) {
            ((ChatMediaViewerScreen) o0).G0(true);
        }
    }

    public int c() {
        return ((CallGridLayoutManager) this.a).M.getResources().getDisplayMetrics().heightPixels;
    }

    public void d(Throwable th) {
        ((ov6) this.a).close();
    }

    public void e(gle gle) {
        lme lme = (lme) this.a;
        lme.b().a(new flc(lme, 28, gle));
    }

    public void f(int i) {
        zm4.a((zm4) this.a, false, i * 10);
    }

    public void g(pke pke) {
        lme lme = (lme) this.a;
        lme.b().a(new nle(lme, pke, 2));
    }

    public void h(wq8 wq8, br8 br8) {
        ((zz1) this.a).Z.removeCallbacksAndMessages(wq8);
    }

    public long i() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object, oz7] */
    public ue j(a8g a8g, Rect rect) {
        AnimatedFactoryV2Impl animatedFactoryV2Impl = (AnimatedFactoryV2Impl) this.a;
        if (animatedFactoryV2Impl.g == null) {
            animatedFactoryV2Impl.g = new Object();
        }
        return new ue(animatedFactoryV2Impl.g, a8g, rect, animatedFactoryV2Impl.d);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: yz1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void k(defpackage.wq8 r10, defpackage.br8 r11) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.a
            zz1 r0 = (defpackage.zz1) r0
            android.os.Handler r1 = r0.Z
            r2 = 0
            r1.removeCallbacksAndMessages(r2)
            java.util.ArrayList r1 = r0.t0
            int r3 = r1.size()
            r4 = 0
        L_0x0011:
            r5 = -1
            if (r4 >= r3) goto L_0x0022
            java.lang.Object r6 = r1.get(r4)
            yz1 r6 = (defpackage.yz1) r6
            wq8 r6 = r6.b
            if (r10 != r6) goto L_0x001f
            goto L_0x0023
        L_0x001f:
            int r4 = r4 + 1
            goto L_0x0011
        L_0x0022:
            r4 = r5
        L_0x0023:
            if (r4 != r5) goto L_0x0026
            return
        L_0x0026:
            int r4 = r4 + 1
            int r3 = r1.size()
            if (r4 >= r3) goto L_0x0035
            java.lang.Object r1 = r1.get(r4)
            r2 = r1
            yz1 r2 = (defpackage.yz1) r2
        L_0x0035:
            r5 = r2
            r8g r1 = new r8g
            r8 = 1
            r3 = r1
            r4 = r9
            r6 = r11
            r7 = r10
            r3.<init>((java.lang.Object) r4, (java.lang.Object) r5, (java.lang.Object) r6, (java.lang.Object) r7, (int) r8)
            long r2 = android.os.SystemClock.uptimeMillis()
            r4 = 200(0xc8, double:9.9E-322)
            long r2 = r2 + r4
            android.os.Handler r9 = r0.Z
            r9.postAtTime(r1, r10, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gaa.k(wq8, br8):void");
    }

    public int l(View view) {
        ((a) this.a).getClass();
        return a.F(view) - ((pdc) view.getLayoutParams()).topMargin;
    }

    public ead m() {
        ead ead = new ead();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) this.a).entrySet()) {
            m9f m9f = (m9f) entry.getValue();
            if (m9f.e) {
                ead.a(m9f.a);
                arrayList.add((String) entry.getKey());
            }
        }
        arrayList.toString();
        return ead;
    }

    public Collection n() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) this.a).entrySet()) {
            if (((m9f) entry.getValue()).e) {
                arrayList.add(((m9f) entry.getValue()).a);
            }
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    public void o(fo7 fo7, long j, long j2, boolean z) {
        ((x14) this.a).r((aqa) fo7, j, j2);
    }

    public void o1(Object obj, bc7 bc7, Object obj2) {
        hm9.m(gaa.class.getName(), "set new router", new Object[0]);
        this.a = (foc) obj2;
    }

    public int p() {
        return ((a) this.a).L();
    }

    public Object parse(db7 db7) {
        va8 va8;
        il[] ilVarArr = (il[]) this.a;
        va8[] va8Arr = new va8[ilVarArr.length];
        db7.u();
        int length = ilVarArr.length;
        for (int i = 0; i < length; i++) {
            il ilVar = ilVarArr[i];
            db7.s();
            String T = db7.T();
            int hashCode = T.hashCode();
            if (hashCode != 3548) {
                if (hashCode == 3135262 && T.equals("fail")) {
                    ApiInvocationException apiInvocationException = (ApiInvocationException) ilVar.b.getFailParser().parse(db7);
                    va8 = new va8(ilVar, new Object());
                    db7.q();
                    va8Arr[i] = va8;
                }
            } else if (T.equals("ok")) {
                va8 = new va8(ilVar, ilVar.b.getOkParser().parse(new i03(db7)));
                db7.q();
                va8Arr[i] = va8;
            }
            db7.z();
            va8 = new va8(ilVar, (Object) null);
            db7.q();
            va8Arr[i] = va8;
        }
        db7.t();
        return new cl0(va8Arr);
    }

    public void q(Typeface typeface) {
        s53 s53 = (s53) this.a;
        if (s53.o(typeface)) {
            s53.i(false);
        }
    }

    public int r() {
        a aVar = (a) this.a;
        return aVar.o - aVar.I();
    }

    public Collection s() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) this.a).entrySet()) {
            if (((m9f) entry.getValue()).e) {
                arrayList.add(((m9f) entry.getValue()).b);
            }
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    public View t(int i) {
        return ((a) this.a).v(i);
    }

    public File u() {
        kk5 kk5 = (kk5) ((v4) this.a).c(kk5.class);
        kk5.getClass();
        return kk5.g(kk5.b(), "stickerCache");
    }

    public void v(Rect rect, View view, int i) {
        int[] iArr = (int[]) ((SparseArray) this.a).get(i, (Object) null);
        if (iArr != null) {
            rect.set(view.getLeft() - iArr[0], view.getTop() - iArr[2], view.getRight() + iArr[4], view.getBottom() + iArr[6]);
        }
    }

    public int w(View view) {
        ((a) this.a).getClass();
        return a.z(view) + ((pdc) view.getLayoutParams()).bottomMargin;
    }

    public void x(Rect rect, View view, int i) {
        int[] iArr = (int[]) ((SparseArray) this.a).get(i, (Object) null);
        if (iArr != null) {
            rect.set(view.getLeft() - iArr[0], view.getTop() - iArr[2], view.getRight() + iArr[4], view.getTop() - iArr[3]);
        }
    }

    public void y(fo7 fo7, long j, long j2) {
        aqa aqa = (aqa) fo7;
        x14 x14 = (x14) this.a;
        x14.getClass();
        long j3 = aqa.a;
        z24 z24 = aqa.b;
        t1e t1e = aqa.o;
        xn7 xn7 = new xn7(j3, z24, t1e.c, t1e.o, j, j2, t1e.b);
        x14.n.getClass();
        x14.q.f(xn7, aqa.c, -1, (oy5) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
        x14.L = ((Long) aqa.Y).longValue() - j;
        x14.s(true);
    }

    public b11 z(fo7 fo7, long j, long j2, IOException iOException, int i) {
        IOException iOException2 = iOException;
        aqa aqa = (aqa) fo7;
        x14 x14 = (x14) this.a;
        x14.getClass();
        long j3 = aqa.a;
        t1e t1e = aqa.o;
        x14.q.i(new xn7(j3, aqa.b, t1e.c, t1e.o, j, j2, t1e.b), aqa.c, iOException2, true);
        x14.n.getClass();
        fm9.c("Failed to resolve time offset.", iOException2);
        x14.s(true);
        return jo7.X;
    }

    public gaa(String str, int i) {
        switch (i) {
            case 29:
                this.a = new LinkedHashMap();
                return;
            default:
                this.a = Executors.newCachedThreadPool(new rye(new AtomicInteger(0), str));
                return;
        }
    }

    public gaa(int i) {
        switch (i) {
            case 18:
                Process.getStartElapsedRealtime();
                this.a = new hs();
                return;
            default:
                this.a = new SparseArray();
                return;
        }
    }

    public gaa(mi9 mi9) {
        Object obj;
        this.a = mi9;
        Object obj2 = null;
        try {
            obj = mi9.h(cne.e0);
        } catch (IllegalArgumentException unused) {
            obj = null;
        }
        Class cls = (Class) obj;
        Class<c9e> cls2 = c9e.class;
        if (cls == null || cls.equals(cls2)) {
            ((mi9) this.a).j(o9f.o0, q9f.X);
            aa0 aa0 = cne.e0;
            mi9 mi92 = (mi9) this.a;
            mi92.j(aa0, cls2);
            try {
                obj2 = mi92.h(cne.d0);
            } catch (IllegalArgumentException unused2) {
            }
            if (obj2 == null) {
                mi92.j(cne.d0, cls2.getCanonicalName() + "-" + UUID.randomUUID());
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
    }
}
