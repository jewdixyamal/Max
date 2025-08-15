package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.res.AssetManager;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.fresco.ui.common.ImagePerfDataListener;
import com.facebook.fresco.ui.common.c;
import com.facebook.fresco.ui.common.d;
import com.google.android.material.tabs.TabLayout;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* renamed from: xu3  reason: default package */
public final class xu3 {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;

    public xu3(ar0 ar0, ja7 ja7, g9g g9g, xu3[] xu3Arr) {
        this.b = ar0;
        this.c = ja7;
        this.d = g9g;
        this.e = xu3Arr;
        this.f = ja7.a;
        int ordinal = g9g.ordinal();
        if (xu3Arr != null) {
            xu3 xu3 = xu3Arr[ordinal];
            if (xu3 != null || xu3 != this) {
                xu3Arr[ordinal] = this;
            }
        }
    }

    public void a() {
        if (!this.a) {
            ViewPager2 viewPager2 = (ViewPager2) this.c;
            hdc adapter = viewPager2.getAdapter();
            this.e = adapter;
            if (adapter != null) {
                this.a = true;
                TabLayout tabLayout = (TabLayout) this.b;
                mg6 mg6 = new mg6(tabLayout, 2);
                this.f = mg6;
                viewPager2.b(mg6);
                cx5 cx5 = new cx5(3, viewPager2);
                this.g = cx5;
                tabLayout.a(cx5);
                pz4 pz4 = new pz4(8, this);
                this.h = pz4;
                ((hdc) this.e).z(pz4);
                s();
                tabLayout.q(viewPager2.getCurrentItem(), 0.0f, true, true, true);
                return;
            }
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        throw new IllegalStateException("TabLayoutMediator is already attached");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0047, code lost:
        r6 = r5[r1.ordinal()];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.xu3 b(defpackage.r6d r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.c
            ja7 r0 = (defpackage.ja7) r0
            g9g r1 = defpackage.fp3.G(r0, r6)
            char r2 = r1.a
            java.lang.Object r3 = r5.b
            ar0 r3 = (defpackage.ar0) r3
            r3.t(r2)
            r3.k()
            java.lang.Object r2 = r5.g
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x003a
            java.lang.Object r4 = r5.h
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L_0x0024
            java.lang.String r4 = r6.a()
        L_0x0024:
            r3.l()
            r5.m(r2)
            r6 = 58
            r3.t(r6)
            r3.x()
            r5.m(r4)
            r6 = 0
            r5.g = r6
            r5.h = r6
        L_0x003a:
            java.lang.Object r6 = r5.d
            g9g r6 = (defpackage.g9g) r6
            if (r6 != r1) goto L_0x0041
            return r5
        L_0x0041:
            java.lang.Object r5 = r5.e
            xu3[] r5 = (defpackage.xu3[]) r5
            if (r5 == 0) goto L_0x0050
            int r6 = r1.ordinal()
            r6 = r5[r6]
            if (r6 == 0) goto L_0x0050
            goto L_0x0055
        L_0x0050:
            xu3 r6 = new xu3
            r6.<init>(r3, r0, r1, r5)
        L_0x0055:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xu3.b(r6d):xu3");
    }

    public void c() {
        hdc hdc = (hdc) this.e;
        if (hdc != null) {
            hdc.B((pz4) this.h);
            this.h = null;
        }
        ((TabLayout) this.b).l((cx5) this.g);
        ((ViewPager2) this.c).g((mg6) this.f);
        this.g = null;
        this.f = null;
        this.e = null;
        this.a = false;
    }

    public void d(boolean z) {
        if (this.a) {
            m(String.valueOf(z));
        } else {
            ((sh0) ((ar0) this.b).b).J(String.valueOf(z));
        }
    }

    public void e(r6d r6d, int i, boolean z) {
        f(r6d, i);
        d(z);
    }

    public void f(r6d r6d, int i) {
        int ordinal = ((g9g) this.d).ordinal();
        boolean z = true;
        ar0 ar0 = (ar0) this.b;
        if (ordinal == 1) {
            if (!ar0.a) {
                ar0.t(',');
            }
            ar0.l();
        } else if (ordinal != 2) {
            if (ordinal != 3) {
                if (!ar0.a) {
                    ar0.t(',');
                }
                ar0.l();
                tu0.t((ja7) this.c, r6d);
                m(r6d.g(i));
                ar0.t(':');
                ar0.x();
                return;
            }
            if (i == 0) {
                this.a = true;
            }
            if (i == 1) {
                ar0.t(',');
                ar0.x();
                this.a = false;
            }
        } else if (!ar0.a) {
            if (i % 2 == 0) {
                ar0.t(',');
                ar0.l();
            } else {
                ar0.t(':');
                ar0.x();
                z = false;
            }
            this.a = z;
        } else {
            this.a = true;
            ar0.l();
        }
    }

    public void g(r6d r6d, int i) {
        m(r6d.g(i));
    }

    public void h() {
        ((ar0) this.b).u("null");
    }

    public void i(r6d r6d, int i, Object obj) {
        s9e s9e = s9e.a;
        if (obj != null || ((la7) this.f).f) {
            j(r6d, i, obj);
        }
    }

    public void j(r6d r6d, int i, Object obj) {
        s9e s9e = s9e.a;
        f(r6d, i);
        s9e s9e2 = s9e.a;
        if (obj == null) {
            h();
        } else {
            l(s9e, obj);
        }
    }

    public void k(r6d r6d, int i, cc7 cc7, Object obj) {
        f(r6d, i);
        l(cc7, obj);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0066  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void l(defpackage.cc7 r5, java.lang.Object r6) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.c
            ja7 r0 = (defpackage.ja7) r0
            la7 r1 = r0.a
            boolean r2 = r1.i
            if (r2 == 0) goto L_0x000e
            r5.b(r4, r6)
            goto L_0x0075
        L_0x000e:
            int r1 = r1.p
            int r1 = defpackage.au1.s(r1)
            if (r1 == 0) goto L_0x0063
            r2 = 1
            if (r1 == r2) goto L_0x0023
            r0 = 2
            if (r1 != r0) goto L_0x001d
            goto L_0x0063
        L_0x001d:
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
            r4.<init>()
            throw r4
        L_0x0023:
            r6d r1 = r5.d()
            pag r1 = r1.e()
            nae r2 = defpackage.nae.e
            boolean r2 = defpackage.tpa.f(r1, r2)
            if (r2 != 0) goto L_0x003b
            nae r2 = defpackage.nae.h
            boolean r1 = defpackage.tpa.f(r1, r2)
            if (r1 == 0) goto L_0x0063
        L_0x003b:
            r6d r1 = r5.d()
            java.util.List r1 = r1.getAnnotations()
            java.util.Iterator r1 = r1.iterator()
        L_0x0047:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x005e
            java.lang.Object r2 = r1.next()
            java.lang.annotation.Annotation r2 = (java.lang.annotation.Annotation) r2
            boolean r3 = r2 instanceof defpackage.ka7
            if (r3 == 0) goto L_0x0047
            ka7 r2 = (defpackage.ka7) r2
            java.lang.String r0 = r2.discriminator()
            goto L_0x0064
        L_0x005e:
            la7 r0 = r0.a
            java.lang.String r0 = r0.j
            goto L_0x0064
        L_0x0063:
            r0 = 0
        L_0x0064:
            if (r0 == 0) goto L_0x0072
            r6d r1 = r5.d()
            java.lang.String r1 = r1.a()
            r4.g = r0
            r4.h = r1
        L_0x0072:
            r5.b(r4, r6)
        L_0x0075:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xu3.l(cc7, java.lang.Object):void");
    }

    public void m(String str) {
        ((ar0) this.b).w(str);
    }

    public void n(r6d r6d, int i, String str) {
        f(r6d, i);
        m(str);
    }

    public void o() {
        g9g g9g = (g9g) this.d;
        char c2 = g9g.b;
        ar0 ar0 = (ar0) this.b;
        ar0.y();
        ar0.n();
        ar0.t(g9g.b);
    }

    public void p(d dVar, vu6 vu6) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        la6 la6;
        umc umc;
        dVar.getClass();
        if (this.a && (copyOnWriteArrayList = (CopyOnWriteArrayList) this.h) != null && !copyOnWriteArrayList.isEmpty()) {
            if (!(vu6 != vu6.c || (la6 = ((d2b) this.b).h) == null || (umc = la6.d) == null)) {
                Rect bounds = umc.getBounds();
                bounds.width();
                d dVar2 = (d) this.d;
                dVar2.getClass();
                bounds.height();
                dVar2.getClass();
            }
            c b2 = dVar.b2();
            Iterator it = ((CopyOnWriteArrayList) this.h).iterator();
            while (it.hasNext()) {
                ((ImagePerfDataListener) it.next()).onImageLoadStatusUpdated(b2, vu6);
            }
        }
    }

    public void q() {
        zu3 zu3 = (zu3) this.d;
        uu3 uu3 = (uu3) this.b;
        if (uu3 != null) {
            uu3.changeEnded(zu3, (av3) this.e);
        }
        uu3 uu32 = (uu3) this.c;
        if (uu32 != null) {
            zu3.c.remove(uu32.getInstanceId());
            uu32.changeEnded(zu3, (av3) this.f);
        }
        for (yu3 b2 : (List) this.g) {
            b2.b(uu32, uu3, this.a);
        }
        if (zu3.a) {
            ViewGroup viewGroup = null;
            View view = (View) this.h;
            ViewParent parent = view != null ? view.getParent() : null;
            if (parent instanceof ViewGroup) {
                viewGroup = (ViewGroup) parent;
            }
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
        }
        if (zu3.d() && uu3 != null) {
            uu3.setNeedsAttach(false);
        }
    }

    public FileInputStream r(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e2) {
            String message = e2.getMessage();
            if (message != null && message.contains("compressed")) {
                ((ihb) this.c).getClass();
            }
            return null;
        }
    }

