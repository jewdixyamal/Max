package defpackage;

import android.util.Size;
import java.util.Comparator;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: ye4  reason: default package */
public final /* synthetic */ class ye4 implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ ye4(int i) {
        this.a = i;
    }

    public final int compare(Object obj, Object obj2) {
        int i = -1;
        y93 y93 = aa3.a;
        switch (this.a) {
            case 0:
                ze4 ze4 = (ze4) obj;
                ze4 ze42 = (ze4) obj2;
                zma b = (!ze4.X || !ze4.s0) ? bf4.f.b() : bf4.f;
                int i2 = ze4.t0;
                return y93.c(Integer.valueOf(i2), Integer.valueOf(ze42.t0), ze4.Y.G0 ? bf4.f.b() : bf4.g).c(Integer.valueOf(ze4.u0), Integer.valueOf(ze42.u0), b).c(Integer.valueOf(i2), Integer.valueOf(ze42.t0), b).f();
            case 1:
                af4 af4 = (af4) obj;
                af4 af42 = (af4) obj2;
                zma b2 = (!af4.X || !af4.s0) ? cf4.j.b() : cf4.j;
                boolean z = af4.Y.y;
                int i3 = af4.u0;
                aa3 aa3 = y93;
                if (z) {
                    aa3 = y93.c(Integer.valueOf(i3), Integer.valueOf(af42.u0), cf4.j.b());
                }
                return aa3.c(Integer.valueOf(af4.v0), Integer.valueOf(af42.v0), b2).c(Integer.valueOf(i3), Integer.valueOf(af42.u0), b2).f();
            case 2:
                long j = ((dn4) obj).c;
                long j2 = ((dn4) obj2).c;
                int i4 = oaf.a;
                int i5 = (j > j2 ? 1 : (j == j2 ? 0 : -1));
                if (i5 < 0) {
                    return -1;
                }
                return i5 == 0 ? 0 : 1;
            case 3:
                return np8.j(((pw0) obj).c, ((pw0) obj2).c);
            case 4:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i6 = 0; i6 < bArr.length; i6++) {
                    byte b3 = bArr[i6];
                    byte b4 = bArr2[i6];
                    if (b3 != b4) {
                        return b3 - b4;
                    }
                }
                return 0;
            case 5:
                return tpa.n(((Long) obj).longValue(), ((Long) obj2).longValue());
            case 6:
                dx0 dx0 = (dx0) obj;
                dx0 dx02 = (dx0) obj2;
                long j3 = dx0.Y;
                long j4 = dx02.Y;
                if (j3 - j4 == 0) {
                    return dx0.compareTo(dx02);
                }
                if (j3 >= j4) {
                    i = 1;
                }
                return i;
            case 7:
                ex0 ex0 = (ex0) obj;
                ex0 ex02 = (ex0) obj2;
                long j5 = ex0.Y;
                long j6 = ex02.Y;
                if (j5 - j6 == 0) {
                    return ex0.compareTo(ex02);
                }
                if (j5 >= j6) {
                    i = 1;
                }
                return i;
            case 8:
                hx8 hx8 = (hx8) obj;
                hx8 hx82 = (hx8) obj2;
                int m = tpa.m(hx82.b, hx8.b);
                if (m != 0) {
                    return m;
                }
                return hx8.a.b.a.toString().compareTo(hx82.a.b.a.toString());
            case 9:
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                return Long.signum((((long) size.getWidth()) * ((long) size.getHeight())) - (((long) size2.getWidth()) * ((long) size2.getHeight())));
            case 10:
                return tpa.n(((Long) obj2).longValue(), ((Long) obj).longValue());
            case 11:
                vk6 vk6 = (vk6) obj;
                vk6 vk62 = (vk6) obj2;
                int f = xfg.f(Long.valueOf(vk62.k()), Long.valueOf(vk6.k()));
                return f != 0 ? f : xfg.f(Long.valueOf(vk6.getId()), Long.valueOf(vk62.getId()));
            case Protos.Attaches.Attach.PRESENT /*12*/:
                return ((aa0) obj).a.compareTo(((aa0) obj2).a);
            case 13:
                return tpa.m(((nqb) obj).a.ordinal(), ((nqb) obj2).a.ordinal());
            case Protos.Attaches.Attach.LOCATION /*14*/:
                z5c z5c = (z5c) obj;
                z5c z5c2 = (z5c) obj2;
                if (z5c == null || z5c2 == null) {
                    return 0;
                }
                return z5c2.getCount() - z5c.getCount();
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return np8.j(((e52) obj2).b.Z, ((e52) obj).b.Z);
            case 16:
                l92 l92 = (l92) obj;
                l92 l922 = (l92) obj2;
                long j7 = l92.c.a().e;
                long j8 = l922.c.a().e;
                if (j7 == 0) {
                    j7 = Long.MAX_VALUE;
                }
                if (j8 == 0) {
                    j8 = Long.MAX_VALUE;
                }
                int n = tpa.n(j8, j7);
                if (n != 0) {
                    return n;
                }
                int n2 = tpa.n(l922.c.k, l92.c.k);
                if (n2 != 0) {
                    return n2;
                }
                int n3 = tpa.n(l922.b, l92.b);
                return n3 != 0 ? n3 : tpa.m(l922.hashCode(), l92.hashCode());
            case LangUtils.HASH_SEED /*17*/:
                return ((zsd) obj).a - ((zsd) obj2).a;
            case 18:
                return ((atd) obj).a - ((atd) obj2).a;
            case 19:
                return Float.compare(((zsd) obj).c, ((zsd) obj2).c);
            case 20:
                return Float.compare(((atd) obj).c, ((atd) obj2).c);
            case 21:
                gtd gtd = (gtd) obj;
                gtd gtd2 = (gtd) obj2;
                return y93.b(gtd.a, gtd2.a).b(gtd.b, gtd2.b).a(gtd.c, gtd2.c).f();
            case 22:
                hvd hvd = (hvd) obj;
                hvd hvd2 = (hvd) obj2;
                int compare = Integer.compare(hvd2.b, hvd.b);
                if (compare != 0) {
                    return compare;
                }
                int compareTo = hvd.c.compareTo(hvd2.c);
                return compareTo != 0 ? compareTo : hvd.d.compareTo(hvd2.d);
            case 23:
                hvd hvd3 = (hvd) obj;
                hvd hvd4 = (hvd) obj2;
                int compare2 = Integer.compare(hvd4.a, hvd3.a);
                if (compare2 != 0) {
                    return compare2;
                }
                int compareTo2 = hvd4.c.compareTo(hvd3.c);
                return compareTo2 != 0 ? compareTo2 : hvd4.d.compareTo(hvd3.d);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                return ((wua) obj2).a().compareTo(((wua) obj).a());
            case 25:
                return Integer.compare(((lze) obj).Y, ((lze) obj2).Y);
            case 26:
                return Integer.compare(((i4g) obj).a.b, ((i4g) obj2).a.b);
            case 27:
                return Integer.compare(((j4g) obj).a.b, ((j4g) obj2).a.b);
            case 28:
                return Long.compare(((g4g) obj).b, ((g4g) obj2).b);
            default:
                return Long.compare(((h4g) obj).b, ((h4g) obj2).b);
        }
    }
}
