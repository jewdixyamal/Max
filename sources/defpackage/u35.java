package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.PlaybackException;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;

/* renamed from: u35  reason: default package */
public final class u35 implements gd {
    public static final NumberFormat o;
    public final kue a = new kue();
    public final hue b = new hue();
    public final long c = SystemClock.elapsedRealtime();

    static {
        NumberFormat instance = NumberFormat.getInstance(Locale.US);
        o = instance;
        instance.setMinimumFractionDigits(2);
        instance.setMaximumFractionDigits(2);
        instance.setGroupingUsed(false);
    }

    public static String a(a70 a70) {
        return a70.a + "," + a70.c + "," + a70.b + "," + a70.d + "," + a70.e + "," + a70.f;
    }

    public static String d(long j) {
        if (j == -9223372036854775807L) {
            return "?";
        }
        return o.format((double) (((float) j) / 1000.0f));
    }

    public final void A(fd fdVar, p3b p3b, p3b p3b2, int i) {
        String str;
        StringBuilder sb = new StringBuilder("reason=");
        switch (i) {
            case 0:
                str = "AUTO_TRANSITION";
                break;
            case 1:
                str = "SEEK";
                break;
            case 2:
                str = "SEEK_ADJUSTMENT";
                break;
            case 3:
                str = "SKIP";
                break;
            case 4:
                str = "REMOVE";
                break;
            case 5:
                str = "INTERNAL";
                break;
            case 6:
                str = "SILENCE_SKIP";
                break;
            default:
                str = "?";
                break;
        }
        sb.append(str);
        sb.append(", PositionInfo:old [mediaItem=");
        sb.append(p3b.b);
        sb.append(", period=");
        sb.append(p3b.e);
        sb.append(", pos=");
        sb.append(p3b.f);
        int i2 = p3b.h;
        if (i2 != -1) {
            sb.append(", contentPos=");
            sb.append(p3b.g);
            sb.append(", adGroup=");
            sb.append(i2);
            sb.append(", ad=");
            sb.append(p3b.i);
        }
        sb.append("], PositionInfo:new [mediaItem=");
        sb.append(p3b2.b);
        sb.append(", period=");
        sb.append(p3b2.e);
        sb.append(", pos=");
        sb.append(p3b2.f);
        int i3 = p3b2.h;
        if (i3 != -1) {
            sb.append(", contentPos=");
            sb.append(p3b2.g);
            sb.append(", adGroup=");
            sb.append(i3);
            sb.append(", ad=");
            sb.append(p3b2.i);
        }
        sb.append("]");
        f(fdVar, "positionDiscontinuity", sb.toString());
    }

    public final void A0(fd fdVar, p0f p0f) {
        f99 f99;
        z04.t("tracks [" + c(fdVar));
        zw6 a2 = p0f.a();
        for (int i = 0; i < a2.size(); i++) {
            o0f o0f = (o0f) a2.get(i);
            z04.t("  group [");
            for (int i2 = 0; i2 < o0f.a; i2++) {
                String str = o0f.g(i2) ? "[X]" : "[ ]";
                z04.t("    " + str + " Track:" + i2 + ", " + qy5.e(o0f.c(i2)) + ", supported=" + oaf.z(o0f.d(i2)));
            }
            z04.t("  ]");
        }
        boolean z = false;
        int i3 = 0;
        while (!z && i3 < a2.size()) {
            o0f o0f2 = (o0f) a2.get(i3);
            int i4 = 0;
            while (!z && i4 < o0f2.a) {
                if (o0f2.g(i4) && (f99 = o0f2.c(i4).k) != null && f99.d() > 0) {
                    z04.t("  Metadata [");
                    g(f99, "    ");
                    z04.t("  ]");
                    z = true;
                }
                i4++;
            }
            i3++;
        }
        z04.t("]");
    }

    public final void B(fd fdVar, c3b c3b) {
        f(fdVar, "playbackParameters", c3b.toString());
    }

    public final void B0(fd fdVar, Exception exc) {
        z04.u(b(fdVar, "internalError", "drmSessionManagerError", exc));
    }

    public final void C(fd fdVar, String str) {
        f(fdVar, "audioDecoderInitialized", str);
    }

