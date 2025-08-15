package defpackage;

import android.text.TextUtils;
import androidx.media3.common.ParserException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* renamed from: t4g  reason: default package */
public final class t4g implements la5 {
    public static final Pattern t0 = Pattern.compile("LOCAL:([^,]+)");
    public static final Pattern u0 = Pattern.compile("MPEGTS:(-?\\d+)");
    public final boolean X;
    public pa5 Y;
    public byte[] Z = new byte[LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY];
    public final String a;
    public final tue b;
    public final wpa c = new wpa();
    public final mbe o;
    public int s0;

    public t4g(String str, tue tue, b46 b46, boolean z) {
        this.a = str;
        this.b = tue;
        this.o = b46;
        this.X = z;
    }

    public final void S(pa5 pa5) {
        this.Y = this.X ? new k8g(pa5, this.o) : pa5;
        pa5.J(new wd0(-9223372036854775807L));
    }

    public final yze a(long j) {
        yze B = this.Y.B(0, 3);
        ny5 ny5 = new ny5();
        ny5.m = ia9.l("text/vtt");
        ny5.d = this.a;
        ny5.r = j;
        B.e(ny5.a());
        this.Y.w();
        return B;
    }

    public final void d(long j, long j2) {
        throw new IllegalStateException();
    }

    public final int g(na5 na5, lh4 lh4) {
        String h;
        this.Y.getClass();
        int i = (int) ((sa4) na5).c;
        int i2 = this.s0;
        byte[] bArr = this.Z;
        if (i2 == bArr.length) {
            this.Z = Arrays.copyOf(bArr, ((i != -1 ? i : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.Z;
        int i3 = this.s0;
        int read = ((sa4) na5).read(bArr2, i3, bArr2.length - i3);
        if (read != -1) {
            int i4 = this.s0 + read;
            this.s0 = i4;
            if (i == -1 || i4 != i) {
                return 0;
            }
        }
        wpa wpa = new wpa(this.Z);
        v4g.d(wpa);
        String h2 = wpa.h(b52.c);
        long j = 0;
        long j2 = 0;
        while (true) {
            Matcher matcher = null;
            if (!TextUtils.isEmpty(h2)) {
                if (h2.startsWith("X-TIMESTAMP-MAP")) {
                    Matcher matcher2 = t0.matcher(h2);
                    if (matcher2.find()) {
                        Matcher matcher3 = u0.matcher(h2);
                        if (matcher3.find()) {
                            String group = matcher2.group(1);
                            group.getClass();
                            j2 = v4g.c(group);
                            String group2 = matcher3.group(1);
                            group2.getClass();
                            j = (Long.parseLong(group2) * 1000000) / 90000;
                        } else {
                            throw ParserException.a((RuntimeException) null, "X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(h2));
                        }
                    } else {
                        throw ParserException.a((RuntimeException) null, "X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(h2));
                    }
                }
                h2 = wpa.h(b52.c);
            } else {
                while (true) {
                    String h3 = wpa.h(b52.c);
                    if (h3 == null) {
                        break;
                    } else if (v4g.a.matcher(h3).matches()) {
                        do {
                            h = wpa.h(b52.c);
                            if (h == null) {
                                break;
                            }
                        } while (h.isEmpty());
                    } else {
                        Matcher matcher4 = q4g.a.matcher(h3);
                        if (matcher4.matches()) {
                            matcher = matcher4;
                            break;
                        }
                    }
                }
                if (matcher == null) {
                    a(0);
                    return -1;
                }
                String group3 = matcher.group(1);
                group3.getClass();
                long c2 = v4g.c(group3);
                long b2 = this.b.b(((((j + c2) - j2) * 90000) / 1000000) % 8589934592L);
                yze a2 = a(b2 - c2);
                byte[] bArr3 = this.Z;
                int i5 = this.s0;
                wpa wpa2 = this.c;
                wpa2.E(i5, bArr3);
                a2.b(wpa2, this.s0, 0);
                a2.a(b2, 1, this.s0, 0, (wze) null);
                return -1;
            }
        }
    }

    public final boolean n(na5 na5) {
        sa4 sa4 = (sa4) na5;
        sa4.q(this.Z, 0, 6, false);
        byte[] bArr = this.Z;
        wpa wpa = this.c;
        wpa.E(6, bArr);
        if (v4g.a(wpa)) {
            return true;
        }
        sa4.q(this.Z, 6, 3, false);
        wpa.E(9, this.Z);
        return v4g.a(wpa);
    }

    public final void release() {
    }
}
