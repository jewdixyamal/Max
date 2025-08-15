package ru.ok.messages.media.attaches.fragments;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.fragment.app.b;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.apache.http.HttpStatus;
import ru.ok.messages.media.attaches.ActAttachesView;
import ru.ok.messages.video.widgets.PinchToZoomVideoViewWrapper;
import ru.ok.messages.video.widgets.VideoView;
import ru.ok.messages.views.dialogs.ConfirmationDialog;
import ru.ok.messages.views.dialogs.FrgDlgAudioTracksPicker;
import ru.ok.messages.views.dialogs.VideoQualityPickerDialog;
import ru.ok.messages.views.widgets.SlideOutLayout;
import ru.ok.messages.views.widgets.VideoThumbnailView;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.util.HandledException;

public class FrgAttachVideo extends FrgAttachView implements kj9 {
    public Map I1;
    public ImageButton J1;
    public r20 K1;
    public we8 L1;
    public wk9 M1;
    public lj9 N1;
    public VideoThumbnailView O1;
    public die P1;
    public ad Q1;
    public jg5 R1;

    public final void C1() {
        K1();
    }

    public final void D1() {
        if (this.D1.i()) {
            this.q1.n().t(this.C1.a, this.D1.r, new hj8(13));
        }
        q1().F1 = new k46(this, 3);
        die a = ((oz) ((y8a) vl.b()).getAccessor().c(oz.class)).a(this.D1);
        this.P1 = a;
        a.T(new k46(this, 1), new k46(this, 2));
    }

    public final void E1(boolean z) {
        if (z) {
            a14.N(0, d0(), h0(jpc.n3));
        } else if (!wmd.l(d0())) {
            wmd.D(this, wmd.s(), 110);
        } else {
            D1();
        }
    }

    public final void F1() {
        J1();
        G1();
        if (!s5c.R(this.D1)) {
            wk9 wk9 = this.M1;
            we8 we8 = this.L1;
            y8a y8a = (y8a) ((ed3) this.p1.b);
            dlf s = y8a.s();
            hle q = y8a.q();
            ef7 ef7 = (ef7) y8a.getAccessor().c(ef7.class);
            o20 d = y8a.d();
            au8 l = y8a.l();
            p7b n = y8a.n();
            o45 g = y8a.g();
            ti4 f = y8a.f();
            n46 u1 = r1();
            this.N1 = new lj9(wk9, we8, s, q, ef7, d, l, n, this, g, f, u1 == null ? true : ((ActAttachesView) u1).b1, false);
            ((View) this.M1.c).setVisibility(0);
            VideoThumbnailView videoThumbnailView = this.O1;
            if (videoThumbnailView != null) {
                videoThumbnailView.setVisibility(8);
            }
            e52 t1 = t1();
            long j = t1 != null ? t1.b.a : 0;
            hm9.m("ru.ok.messages.media.attaches.fragments.FrgAttachVideo", "Bind %s", this.D1.r);
            this.N1.Z1(this.D1, j, this.C1.a, 4, false);
        }
    }

    public final void G() {
    }