    public void s() {
        int min;
        TabLayout tabLayout = (TabLayout) this.b;
        tabLayout.k();
        hdc hdc = (hdc) this.e;
        if (hdc != null) {
            int j = hdc.j();
            for (int i = 0; i < j; i++) {
                eje i2 = tabLayout.i();
                ((hje) this.d).h(i2, i);
                tabLayout.b(i2, tabLayout.b.size(), false);
            }
            if (j > 0 && (min = Math.min(((ViewPager2) this.c).getCurrentItem(), tabLayout.getTabCount() - 1)) != tabLayout.getSelectedTabPosition()) {
                tabLayout.o(tabLayout.h(min), true);
            }
        }
    }

    public void t(int i, Serializable serializable) {
        ((Executor) this.b).execute(new si1((Object) this, i, (Object) serializable, 6));
    }

    public void u() {
        ArrayList arrayList;
        zec zec;
        int i;
        if (this.a) {
            ArrayList arrayList2 = new ArrayList();
            int i2 = Build.VERSION.SDK_INT;
            PackageManager packageManager = (PackageManager) this.e;
            if (i2 >= 30) {
                Intent intent = new Intent("android.media.MediaRoute2ProviderService");
                ArrayList arrayList3 = new ArrayList();
                for (ResolveInfo resolveInfo : packageManager.queryIntentServices(intent, 0)) {
                    arrayList3.add(resolveInfo.serviceInfo);
                }
                arrayList2 = arrayList3;
            }
            Iterator<ResolveInfo> it = packageManager.queryIntentServices(new Intent("android.media.MediaRouteProviderService"), 0).iterator();
            int i3 = 0;
            while (true) {
                boolean hasNext = it.hasNext();
                arrayList = (ArrayList) this.f;
                boolean z = true;
                zec = (zec) this.c;
                if (!hasNext) {
                    break;
                }
                ServiceInfo serviceInfo = it.next().serviceInfo;
                if (serviceInfo != null) {
                    if ((eh8.d == null ? false : eh8.c().d) && !arrayList2.isEmpty()) {
                        Iterator it2 = arrayList2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            ServiceInfo serviceInfo2 = (ServiceInfo) it2.next();
                            if (serviceInfo.packageName.equals(serviceInfo2.packageName) && serviceInfo.name.equals(serviceInfo2.name)) {
                                break;
                            }
                        }
                    }
                    String str = serviceInfo.packageName;
                    String str2 = serviceInfo.name;
                    int size = arrayList.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= size) {
                            i4 = -1;
                            break;
                        }
                        ComponentName componentName = ((yec) arrayList.get(i4)).t0;
                        if (componentName.getPackageName().equals(str) && componentName.getClassName().equals(str2)) {
                            break;
                        }
                        i4++;
                    }
                    if (i4 < 0) {
                        yec yec = new yec((Context) this.b, new ComponentName(serviceInfo.packageName, serviceInfo.name));
                        yec.A0 = new yt8(this, yec);
                        if (!yec.w0) {
                            if (yec.B0) {
                                yec.toString();
                            }
                            yec.w0 = true;
                            yec.m();
                        }
                        i = i3 + 1;
                        arrayList.add(i3, yec);
                        ((ah8) zec).a(yec);
                    } else if (i4 >= i3) {
                        yec yec2 = (yec) arrayList.get(i4);
                        if (!yec2.w0) {
                            if (yec.B0) {
                                yec2.toString();
                            }
                            yec2.w0 = true;
                            yec2.m();
                        }
                        if (yec2.y0 == null) {
                            if (!yec2.w0 || (yec2.X == null && yec2.v0.isEmpty())) {
                                z = false;
                            }
                            if (z) {
                                yec2.l();
                                yec2.i();
                            }
                        }
                        i = i3 + 1;
                        Collections.swap(arrayList, i4, i3);
                    }
                    i3 = i;
                }
            }
            if (i3 < arrayList.size()) {
                for (int size2 = arrayList.size() - 1; size2 >= i3; size2--) {
                    yec yec3 = (yec) arrayList.get(size2);
                    ah8 ah8 = (ah8) zec;
                    ch8 d2 = ah8.d(yec3);
                    if (d2 != null) {
                        yec3.getClass();
                        eh8.b();
                        yec3.o = null;
                        yec3.h((bg8) null);
                        ah8.l(d2, (vg8) null);
                        if (eh8.c) {
                            d2.toString();
                        }
                        ah8.m.b(514, d2);
                        ah8.i.remove(d2);
                    }
                    arrayList.remove(yec3);
                    yec3.A0 = null;
                    if (yec3.w0) {
                        if (yec.B0) {
                            yec3.toString();
                        }
                        yec3.w0 = false;
                        yec3.m();
                    }
                }
            }
        }
    }

    public void v(boolean z) {
        this.a = z;
        if (z) {
            gv6 gv6 = (gv6) this.f;
            d dVar = (d) this.d;
            hc9 hc9 = (hc9) this.c;
            if (gv6 == null) {
                this.f = new gv6(hc9, dVar, this);
            }
            if (((fv6) this.e) == null) {
                this.e = new fv6(hc9, dVar);
            }
            if (((p06) this.g) == null) {
                this.g = new p06((fv6) this.e);
            }
            gv6 gv62 = (gv6) this.f;
            if (gv62 != null) {
                ((d2b) this.b).g.addListener(gv62);
            }
            p06 p06 = (p06) this.g;
            if (p06 != null) {
                d2b d2b = (d2b) this.b;
                synchronized (d2b) {
                    try {
                        if (d2b.G == null) {
                            d2b.G = new HashSet();
                        }
                        d2b.G.add(p06);
                    } catch (Throwable th) {
                        while (true) {
                            throw th;
                        }
                    }
                }
                return;
            }
            return;
        }
        gv6 gv63 = (gv6) this.f;
        if (gv63 != null) {
            ((d2b) this.b).g.removeListener(gv63);
        }
        p06 p062 = (p06) this.g;
        if (p062 != null) {
            d2b d2b2 = (d2b) this.b;
            synchronized (d2b2) {
                HashSet hashSet = d2b2.G;
                if (hashSet != null) {
                    hashSet.remove(p062);
                }
            }
        }
    }

    public boolean w() {
        return ((la7) this.f).a;
    }

    public xu3(AwakeTimeSinceBootClock awakeTimeSinceBootClock, d2b d2b) {
        this.c = awakeTimeSinceBootClock;
        this.b = d2b;
        u2 u2Var = new u2(6);
        vu6 vu6 = vu6.a;
        nqf nqf = nqf.a;
        this.d = u2Var;
    }

    public xu3(Context context, zec zec) {
        this.f = new ArrayList();
        this.g = new an(10, this);
        this.h = new q57(20, this);
        this.b = context;
        this.c = zec;
        this.d = new Handler();
        this.e = context.getPackageManager();
    }

    public xu3(TabLayout tabLayout, ViewPager2 viewPager2, hje hje) {
        this.b = tabLayout;
        this.c = viewPager2;
        this.d = hje;
    }

    public xu3(AssetManager assetManager, Executor executor, ihb ihb, String str, File file) {
        this.a = false;
        this.b = executor;
        this.c = ihb;
        this.f = str;
        this.e = file;
        int i = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i <= 34) {
            switch (i) {
                case 29:
                case 30:
                    bArr = oag.c;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = oag.b;
                    break;
            }
        }
        this.d = bArr;
    }

    public xu3(uu3 uu3, zu3 zu3, av3 av3, uu3 uu32, List list, View view, av3 av32, boolean z, ViewGroup viewGroup) {
        this.b = uu3;
        this.d = zu3;
        this.e = av3;
        this.c = uu32;
        this.g = list;
        this.h = view;
        this.f = av32;
        this.a = z;
    }
}
