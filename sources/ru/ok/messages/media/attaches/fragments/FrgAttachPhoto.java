package ru.ok.messages.media.attaches.fragments;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.upstream.FileDataSource$FileDataSourceException;
import java.io.File;
import java.util.ArrayList;
import ru.ok.messages.media.attaches.ActAttachesView;
import ru.ok.messages.media.attaches.AttachPhotoView;
import ru.ok.messages.views.dialogs.ProgressDialog;

public class FrgAttachPhoto extends FrgAttachView implements r00, ik9 {
    public FrameLayout I1;
    public AttachPhotoView J1;
    public qj9 K1;
    public int L1 = 0;
    public die M1;
    public int N1;

    public final void D1(int i) {
        ProgressDialog q1 = q1();
        if (q1 != null) {
            q1.F1 = new z16(2, this);
            die a = ((oz) ((y8a) vl.b()).getAccessor().c(oz.class)).a(this.D1);
            this.M1 = a;
            this.N1 = i;
            a.T(new g46(this, i, 0), new g46(this, i, 1));
        }
    }

    public final void E1(boolean z) {
        if (z) {
            au8 l = ((y8a) ((ed3) this.p1.b)).l();
            cu8 cu8 = this.C1.a;
            l20 l20 = this.D1;
            l.getClass();
            l.t(cu8, l20.r, new l01());
        } else if (r1() != null) {
            ((ActAttachesView) r1()).e();
        }
    }

