package defpackage;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ProcessingException;
import androidx.media3.common.VideoFrameProcessingException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager;
import ru.ok.android.externcalls.sdk.sessionroom.internal.listener.SessionRoomListenerManagerImpl;
import ru.ok.android.externcalls.sdk.sessionroom.internal.participant.SessionRoomParticipantsDataProviderImpl;
import ru.ok.tamtam.android.widgets.quickcamera.CameraxCameraApiView;
import ru.ok.tamtam.nano.Protos;

/* renamed from: flc  reason: default package */
public final /* synthetic */ class flc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ flc(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final void run() {
        Throwable th;
        long j = 0;
        int i = 0;
        switch (this.a) {
            case 0:
                wv7 wv7 = (wv7) this.b;
                int h = wv7.h();
                while (i < h) {
                    long e = wv7.e(i);
                    r7b r7b = (r7b) wv7.i(i);
                    if (e > j) {
                        ir3 h2 = ((glc) this.c).h();
                        int i2 = r7b.b;
                        ilc ilc = h2.a;
                        ilc.b();
                        th thVar = h2.d;
                        q36 f = thVar.f();
                        f.j(1, (long) i2);
                        f.j(2, (long) r7b.a);
                        f.j(3, e);
                        try {
                            ilc.c();
                            f.n();
                            ilc.r();
                            ilc.l();
                            thVar.t(f);
                        } catch (Throwable th2) {
                            thVar.t(f);
                            throw th2;
                        }
                    }
                    i++;
                    j = 0;
                }
                return;
            case 1:
                for (Map.Entry entry : ((Map) this.b).entrySet()) {
                    long longValue = ((Number) entry.getKey()).longValue();
                    t19 d = ((vlc) this.c).d();
                    ilc ilc2 = d.a;
                    ilc2.b();
                    p19 p19 = d.n;
                    q36 f2 = p19.f();
                    d.a().getClass();
                    byte[] d2 = v89.d((ix8) entry.getValue());
                    if (d2 == null) {
                        f2.W(1);
                    } else {
                        f2.k(1, d2);
                    }
                    f2.j(2, longValue);
                    try {
                        ilc2.c();
                        f2.n();
                        ilc2.r();
                        ilc2.l();
                        p19.t(f2);
                    } catch (Throwable th3) {
                        p19.t(f2);
                        throw th3;
                    }
                }
                return;
            case 2:
                for (wua b2 : (List) this.b) {
                    wlc wlc = (wlc) this.c;
                    rva c2 = wlc.c();
                    xua b3 = wlc.b(wlc, b2);
                    ilc ilc3 = c2.a;
                    ilc3.b();
                    ilc3.c();
                    try {
                        c2.b.C(b3);
                        ilc3.r();
                    } finally {
                        ilc3.l();
                    }
                }
                return;
            case 3:
                for (Map.Entry entry2 : ((Map) this.b).entrySet()) {
                    String str = (String) entry2.getKey();
                    long longValue2 = ((Number) entry2.getValue()).longValue();
                    rva c3 = ((wlc) this.c).c();
                    ilc ilc4 = c3.a;
                    ilc4.b();
                    p19 p192 = c3.d;
                    q36 f3 = p192.f();
                    f3.j(1, longValue2);
                    f3.j(2, (long) 1);
                    if (str == null) {
                        f3.W(3);
                    } else {
                        f3.f(3, str);
                    }
                    try {
                        ilc4.c();
                        f3.n();
                        ilc4.r();
                        ilc4.l();
                        p192.t(f3);
                    } catch (Throwable th4) {
                        p192.t(f3);
                        throw th4;
                    }
                }
                return;
            case 4:
                koc koc = (koc) this.b;
                if (!koc.j.get()) {
                    long j2 = koc.k + 1;
                    koc.k = j2;
                    ioc ioc = (ioc) this.c;
                    koc.l.put(j2, new uag(j2, ioc, koc.o));
                    k8g k8g = koc.n;
                    k8g.getClass();
                    ((Handler) k8g.c).post(new gbg(k8g, ioc.b, 0));
                    koc.f.post(new joc(koc, j2, 0));
                    return;
                }
                return;
            case 5:
                koc koc2 = (koc) this.b;
                AtomicBoolean atomicBoolean = koc2.j;
                if (!atomicBoolean.get()) {
                    AtomicReference atomicReference = koc2.b;
                    e24 e24 = (e24) atomicReference.get();
                    e24 e242 = (e24) this.c;
                    if (e24 != e242) {
                        atomicReference.set(e242);
                        vag vag = koc2.d;
                        pbg pbg = koc2.c;
                        if (e24 != null) {
                            if (pbg != null) {
                                e24.c.remove(pbg);
                                e24.c(vag);
                            } else {
                                throw new IllegalArgumentException("Illegal 'listener' value: null");
                            }
                        }
                        koc2.a();
                        if (e242 != null) {
                            e242.a(vag);
                            if (pbg != null) {
                                e242.c.add(pbg);
                                boolean b4 = e242.b();
                                e24 e243 = (e24) atomicReference.get();
                                if (!atomicBoolean.get() && e243 == e242) {
                                    if (b4) {
                                        koc2.b();
                                        return;
                                    } else {
                                        koc2.a();
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            } else {
                                throw new IllegalArgumentException("Illegal 'listener' value: null");
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 6:
                qp4 qp4 = (qp4) this.b;
                if (!((AtomicBoolean) qp4.Z).get()) {
                    AtomicReference atomicReference2 = (AtomicReference) qp4.s0;
                    e24 e244 = (e24) atomicReference2.get();
                    e24 e245 = (e24) this.c;
                    if (e244 != e245) {
                        atomicReference2.set(e245);
                        vag vag2 = (vag) qp4.t0;
                        if (e244 != null) {
                            e244.c(vag2);
                        }
                        if (e245 != null) {
                            e245.a(vag2);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 7:
                Throwable th5 = (Throwable) this.c;
                qp4 qp42 = (qp4) this.b;
                Iterator it = ((CopyOnWriteArrayList) qp42.a).iterator();
                while (it.hasNext()) {
                    try {
                        ((poc) it.next()).c(th5);
                    } catch (Throwable th6) {
                        ((a4c) qp42.c).reportException("RtcNotificationReceiver", "rtc.notification.handle.notificationerror", th6);
                    }
                }
                return;
            case 8:
                ooc ooc = (ooc) this.c;
                qp4 qp43 = (qp4) this.b;
                Iterator it2 = ((CopyOnWriteArrayList) qp43.a).iterator();
                while (it2.hasNext()) {
                    try {
                        ((poc) it2.next()).b(ooc);
                    } catch (Throwable th7) {
                        ((a4c) qp43.c).reportException("RtcNotificationReceiver", "rtc.notification.handle.notificationreceived", th7);
                    }
                }
                return;
            case 9:
                fwc fwc = (fwc) this.b;
                e24 e246 = (e24) this.c;
                fwc.Y.d(e246);
                if (fwc.Z && e246 != null) {
                    fwc.Y.e();
                    return;
                }
                return;
            case 10:
                SessionRoomListenerManagerImpl.sendActualState$lambda$12((SessionRoomListenerManagerImpl) this.b, (SessionRoomsManager.OwnRoomsListener) this.c);
                return;
            case 11:
                SessionRoomListenerManagerImpl.onRoomUpdated$lambda$5((SessionRoomListenerManagerImpl) this.b, (ql1) this.c);
                return;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                SessionRoomListenerManagerImpl.onCurrentParticipantActiveRoomChanged$lambda$9((SessionRoomListenerManagerImpl) this.b, (nl1) this.c);
                return;
            case 13:
                SessionRoomListenerManagerImpl.onRoomRemoved$lambda$3((SessionRoomListenerManagerImpl) this.b, (pl1) this.c);
                return;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                SessionRoomListenerManagerImpl.onCurrentParticipantInvitedToRoom$lambda$7((SessionRoomListenerManagerImpl) this.b, (ol1) this.c);
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                SessionRoomParticipantsDataProviderImpl.resolveInternalIdByExternal$lambda$1((m56) this.b, (ParticipantId) this.c);
                return;
            case 16:
                qld qld = (qld) this.b;
                qld.getClass();
                kq7 kq7 = ((d) this.c).z0;
                if (kq7 != null) {
                    kq7.j(false);
                }
                qld.g.stopDeviceAudioShare();
                return;
            case LangUtils.HASH_SEED /*17*/:
                fd7 fd7 = ((qld) this.b).f;
                if (fd7 != null) {
                    ((CopyOnWriteArraySet) fd7.a).remove(new tag(0, (z99) this.c));
                    return;
                }
                return;
            case 18:
                rod rod = (rod) this.b;
                boolean z = rod.p;
                JSONObject jSONObject = (JSONObject) this.c;
                a4c a4c = rod.b;
                if (!z) {
                    a4c.log("OKSignaling", "<!> ignoring " + jSONObject.toString());
                    return;
                }
                try {
                    Iterator it3 = rod.k.iterator();
                    while (it3.hasNext()) {
                        ((qod) it3.next()).j(jSONObject);
                    }
                    return;
                } catch (JSONException e2) {
                    a4c.reportException("OKSignaling", "signaling.listener.response.notification", e2);
                    return;
                }
            case 19:
                ((ard) ((g03) this.b).c).o.c((VideoFrameProcessingException) this.c);
                return;
            case 20:
                ((ViewPropertyAnimator) this.b).translationY(0.0f).setDuration(200).setInterpolator((AccelerateDecelerateInterpolator) ((bud) this.c).b.getValue()).start();
                return;
            case 21:
                svd svd = (svd) this.b;
                SurfaceTexture surfaceTexture = svd.u0;
                Surface surface = svd.v0;
                SurfaceTexture surfaceTexture2 = (SurfaceTexture) this.c;
                Surface surface2 = new Surface(surfaceTexture2);
                svd.u0 = surfaceTexture2;
                svd.v0 = surface2;
                Iterator it4 = svd.a.iterator();
                while (it4.hasNext()) {
                    ((n75) it4.next()).a.m2(surface2);
                }
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                if (surface != null) {
                    surface.release();
                    return;
                }
                return;
            case 22:
                kee kee = (kee) this.b;
                kee.getClass();
                ((tj3) ((AtomicReference) this.c).get()).accept(new zb0(kee));
                return;
            case 23:
                see see = (see) this.c;
                mee mee = (mee) this.b;
                mee.getClass();
                try {
                    mee.a.a(see);
                    return;
                } catch (ProcessingException e3) {
                    mee.c.accept(e3);
                    return;
                }
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                kee kee2 = (kee) this.c;
                mee mee2 = (mee) this.b;
                mee2.getClass();
                try {
                    mee2.a.c(kee2);
                    return;
                } catch (ProcessingException e4) {
                    mee2.c.accept(e4);
                    return;
                }
            case 25:
                ((vje) this.b).X.remove((yhc) this.c);
                return;
            case 26:
                ey1 ey1 = ((fc0) this.b).c;
                if (ey1 != null) {
                    ey1.k((ImageCaptureException) this.c);
                    return;
                }
                throw new IllegalStateException("One and only one callback is allowed.");
            case 27:
                ey1 ey12 = ((fc0) this.b).c;
                Objects.requireNonNull(ey12);
                ov6 ov6 = (ov6) this.c;
                Objects.requireNonNull(ov6);
                hm9.m(ey1.class.getName(), "capture image with success", new Object[0]);
                CameraxCameraApiView cameraxCameraApiView = (CameraxCameraApiView) ey12.b;
                try {
                    ByteBuffer t = ov6.v()[0].t();
                    byte[] bArr = new byte[t.capacity()];
                    t.rewind();
                    t.get(bArr);
                    cx1 cx1 = cameraxCameraApiView.s0;
                    if (cx1 != null) {
                        urb urb = ((rrb) ((rxd) cx1).b).o;
                        if (urb == null) {
                            urb = null;
                        }
                        pnf.n(urb, ((w9a) urb.s0).b(), (vx3) null, new srb(urb, bArr, (Continuation) null), 2);
                    }
                    m6d.c(ov6, (Throwable) null);
                    return;
                } catch (Throwable th8) {
                    Throwable th9 = th8;
                    m6d.c(ov6, th);
                    throw th9;
                }
            case 28:
                ((lme) this.b).e((gle) this.c);
                return;
            default:
                f6 f6Var = (f6) this.c;
                wle wle = (wle) this.b;
                wle.getClass();
                try {
                    f6Var.run();
                    return;
                } catch (Throwable th10) {
                    Throwable th11 = th10;
                    hm9.p("wle", "fail", th11);
                    ((cba) ((o45) wle.k.getValue())).c(th11, true);
                    return;
                }
        }
    }
}
