package defpackage;

import java.util.List;
import java.util.regex.Pattern;

/* renamed from: rg9  reason: default package */
public final class rg9 extends tfg {
    public static final rl8 l = fm9.A("multipart/form-data");
    public static final byte[] m = {(byte) 58, (byte) 32};
    public static final byte[] n = {(byte) 13, (byte) 10};
    public static final byte[] o;
    public final rl8 h;
    public long i = -1;
    public final aw0 j;
    public final List k;

    static {
        Pattern pattern = rl8.d;
        fm9.A("multipart/mixed");
        fm9.A("multipart/alternative");
        fm9.A("multipart/digest");
        fm9.A("multipart/parallel");
        byte b = (byte) 45;
        o = new byte[]{b, b};
    }

    public rg9(aw0 aw0, rl8 rl8, List list) {
        this.j = aw0;
        this.k = list;
        Pattern pattern = rl8.d;
        this.h = fm9.A(rl8 + "; boundary=" + aw0.j());
    }

    public final void E(eu0 eu0) {
        F(eu0, false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: bt0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: eu0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: bt0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: eu0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: bt0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: eu0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long F(defpackage.eu0 r17, boolean r18) {
        /*
            r16 = this;
            r0 = r16
            if (r18 == 0) goto L_0x000b
            bt0 r1 = new bt0
            r1.<init>()
            r2 = r1
            goto L_0x000f
        L_0x000b:
            r1 = 0
            r2 = r1
            r1 = r17
        L_0x000f:
            java.util.List r3 = r0.k
            int r4 = r3.size()
            r5 = 0
            r6 = 0
            r8 = r5
        L_0x0019:
            aw0 r9 = r0.j
            byte[] r10 = o
            byte[] r11 = n
            if (r8 >= r4) goto L_0x009d
            java.lang.Object r12 = r3.get(r8)
            qg9 r12 = (defpackage.qg9) r12
            cj6 r13 = r12.a
            r1.write(r10)
            r1.M(r9)
            r1.write(r11)
            if (r13 == 0) goto L_0x0057
            int r9 = r13.size()
            r10 = r5
        L_0x0039:
            if (r10 >= r9) goto L_0x0057
            java.lang.String r14 = r13.b(r10)
            eu0 r14 = r1.L(r14)
            byte[] r15 = m
            eu0 r14 = r14.write(r15)
            java.lang.String r15 = r13.d(r10)
            eu0 r14 = r14.L(r15)
            r14.write(r11)
            int r10 = r10 + 1
            goto L_0x0039
        L_0x0057:
            tfg r9 = r12.b
            rl8 r10 = r9.h()
            if (r10 == 0) goto L_0x006e
            java.lang.String r12 = "Content-Type: "
            eu0 r12 = r1.L(r12)
            java.lang.String r10 = r10.a
            eu0 r10 = r12.L(r10)
            r10.write(r11)
        L_0x006e:
            long r12 = r9.g()
            r14 = -1
            int r10 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r10 == 0) goto L_0x0086
            java.lang.String r10 = "Content-Length: "
            eu0 r10 = r1.L(r10)
            eu0 r10 = r10.i0(r12)
            r10.write(r11)
            goto L_0x008c
        L_0x0086:
            if (r18 == 0) goto L_0x008c
            r2.m()
            return r14
        L_0x008c:
            r1.write(r11)
            if (r18 == 0) goto L_0x0093
            long r6 = r6 + r12
            goto L_0x0096
        L_0x0093:
            r9.E(r1)
        L_0x0096:
            r1.write(r11)
            int r8 = r8 + 1
            goto L_0x0019
        L_0x009d:
            r1.write(r10)
            r1.M(r9)
            r1.write(r10)
            r1.write(r11)
            if (r18 == 0) goto L_0x00b1
            long r0 = r2.b
            long r6 = r6 + r0
            r2.m()
        L_0x00b1:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rg9.F(eu0, boolean):long");
    }

    public final long g() {
        long j2 = this.i;
        if (j2 != -1) {
            return j2;
        }
        long F = F((eu0) null, true);
        this.i = F;
        return F;
    }

    public final rl8 h() {
        return this.h;
    }
}