    /* JADX WARNING: type inference failed for: r4v4, types: [one, java.lang.Object] */
    public final void F1(boolean z) {
        File file;
        if (this.D1.f()) {
            l20 l20 = this.D1;
            if (l20.b.X && !s5c.U(l20, this.C1)) {
                if (!TextUtils.isEmpty(this.D1.b.u0)) {
                    file = ((kk5) this.q1.j()).n(this.D1.b.u0);
                } else {
                    file = null;
                }
                if (file == null || !file.exists()) {
                    file = ((kk5) this.q1.j()).k(this.D1.b.s0);
                }
                if (this.D1.o.c() && file.exists()) {
                    hm9.m("ru.ok.messages.media.attaches.fragments.FrgAttachPhoto", "onGifPlayClicked: gif exists start play", new Object[0]);
                    G1();
                } else if ((z || ((ge2) this.q1.getAccessor().c(ge2.class)).b(true)) && !this.D1.o.d()) {
                    hm9.m("ru.ok.messages.media.attaches.fragments.FrgAttachPhoto", "onGifPlayClicked: gif not exists start download", new Object[0]);
                    this.q1.n().u(this.C1.a, this.D1.r, d20.X);
                    l20 l202 = this.D1;
                    long j = this.C1.a.b;
                    ? obj = new Object();
                    obj.a = j;
                    obj.b = l202.r;
                    x10 x10 = l202.b;
                    obj.e = x10.s0;
                    obj.g = x10.t0;
                    obj.h = true;
                    ((rf5) this.q1.getAccessor().c(rf5.class)).a(new pne(obj));
                } else {
                    hm9.m("ru.ok.messages.media.attaches.fragments.FrgAttachPhoto", "onGifPlayClicked: gif not exists, do nothing, autoload disabled or loading in progress", new Object[0]);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0057, code lost:
        if (r0.endsWith(".mp4") == false) goto L_0x005b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean G0(android.view.MenuItem r6) {
        /*
            r5 = this;
            int r6 = r6.getItemId()
            r0 = 16908332(0x102002c, float:2.3877352E-38)
            r1 = 1
            if (r6 != r0) goto L_0x0035
            ru.ok.messages.media.attaches.AttachPhotoView r6 = r5.J1
            jag r6 = r6.getZoomableController()
            r6.reset()
            boolean r6 = r5.F1
            if (r6 == 0) goto L_0x0030
            ru.ok.messages.media.attaches.AttachPhotoView r6 = r5.J1
            r6.setWrapContentMeasure(r1)
            q5 r5 = r5.g1()
            boolean r6 = r5 instanceof ru.ok.messages.media.attaches.ActAttachesView
            if (r6 == 0) goto L_0x0029
            r5.onBackPressed()
            goto L_0x0114
        L_0x0029:
            if (r5 == 0) goto L_0x0114
            defpackage.u7.a(r5)
            goto L_0x0114
        L_0x0030:
            r5.e1()
            goto L_0x0114
        L_0x0035:
            int r0 = defpackage.xxb.menu_attachments__save_to_gallery
            if (r6 != r0) goto L_0x0085
            q5 r6 = r5.g1()
            if (r6 == 0) goto L_0x0114
            l20 r6 = r5.D1
            java.lang.String r0 = r6.s
            x10 r6 = r6.b
            java.lang.String r6 = r6.a()
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x005a
            int r2 = defpackage.pag.d
            java.lang.String r2 = ".mp4"
            boolean r2 = r0.endsWith(r2)
            if (r2 != 0) goto L_0x005a
            goto L_0x005b
        L_0x005a:
            r0 = r6
        L_0x005b:
            boolean r6 = android.text.TextUtils.isEmpty(r0)
            if (r6 == 0) goto L_0x0070
            android.content.Context r6 = r5.d0()
            int r0 = defpackage.jpc.v2
            java.lang.String r5 = r5.h0(r0)
            r0 = 0
            defpackage.a14.N(r0, r6, r5)
            return r1
        L_0x0070:
            l20 r6 = r5.D1
            x10 r6 = r6.b
            boolean r6 = r6.X
            ru.ok.messages.views.dialogs.SaveToGalleryDialog r6 = ru.ok.messages.views.dialogs.SaveToGalleryDialog.n1(r0, r6)
            androidx.fragment.app.c r5 = r5.f0()
            java.lang.String r0 = "ru.ok.messages.views.dialogs.SaveToGalleryDialog"
            r6.k1(r5, r0)
            goto L_0x0114
        L_0x0085:
            int r0 = defpackage.xxb.menu_attachments__open_in
            if (r6 != r0) goto L_0x008f
            r6 = 3
            r5.D1(r6)
            goto L_0x0114
        L_0x008f:
            int r0 = defpackage.xxb.menu_attachments__forward
            r2 = 0
            if (r6 != r0) goto L_0x00a6
            n46 r6 = r5.r1()
            if (r6 == 0) goto L_0x0114
            es8 r5 = r5.C1
            ru.ok.messages.media.attaches.ActAttachesView r6 = (ru.ok.messages.media.attaches.ActAttachesView) r6
            sh0 r6 = r6.m1
            r6.s(r5, r2)
            goto L_0x0114
        L_0x00a6:
            int r0 = defpackage.xxb.menu_attachments__open_all_media
            if (r6 != r0) goto L_0x00ce
            androidx.fragment.app.b r6 = r5.b0()
            es8 r0 = r5.C1
            cu8 r0 = r0.a
            long r2 = r0.t0
            int r0 = defpackage.r5.U0
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<r5> r4 = defpackage.r5.class
            r0.<init>(r6, r4)
            r4 = 67108864(0x4000000, float:1.5046328E-36)
            r0.addFlags(r4)
            java.lang.String r4 = "ru.ok.tamtam.extra.CHAT_ID"
            r0.putExtra(r4, r2)
            r6.startActivity(r0)
            r5.e1()
            goto L_0x0114
        L_0x00ce:
            int r0 = defpackage.xxb.menu_attachments__share
            if (r6 != r0) goto L_0x00d7
            r6 = 2
            r5.D1(r6)
            goto L_0x0114
        L_0x00d7:
            int r0 = defpackage.xxb.menu_attachments__go_to_message
            if (r6 != r0) goto L_0x00dc
            goto L_0x0114
        L_0x00dc:
            int r0 = defpackage.xxb.menu_attachments__rotate_screen
            if (r6 != r0) goto L_0x00e4
            r5.B1()
            goto L_0x0114
        L_0x00e4:
            int r0 = defpackage.xxb.menu_attachments__send_photo
            if (r6 != r0) goto L_0x0114
            n46 r6 = r5.r1()
            if (r6 == 0) goto L_0x0114
            l20 r0 = r5.D1
            boolean r0 = r0.f()
            if (r0 == 0) goto L_0x00fd
            l20 r0 = r5.D1
            x10 r0 = r0.b
            long r2 = r0.s0
            goto L_0x010b
        L_0x00fd:
            l20 r0 = r5.D1
            boolean r0 = defpackage.s5c.N(r0)
            if (r0 == 0) goto L_0x010b
            l20 r0 = r5.D1
            s10 r0 = r0.j
            long r2 = r0.a
        L_0x010b:
            es8 r5 = r5.C1
            ru.ok.messages.media.attaches.ActAttachesView r6 = (ru.ok.messages.media.attaches.ActAttachesView) r6
            sh0 r6 = r6.m1
            r6.s(r5, r2)
        L_0x0114:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.media.attaches.fragments.FrgAttachPhoto.G0(android.view.MenuItem):boolean");
    }

    public final void G1() {
        hm9.m("ru.ok.messages.media.attaches.fragments.FrgAttachPhoto", "playGif", new Object[0]);
        q5 g1 = g1();
        if (g1 != null) {
            qj9 qj9 = this.K1;
            if (qj9 != null) {
                qj9.l1(false);
                this.K1 = null;
            }
            we8 i = ((xe8) b0()).i();
            fl9 fl9 = new fl9(g1, (float[]) null);
            this.K1 = new qj9(fl9, i, ((y8a) ((ed3) this.p1.b)).h(), this);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 17;
            this.I1.addView((View) fl9.c, layoutParams);
            qj9 qj92 = this.K1;
            wc6 wc6 = new wc6(qj92.o, this.D1);
            qj92.Y = wc6;
            ((bq7) qj92.c).s(wc6, qj92);
            ((pl9) ((kk9) qj92.b)).b(qj92);
        }
    }

    public final void H0() {
        super.H0();
        die die = this.M1;
        if (die != null) {
            cqc.b((sd7) die.o);
        }
    }

    public final void K0() {
        super.K0();
        int i = this.N1;
        die die = this.M1;
        if (die != null) {
            this.N1 = i;
            die.T(new g46(this, i, 0), new g46(this, i, 1));
        }
    }

    public final void L0(Bundle bundle) {
        String str;
        super.L0(bundle);
        bundle.putInt("ru.ok.tamtam.extra.GIF_ERRORS_COUNT", this.L1);
        die die = this.M1;
        if (die != null) {
            bundle.putStringArrayList("ru.ok.tamtam.extra.ATTACH_DOWNLOAD_OBSERVER", (ArrayList) die.c);
        }
        int i = this.N1;
        if (i != 0) {
            if (i == 1) {
                str = "SET_AS_BG";
            } else if (i == 2) {
                str = "SHARE";
            } else if (i == 3) {
                str = "OPEN";
            } else {
                throw null;
            }
            bundle.putString("ru.ok.tamtam.extra.DOWNLOAD_ACTION", str);
        }
    }

    public final void M(int i) {
        this.J1.setWrapContentMeasure(true);
        super.M(i);
    }

    public final void T() {
        E1(false);
    }

    public final void X() {
    }

    public final void Y(Throwable th) {
        if (th.getCause() != null && (th.getCause() instanceof FileDataSource$FileDataSourceException)) {
            int i = this.L1 + 1;
            this.L1 = i;
            View view = this.U0;
            if (view != null) {
                if (i > 2) {
                    view.post(new i46(this, 0));
                    return;
                }
                File k = ((kk5) this.q1.j()).k(this.D1.b.s0);
                File n = ((kk5) this.q1.j()).n(this.D1.b.u0);
                if (k.delete() || n.delete()) {
                    view.post(new i46(this, 1));
                }
            }
        }
    }

    public final void l1(int i, int i2, Intent intent) {
    }

    public final boolean n1() {
        this.J1.getZoomableController().reset();
        this.J1.setWrapContentMeasure(true);
        return false;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        this.S0 = true;
        this.J1.getZoomableController().reset();
    }

    @uae
    public void onEvent(fn4 fn4) {
        if (this.o1 && this.W0 && this.D1.f() && TextUtils.equals(this.D1.b.t0, fn4.b)) {
            G1();
        }
    }

    public final void v0(Bundle bundle) {
        super.v0(bundle);
        z1();
    }

    public final void w0(Menu menu, MenuInflater menuInflater) {
        if (!this.C1.a.s() && !this.Z.getBoolean("ru.ok.tamtam.extra.COMPAT_MODE", false)) {
            menu.clear();
            menuInflater.inflate(azb.menu_attach_photo, menu);
            ngg.g(this.r1, menu, (Integer) null);
            boolean y = this.C1.a.y();
            boolean C = this.C1.a.C();
            boolean z = true;
            boolean z2 = this.D1.f() && this.D1.b.X;
            e52 t1 = t1();
            ai3 v1 = v1();
            if (v1 != null) {
                MenuItem e = v1.e(xxb.menu_attachments__open_in);
                if (e != null && !y) {
                    e.setVisible(false);
                }
                MenuItem e2 = v1.e(xxb.menu_attachments__save_to_gallery);
                if (e2 != null && y) {
                    e2.setVisible(false);
                }
                MenuItem e3 = v1.e(xxb.menu_attachments__open_all_media);
                if (e3 != null && (C || y || t1 == null)) {
                    e3.setVisible(false);
                }
                MenuItem e4 = v1.e(xxb.menu_attachments__go_to_message);
                if (e4 != null) {
                    if (t1 == null) {
                        z = false;
                    }
                    e4.setVisible(z);
                }
                MenuItem e5 = v1.e(xxb.menu_attachments__rotate_screen);
                if (e5 != null) {
                    Context d0 = d0();
                    if (d0 != null) {
                        Settings.System.getInt(d0.getContentResolver(), "accelerometer_rotation", 0);
                    }
                    e5.setVisible(false);
                }
                MenuItem e6 = v1.e(xxb.menu_attachments__send_photo);
                if (z2) {
                    e6.setTitle(jpc.B2);
                } else {
                    e6.setTitle(jpc.L2);
                }
            }
            super.w0(menu, menuInflater);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0020, code lost:
        r9 = r7.C1.a.z0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View x0(android.view.LayoutInflater r8, android.view.ViewGroup r9, android.os.Bundle r10) {
        /*
            r7 = this;
            int r0 = defpackage.yyb.frg_photo_view
            r1 = 0
            android.view.View r8 = r8.inflate(r0, r9, r1)
            int r9 = defpackage.xxb.frg_photo_view__fl_photo
            android.view.View r9 = r8.findViewById(r9)
            android.widget.FrameLayout r9 = (android.widget.FrameLayout) r9
            r7.I1 = r9
            int r9 = defpackage.xxb.frg_photo_view__iv_photo
            android.view.View r9 = r8.findViewById(r9)
            ru.ok.messages.media.attaches.AttachPhotoView r9 = (ru.ok.messages.media.attaches.AttachPhotoView) r9
            r7.J1 = r9
            boolean r9 = r7.E1
            r0 = 1
            if (r9 == 0) goto L_0x003b
            es8 r9 = r7.C1
            cu8 r9 = r9.a
            k8g r9 = r9.z0
            if (r9 != 0) goto L_0x0029
            goto L_0x003b
        L_0x0029:
            int r9 = r9.i()
            if (r9 > r0) goto L_0x0039
            vl r9 = defpackage.vl.o
            vi4 r9 = defpackage.lz7.q(r9)
            vi4 r2 = defpackage.vi4.c
            if (r9 != r2) goto L_0x003b
        L_0x0039:
            r9 = r0
            goto L_0x003c
        L_0x003b:
            r9 = r1
        L_0x003c:
            ru.ok.messages.media.attaches.AttachPhotoView r2 = r7.J1
            e52 r3 = r7.t1()
            l20 r4 = r7.D1
            es8 r5 = r7.C1
            boolean r6 = r7.G1
            r2.N0 = r6
            r2.O0 = r9
            r2.R0 = r3
            r2.r(r4, r5)
            ru.ok.messages.media.attaches.AttachPhotoView r9 = r7.J1
            r9.setListener(r7)
            ru.ok.messages.media.attaches.AttachPhotoView r9 = r7.J1
            r9.setZoomEnabled(r0)
            r9 = r8
            ru.ok.messages.views.widgets.SlideOutLayout r9 = (ru.ok.messages.views.widgets.SlideOutLayout) r9
            ru.ok.messages.media.attaches.AttachPhotoView r2 = r7.J1
            r7.A1(r9, r2)
            boolean r9 = r7.E1
            if (r9 == 0) goto L_0x006c
            ru.ok.messages.media.attaches.AttachPhotoView r9 = r7.J1
            r9.setWrapContentMeasure(r0)
        L_0x006c:
            if (r10 == 0) goto L_0x00d2
            java.lang.String r9 = "ru.ok.tamtam.extra.GIF_ERRORS_COUNT"
            int r9 = r10.getInt(r9, r1)
            r7.L1 = r9
            ed3 r9 = defpackage.vl.b()
            y8a r9 = (defpackage.y8a) r9
            v4 r9 = r9.getAccessor()
            java.lang.Class<oz> r0 = defpackage.oz.class
            java.lang.Object r9 = r9.c(r0)
            oz r9 = (defpackage.oz) r9
            java.lang.String r0 = "ru.ok.tamtam.extra.ATTACH_DOWNLOAD_OBSERVER"
            die r9 = defpackage.ema.B(r9, r10, r0)
            r7.M1 = r9
            java.lang.String r9 = "ru.ok.tamtam.extra.DOWNLOAD_ACTION"
            boolean r0 = r10.containsKey(r9)
            if (r0 == 0) goto L_0x00d2
            java.lang.String r9 = r10.getString(r9)
            if (r9 == 0) goto L_0x00ca
            java.lang.String r10 = "SET_AS_BG"
            boolean r10 = r9.equals(r10)
            if (r10 == 0) goto L_0x00a8
            r9 = 1
            goto L_0x00bb
        L_0x00a8:
            java.lang.String r10 = "SHARE"
            boolean r10 = r9.equals(r10)
            if (r10 == 0) goto L_0x00b2
            r9 = 2
            goto L_0x00bb
        L_0x00b2:
            java.lang.String r10 = "OPEN"
            boolean r10 = r9.equals(r10)
            if (r10 == 0) goto L_0x00be
            r9 = 3
        L_0x00bb:
            r7.N1 = r9
            goto L_0x00d2
        L_0x00be:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "No enum constant ru.ok.messages.media.attaches.fragments.FrgAttachPhoto.DownloadAction."
            java.lang.String r8 = r8.concat(r9)
            r7.<init>(r8)
            throw r7
        L_0x00ca:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r8 = "Name is null"
            r7.<init>(r8)
            throw r7
        L_0x00d2:
            h46 r9 = new h46
            r10 = 1
            r9.<init>(r7, r10)
            defpackage.nd7.h(r8, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.media.attaches.fragments.FrgAttachPhoto.x0(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void y0() {
        super.y0();
        qj9 qj9 = this.K1;
        if (qj9 != null) {
            qj9.l1(false);
            this.K1 = null;
        }
    }

    public final void y1(boolean z) {
        if (!this.E1) {
            hm9.k("ru.ok.messages.media.attaches.fragments.FrgAttachPhoto", "setUserVisibleHintExtended: " + z);
            if (z) {
                F1(false);
            }
        }
    }

    @uae
    public void onEvent(l6f l6f) {
        if (this.o1 && l6f.c == this.C1.a.b) {
            w1(l6f, new h46(this, 0));
        }
    }
}