    public final void C0(fd fdVar, int i) {
        f(fdVar, "playbackSuppressionReason", i != 0 ? i != 1 ? "?" : "TRANSIENT_AUDIO_FOCUS_LOSS" : "NONE");
    }

    public final void D(fd fdVar, f99 f99) {
        z04.t("metadata [" + c(fdVar));
        g(f99, "  ");
        z04.t("]");
    }

    public final void D0(fd fdVar) {
        e(fdVar, "drmKeysRestored");
    }

    public final void E(fd fdVar, int i) {
        f(fdVar, "state", i != 1 ? i != 2 ? i != 3 ? i != 4 ? "?" : "ENDED" : "READY" : "BUFFERING" : "IDLE");
    }

    public final void E0(fd fdVar, pc8 pc8) {
        f(fdVar, "upstreamDiscarded", qy5.e((qy5) pc8.g));
    }

    public final void F(fd fdVar, int i) {
        f(fdVar, "droppedFrames", Integer.toString(i));
    }

    public final void H(fd fdVar, qy5 qy5) {
        f(fdVar, "audioInputFormat", qy5.e(qy5));
    }

    public final void I(fd fdVar, int i, int i2) {
        f(fdVar, "surfaceSize", i + ", " + i2);
    }

    public final void J(fd fdVar, n54 n54) {
        e(fdVar, "videoDisabled");
    }

    public final void K(fd fdVar, int i) {
        f(fdVar, "repeatMode", i != 0 ? i != 1 ? i != 2 ? "?" : "ALL" : "ONE" : "OFF");
    }

    public final void L(fd fdVar, int i, long j) {
    }

    public final void M(fd fdVar, h30 h30) {
        f(fdVar, "audioAttributes", h30.a + "," + h30.b + "," + h30.c + "," + h30.d);
    }

    public final void P(fd fdVar, a70 a70) {
        f(fdVar, "audioTrackInit", a(a70));
    }

    public final void Q(fd fdVar) {
        e(fdVar, "videoEnabled");
    }

    public final void R(fd fdVar, pc8 pc8, IOException iOException, boolean z) {
        z04.u(b(fdVar, "internalError", "loadError", iOException));
    }

    public final void T(fd fdVar, jlf jlf) {
        f(fdVar, "videoSize", jlf.a + ", " + jlf.b);
    }

    public final void U(fd fdVar, int i) {
        mue mue = fdVar.b;
        int i2 = mue.i();
        int p = mue.p();
        StringBuilder sb = new StringBuilder("timeline [");
        sb.append(c(fdVar));
        sb.append(", periodCount=");
        sb.append(i2);
        sb.append(", windowCount=");
        sb.append(p);
        sb.append(", reason=");
        sb.append(i != 0 ? i != 1 ? "?" : "SOURCE_UPDATE" : "PLAYLIST_CHANGED");
        z04.t(sb.toString());
        for (int i3 = 0; i3 < Math.min(i2, 3); i3++) {
            hue hue = this.b;
            mue.g(i3, hue, false);
            z04.t("  period [" + d(oaf.h0(hue.d)) + "]");
        }
        if (i2 > 3) {
            z04.t("  ...");
        }
        for (int i4 = 0; i4 < Math.min(p, 3); i4++) {
            kue kue = this.a;
            mue.o(i4, kue);
            z04.t("  window [" + d(oaf.h0(kue.m)) + ", seekable=" + kue.h + ", dynamic=" + kue.i + "]");
        }
        if (p > 3) {
            z04.t("  ...");
        }
        z04.t("]");
    }

    public final void V(fd fdVar, qy5 qy5) {
        f(fdVar, "videoInputFormat", qy5.e(qy5));
    }

    public final void W(fd fdVar, pc8 pc8) {
        f(fdVar, "downstreamFormat", qy5.e((qy5) pc8.g));
    }

