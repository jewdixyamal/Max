package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* renamed from: m3g  reason: default package */
public final class m3g implements Closeable {
    public boolean X;
    public boolean Y;
    public final bt0 Z = new Object();
    public boolean a;
    public int b;
    public long c;
    public boolean o;
    public final bt0 s0 = new Object();
    public eu8 t0;
    public final byte[] u0 = null;
    public final fu0 v0;
    public final l3g w0;
    public final boolean x0;
    public final boolean y0;

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, bt0] */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object, bt0] */
    public m3g(y7c y7c, m8c m8c, boolean z, boolean z2) {
        this.v0 = y7c;
        this.w0 = m8c;
        this.x0 = z;
        this.y0 = z2;
    }

    public final void close() {
        eu8 eu8 = this.t0;
        if (eu8 != null) {
            eu8.close();
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [m3g, e8c, n3g] */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: Code restructure failed: missing block: B:112:?, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m() {
        /*
            r9 = this;
            long r0 = r9.c
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x000f
            fu0 r4 = r9.v0
            bt0 r5 = r9.Z
            r4.Q(r5, r0)
        L_0x000f:
            int r0 = r9.b
            switch(r0) {
                case 8: goto L_0x006d;
                case 9: goto L_0x003d;
                case 10: goto L_0x0028;
                default: goto L_0x0014;
            }
        L_0x0014:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            int r9 = r9.b
            byte[] r1 = defpackage.naf.a
            java.lang.String r9 = java.lang.Integer.toHexString(r9)
            java.lang.String r1 = "Unknown control opcode: "
            java.lang.String r9 = r1.concat(r9)
            r0.<init>(r9)
            throw r0
        L_0x0028:
            l3g r0 = r9.w0
            bt0 r9 = r9.Z
            long r1 = r9.b
            r9.e(r1)
            m8c r0 = (defpackage.m8c) r0
            monitor-enter(r0)
            r9 = 0
            r0.q = r9     // Catch:{ all -> 0x003a }
            monitor-exit(r0)
            goto L_0x0119
        L_0x003a:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003a }
            throw r9
        L_0x003d:
            l3g r0 = r9.w0
            bt0 r9 = r9.Z
            long r1 = r9.b
            aw0 r9 = r9.e(r1)
            m8c r0 = (defpackage.m8c) r0
            monitor-enter(r0)
            boolean r1 = r0.o     // Catch:{ all -> 0x005b }
            if (r1 != 0) goto L_0x0068
            boolean r1 = r0.l     // Catch:{ all -> 0x005b }
            if (r1 == 0) goto L_0x005d
            java.util.ArrayDeque r1 = r0.j     // Catch:{ all -> 0x005b }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x005b }
            if (r1 == 0) goto L_0x005d
            goto L_0x0068
        L_0x005b:
            r9 = move-exception
            goto L_0x006b
        L_0x005d:
            java.util.ArrayDeque r1 = r0.i     // Catch:{ all -> 0x005b }
            r1.add(r9)     // Catch:{ all -> 0x005b }
            r0.f()     // Catch:{ all -> 0x005b }
            monitor-exit(r0)
            goto L_0x0119
        L_0x0068:
            monitor-exit(r0)
            goto L_0x0119
        L_0x006b:
            monitor-exit(r0)     // Catch:{ all -> 0x005b }
            throw r9
        L_0x006d:
            java.lang.String r0 = ""
            bt0 r1 = r9.Z
            long r4 = r1.b
            r6 = 1
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x0144
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r3 = 0
            if (r2 == 0) goto L_0x00bc
            short r0 = r1.readShort()
            bt0 r1 = r9.Z
            java.lang.String r1 = r1.p0()
            r2 = 1000(0x3e8, float:1.401E-42)
            if (r0 < r2) goto L_0x00ad
            r2 = 5000(0x1388, float:7.006E-42)
            if (r0 < r2) goto L_0x0091
            goto L_0x00ad
        L_0x0091:
            r2 = 1004(0x3ec, float:1.407E-42)
            if (r2 > r0) goto L_0x0099
            r2 = 1006(0x3ee, float:1.41E-42)
            if (r2 >= r0) goto L_0x00a2
        L_0x0099:
            r2 = 1015(0x3f7, float:1.422E-42)
            if (r2 <= r0) goto L_0x009e
            goto L_0x00ab
        L_0x009e:
            r2 = 2999(0xbb7, float:4.202E-42)
            if (r2 < r0) goto L_0x00ab
        L_0x00a2:
            java.lang.String r2 = "Code "
            java.lang.String r4 = " is reserved and may not be used."
            java.lang.String r2 = defpackage.wg0.g(r0, r2, r4)
            goto L_0x00b3
        L_0x00ab:
            r2 = r3
            goto L_0x00b3
        L_0x00ad:
            java.lang.String r2 = "Code must be in range [1000,5000): "
            java.lang.String r2 = defpackage.zr6.h(r0, r2)
        L_0x00b3:
            if (r2 != 0) goto L_0x00b6
            goto L_0x00c1
        L_0x00b6:
            java.net.ProtocolException r9 = new java.net.ProtocolException
            r9.<init>(r2)
            throw r9
        L_0x00bc:
            r1 = 1005(0x3ed, float:1.408E-42)
            r8 = r1
            r1 = r0
            r0 = r8
        L_0x00c1:
            l3g r2 = r9.w0
            m8c r2 = (defpackage.m8c) r2
            r2.getClass()
            r4 = -1
            if (r0 == r4) goto L_0x0138
            monitor-enter(r2)
            int r5 = r2.m     // Catch:{ all -> 0x00f3 }
            if (r5 != r4) goto L_0x012a
            r2.m = r0     // Catch:{ all -> 0x00f3 }
            r2.n = r1     // Catch:{ all -> 0x00f3 }
            boolean r0 = r2.l     // Catch:{ all -> 0x00f3 }
            if (r0 == 0) goto L_0x00f5
            java.util.ArrayDeque r0 = r2.j     // Catch:{ all -> 0x00f3 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00f3 }
            if (r0 == 0) goto L_0x00f5
            e8c r0 = r2.h     // Catch:{ all -> 0x00f3 }
            r2.h = r3     // Catch:{ all -> 0x00f3 }
            m3g r4 = r2.d     // Catch:{ all -> 0x00f3 }
            r2.d = r3     // Catch:{ all -> 0x00f3 }
            n3g r5 = r2.e     // Catch:{ all -> 0x00f3 }
            r2.e = r3     // Catch:{ all -> 0x00f3 }
            coe r3 = r2.f     // Catch:{ all -> 0x00f3 }
            r3.e()     // Catch:{ all -> 0x00f3 }
            r3 = r0
            goto L_0x00f7
        L_0x00f3:
            r9 = move-exception
            goto L_0x0136
        L_0x00f5:
            r4 = r3
            r5 = r4
        L_0x00f7:
            monitor-exit(r2)
            frf r0 = r2.s     // Catch:{ all -> 0x0105 }
            r0.getClass()     // Catch:{ all -> 0x0105 }
            if (r3 == 0) goto L_0x0107
            frf r0 = r2.s     // Catch:{ all -> 0x0105 }
            r0.a(r1)     // Catch:{ all -> 0x0105 }
            goto L_0x0107
        L_0x0105:
            r9 = move-exception
            goto L_0x011a
        L_0x0107:
            if (r3 == 0) goto L_0x010c
            defpackage.naf.c(r3)
        L_0x010c:
            if (r4 == 0) goto L_0x0111
            defpackage.naf.c(r4)
        L_0x0111:
            if (r5 == 0) goto L_0x0116
            defpackage.naf.c(r5)
        L_0x0116:
            r0 = 1
            r9.a = r0
        L_0x0119:
            return
        L_0x011a:
            if (r3 == 0) goto L_0x011f
            defpackage.naf.c(r3)
        L_0x011f:
            if (r4 == 0) goto L_0x0124
            defpackage.naf.c(r4)
        L_0x0124:
            if (r5 == 0) goto L_0x0129
            defpackage.naf.c(r5)
        L_0x0129:
            throw r9
        L_0x012a:
            java.lang.String r9 = "already closed"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00f3 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x00f3 }
            r0.<init>(r9)     // Catch:{ all -> 0x00f3 }
            throw r0     // Catch:{ all -> 0x00f3 }
        L_0x0136:
            monitor-exit(r2)
            throw r9
        L_0x0138:
            java.lang.String r9 = "Failed requirement."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r0.<init>(r9)
            throw r0
        L_0x0144:
            java.net.ProtocolException r9 = new java.net.ProtocolException
            java.lang.String r0 = "Malformed close payload length of 1."
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m3g.m():void");
    }

    /* JADX INFO: finally extract failed */
    public final void n() {
        boolean z;
        if (!this.a) {
            fu0 fu0 = this.v0;
            long h = fu0.p().h();
            fu0.p().b();
            try {
                byte readByte = fu0.readByte();
                byte[] bArr = naf.a;
                fu0.p().g(h, TimeUnit.NANOSECONDS);
                byte b2 = readByte & 15;
                this.b = b2;
                boolean z2 = false;
                boolean z3 = (readByte & 128) != 0;
                this.o = z3;
                boolean z4 = (readByte & 8) != 0;
                this.X = z4;
                if (!z4 || z3) {
                    boolean z5 = (readByte & 64) != 0;
                    if (b2 == 1 || b2 == 2) {
                        if (!z5) {
                            z = false;
                        } else if (this.x0) {
                            z = true;
                        } else {
                            throw new ProtocolException("Unexpected rsv1 flag");
                        }
                        this.Y = z;
                    } else if (z5) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    if ((readByte & 32) != 0) {
                        throw new ProtocolException("Unexpected rsv2 flag");
                    } else if ((readByte & 16) == 0) {
                        byte readByte2 = fu0.readByte();
                        if ((readByte2 & 128) != 0) {
                            z2 = true;
                        }
                        if (!z2) {
                            long j = (long) (readByte2 & Byte.MAX_VALUE);
                            this.c = j;
                            if (j == ((long) 126)) {
                                this.c = (long) (fu0.readShort() & 65535);
                            } else if (j == ((long) 127)) {
                                long readLong = fu0.readLong();
                                this.c = readLong;
                                if (readLong < 0) {
                                    throw new ProtocolException("Frame length 0x" + Long.toHexString(this.c) + " > 0x7FFFFFFFFFFFFFFF");
                                }
                            }
                            if (this.X && this.c > 125) {
                                throw new ProtocolException("Control frame must be less than 125B.");
                            } else if (z2) {
                                fu0.readFully(this.u0);
                            }
                        } else {
                            throw new ProtocolException("Server-sent frames must not be masked.");
                        }
                    } else {
                        throw new ProtocolException("Unexpected rsv3 flag");
                    }
                } else {
                    throw new ProtocolException("Control frames must be final.");
                }
            } catch (Throwable th) {
                fu0.p().g(h, TimeUnit.NANOSECONDS);
                throw th;
            }
        } else {
            throw new IOException("closed");
        }
    }
}
