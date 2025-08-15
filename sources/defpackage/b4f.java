package defpackage;

import java.nio.ByteBuffer;

/* renamed from: b4f  reason: default package */
public final class b4f {
    public static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public final t99 b;
    public volatile int c = 0;

    public b4f(t99 t99, int i) {
        this.b = t99;
        this.a = i;
    }

    public final int a(int i) {
        l99 c2 = c();
        int a2 = c2.a(16);
        if (a2 == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) c2.o;
        int i2 = a2 + c2.a;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final int b() {
        l99 c2 = c();
        int a2 = c2.a(16);
        if (a2 == 0) {
            return 0;
        }
        int i = a2 + c2.a;
        return ((ByteBuffer) c2.o).getInt(((ByteBuffer) c2.o).getInt(i) + i);
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [jy7, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.l99 c() {
        /*
            r4 = this;
            java.lang.ThreadLocal r0 = d
            java.lang.Object r1 = r0.get()
            l99 r1 = (defpackage.l99) r1
            if (r1 != 0) goto L_0x0012
            l99 r1 = new l99
            r1.<init>()
            r0.set(r1)
        L_0x0012:
            t99 r0 = r4.b
            m99 r0 = r0.a
            r2 = 6
            int r2 = r0.a(r2)
            if (r2 == 0) goto L_0x005c
            int r3 = r0.a
            int r2 = r2 + r3
            java.lang.Object r3 = r0.o
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            int r3 = r3.getInt(r2)
            int r3 = r3 + r2
            int r3 = r3 + 4
            int r4 = r4.a
            int r4 = r4 * 4
            int r4 = r4 + r3
            java.lang.Object r2 = r0.o
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            int r2 = r2.getInt(r4)
            int r2 = r2 + r4
            java.lang.Object r4 = r0.o
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4
            r1.o = r4
            if (r4 == 0) goto L_0x0055
            r1.a = r2
            int r4 = r4.getInt(r2)
            int r2 = r2 - r4
            r1.b = r2
            java.lang.Object r4 = r1.o
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4
            short r4 = r4.getShort(r2)
            r1.c = r4
            goto L_0x005c
        L_0x0055:
            r4 = 0
            r1.a = r4
            r1.b = r4
            r1.c = r4
        L_0x005c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b4f.c():l99");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        l99 c2 = c();
        int a2 = c2.a(4);
        sb.append(Integer.toHexString(a2 != 0 ? ((ByteBuffer) c2.o).getInt(a2 + c2.a) : 0));
        sb.append(", codepoints:");
        int b2 = b();
        for (int i = 0; i < b2; i++) {
            sb.append(Integer.toHexString(a(i)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
