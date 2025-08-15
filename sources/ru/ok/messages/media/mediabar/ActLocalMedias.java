package ru.ok.messages.media.mediabar;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.transition.TransitionSet;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.io.File;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import ru.ok.messages.media.crop.ActTamCropImage;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerDialogFragment;

public class ActLocalMedias extends r5 implements b56, y46, nwe, r48, View.OnSystemUiVisibilityChangeListener, gd7, n4d, l4d, tj9, xe8, y38 {
    public static final /* synthetic */ int s1 = 0;
    public final ArrayList V0 = new ArrayList();
    public int W0 = 0;
    public String X0;
    public rp7 Y0;
    public vd8 Z0;
    public boolean a1 = true;
    public boolean b1 = true;
    public ViewPager2 c1;
    public ai3 d1;
    public View e1;
    public MediaBarPreviewLayout f1;
    public id7 g1;
    public zl4 h1;
    public zj9 i1;
    public dl9 j1;
    public we8 k1;
    public we8 l1;
    public Toast m1;
    public boolean n1 = true;
    public cl8 o1;
    public n3 p1 = null;
    public final khe q1 = new khe(new x5(0, this));
    public final y5 r1 = new y5(this, 0);

    public final void B1(Set set) {
        t0();
    }

    public final String Z() {
        return "LOCAL_MEDIA_VIEWER";
    }

    public final ai3 a() {
        return this.d1;
    }

    public final we8 b() {
        if (this.k1 == null) {
            this.k1 = ((y8a) ((ed3) this.K0.b)).k().n(ze8.c, new x50(true, false, false));
        }
        return this.k1;
    }

    public final void c(boolean z, boolean z2, boolean z3) {
        this.a1 = z;
        zl4 zl4 = this.h1;
        if (zl4 != null && !zl4.h()) {
            this.h1.g();
            this.h1 = null;
        }
        if (!z) {
            v0(z3);
            ju0.v(this);
            this.h1 = nd7.R(new u5(this, 4), 100);
        } else if (!this.b1) {
            g0(this);
            getWindow().getDecorView().post(new u5(this, 3));
            if (eae.k0(Build.BRAND, "meizu", true)) {
                v0(z3);
            }
        } else {
            v0(z3);
        }
    }

