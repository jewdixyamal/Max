package defpackage;

import android.animation.ObjectAnimator;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.media3.transformer.ExportException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.inviteactions.invitebyphone.InviteByPhoneScreen;
import one.me.keyboardmedia.MediaKeyboardWidget;
import one.me.sdk.transfer.exceptions.HttpUrlExpiredException;
import org.apache.http.util.LangUtils;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
import org.webrtc.VideoTrack;
import ru.ok.android.externcalls.sdk.participant.state.internal.ParticipantStatesListenerProxy;
import ru.ok.tamtam.nano.Protos;

/* renamed from: nn6  reason: default package */
public final /* synthetic */ class nn6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nn6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void run() {
        int i = 0;
        switch (this.a) {
            case 0:
                ((wmc) this.b).p();
                return;
            case 1:
                tq6 tq6 = (tq6) this.b;
                if (!tq6.s0.get()) {
                    hm9.p("uq6", "onUrlExpired", (Throwable) null);
                    tq6.Z.onError(new HttpUrlExpiredException((String) null, (eq6) null, (String) null, 6));
                    tq6.a(false);
                    return;
                }
                return;
            case 2:
                vt6 vt6 = (vt6) this.b;
                synchronized (vt6.z0) {
                    try {
                        vt6.B0 = null;
                        ov6 ov6 = vt6.A0;
                        if (ov6 != null) {
                            vt6.A0 = null;
                            vt6.e(ov6);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 3:
                iu6 iu6 = (iu6) this.b;
                iu6.getClass();
                hm9.m("iu6", "Clear fresco. BitmapMemoryCache size: %d bytes", Integer.valueOf(s36.o().f.getSizeInBytes()));
                ArrayList arrayList = new ArrayList();
                List j = ((el3) iu6.c.getValue()).j(el3.r, el3.t);
                int i2 = 0;
                while (true) {
                    int size = j.size();
                    kk0 kk0 = kk0.c;
                    if (i2 < size) {
                        String q = ((uj3) j.get(i2)).q(iu6.a.a.q(), kk0);
                        if (!TextUtils.isEmpty(q)) {
                            arrayList.add(iu6.a(Uri.parse(q)));
                        }
                        i2++;
                    } else {
                        List unmodifiableList = Collections.unmodifiableList(((p82) iu6.b.getValue()).D(p82.K, false, (c7b) null));
                        while (i < unmodifiableList.size()) {
                            String b2 = ((e52) unmodifiableList.get(i)).b.b(kk0, jk0.a);
                            if (!TextUtils.isEmpty(b2)) {
                                arrayList.add(iu6.a(Uri.parse(b2)));
                            }
                            i++;
                        }
                        s36.o().f.n(new d74(iu6, 15, arrayList));
                        return;
                    }
                }
            case 4:
                InviteByPhoneScreen inviteByPhoneScreen = (InviteByPhoneScreen) this.b;
                inviteByPhoneScreen.getRouter().B(inviteByPhoneScreen);
                return;
            case 5:
                ((VideoFrame.I420Buffer) this.b).release();
                return;
            case 6:
                vf7 vf7 = (vf7) this.b;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(vf7, "translationY", new float[]{-8.0f, 8.0f});
                ofFloat.setDuration(2500);
                ofFloat.setRepeatCount(-1);
                ofFloat.setRepeatMode(2);
                ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                ofFloat.addUpdateListener(new z00(10, (Object) vf7));
                ofFloat.start();
                return;
            case 7:
                cu7 cu7 = (cu7) this.b;
                try {
                    ((t23) cu7.D.getValue()).a();
                    return;
                } catch (Throwable th2) {
                    hm9.p("cu7", "Can't clearCache", th2);
                    ((cba) ((o45) cu7.x.getValue())).c(new IllegalStateException("Can't clearCache"), false);
                    return;
                }
            case 8:
                ((imf) this.b).b.setOnClickListener((View.OnClickListener) null);
                return;
            case 9:
                ((a98) this.b).release();
                return;
            case 10:
                w98 w98 = (w98) this.b;
                v98 v98 = w98.l;
                if (v98 != null) {
                    w98.d.unbindService(v98);
                    w98.l = null;
                }
                w98.c.c.clear();
                return;
            case 11:
                bc7[] bc7Arr = MediaKeyboardWidget.C0;
                ((MediaKeyboardWidget) this.b).m0();
                return;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                ((gf8) this.b).n = -1;
                return;
            case 13:
                ((bh8) this.b).a();
                return;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                synchronized (((bj8) this.b).a) {
                }
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                jy8 jy8 = (jy8) this.b;
                if (!((f5a) jy8.b.getValue()).d()) {
                    hm9.p("jy8", "restoreUploads: not authorized", (Throwable) null);
                    return;
                }
                hm9.m("jy8", "restoreUploadsFromStorage", new Object[0]);
                ((py8) jy8.a.getValue()).a().a(new g28(new rxd(22, jy8), new o9g(21, (Object) jy8), new e5(12, jy8)));
                return;
            case 16:
                m1f m1f = (m1f) ((rxd) this.b).b;
                m1f.X.h(m1f.F0);
                return;
            case LangUtils.HASH_SEED /*17*/:
                ((xg9) this.b).e = false;
                return;
            case 18:
                uh9 uh9 = (uh9) this.b;
                Handler handler = uh9.q;
                nn6 nn6 = uh9.r;
                if (handler != null) {
                    handler.removeCallbacks(nn6);
                }
                a98 a98 = uh9.m;
                long j2 = 0;
                long k = a98 != null ? a98.k() : 0;
                a98 a982 = uh9.m;
                if (a982 != null) {
                    j2 = a982.e0();
                }
                uh9.s.m((Object) null, Long.valueOf(k));
                uh9.u.m((Object) null, Long.valueOf(j2));
                uh9.G.m((Object) null, Float.valueOf(ote.d((float) (((double) k) / ((double) uh9.E)), 0.0f, 1.0f)));
                Handler handler2 = uh9.q;
                if (handler2 != null) {
                    handler2.postDelayed(nn6, 17);
                    return;
                }
                return;
            case 19:
                hj9 hj9 = (hj9) this.b;
                if (!hj9.p) {
                    hj9.p = true;
                    ece ece = hj9.c;
                    long j3 = hj9.h;
                    LinkedHashMap linkedHashMap = d54.a;
                    synchronized (d54.class) {
                    }
                    Locale locale = Locale.US;
                    ExportException d = ExportException.d(new IllegalStateException(ey8.i(j3, "Abort: no output sample written in the last ", " milliseconds. DebugTrace: \"Tracing disabled\"")), 7002);
                    l1f l1f = ((h1f) ece.a).r;
                    l1f.getClass();
                    l1f.g();
                    l1f.j.b(d, 4, 2, 0).b();
                    return;
                }
                return;
            case 20:
                ((oj9) this.b).a2();
                return;
            case 21:
                t3a t3a = (t3a) this.b;
                boolean isAlive = t3a.o.isAlive();
                View view = t3a.a;
                if (isAlive) {
                    t3a.o.removeOnPreDrawListener(t3a);
                } else {
                    view.getViewTreeObserver().removeOnPreDrawListener(t3a);
                }
                view.removeOnAttachStateChangeListener(t3a);
                return;
            case 22:
                ((AtomicBoolean) this.b).set(true);
                return;
            case 23:
                ParticipantStatesListenerProxy.raiseRunnable$lambda$0((ParticipantStatesListenerProxy) this.b);
                return;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                kqa kqa = (kqa) this.b;
                synchronized (kqa) {
                    while (i < kqa.Y.size()) {
                        try {
                            ((VideoTrack) kqa.Y.get(i)).removeSink((VideoSink) kqa.Z.get(i));
                            ((VideoTrack) kqa.Y.get(i)).removeSink((VideoSink) kqa.s0.get(i));
                            i++;
                        } catch (Throwable th3) {
                            ((a4c) kqa.b).log("ParticipantsAgnosticVideoTracks", "close error: " + th3.getMessage());
                        }
                    }
                }
                return;
            case 25:
                throw ((RuntimeException) this.b);
            case 26:
                u0b u0b = (u0b) this.b;
                if (((f5a) u0b.c.getValue()).d() && ((ri4) u0b.b.getValue()).d()) {
                    hm9.m("u0b", "processScheduledPing: app is visible, ping and schedule", new Object[0]);
                    ((k4a) ((pk) u0b.a.getValue())).G(true);
                    u0b.a();
                    r9d.y((s8g) u0b.d.getValue());
                    return;
                }
                return;
            case 27:
                hm9.m("ey1", "execute()", new Object[0]);
                ((fz6) ((hq7) ((je7) ((ey1) this.b).b).getValue())).f();
                hm9.m("ey1", "repository prefetch ok", new Object[0]);
                return;
            case 28:
                ((h8b) this.b).q();
                return;
            default:
                q9b q9b = (q9b) this.b;
                int i3 = q9b.b;
                gh7 gh7 = q9b.Y;
                if (i3 == 0) {
                    q9b.c = true;
                    gh7.d(eg7.ON_PAUSE);
                }
                if (q9b.a == 0 && q9b.c) {
                    gh7.d(eg7.ON_STOP);
                    q9b.o = true;
                    return;
                }
                return;
        }
    }
}