    public final void Z(fd fdVar, int i) {
        StringBuilder sb = new StringBuilder("mediaItem [");
        sb.append(c(fdVar));
        sb.append(", reason=");
        sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? "?" : "PLAYLIST_CHANGED" : "SEEK" : "AUTO" : "REPEAT");
        sb.append("]");
        z04.t(sb.toString());
    }

    public final String b(fd fdVar, String str, String str2, Throwable th) {
        StringBuilder o2 = rh4.o(str, " [");
        o2.append(c(fdVar));
        String sb = o2.toString();
        if (th instanceof PlaybackException) {
            StringBuilder o3 = rh4.o(sb, ", errorCode=");
            o3.append(((PlaybackException) th).b());
            sb = o3.toString();
        }
        if (str2 != null) {
            sb = rh4.j(sb, ", ", str2);
        }
        String I = z04.I(th);
        if (!TextUtils.isEmpty(I)) {
            StringBuilder o4 = rh4.o(sb, "\n  ");
            o4.append(I.replace("\n", "\n  "));
            o4.append(10);
            sb = o4.toString();
        }
        return au1.g(sb, "]");
    }

    public final String c(fd fdVar) {
        String str = "window=" + fdVar.c;
        yj8 yj8 = fdVar.d;
        if (yj8 != null) {
            StringBuilder o2 = rh4.o(str, ", period=");
            o2.append(fdVar.b.b(yj8.a));
            str = o2.toString();
            if (yj8.b()) {
                StringBuilder o3 = rh4.o(str, ", adGroup=");
                o3.append(yj8.b);
                StringBuilder o4 = rh4.o(o3.toString(), ", ad=");
                o4.append(yj8.c);
                str = o4.toString();
            }
        }
        return "eventTime=" + d(fdVar.a - this.c) + ", mediaPos=" + d(fdVar.e) + ", " + str;
    }

    public final void e(fd fdVar, String str) {
        z04.t(b(fdVar, str, (String) null, (Throwable) null));
    }

    public final void e0(fd fdVar, Object obj, long j) {
        f(fdVar, "renderedFirstFrame", String.valueOf(obj));
    }

    public final void f(fd fdVar, String str, String str2) {
        z04.t(b(fdVar, str, str2, (Throwable) null));
    }

    public final void g(f99 f99, String str) {
        for (d99 append : f99.a) {
            StringBuilder l = au1.l(str);
            l.append(append);
            z04.t(l.toString());
        }
    }

    public final void g0(fd fdVar, String str) {
        f(fdVar, "videoDecoderReleased", str);
    }

    public final void h0(fd fdVar, a70 a70) {
        f(fdVar, "audioTrackReleased", a(a70));
    }

    public final void j0(fd fdVar) {
        e(fdVar, "audioEnabled");
    }

    public final void k0(fd fdVar, int i) {
        f(fdVar, "drmSessionAcquired", "state=" + i);
    }

    public final void l0(fd fdVar) {
        e(fdVar, "audioDisabled");
    }

    public final void m0(fd fdVar, PlaybackException playbackException) {
        z04.u(b(fdVar, "playerFailed", (String) null, playbackException));
    }

    public final void n0(fd fdVar, float f) {
        f(fdVar, "volume", Float.toString(f));
    }

    public final void o0(fd fdVar, int i, long j, long j2) {
        z04.u(b(fdVar, "audioTrackUnderrun", i + ", " + j + ", " + j2, (Throwable) null));
    }

    public final void r(fd fdVar, boolean z) {
        f(fdVar, "shuffleModeEnabled", Boolean.toString(z));
    }

    public final void s(fd fdVar) {
        e(fdVar, "drmKeysLoaded");
    }

    public final void t(fd fdVar, boolean z) {
        f(fdVar, "isPlaying", Boolean.toString(z));
    }

    public final void v0(fd fdVar) {
        e(fdVar, "drmSessionReleased");
    }

    public final void w(fd fdVar) {
        e(fdVar, "drmKeysRemoved");
    }

    public final void w0(fd fdVar, String str) {
        f(fdVar, "videoDecoderInitialized", str);
    }

    public final void x(fd fdVar, String str) {
        f(fdVar, "audioDecoderReleased", str);
    }

    public final void y0(fd fdVar, boolean z) {
        f(fdVar, "loading", Boolean.toString(z));
    }

    public final void z(fd fdVar, boolean z) {
        f(fdVar, "skipSilenceEnabled", Boolean.toString(z));
    }

    public final void z0(fd fdVar, boolean z, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(z);
        sb.append(", ");
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "?" : "END_OF_MEDIA_ITEM" : "REMOTE" : "AUDIO_BECOMING_NOISY" : "AUDIO_FOCUS_LOSS" : "USER_REQUEST");
        f(fdVar, "playWhenReady", sb.toString());
    }
}
