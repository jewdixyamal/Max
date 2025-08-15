package one.me.android;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.View;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.android.root.RootController;
import one.me.main.MainScreen;
import ru.ok.tamtam.logout.a;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lone/me/android/MainActivity;", "Lq5;", "Lnmc;", "Lj8;", "<init>", "()V", "hx9", "oneme_playGoogleRelease"}, k = 1, mv = {2, 0, 0})
public final class MainActivity extends q5 implements nmc, j8 {
    public static final /* synthetic */ int a1 = 0;
    public znc U0;
    public final boolean V0 = true;
    public l91 W0;
    public final lx4 X0;
    public final ax7 Y0;
    public x77 Z0;

    public MainActivity() {
        y8a y8a = y8a.a;
        this.X0 = (lx4) y8a.getAccessor().c(lx4.class);
        ax7 ax7 = (ax7) y8a.getAccessor().c(ax7.class);
        this.Y0 = ax7;
        ax7.getClass();
        cta cta = cta.MAIN_ACTIVITY_INIT_TO_RENDER;
        ax7.e.k(cta, new bta(cta, SystemClock.elapsedRealtime()));
        ax7.h = true;
    }

    public final String Z() {
        return null;
    }

    public final void c0(int i, int i2, Intent intent) {
        if (i == 102 && i2 != 0) {
            ((jva) ((bva) y8a.a.getAccessor().c(bva.class))).c();
            a14.L(this, new uia(new kia(woc.n), z7.B(this, yzb.oneme_contact_saved_snackbar_title), (String) null, new eia(0, 0, 0, 7)));
        }
    }

    public final void d0() {
    }

    public final znc g() {
        znc znc = this.U0;
        if (znc != null) {
            return znc;
        }
        return null;
    }

