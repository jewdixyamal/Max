package defpackage;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.Surface;
import com.android.installreferrer.api.ReferrerDetails;
import com.my.tracker.obfuscated.a;
import com.my.tracker.obfuscated.a0;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.sdk.zoom.ZoomableDraweeView;
import org.apache.http.util.LangUtils;
import org.webrtc.VideoFileRenderer;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSource;
import ru.ok.android.externcalls.sdk.watch_together.internal.listener.WatchTogetherListenerManagerImpl;
import ru.ok.android.externcalls.sdk.watch_together.listener.WatchTogetherListener;
import ru.ok.tamtam.nano.Protos;

/* renamed from: fre  reason: default package */
public final /* synthetic */ class fre implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fre(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                hre hre = (hre) this.b;
                see see = hre.h;
                if (see != null && see == ((see) this.c)) {
                    hre.h = null;
                    hre.g = null;
                }
                u00 u00 = hre.l;
                if (u00 != null) {
                    u00.f();
                    hre.l = null;
                    return;
                }
                return;
            case 1:
                Runnable runnable = (Runnable) this.b;
                qm qmVar = (qm) this.c;
                try {
                    runnable.run();
                    qmVar.a();
                    return;
                } catch (Throwable th) {
                    Throwable th2 = th;
                    qmVar.a();
                    throw th2;
                }
            case 2:
                l1f l1f = (l1f) this.b;
                l1f.getClass();
                ffc j = ((ww6) this.c).j();
                k8g k8g = l1f.d;
                String str = (String) k8g.b;
                String str2 = (String) k8g.c;
                h1f h1f = (h1f) l1f.e.a;
                h1f.q.a.e(j);
                t85 t85 = h1f.q;
                if (str != null) {
                    t85.g = str;
                }
                if (str2 != null) {
                    t85.n = str2;
                }
                h1f.r = null;
                int i = h1f.v;
                if (i == 1) {
                    h1f.v = 2;
                    dd3 dd3 = h1f.t;
                    dd3.getClass();
                    tpa.g(dd3, true, false);
                    h1f.s.getClass();
                    h1f.s.b();
                    throw null;
                } else if (i == 2) {
                    h1f.s = null;
                    h1f.v = 3;
                    throw null;
                } else if (i == 3) {
                    h1f.v = 4;
                    throw null;
                } else if (i == 5) {
                    h1f.v = 6;
                    dd3 dd32 = h1f.t;
                    fm9.h(dd32);
                    zd9 zd9 = h1f.w;
                    fm9.h(zd9);
                    db8 db8 = ((lv4) ((mv4) dd32.a.get(0)).a.get(0)).a.e;
                    long j2 = db8.b;
                    dd3 h = tpa.h(h1f.t, zd9.b, db8.d, zd9.a, true, true);
                    fm9.h(h1f.s);
                    h1f.s.b();
                    h1f.f(h, h1f.s, h1f.p, zd9.b - j2);
                    return;
                } else if (i == 6) {
                    h1f.w = null;
                    t85.p = 1;
                    h1f.b(h1f);
                    return;
                } else {
                    h1f.b(h1f);
                    return;
                }
            case 3:
                bm7 bm7 = (bm7) this.c;
                if (((ccd) this.b).a instanceof q0) {
                    bm7.cancel(false);
                    return;
                }
                return;
            case 4:
                rdf rdf = (rdf) this.b;
                if (((xf4) this.c) == rdf.p) {
                    rdf.I();
                    return;
                }
                return;
            case 5:
                ndf ndf = (ndf) this.b;
                ndf.getClass();
                bad bad = (bad) this.c;
                ((ArrayList) bad.b.d).remove(ndf);
                bad.e.remove(ndf);
                return;
            case 6:
                ((l05) ((zm4) this.b).j).a((Surface) this.c);
                return;
            case 7:
                ((VideoFileRenderer) this.b).lambda$onFrame$0((VideoFrame) this.c);
                return;
            case 8:
                ((VideoFileRenderer) this.b).lambda$release$2((CountDownLatch) this.c);
                return;
            case 9:
                xff xff = (xff) this.c;
                nx0 nx0 = (nx0) this.b;
                nx0.getClass();
                try {
                    xff.run();
                    return;
                } catch (Exception e) {
                    nx0.d(e);
                    return;
                }
            case 10:
                sif sif = (sif) this.b;
                if (sif.v0) {
                    hm9.p(sif.a, "postToGl, GL is already RELEASED, skip action!", (Throwable) null);
                    return;
                } else {
                    ((k56) this.c).invoke();
                    return;
                }
            case 11:
                wva wva = (wva) this.b;
                wva.getClass();
                int i2 = maf.a;
                t75 t75 = ((n75) wva.c).a;
                t75.getClass();
                t75.x0.i(25, new f74((ilf) this.c));
                return;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                aab aab = (aab) this.b;
                aab.getClass();
                int i3 = oaf.a;
                u75 u75 = ((o75) aab.b).a;
                jlf jlf = (jlf) this.c;
                u75.p1 = jlf;
                u75.x0.f(25, new q64(22, (Object) jlf));
                return;
            case 13:
                wva wva2 = (wva) this.b;
                wva2.getClass();
                int i4 = maf.a;
                h74 h74 = ((n75) wva2.c).a.C0;
                ed P = h74.P();
                h74.Q(P, 1019, new b74(P, (String) this.c, 12));
                return;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                wva wva3 = (wva) this.b;
                wva3.getClass();
                int i5 = maf.a;
                h74 h742 = ((n75) wva3.c).a.C0;
                ed P2 = h742.P();
                h742.Q(P2, 1030, new b74(P2, (Exception) this.c, 25));
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                aab aab2 = (aab) this.b;
                aab2.getClass();
                int i6 = oaf.a;
                i74 i74 = ((o75) aab2.b).a.D0;
                fd F = i74.F();
                i74.I(F, 1030, new yv3(F, (Exception) this.c));
                return;
            case 16:
                aab aab3 = (aab) this.b;
                aab3.getClass();
                int i7 = oaf.a;
                i74 i742 = ((o75) aab3.b).a.D0;
                fd F2 = i742.F();
                i742.I(F2, 1019, new r64(F2, (String) this.c, 1));
                return;
            case LangUtils.HASH_SEED /*17*/:
                ((VideoSource) this.b).lambda$setVideoProcessor$0((VideoFrame) this.c);
                return;
            case 18:
                WatchTogetherListenerManagerImpl.sendActualState$lambda$5((WatchTogetherListenerManagerImpl) this.b, (WatchTogetherListener) this.c);
                return;
            case 19:
                j7g j7g = (j7g) this.b;
                dcd dcd = (dcd) this.c;
                if (!(j7g.a.a instanceof r0)) {
                    dcd.l(j7g.o.getForegroundInfoAsync());
                    return;
                } else {
                    dcd.cancel(true);
                    return;
                }
            case 20:
                ((v7g) this.b).i((p7g) this.c);
                return;
            case 21:
                ((v7g) this.b).a((q8g) this.c, false);
                return;
            case 22:
                bm7 bm72 = (bm7) this.c;
                if (((v8g) this.b).B0.a instanceof r0) {
                    bm72.cancel(true);
                    return;
                }
                return;
            case 23:
                fre.super.invalidateDrawable((Drawable) this.c);
                return;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                ((ZoomableDraweeView) ((n5) this.b).c).o((ru6) this.c);
                return;
            case 25:
                ((ZoomableDraweeView) ((n5) this.b).c).n((Throwable) this.c);
                return;
            case 26:
                Object obj = this.c;
                uag uag = (uag) this.b;
                uag.getClass();
                try {
                    moc moc = uag.d.c;
                    if (moc != null) {
                        moc.a(uag.c, (roc) obj);
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    uag.a.reportException("ProtocolInfo", "rtc.command.handle.command.onsuccess", th3);
                    return;
                }
            case 27:
                Throwable th4 = (Throwable) this.c;
                uag uag2 = (uag) this.b;
                uag2.getClass();
                try {
                    tj4 tj4 = uag2.d.d;
                    if (tj4 != null) {
                        tj4.b(uag2.c, th4);
                        return;
                    }
                    return;
                } catch (Throwable th5) {
                    uag2.a.reportException("ProtocolInfo", "rtc.command.handle.command.onerror", th5);
                    return;
                }
            case 28:
                ((a) this.b).a((Activity) this.c);
                return;
            default:
                ((a0) this.b).b((ReferrerDetails) this.c);
                return;
        }
    }
}
