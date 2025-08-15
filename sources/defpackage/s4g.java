package defpackage;

import android.text.TextUtils;
import com.google.android.exoplayer2.ParserException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* renamed from: s4g  reason: default package */
public final class s4g implements ka5 {
    public static final Pattern g = Pattern.compile("LOCAL:([^,]+)");
    public static final Pattern h = Pattern.compile("MPEGTS:(-?\\d+)");
    public final String a;
    public final sue b;
    public final yaf c = new yaf(3, false);
    public oa5 d;
    public byte[] e = new byte[LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY];
    public int f;

    public s4g(String str, sue sue) {
        this.a = str;
        this.b = sue;
    }

    public final xze a(long j) {
        xze B = this.d.B(0, 3);
        my5 my5 = new my5();
        my5.k = "text/vtt";
        my5.c = this.a;
        my5.o = j;
        B.d(my5.a());
        this.d.w();
        return B;
    }

    public final void d(long j, long j2) {
        throw new IllegalStateException();
    }

    public final void g(oa5 oa5) {
        this.d = oa5;
        oa5.M(new pm5(-9223372036854775807L));
    }

    public final boolean h(ma5 ma5) {
        ra4 ra4 = (ra4) ma5;
        ra4.q(this.e, 0, 6, false);
        byte[] bArr = this.e;
        yaf yaf = this.c;
        yaf.F(6, bArr);
        if (u4g.a(yaf)) {
            return true;
        }
        ra4.q(this.e, 6, 3, false);
        yaf.F(9, this.e);
        return u4g.a(yaf);
    }

    public final int i(ma5 ma5, lh4 lh4) {
        String i;
        this.d.getClass();
        int i2 = (int) ((ra4) ma5).c;
        int i3 = this.f;
        byte[] bArr = this.e;
        if (i3 == bArr.length) {
            this.e = Arrays.copyOf(bArr, ((i2 != -1 ? i2 : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.e;
        int i4 = this.f;
        int read = ((ra4) ma5).read(bArr2, i4, bArr2.length - i4);
        if (read != -1) {
            int i5 = this.f + read;
            this.f = i5;
            if (i2 == -1 || i5 != i2) {
                return 0;
            }
        }
        yaf yaf = new yaf(this.e);
        u4g.d(yaf);
        String i6 = yaf.i();
        long j = 0;
        long j2 = 0;
        while (true) {
            Matcher matcher = null;
            if (!TextUtils.isEmpty(i6)) {
                if (i6.startsWith("X-TIMESTAMP-MAP")) {
                    Matcher matcher2 = g.matcher(i6);
                    if (!matcher2.find()) {
                        throw ParserException.a((RuntimeException) null, i6.length() != 0 ? "X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(i6) : new String("X-TIMESTAMP-MAP doesn't contain local timestamp: "));
                    }
                    Matcher matcher3 = h.matcher(i6);
                    if (!matcher3.find()) {
                        throw ParserException.a((RuntimeException) null, i6.length() != 0 ? "X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(i6) : new String("X-TIMESTAMP-MAP doesn't contain media timestamp: "));
                    }
                    String group = matcher2.group(1);
                    group.getClass();
                    j2 = u4g.c(group);
                    String group2 = matcher3.group(1);
                    group2.getClass();
                    j = (Long.parseLong(group2) * 1000000) / 90000;
                }
                i6 = yaf.i();
            } else {
                while (true) {
                    String i7 = yaf.i();
                    if (i7 == null) {
                        break;
                    } else if (u4g.a.matcher(i7).matches()) {
                        do {
                            i = yaf.i();
                            if (i == null) {
                                break;
                            }
                        } while (i.isEmpty());
                    } else {
                        Matcher matcher4 = p4g.a.matcher(i7);
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
                long c2 = u4g.c(group3);
                long b2 = this.b.b(((((j + c2) - j2) * 90000) / 1000000) % 8589934592L);
                xze a2 = a(b2 - c2);
                byte[] bArr3 = this.e;
                int i8 = this.f;
                yaf yaf2 = this.c;
                yaf2.F(i8, bArr3);
                a2.c(this.f, yaf2);
                a2.b(b2, 1, this.f, 0, (vze) null);
                return -1;
            }
        }
    }

    public final void release() {
    }
}
