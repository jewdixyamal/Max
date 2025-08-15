package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* renamed from: q55  reason: default package */
public final class q55 {
    public static final Charset d = StandardCharsets.US_ASCII;
    public static final String[] e = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    public static final int[] f = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    public final int a;
    public final int b;
    public final byte[] c;

    public q55(int i, byte[] bArr, int i2) {
        this.a = i;
        this.b = i2;
        this.c = bArr;
    }

    public static q55 a(long j, ByteOrder byteOrder) {
        return b(new long[]{j}, byteOrder);
    }

    public static q55 b(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[(f[4] * jArr.length)]);
        wrap.order(byteOrder);
        for (long j : jArr) {
            wrap.putInt((int) j);
        }
        return new q55(4, wrap.array(), jArr.length);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(e[this.a]);
        sb.append(", data length:");
        return zr6.j(sb, this.c.length, ")");
    }
}
