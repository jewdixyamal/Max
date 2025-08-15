package ru.ok.messages.views.fragments;

import android.annotation.SuppressLint;
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
import android.widget.ImageView;
import androidx.fragment.app.b;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import one.me.sdk.zoom.ZoomableDraweeView;
import ru.ok.messages.views.dialogs.SaveToGalleryDialog;
import ru.ok.messages.views.widgets.SlideOutLayout;

public class FrgProfilePhoto extends FrgSlideOut {
    public ImageView C1;
    public ZoomableDraweeView D1;
    public e6 E1;
    public cu8 F1;
    public long G1;
    public boolean H1;
    public long I1;
    public long J1;

    public final boolean G0(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            if (g1() == null) {
                return true;
            }
            b0().finish();
            return true;
        } else if (itemId == xxb.menu_avatar_view__save_to_gallery) {
            if (g1() == null) {
                return true;
            }
            SaveToGalleryDialog.n1(this.E1.a, false).k1(this.F0, "ru.ok.messages.views.dialogs.SaveToGalleryDialog");
            return true;
        } else if (itemId != xxb.menu_avatar_view__share || g1() == null) {
            return true;
        } else {
            long o = ((p7b) ((k4a) this.q1.c()).y()).a.o();
            this.I1 = o;
            String str = this.E1.a;
            ((av6) ((y8a) ((ed3) this.p1.b)).getAccessor().c(av6.class)).a(str, new r46(o, str, new WeakReference(this), 1));
            return true;
        }
    }

    public final void L0(Bundle bundle) {
        super.L0(bundle);
        bundle.putLong("ru.ok.tamtam.extra.EXTRA_UPDATE_CONTROL_MSG", this.G1);
        bundle.putLong("ru.ok.tamtam.extra.EXTRA_DOWNLOAD_REQ_ID", this.I1);
        bundle.putLong("ru.ok.tamtam.extra.EXTRA_DOWNLOAD_AS_BG_REQ_ID", this.J1);
        if (this.H1) {
            bundle.putParcelable("ru.ok.tamtam.extra.EXTRA_CHANGED_CONTENT_HOLDER", this.E1);
        }
    }

    public final String f1() {
        return "AVATAR_PHOTO";
    }

    public final void l1(int i, int i2, Intent intent) {
    }

    @uae
    @SuppressLint({"CheckResult"})
    public void onEvent(l6f l6f) {
        cu8 cu8 = this.F1;
        if (cu8 != null) {
            long j = l6f.c;
            if (j != cu8.b) {
                return;
            }
            if (this.o1) {
                ((y8a) ((ed3) this.p1.b)).getClass();
                tp7 m = jyc.a.m();
                m.getClass();
                tp7.b(m, j, true, 2).i(((jle) ((y8a) ((ed3) this.p1.b)).q()).b()).m(((jle) ((y8a) ((ed3) this.p1.b)).q()).a()).k(new iq1(new a56(this), 2, new ig5(18)));
                return;
            }
            tu0.A(this.s1, l6f, true);
        }
    }

    public final void s1() {
        this.C1.setVisibility(4);
        b b0 = b0();
        ai3 a = b0 instanceof nwe ? ((nwe) b0).a() : null;
        if (a != null) {
            a.g(this.E1.c);
        }
        this.D1.setVisibility(0);
        this.D1.setListener(new a56(this));
        e2b a2 = s36.a.get();
        List<String> list = this.E1.b;
        ArrayList arrayList = new ArrayList(list.size());
        for (String str : list) {
            try {
                iv6 o = s36.o();
                wv6 b = wv6.b(str);
                o.getClass();
                arrayList.add(new hv6(o, b, str));
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }
        a2.g = new rz6(arrayList, true);
        a2.i = true;
        a2.l = this.D1.getController();
        this.D1.setController(a2.a());
    }

    public final void v0(Bundle bundle) {
        super.v0(bundle);
        if (bundle != null) {
            this.G1 = bundle.getLong("ru.ok.tamtam.extra.EXTRA_UPDATE_CONTROL_MSG");
            e6 e6Var = (e6) bundle.getParcelable("ru.ok.tamtam.extra.EXTRA_CHANGED_CONTENT_HOLDER");
            this.E1 = e6Var;
            if (e6Var != null) {
                this.H1 = true;
            }
            this.I1 = bundle.getLong("ru.ok.tamtam.extra.EXTRA_DOWNLOAD_REQ_ID");
            this.J1 = bundle.getLong("ru.ok.tamtam.extra.EXTRA_DOWNLOAD_AS_BG_REQ_ID");
        }
        if (!this.H1) {
            this.E1 = (e6) this.Z.getParcelable("ru.ok.tamtam.extra.CONTENT_HOLDER");
        }
        du8 du8 = (du8) this.Z.getParcelable("ru.ok.tamtam.extra.EXTRA_CONTROL_MSG_DB_PARC");
        if (du8 != null) {
            this.F1 = du8.a;
        }
    }

    public final void w0(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(azb.menu_avatar_view, menu);
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        SlideOutLayout slideOutLayout = (SlideOutLayout) layoutInflater.inflate(yyb.frg_profile_photo, viewGroup, false);
        ImageView imageView = (ImageView) slideOutLayout.findViewById(xxb.frg_profile_photo__progress);
        this.C1 = imageView;
        imageView.setImageDrawable(new r20(d0(), 0));
        ZoomableDraweeView zoomableDraweeView = (ZoomableDraweeView) slideOutLayout.findViewById(xxb.frg_profile_photo__iv_photo);
        this.D1 = zoomableDraweeView;
        ma6 ma6 = new ma6(g0());
        ma6.l = ssc.o;
        ma6.j = new r20(d0(), 0);
        Context d0 = d0();
        int i = gpc.w;
        ma6.f = ngg.u(i, -1, d0);
        ma6.h = ngg.u(i, -1, d0());
        ma6.b = 0;
        zoomableDraweeView.setHierarchy(ma6.a());
        this.D1.setZoomEnabled(true);
        this.D1.setOnTouchListener(new q46(new GestureDetector(d0(), new q00(10, this)), 1));
        s1();
        slideOutLayout.setSlideOutListener(this);
        Y0(true);
        return slideOutLayout;
    }

    @uae
    public void onEvent(oi0 oi0) {
        if (this.G1 != oi0.a) {
            return;
        }
        if (this.o1) {
            this.C1.setVisibility(4);
            this.D1.setVisibility(0);
            this.D1.setZoomEnabled(false);
            a14.N(1, b0(), h0(jpc.G));
            return;
        }
        tu0.A(this.s1, oi0, true);
    }

    @uae
    public void onEvent(fn4 fn4) {
        long j = this.I1;
        long j2 = fn4.a;
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        HashSet hashSet = this.s1;
        String str = fn4.c;
        if (i == 0) {
            if (this.o1) {
                j1();
                hm9.d0(b0(), new File(str), ((y8a) ((ed3) this.p1.b)).h());
                return;
            }
            tu0.A(hashSet, fn4, true);
        } else if (this.J1 == j2 && !TextUtils.isEmpty(str)) {
            if (this.o1) {
                j1();
                new mzd(((y8a) ((ed3) this.p1.b)).h(), ((y8a) ((ed3) this.p1.b)).f(), ((y8a) ((ed3) this.p1.b)).n().b).a(this, str);
                return;
            }
            tu0.A(hashSet, fn4, true);
        }
    }

    @uae
    public void onEvent(hn4 hn4) {
        long j = this.I1;
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
        } else if (this.J1 != j2) {
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
