package defpackage;

import android.graphics.Path;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: vu4  reason: default package */
public class vu4 implements l30, kx3, s43, nr8, jm0, f7b, za7, j88, z0a, kz3, p2a {
    public static final vu4 X = new Object();
    public static vu4 Y;
    public static final vu4 a = new Object();
    public static final /* synthetic */ vu4 b = new Object();
    public static final vu4 c = new Object();
    public static final vu4 o = new Object();

    public static o43 l(o43 o43) {
        try {
            if (o43.n0(o43) && (o43.e0() instanceof CloseableStaticBitmap)) {
                return ((CloseableStaticBitmap) o43.e0()).cloneUnderlyingBitmapReference();
            }
            o43.S(o43);
            return null;
        } finally {
            o43.S(o43);
        }
    }

    public static Path q(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f3, f4);
        return path;
    }

    public static reb s(String str) {
        v25 v25 = reb.Y;
        v25.getClass();
        u1 u1Var = new u1(0, v25);
        while (u1Var.hasNext()) {
            reb reb = (reb) u1Var.next();
            if (tpa.f(reb.a, str)) {
                return reb;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public MediaCodecInfo a(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    public long b(long j) {
        return j;
    }

    public void c(wq8 wq8, boolean z) {
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [c1a, java.util.ArrayList] */
    public c1a call() {
        return new ArrayList(16);
    }

    public boolean d(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    public boolean e(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    public v1d f() {
        return new wd0(-9223372036854775807L);
    }

    public int g() {
        return MediaCodecList.getCodecCount();
    }

    public boolean h() {
        return false;
    }

    public void i(long j) {
    }

    public long j(sa4 sa4) {
        return -1;
    }

    public CharSequence k(Preference preference) {
        EditTextPreference editTextPreference = (EditTextPreference) preference;
        editTextPreference.getClass();
        if (!TextUtils.isEmpty((CharSequence) null)) {
            return null;
        }
        return editTextPreference.a.getString(y1c.not_set);
    }

    public j47 m(oy5 oy5) {
        String str = oy5.w0;
        if (str != null) {
            char c2 = 65535;
            switch (str.hashCode()) {
                case -1354451219:
                    if (str.equals("application/vnd.dvb.ait")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -1348231605:
                    if (str.equals("application/x-icy")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case -1248341703:
                    if (str.equals("application/id3")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 1154383568:
                    if (str.equals("application/x-emsg")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 1652648887:
                    if (str.equals("application/x-scte35")) {
                        c2 = 4;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    return new wo(0);
                case 1:
                    return new rs6();
                case 2:
                    return new at6((xs6) null);
                case 3:
                    return new wo(1);
                case 4:
                    return new vvd();
            }
        }
        String valueOf = String.valueOf(str);
        throw new IllegalArgumentException(valueOf.length() != 0 ? "Attempted to create decoder for unsupported MIME type: ".concat(valueOf) : new String("Attempted to create decoder for unsupported MIME type: "));
    }

    public boolean n() {
        return this instanceof f08;
    }

    public boolean o(wq8 wq8) {
        return false;
    }

    public void p(float f, float f2, float f3, pjd pjd) {
        pjd.c(f, 0.0f);
    }

    public Object parse(db7 db7) {
        db7.z();
        return null;
    }

    public boolean r(oy5 oy5) {
        String str = oy5.w0;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }

    public gle w(gy8 gy8) {
        int i;
        String str;
        long j;
        if (!gy8.m()) {
            return null;
        }
        try {
            i = lz7.N(gy8);
        } catch (Throwable th) {
            hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
            Iterator it = u7d.a.iterator();
            while (it.hasNext()) {
                ((r4a) it.next()).getClass();
                r4a.a(th);
            }
            int s = au1.s(k7d.a);
            if (s == 0) {
                i = 0;
            } else if (s != 1) {
                throw new NoWhenBranchMatchedException();
            } else {
                throw th;
            }
        }
        Long l = null;
        String str2 = null;
        for (int i2 = 0; i2 < i; i2++) {
            try {
                str = lz7.P(gy8);
            } catch (Throwable th2) {
                hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th2);
                Iterator it2 = u7d.a.iterator();
                while (it2.hasNext()) {
                    ((r4a) it2.next()).getClass();
                    r4a.a(th2);
                }
                int s2 = au1.s(k7d.a);
                if (s2 != 0) {
                    if (s2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw th2;
                }
            }
            if (str != null) {
                try {
                    if (str.equals("botId")) {
                        j = lz7.M(gy8, 0);
                        l = Long.valueOf(j);
                    } else if (str.equals("startParams")) {
                        str2 = lz7.P(gy8);
                    } else {
                        gy8.z();
                    }
                } catch (Throwable th3) {
                    hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                    Iterator it3 = u7d.a.iterator();
                    while (it3.hasNext()) {
                        ((r4a) it3.next()).getClass();
                        r4a.a(th3);
                    }
                    int s3 = au1.s(k7d.a);
                    if (s3 != 0) {
                        if (s3 != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw th3;
                    }
                }
            }
        }
        return new k95(str2, l);
    }
}
