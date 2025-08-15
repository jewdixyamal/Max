package defpackage;

import android.content.Context;
import android.content.Intent;
import android.media.projection.MediaProjection;
import android.text.TextUtils;
import androidx.media3.transformer.ExportException;
import com.my.tracker.obfuscated.g0;
import com.my.tracker.obfuscated.t;
import com.my.tracker.obfuscated.z0;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.http.util.LangUtils;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.ContextUtils;
import org.webrtc.EglBase;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.Size;
import org.webrtc.VideoFileRenderer;
import org.webrtc.VideoFrame;
import org.webrtc.audio.JavaAudioDeviceModule;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.stereo.internal.StereoRoomManagerImpl;
import ru.ok.android.externcalls.sdk.urlsharing.external.internal.listener.UrlSharingListenerManagerImpl;
import ru.ok.tamtam.nano.Protos;

/* renamed from: ewc  reason: default package */
public final /* synthetic */ class ewc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ ewc(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.o = obj3;
    }

    /* JADX WARNING: type inference failed for: r9v1, types: [fd7, org.webrtc.audio.JavaAudioDeviceModule$AudioRecordSampleHook, java.lang.Object] */
    public final void run() {
        boolean z;
        int i;
        int i2 = 6;
        boolean z2 = false;
        switch (this.a) {
            case 0:
                fwc fwc = (fwc) this.b;
                Intent intent = (Intent) this.o;
                fwc.Y.e();
                l26 l26 = fwc.X;
                l26.getClass();
                l26.c.c(new k26(l26, 0));
                h26 h26 = fwc.o;
                h26.getClass();
                h26.o.c(new v05((Object) h26, (Object) intent, (Object) (Size) this.c, 5));
                return;
            case 1:
                qld qld = (qld) this.b;
                EglBase eglBase = (EglBase) this.c;
                a4c a4c = (a4c) this.o;
                qld.h = eglBase;
                a4c.log("SharedPeerConnectionFac", "create");
                qld.c = "H264";
                a4c.log("SharedPeerConnectionFac", "Preferred video codec: " + qld.c);
                a4c.log("SharedPeerConnectionFac", "Create internal peer connection factory ...");
                y8 y8Var = new y8((Object) a4c);
                l7b l7b = new l7b(y8Var, a4c, false, 5);
                JavaAudioDeviceModule.Builder builder = JavaAudioDeviceModule.builder(ContextUtils.getApplicationContext());
                ? obj = new Object();
                obj.a = new CopyOnWriteArraySet();
                qld.f = obj;
                qld.g = builder.setAudioRecordSampleHook(obj).setAudioRecordStateCallback(y8Var).setAudioRecordErrorCallback(l7b).setAudioTrackStateCallback(y8Var).setAudioTrackErrorCallback(y8Var).setUseSilenceProvider(true).createAudioDeviceModule();
                if (nsa.A().g) {
                    qld.g.setMicrophoneMute(true);
                }
                qsa A = nsa.A();
                String str = "WebRTC-IntelVP8/Enabled/WebRTC-Audio-SendSideBwe/Enabled/WebRTC-SendSideBwe-WithOverhead/Enabled/WebRTC-FeedbackTimeout/Enabled/WebRTC-Bwe-SafeResetOnRouteChange/Enabled/".concat((A.a || A.b) ? "WebRTC-Audio-Red-For-Opus/Enabled-2/" : "WebRTC-Audio-Red-For-Opus/Disabled/") + "WebRTC-SpsPpsIdrIsH264Keyframe/Enabled/";
                String str2 = A.c;
                if (!TextUtils.isEmpty(str2)) {
                    str = str + "WebRTC-OK-StunCustomAttr/Enabled-" + str2 + "/";
                }
                String str3 = A.d;
                if (!TextUtils.isEmpty(str3)) {
                    str = str + "WebRTC-OK-TurnChannelDataMark/" + str3 + "/";
                }
                Integer num = A.e;
                if (num != null) {
                    int intValue = num.intValue();
                    if (intValue < 0) {
                        intValue = 1000;
                    }
                    str = str + "WebRTC-RttMult/Enabled-1.0," + intValue + "/";
                }
                String str4 = str + "WebRTC-Bwe-LossBasedBweV2/Enabled:true,CandidateFactors:1.02|1.0|0.95,DelayBasedCandidate:true,HigherBwBiasFactor:0.0002,HigherLogBwBiasFactor:0.02,ObservationDurationLowerBound:250ms,InstantUpperBoundBwBalance:75kbps,BwRampupUpperBoundFactor:1000000.0,InstantUpperBoundTemporalWeightFactor:0.9,TemporalWeightFactor:0.9,MaxIncreaseFactor:1.3,NewtonStepSize:0.75,InherentLossUpperBoundBwBalance:75kbps,LossThresholdOfHighBandwidthPreference:0.15,NotIncreaseIfInherentLossLessThanAverageLoss:true,_20230522/";
                if (A.f) {
                    str4 = str4 + "CallsSDK-Audio-EarlyStartPlayout/Enabled/";
                }
                if (A.g) {
                    str4 = str4 + "CallsSDK-Audio-EarlyStartRecording/Enabled/";
                }
                if (A.h) {
                    str4 = str4 + "WebRTC-IceFieldTrials/skip_relay_to_non_relay_connections:true/";
                }
                psa psa = A.j;
                if (psa == null || !psa.a) {
                    z = false;
                } else {
                    Boolean bool = Boolean.TRUE;
                    if (tpa.f(psa.c, bool)) {
                        str4 = str4 + "CallsSDK-Audio-OpusFECWithDRED/Enabled/";
                    }
                    if (tpa.f(psa.b, bool)) {
                        str4 = str4 + "CallsSDK-Audio-OpusNOLACE/Enabled/";
                        z = true;
                    } else {
                        z = false;
                    }
                    Integer num2 = psa.f;
                    if (num2 != null) {
                        str4 = str4 + "CallsSDK-Audio-OpusDREDByBitrate/Enabled:" + num2 + "/";
                    }
                    Integer num3 = psa.e;
                    if (num3 != null) {
                        str4 = str4 + "CallsSDK-Audio-OpusAdapterMinBitrate/Enabled:" + num3 + "/";
                    }
                    if (tpa.f(psa.d, bool)) {
                        str4 = str4 + qsa.a(z);
                        z2 = true;
                    }
                }
                osa b2 = A.b();
                Integer num4 = b2.b;
                int intValue2 = num4 != null ? num4.intValue() : 6;
                Integer num5 = b2.a;
                if (num5 != null) {
                    i2 = num5.intValue();
                }
                Boolean bool2 = b2.c;
                String str5 = str4 + "WebRTC-Audio-AdaptivePtime/enabled:true,min_payload_bitrate:" + intValue2 + "kbps,min_encoder_bitrate:" + i2 + "kbps,use_slow_adaptation:" + (bool2 != null ? bool2.booleanValue() : true) + "/";
                if (A.k && !z2) {
                    str5 = str5 + qsa.a(z);
                }
                if (A.l) {
                    str5 = str5 + "CallsSDK-DisableSharedSocket/Enabled/";
                }
                String str6 = A.m;
                if (!(str6 == null || str6.length() == 0)) {
                    str5 = str5 + str6;
                }
                a4c.log("SharedPeerConnectionFac", "Field trials: " + str5);
                PeerConnectionFactory.initializeFieldTrials(str5);
                qld.d = PeerConnectionFactory.builder().setVideoDecoderFactory(qld.e).setVideoEncoderFactory(qld.j).setAudioDeviceModule(qld.g).createPeerConnectionFactory();
                if (qld.d != null) {
                    a4c.log("SharedPeerConnectionFac", jb9.c(qld.d) + " was created");
                    boolean z3 = jb9.a ^ true;
                    a4c.log("SharedPeerConnectionFac", "Is VIDEO HW acceleration enabled? ".concat(z3 ? "yes" : "no"));
                    if (z3 && eglBase != null) {
                        a4c.log("SharedPeerConnectionFac", "Enable video hardware acceleration options for " + jb9.c(qld.d));
                        return;
                    }
                    return;
                }
                throw new IllegalStateException();
            case 2:
                qld qld2 = (qld) this.b;
                MediaProjection mediaProjection = (MediaProjection) this.o;
                qld2.getClass();
                kq7 kq7 = ((d) this.c).z0;
                if (kq7 != null) {
                    kq7.j(true);
                }
                qld2.g.startDeviceAudioShare(mediaProjection);
                return;
            case 3:
                rod rod = (rod) this.b;
                boolean z4 = rod.p;
                JSONObject jSONObject = (JSONObject) this.c;
                a4c a4c2 = rod.b;
                if (!z4) {
                    a4c2.log("OKSignaling", "<!> ignoring " + jSONObject.toString());
                    return;
                }
                try {
                    Iterator it = rod.l.iterator();
                    while (it.hasNext()) {
                        ((qod) it.next()).j(jSONObject);
                    }
                    return;
                } catch (JSONException e) {
                    a4c2.reportException("OKSignaling", (String) this.o, e);
                    return;
                }
            case 4:
                StereoRoomManagerImpl.withInternalId$lambda$12((StereoRoomManagerImpl) this.b, (ParticipantId) this.c, (m56) this.o);
                return;
            case 5:
                h2e h2e = ((g2e) this.b).a;
                if (h2e.f != null) {
                    String str7 = (String) this.o;
                    boolean t = oag.t(str7);
                    File file = (File) this.c;
                    if (!t) {
                        kk5 kk5 = (kk5) h2e.e;
                        kk5.getClass();
                        File o2 = pag.o(kk5.g(kk5.b(), "stickerCache"), tfg.e(str7));
                        if (!o2.exists() || !o2.canRead()) {
                            try {
                                o2.getParentFile().mkdirs();
                                s5c.s(file, o2);
                            } catch (IOException unused) {
                            }
                        }
                        file = o2;
                    }
                    h2e.c(h2e.f, file);
                    return;
                }
                return;
            case 6:
                ((nw4) this.b).k((iee) this.c, (Map.Entry) this.o);
                return;
            case 7:
                vee vee = ((wee) this.b).f;
                see see = vee.b;
                if (see != null) {
                    Objects.toString(see);
                    vee.b.d();
                }
                boolean z5 = vee.Z;
                see see2 = (see) this.c;
                if (z5) {
                    vee.Z = false;
                    see2.d();
                    see2.j.b((Object) null);
                    return;
                }
                vee.b = see2;
                vee.o = (u00) this.o;
                android.util.Size size = see2.b;
                vee.a = size;
                vee.Y = false;
                if (!vee.a()) {
                    vee.s0.e.getHolder().setFixedSize(size.getWidth(), size.getHeight());
                    return;
                }
                return;
            case 8:
                l1f l1f = (l1f) this.b;
                l1f.getClass();
                ffc j = ((ww6) this.c).j();
                k8g k8g = l1f.d;
                String str8 = (String) k8g.b;
                String str9 = (String) k8g.c;
                ece ece = l1f.e;
                ece.getClass();
                ExportException exportException = (ExportException) this.o;
                int i3 = exportException.a;
                h1f h1f = (h1f) ece.a;
                if (i3 == 7003 && ((i = h1f.v) == 5 || i == 6 || i == 1 || i == 2 || i == 3 || i == 4)) {
                    h1f.s = null;
                    h1f.r = null;
                    t85 t85 = h1f.q;
                    t85.b();
                    t85.p = 6;
                    h1f.a(h1f);
                    return;
                }
                h1f.q.a.e(j);
                t85 t852 = h1f.q;
                if (str8 != null) {
                    t852.g = str8;
                }
                if (str9 != null) {
                    t852.n = str9;
                }
                t852.q = exportException;
                h1f.r = null;
                ypc ypc = new ypc(h1f, 12, exportException);
                pm7 pm7 = h1f.f;
                pm7.c(-1, ypc);
                pm7.b();
                h1f.v = 0;
                return;
            case 9:
                UrlSharingListenerManagerImpl.saveUrlSharing$lambda$0((UrlSharingListenerManagerImpl) this.b, (jpd) this.c, (zad) this.o);
                return;
            case 10:
                bm7 bm7 = (bm7) this.b;
                ccd ccd = (ccd) this.c;
                try {
                    try {
                        ccd.n(((vu) this.o).apply(fm9.C(bm7)));
                        return;
                    } catch (Throwable th) {
                        ccd.m(th);
                        return;
                    }
                } catch (CancellationException unused2) {
                    ccd.cancel(false);
                    return;
                } catch (ExecutionException e2) {
                    e = e2;
                    Throwable cause = e.getCause();
                    if (cause != null) {
                        e = cause;
                    }
                    ccd.m(e);
                    return;
                } catch (Error | RuntimeException e3) {
                    ccd.m(e3);
                    return;
                }
            case 11:
                ccd ccd2 = (ccd) this.b;
                Runnable runnable = (Runnable) this.c;
                Object obj2 = this.o;
                try {
                    if (!(ccd2.a instanceof q0)) {
                        runnable.run();
                        ccd2.l(obj2);
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    ccd2.m(th2);
                    return;
                }
            case Protos.Attaches.Attach.PRESENT /*12*/:
                c54.p("Surface update cancellation should only occur on main thread.", kq0.t());
                ((AtomicBoolean) this.b).set(true);
                bad bad = (bad) this.c;
                iv1 iv1 = (iv1) this.o;
                ((ArrayList) bad.b.d).remove(iv1);
                bad.e.remove(iv1);
                return;
            case 13:
                ((VideoFileRenderer) this.b).lambda$renderFrameOnRenderThread$1((VideoFrame.I420Buffer) this.c, (VideoFrame) this.o);
                return;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                aab aab = (aab) this.b;
                aab.getClass();
                int i4 = oaf.a;
                u75 u75 = ((o75) aab.b).a;
                u75.getClass();
                i74 i74 = u75.D0;
                fd F = i74.F();
                i74.I(F, 1017, new x64(F, (qy5) this.c, (s54) this.o, 0));
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                wva wva = (wva) this.b;
                wva.getClass();
                int i5 = maf.a;
                n75 n75 = (n75) wva.c;
                n75.getClass();
                t75 t75 = n75.a;
                t75.getClass();
                h74 h74 = t75.C0;
                ed P = h74.P();
                h74.Q(P, 1017, new v64(P, (oy5) this.c, (r54) this.o));
                return;
            case 16:
                hoc hoc = (hoc) this.c;
                roc roc = (roc) this.o;
                k8g k8g2 = (k8g) this.b;
                Iterator it2 = ((CopyOnWriteArrayList) k8g2.b).iterator();
                while (it2.hasNext()) {
                    loc loc = (loc) it2.next();
                    try {
                        Long l = (Long) loc.d.get(hoc);
                        if (l != null) {
                            loc.b.log(loc.a, "<- [" + l + "]: " + roc);
                        }
                    } catch (Throwable th3) {
                        ((a4c) k8g2.a).reportException("CallsListeners", "rtc.command.handle.listeners.oncommandsuccess", th3);
                    }
                }
                return;
            case LangUtils.HASH_SEED /*17*/:
                hoc hoc2 = (hoc) this.c;
                Throwable th4 = (Throwable) this.o;
                k8g k8g3 = (k8g) this.b;
                Iterator it3 = ((CopyOnWriteArrayList) k8g3.b).iterator();
                while (it3.hasNext()) {
                    loc loc2 = (loc) it3.next();
                    try {
                        Long l2 = (Long) loc2.d.get(hoc2);
                        if (l2 != null) {
                            loc2.b.log(loc2.a, "<- [" + l2 + "]: " + th4);
                        }
                    } catch (Throwable th5) {
                        ((a4c) k8g3.a).reportException("CallsListeners", "rtc.command.handle.listeners.oncommanderror", th5);
                    }
                }
                return;
            default:
                g0.a((Context) this.b, (z0) this.c, (t) this.o);
                return;
        }
    }
}
