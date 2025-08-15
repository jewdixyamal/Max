package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import androidx.cardview.widget.CardView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import org.apache.http.util.LangUtils;

/* renamed from: ob6  reason: default package */
public final class ob6 implements qj3, b7b, km0, e46, za7, k88, lm9, ihb, kz3, dnc {
    public static final ob6 X = new Object();
    public static final ob6 Y = new Object();
    public static final ob6 a = new Object();
    public static final ob6 b = new Object();
    public static final /* synthetic */ ob6 c = new Object();
    public static final te5 o = new Object();

    public ob6(int i) {
        switch (i) {
            case LangUtils.HASH_SEED /*17*/:
                new khe(new xid(18));
                return;
            default:
                return;
        }
    }

    public static ow4 l(int i) {
        Object obj;
        v25 v25 = ow4.t0;
        v25.getClass();
        u1 u1Var = new u1(0, v25);
        while (true) {
            if (!u1Var.hasNext()) {
                obj = null;
                break;
            }
            obj = u1Var.next();
            if (((ow4) obj).a == i) {
                break;
            }
        }
        ow4 ow4 = (ow4) obj;
        return ow4 == null ? ow4.CLASSIC : ow4;
    }

    public MediaCodecInfo a(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    public void accept(Object obj) {
        kef kef = (kef) obj;
        if (!kef.b || !pag.l(kef.d)) {
            throw new RuntimeException("conversion failed");
        }
    }

    public long b(long j) {
        return j;
    }

    public nd7 c(qy5 qy5) {
        String str = qy5.n;
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
                    return new xo(0);
                case 1:
                    return new ss6();
                case 2:
                    return new bt6((ys6) null);
                case 3:
                    return new xo(1);
                case 4:
                    return new wvd();
            }
        }
        throw new IllegalArgumentException(wg0.i("Attempted to create decoder for unsupported MIME type: ", str));
    }

    public boolean d(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    public boolean e(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    public void f(int i, Serializable serializable) {
    }

    public int g() {
        return MediaCodecList.getCodecCount();
    }

    public boolean h() {
        return false;
    }

    public void i(String str) {
        hm9.m("RLottie", str, new Object[0]);
    }

    public void j(String str, Throwable th) {
        hm9.p("RLottie", str, th);
    }

    public m85[] k(k85[] k85Arr, gg0 gg0) {
        ek0 ek0;
        double d;
        k85[] k85Arr2 = k85Arr;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (k85 k85 : k85Arr2) {
            if (k85 == null || k85.b.length <= 1) {
                arrayList.add((Object) null);
            } else {
                ww6 i2 = zw6.i();
                i2.d(new z8(0, 0));
                arrayList.add(i2);
            }
        }
        int length = k85Arr2.length;
        long[][] jArr = new long[length][];
        for (int i3 = 0; i3 < k85Arr2.length; i3++) {
            k85 k852 = k85Arr2[i3];
            if (k852 == null) {
                jArr[i3] = new long[0];
            } else {
                int[] iArr = k852.b;
                jArr[i3] = new long[iArr.length];
                for (int i4 = 0; i4 < iArr.length; i4++) {
                    jArr[i3][i4] = (long) k852.a.c[iArr[i4]].s0;
                }
                Arrays.sort(jArr[i3]);
            }
        }
        int[] iArr2 = new int[length];
        long[] jArr2 = new long[length];
        for (int i5 = 0; i5 < length; i5++) {
            long[] jArr3 = jArr[i5];
            jArr2[i5] = jArr3.length == 0 ? 0 : jArr3[0];
        }
        b9.v(arrayList, jArr2);
        pg9 g = sh0.H().c().g();
        int i6 = 0;
        while (i6 < length) {
            long[] jArr4 = jArr[i6];
            if (jArr4.length > 1) {
                int length2 = jArr4.length;
                double[] dArr = new double[length2];
                int i7 = i;
                while (true) {
                    long[] jArr5 = jArr[i6];
                    d = 0.0d;
                    if (i7 >= jArr5.length) {
                        break;
                    }
                    long j = jArr5[i7];
                    if (j != -1) {
                        d = Math.log((double) j);
                    }
                    dArr[i7] = d;
                    i7++;
                }
                int i8 = length2 - 1;
                double d2 = dArr[i8] - dArr[i];
                int i9 = i;
                while (i9 < i8) {
                    double d3 = dArr[i9];
                    i9++;
                    g.g(Double.valueOf(d2 == d ? 1.0d : (((d3 + dArr[i9]) * 0.5d) - dArr[i]) / d2), Integer.valueOf(i6));
                    i = 0;
                    d = 0.0d;
                }
            }
            i6++;
            i = 0;
        }
        zw6 j2 = zw6.j(g.h());
        for (int i10 = 0; i10 < j2.size(); i10++) {
            int intValue = ((Integer) j2.get(i10)).intValue();
            int i11 = iArr2[intValue] + 1;
            iArr2[intValue] = i11;
            jArr2[intValue] = jArr[intValue][i11];
            b9.v(arrayList, jArr2);
        }
        for (int i12 = 0; i12 < k85Arr2.length; i12++) {
            if (arrayList.get(i12) != null) {
                jArr2[i12] = jArr2[i12] * 2;
            }
        }
        b9.v(arrayList, jArr2);
        ww6 i13 = zw6.i();
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            ww6 ww6 = (ww6) arrayList.get(i14);
            i13.d(ww6 == null ? zw6.m() : ww6.j());
        }
        ffc j3 = i13.j();
        m85[] m85Arr = new m85[k85Arr2.length];
        for (int i15 = 0; i15 < k85Arr2.length; i15++) {
            k85 k853 = k85Arr2[i15];
            if (k853 != null) {
                int[] iArr3 = k853.b;
                if (iArr3.length != 0) {
                    if (iArr3.length == 1) {
                        int i16 = iArr3[0];
                        int i17 = k853.c;
                        ek0 = new ek0(k853.a, new int[]{i16});
                    } else {
                        long j4 = (long) 25000;
                        ek0 = new b9(k853.a, iArr3, k853.c, gg0, (long) 10000, j4, j4, 1279, 719, 0.7f, 0.75f, (zw6) j3.get(i15), rhe.a);
                    }
                    m85Arr[i15] = ek0;
                }
            }
        }
        return m85Arr;
    }

    public void m(qz7 qz7, float f) {
        lnc lnc = (lnc) ((Drawable) qz7.b);
        CardView cardView = (CardView) qz7.c;
        boolean useCompatPadding = cardView.getUseCompatPadding();
        boolean preventCornerOverlap = cardView.getPreventCornerOverlap();
        if (!(f == lnc.e && lnc.f == useCompatPadding && lnc.g == preventCornerOverlap)) {
            lnc.e = f;
            lnc.f = useCompatPadding;
            lnc.g = preventCornerOverlap;
            lnc.b((Rect) null);
            lnc.invalidateSelf();
        }
        if (!cardView.getUseCompatPadding()) {
            qz7.X(0, 0, 0, 0);
            return;
        }
        lnc lnc2 = (lnc) ((Drawable) qz7.b);
        float f2 = lnc2.e;
        float f3 = lnc2.a;
        int ceil = (int) Math.ceil((double) mnc.a(f2, f3, cardView.getPreventCornerOverlap()));
        int ceil2 = (int) Math.ceil((double) mnc.b(f2, f3, cardView.getPreventCornerOverlap()));
        qz7.X(ceil, ceil2, ceil, ceil2);
    }

    public boolean n(qy5 qy5) {
        String str = qy5.n;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }

    public void o(Throwable th) {
        hm9.p("RLottie", "fail!", th);
    }

    public Object parse(db7 db7) {
        if (db7.peek() == 0) {
            return null;
        }
        db7.z();
        return null;
    }

    public boolean test(Object obj) {
        return fme.a(((Number) obj).intValue());
    }
}
