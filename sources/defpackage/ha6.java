package defpackage;

import java.math.BigDecimal;

/* renamed from: ha6  reason: default package */
public abstract class ha6 extends ta7 {
    public int a;
    public boolean b;
    public jb7 c;

    static {
        int i = sa7.WRITE_NUMBERS_AS_STRINGS.b;
        int i2 = sa7.ESCAPE_NON_ASCII.b;
        int i3 = sa7.STRICT_DUPLICATE_DETECTION.b;
    }

    public final String t0(BigDecimal bigDecimal) {
        if (!sa7.WRITE_BIGDECIMAL_AS_PLAIN.a(this.a)) {
            return bigDecimal.toString();
        }
        int scale = bigDecimal.scale();
        if (scale >= -9999 && scale <= 9999) {
            return bigDecimal.toPlainString();
        }
        ta7.d(String.format("Attempt to write plain `java.math.BigDecimal` (see JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN) with illegal scale (%d): needs to be between [-%d, %d]", new Object[]{Integer.valueOf(scale), 9999, 9999}));
        throw null;
    }

    public final boolean u0(sa7 sa7) {
        return (this.a & sa7.b) != 0;
    }
}