    public final void c0(int i, int i2, Intent intent) {
        x3c x3c;
        x3c x3c2;
        ArrayList arrayList = this.V0;
        if (!arrayList.isEmpty()) {
            up7 up7 = (up7) arrayList.get(this.W0);
            if (i == 1) {
                if (i2 == -1) {
                    long longExtra = intent.getLongExtra("ru.ok.tamtam.extra.START_POSITION", 0);
                    long longExtra2 = intent.getLongExtra("ru.ok.tamtam.extra.END_POSITION", 0);
                    String stringExtra = intent.getStringExtra("ru.ok.tamtam.extra.THUMBNAIL_URI");
                    zj9 zj9 = this.i1;
                    i20 a = zj9.t0.a();
                    float f = (float) zj9.s0;
                    a.b = ((float) longExtra) / f;
                    a.c = ((float) longExtra2) / f;
                    zj9.t0 = new ref(a);
                    zj9.c2();
                    up7 up72 = zj9.X;
                    p4d p4d = zj9.w0;
                    p4d.a(up72, p4d.a.size());
                    r4d h = p4d.h(up72);
                    if (h != null) {
                        h.d = stringExtra;
                        for (l4d j : p4d.g) {
                            j.j(h);
                        }
                    }
                    if (up7 != null) {
                        FrgLocalMedia F = this.Z0.F(up7.b);
                        if (F instanceof FrgLocalVideo) {
                            ((FrgLocalVideo) F).v1();
                        }
                        this.p1 = new t22(up7, stringExtra);
                    }
                }
            } else if (i == 2) {
                if (i2 == -1) {
                    Uri uri = (Uri) intent.getParcelableExtra("ru.ok.tamtam.extra.RESULT_URI");
                    nz3 nz3 = (nz3) intent.getParcelableExtra("ru.ok.tamtam.extra.CROP_STATE");
                    if (uri != null) {
                        zj9 zj92 = this.i1;
                        awa awa = zj92.u0;
                        if (awa != null) {
                            x3c2 = new x3c(4);
                            x3c2.b = awa.a;
                            x3c2.c = awa.b;
                            x3c2.o = awa.c;
                            x3c2.X = awa.o;
                            x3c2.Y = awa.X;
                        } else {
                            x3c2 = new x3c(4);
                        }
                        if (awa == null || awa.X == null) {
                            x3c2.o = nz3;
                        } else {
                            x3c2.Y = null;
                            x3c2.o = null;
                        }
                        x3c2.c = uri;
                        if (nz3 == null) {
                            x3c2.c = null;
                        }
                        zj92.u0 = new awa((Uri) x3c2.b, (Uri) x3c2.c, (nz3) x3c2.o, (ov4) x3c2.X, (Uri) x3c2.Y);
                        zj92.b2();
                        up7 up73 = zj92.X;
                        p4d p4d2 = zj92.w0;
                        boolean j2 = p4d2.j(up73);
                        boolean z = zj92.A0;
                        if (!j2 && z) {
                            zj92.a2();
                        }
                        if (p4d2.j(zj92.X) && !z) {
                            zj92.a2();
                        }
                        zj92.d2(new uj9(zj92, 4));
                        zj92.d2(new uj9(zj92, 3));
                        up7 up74 = (up7) arrayList.get(this.W0);
                        if (up74 != null) {
                            this.p1 = new r22(up74, uri);
                        }
                    } else {
                        hm9.q("ru.ok.messages.media.mediabar.ActLocalMedias", "crop", new Exception("no crop result data").getMessage());
                        a14.N(1, this, getString(jpc.i));
                        finish();
                    }
                }
            } else if (i == 3 && i2 == -1) {
                Uri uri2 = (Uri) intent.getParcelableExtra("photo_editor:result_uri");
                ov4 ov4 = (ov4) intent.getParcelableExtra("photo_editor:editor_state");
                zj9 zj93 = this.i1;
                awa awa2 = zj93.u0;
                if (awa2 != null) {
                    x3c = new x3c(4);
                    x3c.b = awa2.a;
                    x3c.c = awa2.b;
                    x3c.o = awa2.c;
                    x3c.X = awa2.o;
                    x3c.Y = awa2.X;
                } else {
                    x3c = new x3c(4);
                }
                x3c.Y = uri2;
                x3c.X = ov4;
                zj93.u0 = new awa((Uri) x3c.b, (Uri) x3c.c, (nz3) x3c.o, ov4, uri2);
                zj93.b2();
                zj93.d2(new uj9(zj93, 0));
                if (up7 != null) {
                    this.p1 = new s22(up7, uri2);
                }
            }
            t0();
        }
    }

    public final void d0() {
        Intent intent = getIntent();
        if (intent != null && !intent.getBooleanExtra("ru.ok.tamtam.extra.PROFILE_CREATION", false)) {
            super.d0();
        }
    }

    public final void e() {
        c(!this.a1, true, false);
    }

    public final boolean f() {
        return this.a1;
    }

    public final void finish() {
        ((y8a) ((ed3) this.K0.b)).m().f(wuc.CHAT_ATTACH_PICKER, spa.f);
        p4d p4d = m0().f;
        p4d.getClass();
        Iterator it = new ArrayList(p4d.a).iterator();
        while (it.hasNext()) {
            ((r4d) it.next()).e = false;
        }
        MediaBarPreviewLayout mediaBarPreviewLayout = this.f1;
        Pair<Integer, Integer> scrollPosition = mediaBarPreviewLayout != null ? mediaBarPreviewLayout.getScrollPosition() : new Pair<>(0, 0);
        Intent intent = new Intent();
        intent.putExtra("ru.ok.tamtam.extra.PREVIEW_LAYOUT_SCROLL_POSITION", (Serializable) scrollPosition.first);
        intent.putExtra("ru.ok.tamtam.extra.PREVIEW_LAYOUT_SCROLL_OFFSET", (Serializable) scrollPosition.second);
        intent.putExtra("ru.ok.tamtam.extra.EXTRA_CHANGE_LOCAL_MEDIA_RESULT", this.p1);
        setResult(0, intent);
        super.finish();
    }

    public final we8 i() {
        if (this.l1 == null) {
            this.l1 = ((y8a) ((ed3) this.K0.b)).k().n(ze8.a, new x50(false, true, true));
        }
        return this.l1;
    }

