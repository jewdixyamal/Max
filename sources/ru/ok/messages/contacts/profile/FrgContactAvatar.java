package ru.ok.messages.contacts.profile;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.b;
import java.io.File;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashSet;
import one.me.sdk.zoom.ZoomableDraweeView;
import ru.ok.messages.views.fragments.FrgSlideOut;
import ru.ok.messages.views.widgets.SlideOutLayout;

public class FrgContactAvatar extends FrgSlideOut {
    public ArrayList C1;
    public Long D1;
    public boolean E1;
    public boolean F1;
    public long G1;
    public long H1;
    public boolean I1;

    /* JADX WARNING: type inference failed for: r8v2, types: [q5] */
    /* JADX WARNING: type inference failed for: r8v11, types: [q5] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean G0(android.view.MenuItem r8) {
        /*
            r7 = this;
            int r8 = r8.getItemId()
            r0 = 16908332(0x102002c, float:2.3877352E-38)
            if (r8 != r0) goto L_0x0018
            q5 r8 = r7.g1()
            if (r8 == 0) goto L_0x014c
            androidx.fragment.app.b r7 = r7.b0()
            r7.finish()
            goto L_0x014c
        L_0x0018:
            int r0 = defpackage.xxb.menu_avatar_photo__save_to_gallery
            if (r8 != r0) goto L_0x003c
            q5 r8 = r7.g1()
            if (r8 == 0) goto L_0x014c
            boolean r8 = r7.o1
            if (r8 == 0) goto L_0x014c
            java.util.ArrayList r8 = r7.C1
            java.lang.Object r8 = defpackage.nd7.r(r8)
            java.lang.String r8 = (java.lang.String) r8
            r0 = 0
            ru.ok.messages.views.dialogs.SaveToGalleryDialog r8 = ru.ok.messages.views.dialogs.SaveToGalleryDialog.n1(r8, r0)
            androidx.fragment.app.c r7 = r7.F0
            java.lang.String r0 = "ru.ok.messages.views.dialogs.SaveToGalleryDialog"
            r8.k1(r7, r0)
            goto L_0x014c
        L_0x003c:
            int r0 = defpackage.xxb.menu_avatar_photo__share
            if (r8 != r0) goto L_0x008d
            jyc r8 = r7.q1
            pk r8 = r8.c()
            k4a r8 = (defpackage.k4a) r8
            m7b r8 = r8.y()
            p7b r8 = (defpackage.p7b) r8
            t33 r8 = r8.a
            long r1 = r8.o()
            r7.G1 = r1
            y7g r8 = r7.p1
            java.lang.Object r8 = r8.b
            ed3 r8 = (defpackage.ed3) r8
            y8a r8 = (defpackage.y8a) r8
            v4 r8 = r8.getAccessor()
            java.lang.Class<av6> r0 = defpackage.av6.class
            java.lang.Object r8 = r8.c(r0)
            av6 r8 = (defpackage.av6) r8
            java.util.ArrayList r0 = r7.C1
            java.lang.Object r0 = defpackage.nd7.r(r0)
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6
            java.util.ArrayList r0 = r7.C1
            java.lang.Object r0 = defpackage.nd7.r(r0)
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
            r4.<init>(r7)
            r46 r7 = new r46
            r5 = 0
            r0 = r7
            r0.<init>(r1, r3, r4, r5)
            r8.a(r6, r7)
            goto L_0x014c
        L_0x008d:
            int r0 = defpackage.xxb.menu_avatar_photo__make_main
            r1 = 0
            if (r8 != r0) goto L_0x00f1
            q5 r8 = r7.g1()
            boolean r0 = r8 instanceof defpackage.s46
            if (r0 == 0) goto L_0x009d
            r1 = r8
            s46 r1 = (defpackage.s46) r1
        L_0x009d:
            if (r1 == 0) goto L_0x014c
            java.lang.Long r8 = r7.D1
            long r2 = r8.longValue()
            java.util.ArrayList r7 = r7.C1
            java.lang.Object r7 = defpackage.nd7.r(r7)
            java.lang.String r7 = (java.lang.String) r7
            ru.ok.messages.contacts.profile.ActContactAvatars r1 = (ru.ok.messages.contacts.profile.ActContactAvatars) r1
            iq1 r8 = r1.g1
            defpackage.cqc.b(r8)
            t5 r8 = new t5
            r8.<init>((ru.ok.messages.contacts.profile.ActContactAvatars) r1, (java.lang.String) r7, (long) r2)
            y7g r7 = r1.K0
            java.lang.Object r7 = r7.b
            ed3 r7 = (defpackage.ed3) r7
            y8a r7 = (defpackage.y8a) r7
            hle r7 = r7.q()
            jle r7 = (defpackage.jle) r7
            ztc r7 = r7.a()
            s5 r0 = new s5
            r4 = 2
            r0.<init>(r1, r2, r4)
            xw0 r2 = new xw0
            r3 = 13
            r2.<init>(r3)
            y7g r3 = r1.K0
            java.lang.Object r3 = r3.b
            ed3 r3 = (defpackage.ed3) r3
            y8a r3 = (defpackage.y8a) r3
            hle r3 = r3.q()
            jle r3 = (defpackage.jle) r3
            ztc r3 = r3.b()
            iq1 r7 = defpackage.cqc.a(r8, r7, r0, r2, r3)
            r1.g1 = r7
            goto L_0x014c
        L_0x00f1:
            int r0 = defpackage.xxb.menu_avatar_photo__delete
            if (r8 != r0) goto L_0x014c
            q5 r8 = r7.g1()
            boolean r0 = r8 instanceof defpackage.s46
            if (r0 == 0) goto L_0x0100
            r1 = r8
            s46 r1 = (defpackage.s46) r1
        L_0x0100:
            if (r1 == 0) goto L_0x014c
            java.lang.Long r7 = r7.D1
            long r7 = r7.longValue()
            ru.ok.messages.contacts.profile.ActContactAvatars r1 = (ru.ok.messages.contacts.profile.ActContactAvatars) r1
            iq1 r0 = r1.g1
            defpackage.cqc.b(r0)
            s5 r0 = new s5
            r2 = 0
            r0.<init>(r1, r7, r2)
            y7g r2 = r1.K0
            java.lang.Object r2 = r2.b
            ed3 r2 = (defpackage.ed3) r2
            y8a r2 = (defpackage.y8a) r2
            hle r2 = r2.q()
            jle r2 = (defpackage.jle) r2
            ztc r2 = r2.a()
            s5 r3 = new s5
            r4 = 1
            r3.<init>(r1, r7, r4)
            xw0 r7 = new xw0
            r8 = 12
            r7.<init>(r8)
            y7g r8 = r1.K0
            java.lang.Object r8 = r8.b
            ed3 r8 = (defpackage.ed3) r8
            y8a r8 = (defpackage.y8a) r8
            hle r8 = r8.q()
            jle r8 = (defpackage.jle) r8
            ztc r8 = r8.b()
            iq1 r7 = defpackage.cqc.a(r0, r2, r3, r7, r8)
            r1.g1 = r7
        L_0x014c:
            r7 = 1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.contacts.profile.FrgContactAvatar.G0(android.view.MenuItem):boolean");
    }

    public final void L0(Bundle bundle) {
        super.L0(bundle);
        bundle.putLong("ru.ok.tamtam.extra.DOWNLOAD_REQ_ID", this.G1);
        bundle.putLong("ru.ok.tamtam.extra.EXTRA_DOWNLOAD_AS_BG_REQ_ID", this.H1);
        bundle.putBoolean("ru.ok.tamtam.extra.IMAGE_LOAD_FAILED", this.I1);
    }

    public final String f1() {
        return null;
    }

    public final void l1(int i, int i2, Intent intent) {
    }

    public final void m1(q5 q5Var) {
        super.m1(q5Var);
        if (!(q5Var instanceof s46)) {
            throw new RuntimeException("Activity used with FrgContactAvatar must implement FrgContactAvatar.Listener interface");
        }
    }

    @uae
    public void onEvent(fn4 fn4) {
        long j = this.G1;
        long j2 = fn4.a;
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        HashSet hashSet = this.s1;
        String str = fn4.c;
        if (i == 0) {
            if (this.o1) {
                hm9.d0(b0(), new File(str), ((y8a) ((ed3) this.p1.b)).h());
                j1();
                return;
            }
            tu0.A(hashSet, fn4, true);
        } else if (this.H1 == j2 && !TextUtils.isEmpty(str)) {
            if (this.o1) {
                j1();
                new mzd(((y8a) ((ed3) this.p1.b)).h(), ((y8a) ((ed3) this.p1.b)).f(), ((y8a) ((ed3) this.p1.b)).n().b).a(this, str);
                return;
            }
            tu0.A(hashSet, fn4, true);
        }
    }

    public final void v0(Bundle bundle) {
        super.v0(bundle);
        this.C1 = this.Z.getStringArrayList("ru.ok.tamtam.extra.AVATAR_URL");
        this.D1 = Long.valueOf(this.Z.getLong("ru.ok.tamtam.extra.AVATAR_ID"));
        this.E1 = this.Z.getBoolean("ru.ok.tamtam.extra.DELETE_OPTION");
        this.F1 = this.Z.getBoolean("ru.ok.tamtam.extra.MAKE_MAIN_OPTION");
        if (bundle != null) {
            this.G1 = bundle.getLong("ru.ok.tamtam.extra.DOWNLOAD_REQ_ID");
            this.H1 = bundle.getLong("ru.ok.tamtam.extra.EXTRA_DOWNLOAD_AS_BG_REQ_ID");
            this.I1 = bundle.getBoolean("ru.ok.tamtam.extra.IMAGE_LOAD_FAILED");
        }
    }

    public final void w0(Menu menu, MenuInflater menuInflater) {
        ActContactAvatars actContactAvatars;
        int i;
        AbstractMap.SimpleEntry simpleEntry;
        long longValue = this.D1.longValue();
        q5 g1 = g1();
        ai3 ai3 = null;
        s46 s46 = g1 instanceof s46 ? (s46) g1 : null;
        long j = -1;
        if (s46 != null && (i = actContactAvatars.d1) >= 0) {
            ArrayList arrayList = (actContactAvatars = (ActContactAvatars) s46).a1;
            if (!(i >= arrayList.size() || (simpleEntry = (AbstractMap.SimpleEntry) arrayList.get(actContactAvatars.d1)) == null || simpleEntry.getValue() == null)) {
                j = ((Long) simpleEntry.getValue()).longValue();
            }
        }
        if (longValue == j) {
            menu.clear();
            menuInflater.inflate(azb.menu_avatar_photo, menu);
            b b0 = b0();
            if (b0 instanceof nwe) {
                ai3 = ((nwe) b0).a();
            }
            if (ai3 != null) {
                MenuItem e = ai3.e(xxb.menu_avatar_photo__make_main);
                boolean z = false;
                if (e != null) {
                    e.setVisible(this.E1 && this.F1 && this.D1.longValue() != 0);
                }
                MenuItem e2 = ai3.e(xxb.menu_avatar_photo__delete);
                if (e2 != null) {
                    if (this.E1 && this.D1.longValue() != 0) {
                        z = true;
                    }
                    e2.setVisible(z);
                }
            }
        }
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        SlideOutLayout slideOutLayout = (SlideOutLayout) layoutInflater.inflate(yyb.frg_profile_photo, viewGroup, false);
        ZoomableDraweeView zoomableDraweeView = (ZoomableDraweeView) slideOutLayout.findViewById(xxb.frg_profile_photo__iv_photo);
        ma6 ma6 = new ma6(g0());
        ma6.l = ssc.o;
        ma6.j = new r20(d0(), 0);
        Context d0 = d0();
        int i = gpc.w;
        ma6.f = ngg.u(i, -1, d0);
        ma6.h = ngg.u(i, -1, d0());
        ma6.b = 0;
        zoomableDraweeView.setHierarchy(ma6.a());
        zoomableDraweeView.setZoomEnabled(true);
        zoomableDraweeView.setOnTouchListener(new q46(new GestureDetector(d0(), new q00(9, this)), 0));
        zoomableDraweeView.setListener(new u00((Object) this, (Object) zoomableDraweeView, (Object) slideOutLayout, 11));
        e2b a = s36.a.get();
        ArrayList<String> arrayList = this.C1;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : arrayList) {
            try {
                iv6 o = s36.o();
                wv6 b = wv6.b(str);
                o.getClass();
                arrayList2.add(new hv6(o, b, str));
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }
        a.g = new rz6(arrayList2, false);
        a.i = true;
        a.l = zoomableDraweeView.getController();
        zoomableDraweeView.setController(a.a());
        slideOutLayout.setSlideOutListener(this);
        Y0(true);
        b b0 = b0();
        ai3 a2 = b0 instanceof nwe ? ((nwe) b0).a() : null;
        if (a2 != null) {
            a2.h();
        }
        return slideOutLayout;
    }

    @uae
    public void onEvent(hn4 hn4) {
        long j = this.G1;
        long j2 = hn4.a;
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        HashSet hashSet = this.s1;
        if (i == 0) {
            if (this.o1) {
                j1();
                a14.N(0, d0(), h0(jpc.W2));
                return;
            }
            tu0.A(hashSet, hn4, true);
        } else if (this.H1 != j2) {
        } else {
            if (this.o1) {
                j1();
                a14.K(d0(), jpc.P2);
                return;
            }
            tu0.A(hashSet, hn4, false);
        }
    }
}