    public final boolean G0(MenuItem menuItem) {
        n46 u1;
        MenuItem e;
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            n1();
        } else if (itemId != xxb.menu_attachments__open_all_media) {
            long j = 0;
            if (itemId == xxb.menu_attachments__forward) {
                n46 u12 = r1();
                if (u12 != null) {
                    ((ActAttachesView) u12).m1.s(this.C1, 0);
                }
            } else if (itemId == xxb.menu_attachments__share) {
                if (this.o1) {
                    if (this.D1.i()) {
                        glc l = c37.l(this.D1);
                        String str = (String) l.b;
                        if (str != null) {
                            hm9.e0(d0(), str);
                        } else {
                            File file = (File) l.c;
                            if (file == null) {
                                Boolean bool = (Boolean) l.o;
                                if (bool != null) {
                                    E1(bool.booleanValue());
                                }
                            } else if (!wmd.l(d0())) {
                                wmd.D(this, wmd.s(), 112);
                            } else {
                                hm9.f0(b0(), file, ((y8a) ((ed3) this.p1.b)).h());
                            }
                        }
                    } else if (s5c.P(this.D1)) {
                        E1(false);
                    }
                }
            } else if (itemId == xxb.menu_attach_video__download) {
                I1();
            } else if (itemId == xxb.menu_attach_video__download_cancel) {
                this.q1.n().u(this.C1.a, this.D1.r, d20.b);
                L1();
            } else if (itemId == xxb.menu_attachments__to_pip_mode) {
                Context d0 = d0();
                String[] strArr = wmd.d;
                if (d0 == null ? false : Settings.canDrawOverlays(d0)) {
                    H1(false);
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putInt("ru.ok.tamtam.extra.CONTENT_RES_ID", jpc.P1);
                    bundle.putInt("ru.ok.tamtam.extra.POSITIVE_TEXT_RES_ID", jpc.Z1);
                    bundle.putInt("ru.ok.tamtam.extra.NEGATIVE_TEXT_RES_ID", jpc.X1);
                    ConfirmationDialog confirmationDialog = new ConfirmationDialog();
                    confirmationDialog.X0(bundle);
                    confirmationDialog.b1(HttpStatus.SC_SWITCHING_PROTOCOLS, this);
                    confirmationDialog.k1(this.F0, "ru.ok.messages.views.dialogs.ConfirmationDialog");
                }
            } else if (itemId == xxb.menu_attachments__open_in) {
                if (s5c.P(this.D1)) {
                    this.R1.b(this.C1, this.D1, this, true, false, 4);
                } else if (this.D1.i()) {
                    hm9.V(b0(), this.D1.d.h);
                }
            } else if (itemId != xxb.menu_attach_video__go_to_message) {
                if (itemId == xxb.menu_attachments__rotate_screen) {
                    B1();
                } else if (itemId == xxb.menu_attach_video__audio_tracks) {
                    hm9.m("ru.ok.messages.media.attaches.fragments.FrgAttachVideo", "Open audio tracks", new Object[0]);
                    lj9 lj9 = this.N1;
                    if (lj9 != null) {
                        List a2 = lj9.a2();
                        if (a2.size() < 2) {
                            ((cba) ((y8a) ((ed3) this.p1.b)).g()).c(new HandledException(new IllegalStateException("Audio tracks count less then 2")), true);
                            ai3 v1 = v1();
                            if (!(v1 == null || (e = v1.e(xxb.menu_attach_video__audio_tracks)) == null)) {
                                e.setVisible(false);
                            }
                        } else {
                            this.Q1.d(a2.size(), "OPEN_AUDIO_TRACKS_DIALOG");
                            this.N1.l2();
                            lze e2 = ((bq7) this.N1.c).e();
                            ArrayList arrayList = new ArrayList(a2);
                            Bundle bundle2 = new Bundle();
                            bundle2.putParcelableArrayList("ru.ok.tamtam.extra.AUDIO_TRACKS", arrayList);
                            bundle2.putParcelable("ru.ok.tamtam.extra.CURRENT_AUDIO_TRACK", e2);
                            FrgDlgAudioTracksPicker frgDlgAudioTracksPicker = new FrgDlgAudioTracksPicker();
                            frgDlgAudioTracksPicker.X0(bundle2);
                            frgDlgAudioTracksPicker.k1(c0(), "ru.ok.messages.views.dialogs.FrgDlgAudioTracksPicker");
                        }
                    }
                } else if (itemId == xxb.menu_attach_video__send_video && (u1 = r1()) != null) {
                    if (this.D1.i()) {
                        j = this.D1.d.a;
                    } else if (s5c.P(this.D1)) {
                        j = this.D1.j.a;
                    }
                    ((ActAttachesView) u1).m1.s(this.C1, j);
                }
            }
        } else if (g1() != null) {
            b b0 = b0();
            long j2 = this.C1.a.t0;
            int i = r5.U0;
            Intent intent = new Intent(b0, r5.class);
            intent.addFlags(67108864);
            intent.putExtra("ru.ok.tamtam.extra.CHAT_ID", j2);
            b0.startActivity(intent);
            e1();
        }
        return true;
    }

    public final void G1() {
        if (this.N1 != null) {
            hm9.m("ru.ok.messages.media.attaches.fragments.FrgAttachVideo", "Release %s", this.D1.r);
            this.N1.l1(false);
            this.N1 = null;
        }
    }

    public final void H0() {
        super.H0();
        die die = this.P1;
        if (die != null) {
            cqc.b((sd7) die.o);
        }
        G1();
    }

    public final void H1(boolean z) {
        VideoView videoView = this.M1.Y;
        Rect rect = mpf.a;
        mpf.d(rect, videoView);
        lj9 lj9 = this.N1;
        if (lj9 != null) {
            lj9.F1();
            j10 j = this.D1.j();
            tpa.I(j, this.N1.k(), this.N1.c(), this.N1.c0());
            this.D1 = j.a();
        }
        G1();
        ((y8a) ((ed3) this.p1.b)).k().u0.d(d0(), t1(), this.C1, this.D1, rect, !z);
        if (z) {
            b b0 = b0();
            if (b0 != null) {
                b0.finish();
                b0.overridePendingTransition(0, esb.fullscreen_to_pip);
                return;
            }
            return;
        }
        if (((y8a) ((ed3) this.p1.b)).c().p()) {
            if (this.O1 != null) {
                ((y8a) ((ed3) this.p1.b)).c().g(this.O1);
            }
            wk9 wk9 = this.M1;
            if (!(wk9 == null || ((View) wk9.c) == null)) {
                ((y8a) ((ed3) this.p1.b)).c().g((View) this.M1.c);
            }
        }
        nd7.R(new j46(this, 2), 400);
    }

    public final void I1() {
        if (this.D1.i()) {
            if (!wmd.l(d0())) {
                wmd.D(this, wmd.s(), 111);
                return;
            }
            ((y8a) ((ed3) this.p1.b)).b().f("EXO_VIDEO_DOWNLOAD");
            this.q1.n().t(this.C1.a, this.D1.r, new hj8(13));
            this.q1.n().u(this.C1.a, this.D1.r, d20.X);
            e52 t1 = t1();
            pk c = this.q1.c();
            l20 l20 = this.D1;
            k20 k20 = l20.d;
            long j = k20.a;
            long j2 = t1.b.a;
            cu8 cu8 = this.C1.a;
            ((k4a) c).L(true, j, j2, cu8.c, cu8.b, l20.r, true, true, k20.m);
            L1();
        }
    }

    public final void J1() {
        if (!s5c.R(this.D1) || this.E1) {
            this.J1.setVisibility(8);
            return;
        }
        this.K1.setLevel((int) (this.D1.q * 100.0f));
        this.J1.setVisibility(0);
        VideoThumbnailView videoThumbnailView = this.O1;
        if (videoThumbnailView != null) {
            videoThumbnailView.setVisibility(0);
        }
        lj9 lj9 = this.N1;
        if (lj9 != null && lj9.b()) {
            this.N1.pause();
        }
    }

    public final void K() {
        L1();
    }

    public final void K0() {
        super.K0();
        die die = this.P1;
        if (die != null) {
            die.T(new k46(this, 1), new k46(this, 2));
        }
        K1();
    }

    public final void K1() {
        if (this.N1 != null) {
            if (r1() != null) {
                n46 u1 = r1();
                if ((u1 == null ? true : ((ActAttachesView) u1).b1) && !s5c.R(this.D1)) {
                    this.N1.k1(true);
                    return;
                }
            }
            this.N1.k1(false);
        }
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [qpd, java.util.Map] */
    public final void L() {
        lj9 lj9 = this.N1;
        if (lj9 != null) {
            lj9.l2();
            bq7 bq7 = (bq7) this.N1.c;
            List<mze> emptyList = bq7.f == null ? Collections.emptyList() : (List) bq7.b.b.o;
            bq7 bq72 = (bq7) this.N1.c;
            mze b = bq72.f == null ? mze.c : bq72.b.b.b();
            HashMap hashMap = new HashMap();
            for (mze mze : emptyList) {
                lze lze = mze.a;
                mqb H = j1e.H(lze.o, lze.X);
                hashMap.put(mze, new nqb(H, H.c, H.o, H.X, 0, false));
            }
            this.I1 = new qpd(0);
            for (Map.Entry entry : hashMap.entrySet()) {
                this.I1.put((mze) entry.getKey(), (nqb) entry.getValue());
            }
            mqb mqb = b != mze.c ? ((nqb) this.I1.get(b)).a : null;
            fef fef = ((bq7) this.N1.c).f;
            if (fef != null && !(fef instanceof b24)) {
                boolean z = fef instanceof yn6;
            }
            VideoQualityPickerDialog.n1(new ArrayList(this.I1.values()), mqb, false).k1(c0(), "ru.ok.messages.media.attaches.fragments.FrgAttachVideo");
            c0().f0("VideoQualityPickerDialog:result:request", this, new ydf(new wdg(4), new m46(this, hashMap), 1));
        }
    }

    public final void L0(Bundle bundle) {
        super.L0(bundle);
        die die = this.P1;
        if (die != null) {
            bundle.putStringArrayList("ru.ok.tamtam.extra.SHARE_DOWNLOAD_OBSERVER", (ArrayList) die.c);
        }
        jg5 jg5 = this.R1;
        if (jg5 != null) {
            long j = jg5.h;
            if (j != 0) {
                bundle.putLong("ru.ok.tamtam.extra.FILE_DOWNLOAD_REQUEST_ID", j);
            }
            if (!oag.t(jg5.j)) {
                bundle.putString("ru.ok.tamtam.extra.FILE_TO_OPEN_FILE_ATTACH_ID", jg5.j);
                bundle.putBoolean("ru.ok.tamtam.extra.TO_OPEN_FILE_ON_FINISH_DOWNLOAD", jg5.k);
            }
            int i = jg5.l;
            if (i != 0) {
                bundle.putInt("ru.ok.tamtam.extra.FILE_TO_OPEN_CLICK_SOURCE", i);
            }
            long j2 = jg5.i;
            if (j2 != 0) {
                bundle.putLong("ru.ok.tamtam.extra.SHARED_FILE_MESSAGE_ID", j2);
            }
            if (jg5.m) {
                bundle.putBoolean("ru.ok.tamtam.extra.FILE_TO_OPEN_IN_APP", true);
            }
        }
        if (this.I1 != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry entry : this.I1.entrySet()) {
                arrayList.add((mze) entry.getKey());
                arrayList2.add(new qqb((nqb) entry.getValue()));
            }
            bundle.putParcelableArrayList("ru.ok.tamtam.extra.VIDEO_FORMATS", arrayList);
            bundle.putParcelableArrayList("ru.ok.tamtam.extra.QUALITIES", arrayList2);
        }
    }

    public final void L1() {
        ai3 v1;
        boolean z = true;
        if (this.W0 && (v1 = v1()) != null) {
            MenuItem e = v1.e(xxb.menu_attach_video__download);
            MenuItem e2 = v1.e(xxb.menu_attach_video__download_cancel);
            MenuItem e3 = v1.e(xxb.menu_attachments__share);
            MenuItem e4 = v1.e(xxb.menu_attachments__to_pip_mode);
            MenuItem e5 = v1.e(xxb.menu_attachments__open_in);
            MenuItem e6 = v1.e(xxb.menu_attachments__rotate_screen);
            MenuItem e7 = v1.e(xxb.menu_attach_video__go_to_message);
            MenuItem e8 = v1.e(xxb.menu_attach_video__audio_tracks);
            if (e != null && e2 != null && e3 != null && e4 != null && e5 != null && e6 != null && e7 != null && e8 != null) {
                if (t1() == null) {
                    e.setVisible(false);
                    e2.setVisible(false);
                    e3.setVisible(false);
                    e4.setVisible(false);
                    e5.setVisible(false);
                    e6.setVisible(false);
                    e7.setVisible(false);
                    e8.setVisible(false);
                    return;
                }
                k20 k20 = s5c.P(this.D1) ? this.D1.j.d.d : this.D1.d;
                boolean Q = s5c.Q(((y8a) ((ed3) this.p1.b)).n(), k20);
                e3.setVisible(true);
                e4.setVisible(!Q);
                if (k20 == null) {
                    e.setVisible(false);
                    e2.setVisible(false);
                    e3.setVisible(true);
                    e5.setVisible(!TextUtils.isEmpty(this.D1.s));
                    MenuItem e9 = v1.e(xxb.menu_attachments__open_all_media);
                    if (e9 != null) {
                        e9.setVisible(false);
                    }
                    e6.setVisible(false);
                    e8.setVisible(false);
                } else {
                    String str = k20.h;
                    e5.setVisible(!Q && !TextUtils.isEmpty(str));
                    if (k20.a == 0) {
                        e.setVisible(false);
                        e2.setVisible(false);
                    } else if (this.D1.o.d()) {
                        e2.setVisible(true);
                        e.setVisible(false);
                    } else {
                        e2.setVisible(false);
                        p7b n = ((y8a) ((ed3) this.p1.b)).n();
                        if (oag.t(str) && !k20.g) {
                            z7d z7d = n.b;
                            z7d.getClass();
                            long q = z7d.q(PmsKey.f77maxvideodurationdownload, 1200) * 1000;
                            if (q == 0 || k20.c <= q) {
                                glc l = c37.l(this.D1);
                                if (!TextUtils.isEmpty((String) l.b) || ((File) l.c) != null) {
                                    e.setVisible(false);
                                } else {
                                    e.setVisible(true);
                                }
                            }
                        }
                        e.setVisible(false);
                        e3.setVisible(false);
                    }
                    Context d0 = d0();
                    if (d0 != null) {
                        Settings.System.getInt(d0.getContentResolver(), "accelerometer_rotation", 0);
                    }
                    e6.setVisible(false);
                    lj9 lj9 = this.N1;
                    e8.setVisible(lj9 != null && lj9.a2().size() > 1);
                }
                if (t1() == null) {
                    z = false;
                }
                e7.setVisible(z);
            }
        }
    }

    public final void M(int i) {
        nd7.R(new j46(this, 1), 500);
        super.M(i);
    }

    public final void T() {
        n46 u1 = r1();
        if (u1 != null) {
            ((ActAttachesView) u1).e();
        }
    }

    public final void X() {
        n46 u1 = r1();
        if (u1 != null) {
            ((ActAttachesView) u1).c(true, true, false);
        }
    }

    public final void Y(Throwable th) {
        Context d0 = d0();
        if (d0 != null) {
            a14.N(0, d0, zqe.b(d0, th));
        }
    }

    public final void i1() {
        lj9 lj9 = this.N1;
        if (lj9 != null) {
            kk9 kk9 = (kk9) lj9.b;
            if (kk9 instanceof nse) {
                ((nse) kk9).c();
            }
        }
    }

    public final void k(String str) {
    }

    public final boolean k1() {
        return this.o1;
    }

    public final void l1(int i, int i2, Intent intent) {
        if (i2 == -1) {
            if (i == 101) {
                String[] strArr = wmd.d;
                d1(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + d0().getPackageName())), HttpStatus.SC_PROCESSING, (Bundle) null);
            } else if (i == 102) {
                H1(true);
            }
        } else if (i == 102) {
            Context d0 = d0();
            String[] strArr2 = wmd.d;
            if (d0 == null ? false : Settings.canDrawOverlays(d0)) {
                H1(true);
            }
        }
    }

    public final void n() {
    }

    public final boolean n1() {
        q5 g1 = g1();
        if (g1 == null) {
            return false;
        }
        nd7.R(new j46(this, 1), 400);
        if (this.F1) {
            u7.a(g1);
            return true;
        }
        g1.finish();
        return true;
    }

    public final void o1(int i, String[] strArr, int[] iArr) {
        if (i == 110) {
            if (wmd.O(this, strArr, iArr, wmd.s(), jpc.i2, jpc.f2)) {
                View view = this.U0;
                if (view != null) {
                    view.post(new j46(this, 0));
                }
                D1();
            }
        } else if (i == 111) {
            if (wmd.O(this, strArr, iArr, wmd.s(), jpc.h2, jpc.f2)) {
                I1();
            }
        } else if (i == 112) {
            if (wmd.O(this, strArr, iArr, wmd.s(), jpc.i2, jpc.f2)) {
                glc l = c37.l(this.D1);
                hm9.f0(b0(), (File) l.c, ((y8a) ((ed3) this.p1.b)).h());
            }
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        this.S0 = true;
        PinchToZoomVideoViewWrapper pinchToZoomVideoViewWrapper = this.M1.Z;
        pinchToZoomVideoViewWrapper.c = p0b.b;
        pinchToZoomVideoViewWrapper.s0 = 1.0f;
    }

    @uae
    public void onEvent(l6f l6f) {
        if (l6f.c == this.C1.a.b) {
            w1(l6f, new l46(this, 0));
        }
    }

    public final void r(boolean z) {
        n46 u1 = r1();
        if (u1 != null) {
            ((ActAttachesView) u1).c(z, true, false);
        }
    }

    public final void s() {
    }

    public final void v0(Bundle bundle) {
        super.v0(bundle);
        z1();
        if (s5c.P(this.D1)) {
            ad b = this.q1.b();
            s8g u = this.q1.u();
            kk5 kk5 = (kk5) this.q1.j();
            Context d0 = d0();
            if (this.x1 == null) {
                this.x1 = new xpb();
            }
            jg5 jg5 = new jg5(b, u, kk5, d0, this, this.x1, ((y8a) ((ed3) this.p1.b)).l());
            this.R1 = jg5;
            ((jyc) jg5.b).e().d(jg5);
            if (bundle != null) {
                jg5.h = bundle.getLong("ru.ok.tamtam.extra.FILE_DOWNLOAD_REQUEST_ID", 0);
                jg5.j = bundle.getString("ru.ok.tamtam.extra.FILE_TO_OPEN_FILE_ATTACH_ID", (String) null);
                jg5.k = bundle.getBoolean("ru.ok.tamtam.extra.TO_OPEN_FILE_ON_FINISH_DOWNLOAD", false);
                jg5.l = bundle.getInt("ru.ok.tamtam.extra.FILE_TO_OPEN_CLICK_SOURCE", 0);
                jg5.m = bundle.getBoolean("ru.ok.tamtam.extra.FILE_TO_OPEN_IN_APP", false);
                jg5.i = bundle.getLong("ru.ok.tamtam.extra.SHARED_FILE_MESSAGE_ID", 0);
            }
            this.R1.d = this;
        }
        this.Q1 = ((y8a) ((ed3) this.p1.b)).b();
    }

    public final void w0(Menu menu, MenuInflater menuInflater) {
        MenuItem e;
        if (!this.C1.a.s() && !this.Z.getBoolean("ru.ok.tamtam.extra.COMPAT_MODE", false)) {
            menu.clear();
            menuInflater.inflate(azb.menu_attach_video, menu);
            ngg.g(this.r1, menu, (Integer) null);
            L1();
            ai3 v1 = v1();
            e52 t1 = t1();
            if (!((!this.C1.a.C() && t1 != null) || v1 == null || (e = v1.e(xxb.menu_attachments__open_all_media)) == null)) {
                e.setVisible(false);
            }
            super.w0(menu, menuInflater);
        }
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        View view2;
        Bundle bundle2 = bundle;
        View inflate = layoutInflater.inflate(yyb.frg_video_view, viewGroup, false);
        nd7.h(inflate.findViewById(xxb.frg_video_view__rl_root), new l46(this, 1));
        c54.c(inflate);
        this.L1 = ((xe8) b0()).b();
        y8a y8a = (y8a) ((ed3) this.p1.b);
        this.M1 = new wk9(d0(), inflate.findViewById(xxb.frg_video_view__player), y8a.c(), y8a.b());
        if (!this.F1 || bundle2 != null || s5c.R(this.D1)) {
            view = inflate;
            view.findViewById(xxb.frg_video_view__player).setVisibility(8);
            this.O1 = (VideoThumbnailView) view.findViewById(xxb.frg_video_view__vt_transition);
            this.O1.o(s5c.P(this.D1) ? this.D1.j.d.d : this.D1.d, y8a.d().a(this.D1));
            view2 = this.O1;
        } else {
            wk9 wk9 = this.M1;
            we8 we8 = this.L1;
            dlf s = y8a.s();
            hle q = y8a.q();
            ef7 ef7 = (ef7) y8a.getAccessor().c(ef7.class);
            o20 d = y8a.d();
            au8 l = y8a.l();
            p7b n = y8a.n();
            o45 g = y8a.g();
            ti4 f = y8a.f();
            n46 u1 = r1();
            lj9 lj9 = r0;
            view = inflate;
            lj9 lj92 = new lj9(wk9, we8, s, q, ef7, d, l, n, this, g, f, u1 == null ? true : ((ActAttachesView) u1).b1, false);
            this.N1 = lj9;
            e52 t1 = t1();
            this.N1.Z1(this.D1, t1 != null ? t1.b.a : 0, this.C1.a, 4, true);
            hm9.m("ru.ok.messages.media.attaches.fragments.FrgAttachVideo", "Bind %s", this.D1.r);
            view2 = s5c.b0(y8a.n(), this.D1) ? this.M1.D0 : this.M1.w0;
        }
        A1((SlideOutLayout) view, view2);
        this.J1 = (ImageButton) view.findViewById(xxb.frg_video_view__btn_cancel);
        r20 r20 = new r20(d0());
        this.K1 = r20;
        this.J1.setImageDrawable(r20);
        nd7.h(this.J1, new l46(this, 2));
        Bundle bundle3 = bundle;
        View view3 = view;
        if (bundle3 != null) {
            this.P1 = ema.B((oz) y8a.getAccessor().c(oz.class), bundle3, "ru.ok.tamtam.extra.SHARE_DOWNLOAD_OBSERVER");
        }
        if (bundle3 != null && this.I1 == null) {
            this.I1 = new HashMap();
            ArrayList parcelableArrayList = bundle3.getParcelableArrayList("ru.ok.tamtam.extra.VIDEO_FORMATS");
            ArrayList parcelableArrayList2 = bundle3.getParcelableArrayList("ru.ok.tamtam.extra.QUALITIES");
            if (!(parcelableArrayList == null || parcelableArrayList2 == null)) {
                for (int i = 0; i < parcelableArrayList.size(); i++) {
                    this.I1.put((mze) parcelableArrayList.get(i), ((qqb) parcelableArrayList2.get(i)).a);
                }
            }
        }
        if (!this.E1) {
            k46 k46 = new k46(this, 0);
            WeakHashMap weakHashMap = zmf.a;
            omf.u(view3, k46);
            view3.post(new mg(view3, 4));
        }
        J1();
        return view3;
    }

    public final void x1(boolean z) {
        lj9 lj9 = this.N1;
        if (lj9 != null) {
            if (!z) {
                lj9.l2();
            } else if (lj9.b()) {
                this.N1.j2();
            }
        }
    }

    public final void y0() {
        super.y0();
        jg5 jg5 = this.R1;
        if (jg5 != null) {
            jg5.d = null;
            ((jyc) jg5.b).e().f(jg5);
            cqc.b(jg5.n);
            cqc.b(jg5.o);
        }
        G1();
    }

    public final void y1(boolean z) {
    }
}