    public final boolean h() {
        return this.V0;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [buc, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v2, types: [android.content.Context] */
    /* JADX WARNING: type inference failed for: r1v3, types: [aab, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j0() {
        /*
            r8 = this;
            y8a r0 = defpackage.y8a.a
            v4 r0 = r0.getAccessor()
            java.lang.Class<by6> r1 = defpackage.by6.class
            java.lang.Object r0 = r0.c(r1)
            by6 r0 = (defpackage.by6) r0
            r0.getClass()
            ay6 r0 = defpackage.by6.b
            if (r0 == 0) goto L_0x00e2
            buc r1 = new buc
            r1.<init>()
            r0.a = r8
            r0.d = r1
            android.content.Context r1 = r8.getApplicationContext()
            if (r1 == 0) goto L_0x0025
            r8 = r1
        L_0x0025:
            aab r1 = new aab
            mig r2 = new mig
            r2.<init>(r8)
            r1.<init>()
            android.os.Handler r8 = new android.os.Handler
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            r8.<init>(r3)
            r1.b = r8
            r1.a = r2
            r0.b = r1
            java.lang.Object r8 = r1.a
            mig r8 = (defpackage.mig) r8
            java.lang.String r1 = r8.b
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            qm4 r2 = defpackage.mig.c
            java.lang.String r3 = "requestInAppReview (%s)"
            r2.b(r3, r1)
            mkg r1 = r8.a
            if (r1 != 0) goto L_0x00bf
            r8 = 0
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r1 = 6
            java.lang.String r3 = "PlayCore"
            boolean r1 = android.util.Log.isLoggable(r3, r1)
            if (r1 == 0) goto L_0x0066
            java.lang.String r1 = r2.a
            java.lang.String r2 = "Play Store app is either not installed or not the official version"
            defpackage.qm4.d(r1, r2, r8)
        L_0x0066:
            com.google.android.play.core.review.ReviewException r8 = new com.google.android.play.core.review.ReviewException
            com.google.android.gms.common.api.Status r1 = new com.google.android.gms.common.api.Status
            java.util.Locale r2 = java.util.Locale.getDefault()
            r3 = -1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            java.util.HashMap r5 = defpackage.afg.a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            boolean r7 = r5.containsKey(r6)
            if (r7 != 0) goto L_0x0082
            java.lang.String r5 = ""
            goto L_0x00a9
        L_0x0082:
            java.lang.Object r5 = r5.get(r6)
            java.lang.String r5 = (java.lang.String) r5
            java.util.HashMap r7 = defpackage.afg.b
            java.lang.Object r6 = r7.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r5)
            java.lang.String r5 = " (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#"
            r7.append(r5)
            r7.append(r6)
            java.lang.String r5 = ")"
            r7.append(r5)
            java.lang.String r5 = r7.toString()
        L_0x00a9:
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r5}
            java.lang.String r5 = "Review Error(%d): %s"
            java.lang.String r2 = java.lang.String.format(r2, r5, r4)
            r4 = 0
            r1.<init>(r3, r2, r4, r4)
            r8.<init>(r1)
            ukg r8 = defpackage.j1e.q(r8)
            goto L_0x00d7
        L_0x00bf:
            qne r2 = new qne
            r2.<init>()
            uhg r3 = new uhg
            r3.<init>(r8, r2, r2)
            gjg r8 = new gjg
            r8.<init>(r1, r2, r2, r3)
            android.os.Handler r1 = r1.a()
            r1.post(r8)
            ukg r8 = r2.a
        L_0x00d7:
            if (r8 == 0) goto L_0x00e2
            zx6 r1 = new zx6
            r2 = 0
            r1.<init>(r0, r2)
            r8.i(r1)
        L_0x00e2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.android.MainActivity.j0():void");
    }

    public final void onCreate(Bundle bundle) {
        String name = MainActivity.class.getName();
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            us7 us7 = us7.X;
            Uri data = getIntent().getData();
            ir6.d(us7, name, "@deep_link: onCreate: intent.data = " + data, (Throwable) null);
        }
        this.Y0.d(getIntent());
        w12 b = s36.b(this);
        b.setId(kvb.root);
        v3c.y(new br((Object) this, (Continuation) null, 9), b);
        getWindow().setSoftInputMode(Build.VERSION.SDK_INT >= 30 ? 48 : 16);
        setContentView((View) b);
        qu4.a(this);
        super.onCreate(bundle);
        znc c = mr0.c(this, b, bundle);
        c.e = 1;
        c.Q(false);
        this.U0 = c;
        RootController s = a14.s(this);
        y8a y8a = y8a.a;
        y8a.o().g(new zja(this, 14, s));
        a14.M(this, (Intent) null);
        bcf bcf = bcf.a;
        bcf.b().getClass();
        bcf.b().getClass();
        l91 l91 = (l91) y8a.getAccessor().c(l91.class);
        E().a(this, l91.y0);
        hm9.m("PipAppController", "CallIndicatorAppController attached", new Object[0]);
        l91.Z = this;
        l91.c().a((h91) l91.x0.getValue());
        l91.g(true);
        ((wr1) l91.a).d((g91) l91.w0.getValue());
        l91.o.d(l91);
        this.W0 = l91;
        od2.L(new zn5(((vt7) y8a.getAccessor().c(vt7.class)).stream(), new rw7(this, (Continuation) null), 5), f46.J(this));
        w7c c2 = ((a) y8a.getAccessor().c(a.class)).c(f46.J(this));
        gh7 gh7 = this.a;
        fg7 fg7 = fg7.o;
        od2.L(new zn5(tu0.g(c2, gh7, fg7), new sw7(this, (Continuation) null), 5), f46.J(this));
        od2.L(new zn5(this.X0.a(), new tw7(this, (Continuation) null), 5), f46.J(this));
        setIntent((Intent) null);
        od2.L(new zn5(od2.x(tu0.g(((kxc) ((hp) y8a.getAccessor().c(hp.class))).l, this.a, fg7)), new uw7(this, (Continuation) null), 5), f46.J(this));
        t03 t03 = new t03(od2.D(new t03(new j31(c37.c(new hb3(2, new y98(y8a.n().a.u()))), new t03(ul9.d, 11), new xh0(3, (Continuation) null, 18), 4), 11), new pw7(this, (Continuation) null)), 27);
        MainScreen.Z.getClass();
        this.Z0 = od2.L(new zn5(new t03(tu0.g(new j31(t03, MainScreen.t0, new xi1(3, (Continuation) null, 2), 4), this.a, fg7.X), 11), new qw7(this, (Continuation) null), 5), f46.J(this));
    }

    public final void onDestroy() {
        super.onDestroy();
        l91 l91 = this.W0;
        if (l91 != null) {
            hm9.m("PipAppController", "CallIndicatorAppController dettached", new Object[0]);
            l91.Z = null;
            l91.c().K((h91) l91.x0.getValue());
            ((wr1) l91.a).G.remove((g91) l91.w0.getValue());
            l91.o.c(l91);
        }
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        q71 q71 = (q71) ((l91) y8a.a.getAccessor().c(l91.class)).X.getValue();
        boolean r = ((wr1) ((kr1) q71.a.getValue())).r();
        boolean z = keyEvent.getAction() == 0 && (keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25);
        if (!z || !r) {
            hm9.m("HandleSilenceMode", "skip handle buttons, isIncoming=" + r + " isNeededAction=" + z, new Object[0]);
        } else {
            q71.a();
        }
        return super.onKeyDown(i, keyEvent);
    }

    public final void onNewIntent(Intent intent) {
        String name = MainActivity.class.getName();
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            us7 us7 = us7.X;
            Uri data = intent.getData();
            ir6.d(us7, name, "@deep_link: onNewIntent: intent.data = " + data, (Throwable) null);
        }
        this.Y0.d(intent);
        super.onNewIntent(intent);
        a14.e(a14.s(this), intent);
        y8a.a.o().g(new zja(this, 13, intent));
        a14.M(this, intent);
        setIntent((Intent) null);
    }

    public final void onPause() {
        super.onPause();
        ri9 ri9 = y27.a;
        Object[] objArr = ri9.b;
        long[] jArr = ri9.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            ((g1e) objArr[(i << 3) + i3]).g = true;
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        l91 l91;
        Activity activity;
        super.onPictureInPictureModeChanged(z, configuration);
        if (!z && (l91 = this.W0) != null && (activity = l91.Z) != null) {
            hm9.m("PipAppController", "hide global pip", new Object[0]);
            l91.i(false);
            znc c = l91.c();
            coc coc = (coc) x53.q0(c.e());
            if (!tpa.f(coc != null ? coc.b : null, ":call-pip")) {
                hm9.m("PipAppController", "last screen wasn't pip, skip navigation to call.", new Object[0]);
            } else if (((wr1) l91.a).q() && !ps1.a(c)) {
                hm9.m("PipAppController", "open active call after pip mode.", new Object[0]);
                vw7.c.P1().b(":call-active", (Bundle) null);
            }
            uu3 g = c.g(":call-pip");
            if (g != null) {
                c.B(g);
                if (!c.n()) {
                    activity.finish();
                }
            }
        }
    }

    public final void onResume() {
        xx6 i;
        super.onResume();
        y8a y8a = y8a.a;
        ((by6) y8a.getAccessor().c(by6.class)).getClass();
        ay6 ay6 = by6.b;
        if (!(ay6 == null || (i = y8a.i()) == null)) {
            i.k = ay6.e;
        }
        y27.a();
    }

    public final void onStart() {
        super.onStart();
        j0();
    }

    public final void onStop() {
        xx6 i;
        super.onStop();
        y8a y8a = y8a.a;
        ((by6) y8a.getAccessor().c(by6.class)).getClass();
        if (by6.b != null && (i = y8a.i()) != null) {
            i.k = null;
        }
    }

    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        l91 l91 = this.W0;
        if (l91 != null) {
            l91.h();
        }
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            y27.a();
        }
    }
}