    public final void j(r4d r4d) {
        t0();
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0028 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final ru.ok.messages.media.mediabar.FrgLocalMedia k0() {
        /*
            r4 = this;
            androidx.viewpager2.widget.ViewPager2 r0 = r4.c1
            r1 = 0
            if (r0 != 0) goto L_0x0007
        L_0x0005:
            r0 = r1
            goto L_0x001d
        L_0x0007:
            int r0 = r0.getCurrentItem()
            if (r0 < 0) goto L_0x0005
            java.util.ArrayList r2 = r4.V0
            int r3 = r2.size()
            int r3 = r3 + -1
            if (r0 > r3) goto L_0x0005
            java.lang.Object r0 = r2.get(r0)
            up7 r0 = (defpackage.up7) r0
        L_0x001d:
            if (r0 == 0) goto L_0x0028
            vd8 r4 = r4.Z0
            long r0 = r0.b
            ru.ok.messages.media.mediabar.FrgLocalMedia r4 = r4.F(r0)
            return r4
        L_0x0028:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.media.mediabar.ActLocalMedias.k0():ru.ok.messages.media.mediabar.FrgLocalMedia");
    }

    public final void l0() {
        hm9.m("ru.ok.messages.media.mediabar.ActLocalMedias", "endTransition: onStart", new Object[0]);
        if (this.f1.getVisibility() != 0) {
            hm9.m("ru.ok.messages.media.mediabar.ActLocalMedias", "endTransition: bottom visible", new Object[0]);
            if (this.Y0.a) {
                MediaBarPreviewLayout mediaBarPreviewLayout = this.f1;
                mediaBarPreviewLayout.V0.p();
                mediaBarPreviewLayout.setTranslationY(0.0f);
                mediaBarPreviewLayout.setVisibility(0);
            }
            r0();
        }
        if (((Toolbar) this.d1.b).getVisibility() != 0) {
            hm9.m("ru.ok.messages.media.mediabar.ActLocalMedias", "endTransition: top visible", new Object[0]);
            Toolbar toolbar = (Toolbar) this.d1.b;
            if (toolbar != null) {
                toolbar.setVisibility(0);
            }
        }
    }

    public final xp7 m0() {
        return ((y8a) ((ed3) this.K0.b)).j();
    }

    public final void n0() {
        ArrayList arrayList = this.V0;
        if (arrayList.size() != 0) {
            int max = Math.max(this.W0, 0);
            this.W0 = max;
            if (max >= arrayList.size()) {
                this.W0 = arrayList.size() - 1;
            }
            this.i1.Z1((up7) arrayList.get(this.W0));
        }
    }

    public final void o0() {
        int ordinal = ((kl2) this.q1.getValue()).ordinal();
        if (ordinal == 0) {
            q0((ng4) null);
        } else if (ordinal == 1) {
            ScheduledSendPickerDialogFragment.p1("ru.ok.messages.media.mediabar.ActLocalMedias", S(), this, new v5(0, this));
            ScheduledSendPickerDialogFragment.q1("ru.ok.messages.media.mediabar.ActLocalMedias", S());
        }
    }

    public final void onBackPressed() {
        if (!this.Y0.u0) {
            p4d p4d = m0().f;
            p4d.a.clear();
            p4d.n();
            p4d.b.clear();
            if (((jp) p4d.h).g.getBoolean("app.send.media.as.collage", true)) {
                p4d.l = 3;
            } else {
                p4d.l = 1;
            }
        }
        super.onBackPressed();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        Toolbar toolbar;
        super.onConfigurationChanged(configuration);
        ai3 ai3 = this.d1;
        if (!(ai3 == null || (toolbar = (Toolbar) ai3.b) == null)) {
            y7g y7g = (y7g) ai3.a;
            if (y7g.y() != null) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = fk4.a(y7g.y());
                toolbar.setLayoutParams(layoutParams);
            }
        }
        r0();
        id7 id7 = this.g1;
        id7.getClass();
        int i = configuration.orientation;
        if (i != id7.c) {
            id7.c = i;
            id7.b.o = 0;
        }
        nd7.R(new u5(this, 0), 300);
    }

    public final void onCreate(Bundle bundle) {
        Bundle bundle2 = bundle;
        super.onCreate(bundle);
        getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
        this.k1 = b();
        this.l1 = i();
        if (bundle2 != null) {
            bq7 bq7 = (bq7) this.k1;
            bq7.h = bundle2.getFloat(bq7.b("MediaPlayerController.Volume"));
            bq7.i = bundle2.getBoolean(bq7.b("MediaPlayerController.Looping"));
            bq7.j = bundle2.getBoolean(bq7.b("MediaPlayerController.PlayWhenReady"));
            bq7 bq72 = (bq7) this.l1;
            bq72.h = bundle2.getFloat(bq72.b("MediaPlayerController.Volume"));
            bq72.i = bundle2.getBoolean(bq72.b("MediaPlayerController.Looping"));
            bq72.j = bundle2.getBoolean(bq72.b("MediaPlayerController.PlayWhenReady"));
        }
        this.d1 = j0(yyb.act_local_medias);
        if (!wmd.l(this)) {
            finish();
            return;
        }
        id7 id7 = new id7(getWindow().getDecorView(), this);
        this.g1 = id7;
        this.a.a(id7);
        this.Y0 = (rp7) getIntent().getParcelableExtra("ru.ok.tamtam.extra.OPTIONS");
        f0(u().L);
        ai3 ai3 = this.d1;
        c5 c5Var = new c5(2, (Object) this);
        Toolbar toolbar = (Toolbar) ai3.b;
        if (toolbar != null) {
            toolbar.setNavigationOnClickListener(c5Var);
        }
        ai3 ai32 = this.d1;
        int i = gpc.k;
        int i2 = ((sme) ai32.c).w;
        Toolbar toolbar2 = (Toolbar) ai32.b;
        if (toolbar2 != null) {
            toolbar2.setNavigationIcon(i);
            Drawable navigationIcon = toolbar2.getNavigationIcon();
            if (navigationIcon != null) {
                ngg.G(navigationIcon, i2);
            }
        }
        ai3 ai33 = this.d1;
        int i3 = this.o1.w;
        Drawable navigationIcon2 = ((Toolbar) ai33.b).getNavigationIcon();
        if (navigationIcon2 != null) {
            ngg.G(navigationIcon2, i3);
        }
        ai3 ai34 = this.d1;
        int i4 = this.o1.N;
        Toolbar toolbar3 = (Toolbar) ai34.b;
        if (toolbar3 != null) {
            toolbar3.setBackgroundColor(i4);
        }
        ai3 ai35 = this.d1;
        int i5 = this.o1.F;
        TextView textView = (TextView) ai35.o;
        if (textView != null) {
            textView.setTextColor(i5);
        }
        ai3 ai36 = this.d1;
        int i6 = ((bk4) this.K0.c).a;
        Toolbar toolbar4 = (Toolbar) ai36.b;
        if (toolbar4 != null) {
            WeakHashMap weakHashMap = zmf.a;
            omf.s(toolbar4, (float) i6);
        }
        rp7 rp7 = this.Y0;
        this.X0 = rp7.X;
        if (bundle2 == null) {
            this.W0 = rp7.Z;
        } else {
            this.W0 = bundle2.getInt("ru.ok.tamtam.extra.SELECTED_POS", 0);
            this.a1 = bundle2.getBoolean("ru.ok.tamtam.extra.UI_VISIBILITY", true);
        }
        ArrayList arrayList = this.V0;
        arrayList.addAll(m0().a(this.X0));
        MediaBarPreviewLayout mediaBarPreviewLayout = (MediaBarPreviewLayout) findViewById(xxb.act_local_medias__preview);
        this.f1 = mediaBarPreviewLayout;
        mediaBarPreviewLayout.setShouldApplyHighlight(tpa.f(this.X0, "SELECTED_MEDIA_ALBUM"));
        this.f1.setMessageEdit(this.Y0.b);
        this.f1.setFullScreen(true);
        this.f1.setListener(this);
        this.f1.J0.setVisibility(8);
        this.f1.setChatMode((kl2) this.q1.getValue());
        MediaBarPreviewLayout mediaBarPreviewLayout2 = this.f1;
        ((y8a) ((ed3) this.K0.b)).n().b.getClass();
        mediaBarPreviewLayout2.setAnimojisEnabled(fp3.t(3, Collections.emptySet()));
        if (!this.Y0.a) {
            this.f1.setVisibility(8);
        }
        View findViewById = findViewById(xxb.act_local_medias__fl_root);
        this.j1 = new dl9(findViewById.getContext(), (ViewStub) findViewById.findViewById(xxb.act_local_medias__vs_toolbox), ((y8a) ((ed3) this.K0.b)).c());
        dl9 dl9 = this.j1;
        rp7 rp72 = this.Y0;
        boolean z = rp72.a;
        y8a y8a = (y8a) ((ed3) this.K0.b);
        ad b = y8a.b();
        p4d p4d = y8a.j().f;
        kk5 h = y8a.h();
        bn0 bn0 = new bn0(this, 1);
        o45 g = y8a.g();
        xdf q = y8a.n().c.q();
        zj9 zj9 = r0;
        zj9 zj92 = new zj9(dl9, this, z, rp72.c, b, p4d, h, bn0, g, q);
        this.i1 = zj9;
        this.e1 = findViewById(xxb.act_local_medias__vs_toolbox);
        t0();
        n0();
        this.c1 = (ViewPager2) findViewById(xxb.act_local_medias__view_pager);
        this.Z0 = new vd8(this, arrayList, this.Y0);
        this.c1.b(this.r1);
        this.c1.setOffscreenPageLimit(2);
        this.c1.setAdapter(this.Z0);
        if (oag.d(this.X0, "SELECTED_MEDIA_ALBUM")) {
            this.c1.b(new y5(this, 1));
            r4d i7 = m0().f.i(this.W0);
            if (i7 != null) {
                i7.e = true;
            }
        }
        this.c1.e(this.W0, false);
        u0(this.W0);
        t0();
        MediaBarPreviewLayout mediaBarPreviewLayout3 = this.f1;
        rp7 rp73 = this.Y0;
        int i8 = rp73.v0;
        RecyclerView recyclerView = mediaBarPreviewLayout3.K0;
        if (recyclerView.getLayoutManager() instanceof LinearLayoutManager) {
            ((LinearLayoutManager) recyclerView.getLayoutManager()).n1(i8, rp73.w0);
        }
        if (getIntent().getBooleanExtra("ru.ok.tamtam.extra.WITH_TRANSITION", false)) {
            Toolbar toolbar5 = (Toolbar) this.d1.b;
            if (toolbar5 != null) {
                toolbar5.setVisibility(4);
            }
            ssc ssc = ssc.l;
            ssc ssc2 = ssc.o;
            TransitionSet b2 = tq4.b(ssc, ssc2);
            Rect rect = this.Y0.s0;
            if (rect != null) {
                b2.addTransition(new w33(rect, true));
            }
            b2.addTransition(new tq4(ssc, ssc2));
            setEnterSharedElementCallback(new z5(this, rect));
            b2.addListener(new a6(0, this));
            b2.setDuration(((y8a) ((ed3) this.K0.b)).c().a.b());
            getWindow().setSharedElementEnterTransition(b2);
            postponeEnterTransition();
            ViewPager2 viewPager2 = this.c1;
            u5 u5Var = new u5(this, 1);
            ViewTreeObserver viewTreeObserver = viewPager2.getViewTreeObserver();
            viewTreeObserver.addOnPreDrawListener(new xpf(viewTreeObserver, u5Var));
            TransitionSet b3 = tq4.b(ssc2, ssc);
            if (rect != null) {
                b3.addTransition(new w33(rect, false));
            }
            b3.setDuration(((y8a) ((ed3) this.K0.b)).c().a.b());
            getWindow().setSharedElementReturnTransition(b3);
        } else {
            l0();
        }
        g0((View.OnSystemUiVisibilityChangeListener) null);
    }

    public final void onDestroy() {
        super.onDestroy();
        if (this.k1 != null) {
            ((y8a) ((ed3) this.K0.b)).k().r(this.k1);
        }
        if (this.l1 != null) {
            ((y8a) ((ed3) this.K0.b)).k().r(this.l1);
        }
        ViewPager2 viewPager2 = this.c1;
        if (viewPager2 != null) {
            viewPager2.g(this.r1);
        }
        Toast toast = this.m1;
        if (toast != null) {
            toast.cancel();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a3, code lost:
        if (r10 != -1) goto L_0x00a5;
     */
    @defpackage.uae
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onEvent(defpackage.yp7 r10) {
        /*
            r9 = this;
            java.lang.String r0 = r10.b
            java.lang.String r1 = r9.X0
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b4
            boolean r0 = r9.P0
            r1 = 1
            if (r0 != 0) goto L_0x0015
            java.util.HashSet r9 = r9.Q0
            defpackage.tu0.A(r9, r10, r1)
            return
        L_0x0015:
            xp7 r10 = r9.m0()
            java.lang.String r0 = r9.X0
            java.util.List r10 = r10.a(r0)
            int r0 = r10.size()
            if (r0 != 0) goto L_0x0029
            r9.finish()
            return
        L_0x0029:
            java.util.ArrayList r0 = r9.V0
            int r2 = r0.size()
            int r3 = r10.size()
            if (r3 != r2) goto L_0x0036
            return
        L_0x0036:
            r9.t0()
            int r2 = r9.W0
            int r3 = r0.size()
            if (r2 < r3) goto L_0x0043
            goto L_0x00b4
        L_0x0043:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r0)
            r0.clear()
            r0.addAll(r10)
            vd8 r3 = new vd8
            rp7 r4 = r9.Y0
            r3.<init>(r9, r0, r4)
            r9.Z0 = r3
            androidx.viewpager2.widget.ViewPager2 r0 = r9.c1
            r0.setAdapter(r3)
            int r0 = r9.W0
            int r3 = r10.size()
            if (r0 < r3) goto L_0x006a
            int r10 = r10.size()
            int r10 = r10 - r1
            goto L_0x00a5
        L_0x006a:
            int r3 = r2.size()
            int r3 = r3 + r1
            int r4 = r10.size()
            if (r3 != r4) goto L_0x0078
            int r10 = r0 + 1
            goto L_0x00a5
        L_0x0078:
            java.lang.Object r0 = defpackage.x53.j0(r0, r2)
            up7 r0 = (defpackage.up7) r0
            r1 = 0
            if (r0 != 0) goto L_0x0083
        L_0x0081:
            r10 = r1
            goto L_0x00a5
        L_0x0083:
            java.util.Iterator r10 = r10.iterator()
            r2 = r1
        L_0x0088:
            boolean r3 = r10.hasNext()
            r4 = -1
            if (r3 == 0) goto L_0x00a2
            java.lang.Object r3 = r10.next()
            up7 r3 = (defpackage.up7) r3
            long r5 = r3.b
            long r7 = r0.b
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 != 0) goto L_0x009f
            r10 = r2
            goto L_0x00a3
        L_0x009f:
            int r2 = r2 + 1
            goto L_0x0088
        L_0x00a2:
            r10 = r4
        L_0x00a3:
            if (r10 == r4) goto L_0x0081
        L_0x00a5:
            r9.W0 = r10
            androidx.viewpager2.widget.ViewPager2 r0 = r9.c1
            r0.setCurrentItem(r10)
            r9.n0()
            int r10 = r9.W0
            r9.u0(r10)
        L_0x00b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.media.mediabar.ActLocalMedias.onEvent(yp7):void");
    }

    public final void onPause() {
        super.onPause();
        if (this.k1 != null) {
            ((y8a) ((ed3) this.K0.b)).k().o(this.k1);
        }
        if (this.l1 != null) {
            ((y8a) ((ed3) this.K0.b)).k().o(this.l1);
        }
    }

    public final void onResume() {
        up7 up7;
        super.onResume();
        ((y8a) ((ed3) this.K0.b)).m().f(wuc.CHAT_ATTACH_PICKER_MEDIA_VIEWER, spa.f);
        r0();
        if (this.k1 != null) {
            ((y8a) ((ed3) this.K0.b)).k().l(this.k1);
        }
        if (this.l1 != null) {
            ((y8a) ((ed3) this.K0.b)).k().l(this.l1);
        }
        if (!this.n1) {
            c(this.a1, false, false);
        }
        this.n1 = false;
        ArrayList arrayList = this.V0;
        if (arrayList.size() != 0 && (up7 = (up7) arrayList.get(this.W0)) != null) {
            FrgLocalMedia F = this.Z0.F(up7.b);
            if (F instanceof FrgLocalVideo) {
                ((FrgLocalVideo) F).v1();
            }
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("ru.ok.tamtam.extra.SELECTED_POS", this.W0);
        bundle.putBoolean("ru.ok.tamtam.extra.UI_VISIBILITY", this.a1);
        we8 we8 = this.k1;
        if (we8 != null) {
            bq7 bq7 = (bq7) we8;
            bundle.putFloat(bq7.b("MediaPlayerController.Volume"), bq7.h);
            bundle.putBoolean(bq7.b("MediaPlayerController.Looping"), bq7.i);
            bundle.putBoolean(bq7.b("MediaPlayerController.PlayWhenReady"), bq7.j);
        }
        we8 we82 = this.l1;
        if (we82 != null) {
            bq7 bq72 = (bq7) we82;
            bundle.putFloat(bq72.b("MediaPlayerController.Volume"), bq72.h);
            bundle.putBoolean(bq72.b("MediaPlayerController.Looping"), bq72.i);
            bundle.putBoolean(bq72.b("MediaPlayerController.PlayWhenReady"), bq72.j);
        }
    }

    public final void onStart() {
        super.onStart();
        p4d p4d = m0().f;
        p4d.c.add(this);
        p4d.g.add(this);
        zj9 zj9 = this.i1;
        up7 up7 = zj9.X;
        if (up7 != null) {
            zj9.Z1(up7);
        }
        p4d p4d2 = zj9.w0;
        p4d2.c.add(zj9);
        p4d2.d.add(zj9);
        p4d2.f.add(zj9);
    }

    public final void onStop() {
        super.onStop();
        p4d p4d = m0().f;
        p4d.c.remove(this);
        p4d.g.remove(this);
        zj9 zj9 = this.i1;
        p4d p4d2 = zj9.w0;
        p4d2.c.remove(zj9);
        p4d2.d.remove(zj9);
        p4d2.f.remove(zj9);
        cqc.b(zj9.C0);
        cqc.b((zl4) null);
    }

    public final void onSystemUiVisibilityChange(int i) {
        boolean z = i == 0 || i == 2;
        this.b1 = z;
        if (this.a1 && z) {
            this.h1 = nd7.R(new u5(this, 2), 100);
        }
    }

    public final void p0(boolean z, boolean z2) {
        if (z) {
            ((bq7) this.k1).t(1.0f);
            if (z2) {
                int i = jpc.K2;
                Toast toast = this.m1;
                if (toast != null) {
                    toast.cancel();
                }
                Toast makeText = Toast.makeText(this, i, 0);
                this.m1 = makeText;
                makeText.show();
                return;
            }
            return;
        }
        ((bq7) this.k1).v();
        if (z2) {
            int i2 = jpc.I2;
            Toast toast2 = this.m1;
            if (toast2 != null) {
                toast2.cancel();
            }
            Toast makeText2 = Toast.makeText(this, i2, 0);
            this.m1 = makeText2;
            makeText2.show();
        }
    }

    public final void q0(ng4 ng4) {
        ArrayList arrayList = this.V0;
        if (!arrayList.isEmpty()) {
            if (m0().f.b() == 0 && !this.Y0.b && k0() != null) {
                this.i1.a2();
            }
            Intent intent = new Intent();
            intent.putExtra("act:local_medias:send_result", (Parcelable) arrayList.get(this.W0));
            intent.putExtra("act:local_medias:delayed_attrs", ng4);
            setResult(-1, intent);
            if (this.Y0.a) {
                p4d p4d = m0().f;
                p4d.getClass();
                Iterator it = new ArrayList(p4d.a).iterator();
                while (it.hasNext()) {
                    ((r4d) it.next()).e = false;
                }
                super.finish();
                return;
            }
            Y();
        }
    }

    public final void r0() {
        MediaBarPreviewLayout mediaBarPreviewLayout = this.f1;
        if (mediaBarPreviewLayout == null) {
            return;
        }
        if (this.Y0.a) {
            w5 w5Var = new w5(this, 0);
            WeakHashMap weakHashMap = zmf.a;
            omf.u(mediaBarPreviewLayout, w5Var);
            this.f1.post(new u5(this, 5));
            return;
        }
        View view = this.e1;
        w5 w5Var2 = new w5(this, 1);
        WeakHashMap weakHashMap2 = zmf.a;
        omf.u(view, w5Var2);
        this.f1.post(new u5(this, 6));
    }

    public final void s0(Uri uri, File file, nz3 nz3) {
        Uri fromFile = Uri.fromFile(file);
        Intent intent = new Intent(this, ActTamCropImage.class);
        intent.putExtra("ru.ok.tamtam.extra.SOURCE_URI", uri);
        intent.putExtra("ru.ok.tamtam.extra.RESULT_URI", fromFile);
        intent.putExtra("ru.ok.tamtam.extra.CROP_STATE", nz3);
        intent.putExtra("ru.ok.tamtam.extra.SAVE_AS_PNG", false);
        startActivityForResult(intent, 2);
    }

    public final void t0() {
        this.f1.A();
        r0();
    }

    public final sme u() {
        if (this.o1 == null) {
            this.o1 = cl8.e0;
        }
        return this.o1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0040, code lost:
        r5 = (defpackage.b86) r3.g.get(r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void u0(int r6) {
        /*
            r5 = this;
            ai3 r0 = r5.d1
            java.util.Locale r1 = java.util.Locale.getDefault()
            int r6 = r6 + 1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            int r2 = defpackage.dpc.B
            java.lang.String r2 = r5.getString(r2)
            java.lang.String r3 = r5.X0
            java.lang.String r4 = "SELECTED_MEDIA_ALBUM"
            boolean r3 = defpackage.tpa.f(r3, r4)
            if (r3 == 0) goto L_0x0025
            vd8 r5 = r5.Z0
            java.util.List r5 = r5.x0
            int r5 = r5.size()
            goto L_0x004d
        L_0x0025:
            xp7 r3 = r5.m0()
            java.lang.String r5 = r5.X0
            r3.getClass()
            boolean r4 = defpackage.tpa.f(r5, r4)
            if (r4 == 0) goto L_0x003b
            p4d r5 = r3.f
            int r5 = r5.b()
            goto L_0x004d
        L_0x003b:
            r4 = 0
            if (r5 != 0) goto L_0x0040
        L_0x003e:
            r5 = r4
            goto L_0x004d
        L_0x0040:
            java.util.Map r3 = r3.g
            java.lang.Object r5 = r3.get(r5)
            b86 r5 = (defpackage.b86) r5
            if (r5 != 0) goto L_0x004b
            goto L_0x003e
        L_0x004b:
            int r5 = r5.b
        L_0x004d:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r5 = new java.lang.Object[]{r6, r2, r5}
            java.lang.String r6 = "%d %s %d"
            java.lang.String r5 = java.lang.String.format(r1, r6, r5)
            r0.g(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.media.mediabar.ActLocalMedias.u0(int):void");
    }

    public final void v0(boolean z) {
        tg c = ((y8a) ((ed3) this.K0.b)).c();
        ai3 ai3 = this.d1;
        boolean z2 = this.a1;
        Toolbar toolbar = (Toolbar) ai3.b;
        if (toolbar != null) {
            if (z2) {
                c.i(toolbar);
            } else {
                c.g(toolbar);
            }
        }
        if (this.a1) {
            dl9 dl9 = (dl9) ((kk9) this.i1.b);
            vof a = zmf.a((View) dl9.c);
            cl9 cl9 = new cl9(dl9, 0);
            WeakReference weakReference = a.a;
            View view = (View) weakReference.get();
            if (view != null) {
                view.animate().withStartAction(cl9);
            }
            a.a(1.0f);
            cl9 cl92 = new cl9(dl9, 1);
            View view2 = (View) weakReference.get();
            if (view2 != null) {
                view2.animate().withEndAction(cl92);
            }
            a.c(dl9.o.a.b());
            View view3 = (View) weakReference.get();
            if (view3 != null) {
                view3.animate().start();
            }
        } else {
            dl9 dl92 = (dl9) ((kk9) this.i1.b);
            dl92.B((View) dl92.c, false);
        }
        if (this.Y0.a) {
            if (this.a1) {
                c.i(this.f1);
            } else {
                c.g(this.f1);
            }
        }
        vd8 vd8 = this.Z0;
        if (vd8 != null) {
            for (WeakReference weakReference2 : vd8.z0.values()) {
                FrgLocalMedia frgLocalMedia = (FrgLocalMedia) weakReference2.get();
                if (frgLocalMedia != null) {
                    frgLocalMedia.t1();
                }
            }
        }
    }
}
