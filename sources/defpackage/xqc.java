package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: xqc  reason: default package */
public final class xqc {
    public final /* synthetic */ int a = 0;
    public final int b;
    public long c;
    public final Object d;
    public final Object e;
    public Object f;
    public Object g;
    public Object h;

    public xqc(n64 n64) {
        this.d = n64;
        int i = n64.c;
        this.b = i;
        this.e = new yaf(32);
        qy qyVar = new qy(i, 4, 0);
        this.f = qyVar;
        this.g = qyVar;
        this.h = qyVar;
    }

    public static qy e(qy qyVar, long j, ByteBuffer byteBuffer, int i) {
        while (j >= qyVar.c) {
            qyVar = (qy) qyVar.X;
        }
        while (i > 0) {
            int min = Math.min(i, (int) (qyVar.c - j));
            vc vcVar = (vc) qyVar.o;
            byteBuffer.put(vcVar.a, ((int) (j - qyVar.b)) + vcVar.b, min);
            i -= min;
            j += (long) min;
            if (j == qyVar.c) {
                qyVar = (qy) qyVar.X;
            }
        }
        return qyVar;
    }

    public static qy f(qy qyVar, long j, byte[] bArr, int i) {
        while (j >= qyVar.c) {
            qyVar = (qy) qyVar.X;
        }
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (qyVar.c - j));
            vc vcVar = (vc) qyVar.o;
            System.arraycopy(vcVar.a, ((int) (j - qyVar.b)) + vcVar.b, bArr, i - i2, min);
            i2 -= min;
            j += (long) min;
            if (j == qyVar.c) {
                qyVar = (qy) qyVar.X;
            }
        }
        return qyVar;
    }

    public static qy g(qy qyVar, long j, ByteBuffer byteBuffer, int i) {
        while (j >= qyVar.c) {
            qyVar = (qy) qyVar.X;
        }
        while (i > 0) {
            int min = Math.min(i, (int) (qyVar.c - j));
            wc wcVar = (wc) qyVar.o;
            byteBuffer.put(wcVar.a, ((int) (j - qyVar.b)) + wcVar.b, min);
            i -= min;
            j += (long) min;
            if (j == qyVar.c) {
                qyVar = (qy) qyVar.X;
            }
        }
        return qyVar;
    }

    public static qy h(qy qyVar, long j, byte[] bArr, int i) {
        while (j >= qyVar.c) {
            qyVar = (qy) qyVar.X;
        }
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (qyVar.c - j));
            wc wcVar = (wc) qyVar.o;
            System.arraycopy(wcVar.a, ((int) (j - qyVar.b)) + wcVar.b, bArr, i - i2, min);
            i2 -= min;
            j += (long) min;
            if (j == qyVar.c) {
                qyVar = (qy) qyVar.X;
            }
        }
        return qyVar;
    }

    public static qy i(qy qyVar, o54 o54, mx1 mx1, yaf yaf) {
        int i;
        if (o54.f(1073741824)) {
            long j = mx1.b;
            yaf.E(1);
            qy f2 = f(qyVar, j, yaf.a, 1);
            long j2 = j + 1;
            byte b2 = yaf.a[0];
            boolean z = (b2 & 128) != 0;
            byte b3 = b2 & Byte.MAX_VALUE;
            rz3 rz3 = o54.c;
            byte[] bArr = (byte[]) rz3.a;
            if (bArr == null) {
                rz3.a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            qyVar = f(f2, j2, (byte[]) rz3.a, b3);
            long j3 = j2 + ((long) b3);
            if (z) {
                yaf.E(2);
                qyVar = f(qyVar, j3, yaf.a, 2);
                j3 += 2;
                i = yaf.A();
            } else {
                i = 1;
            }
            int[] iArr = (int[]) rz3.d;
            if (iArr == null || iArr.length < i) {
                iArr = new int[i];
            }
            int[] iArr2 = (int[]) rz3.e;
            if (iArr2 == null || iArr2.length < i) {
                iArr2 = new int[i];
            }
            if (z) {
                int i2 = i * 6;
                yaf.E(i2);
                qyVar = f(qyVar, j3, yaf.a, i2);
                j3 += (long) i2;
                yaf.H(0);
                for (int i3 = 0; i3 < i; i3++) {
                    iArr[i3] = yaf.A();
                    iArr2[i3] = yaf.y();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = mx1.a - ((int) (j3 - mx1.b));
            }
            vze vze = (vze) mx1.c;
            int i4 = maf.a;
            byte[] bArr2 = vze.b;
            byte[] bArr3 = (byte[]) rz3.a;
            rz3.f = i;
            rz3.d = iArr;
            rz3.e = iArr2;
            rz3.b = bArr2;
            rz3.a = bArr3;
            int i5 = vze.a;
            rz3.c = i5;
            int i6 = vze.c;
            rz3.g = i6;
            int i7 = vze.d;
            rz3.h = i7;
            MediaCodec.CryptoInfo cryptoInfo = (MediaCodec.CryptoInfo) rz3.i;
            cryptoInfo.numSubSamples = i;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i5;
            if (maf.a >= 24) {
                va8 va8 = (va8) rz3.j;
                va8.getClass();
                MediaCodec.CryptoInfo.Pattern pattern = (MediaCodec.CryptoInfo.Pattern) va8.c;
                pattern.set(i6, i7);
                ((MediaCodec.CryptoInfo) va8.b).setPattern(pattern);
            }
            long j4 = mx1.b;
            int i8 = (int) (j3 - j4);
            mx1.b = j4 + ((long) i8);
            mx1.a -= i8;
        }
        if (o54.f(268435456)) {
            yaf.E(4);
            qy f3 = f(qyVar, mx1.b, yaf.a, 4);
            int y = yaf.y();
            mx1.b += 4;
            mx1.a -= 4;
            o54.x(y);
            qy e2 = e(f3, mx1.b, o54.o, y);
            mx1.b += (long) y;
            int i9 = mx1.a - y;
            mx1.a = i9;
            ByteBuffer byteBuffer = o54.Z;
            if (byteBuffer == null || byteBuffer.capacity() < i9) {
                o54.Z = ByteBuffer.allocate(i9);
            } else {
                o54.Z.clear();
            }
            return e(e2, mx1.b, o54.Z, mx1.a);
        }
        o54.x(mx1.a);
        return e(qyVar, mx1.b, o54.o, mx1.a);
    }

    public static qy j(qy qyVar, p54 p54, mx1 mx1, wpa wpa) {
        int i;
        if (p54.f(1073741824)) {
            long j = mx1.b;
            wpa.D(1);
            qy h2 = h(qyVar, j, wpa.a, 1);
            long j2 = j + 1;
            byte b2 = wpa.a[0];
            boolean z = (b2 & 128) != 0;
            byte b3 = b2 & Byte.MAX_VALUE;
            rz3 rz3 = p54.o;
            byte[] bArr = (byte[]) rz3.a;
            if (bArr == null) {
                rz3.a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            qyVar = h(h2, j2, (byte[]) rz3.a, b3);
            long j3 = j2 + ((long) b3);
            if (z) {
                wpa.D(2);
                qyVar = h(qyVar, j3, wpa.a, 2);
                j3 += 2;
                i = wpa.A();
            } else {
                i = 1;
            }
            int[] iArr = (int[]) rz3.d;
            if (iArr == null || iArr.length < i) {
                iArr = new int[i];
            }
            int[] iArr2 = (int[]) rz3.e;
            if (iArr2 == null || iArr2.length < i) {
                iArr2 = new int[i];
            }
            if (z) {
                int i2 = i * 6;
                wpa.D(i2);
                qyVar = h(qyVar, j3, wpa.a, i2);
                j3 += (long) i2;
                wpa.G(0);
                for (int i3 = 0; i3 < i; i3++) {
                    iArr[i3] = wpa.A();
                    iArr2[i3] = wpa.y();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = mx1.a - ((int) (j3 - mx1.b));
            }
            wze wze = (wze) mx1.c;
            int i4 = oaf.a;
            byte[] bArr2 = wze.b;
            byte[] bArr3 = (byte[]) rz3.a;
            rz3.f = i;
            rz3.d = iArr;
            rz3.e = iArr2;
            rz3.b = bArr2;
            rz3.a = bArr3;
            int i5 = wze.a;
            rz3.c = i5;
            int i6 = wze.c;
            rz3.g = i6;
            int i7 = wze.d;
            rz3.h = i7;
            MediaCodec.CryptoInfo cryptoInfo = (MediaCodec.CryptoInfo) rz3.i;
            cryptoInfo.numSubSamples = i;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i5;
            if (oaf.a >= 24) {
                h7b h7b = (h7b) rz3.j;
                h7b.getClass();
                MediaCodec.CryptoInfo.Pattern pattern = (MediaCodec.CryptoInfo.Pattern) h7b.c;
                pattern.set(i6, i7);
                ((MediaCodec.CryptoInfo) h7b.b).setPattern(pattern);
            }
            long j4 = mx1.b;
            int i8 = (int) (j3 - j4);
            mx1.b = j4 + ((long) i8);
            mx1.a -= i8;
        }
        if (p54.f(268435456)) {
            wpa.D(4);
            qy h3 = h(qyVar, mx1.b, wpa.a, 4);
            int y = wpa.y();
            mx1.b += 4;
            mx1.a -= 4;
            p54.x(y);
            qy g2 = g(h3, mx1.b, p54.X, y);
            mx1.b += (long) y;
            int i9 = mx1.a - y;
            mx1.a = i9;
            ByteBuffer byteBuffer = p54.s0;
            if (byteBuffer == null || byteBuffer.capacity() < i9) {
                p54.s0 = ByteBuffer.allocate(i9);
            } else {
                p54.s0.clear();
            }
            return g(g2, mx1.b, p54.s0, mx1.a);
        }
        p54.x(mx1.a);
        return g(qyVar, mx1.b, p54.X, mx1.a);
    }

    public void a(qy qyVar) {
        if (((vc) qyVar.o) != null) {
            n64 n64 = (n64) this.d;
            synchronized (n64) {
                qy qyVar2 = qyVar;
                while (qyVar2 != null) {
                    try {
                        int i = n64.f;
                        n64.f = i + 1;
                        vc vcVar = (vc) qyVar2.o;
                        vcVar.getClass();
                        ((vc[]) n64.g)[i] = vcVar;
                        n64.e--;
                        qyVar2 = (qy) qyVar2.X;
                        if (qyVar2 == null || ((vc) qyVar2.o) == null) {
                            qyVar2 = null;
                        }
                    } finally {
                        while (true) {
                        }
                    }
                }
                n64.notifyAll();
            }
            qyVar.o = null;
            qyVar.X = null;
        }
    }

    public void b(qy qyVar) {
        if (((wc) qyVar.o) != null) {
            n64 n64 = (n64) this.d;
            synchronized (n64) {
                qy qyVar2 = qyVar;
                while (qyVar2 != null) {
                    try {
                        int i = n64.f;
                        n64.f = i + 1;
                        wc wcVar = (wc) qyVar2.o;
                        wcVar.getClass();
                        ((wc[]) n64.g)[i] = wcVar;
                        n64.e--;
                        qyVar2 = (qy) qyVar2.X;
                        if (qyVar2 == null || ((wc) qyVar2.o) == null) {
                            qyVar2 = null;
                        }
                    } finally {
                        while (true) {
                        }
                    }
                }
                n64.notifyAll();
            }
            qyVar.o = null;
            qyVar.X = null;
        }
    }

    public final void c(long j) {
        switch (this.a) {
            case 0:
                if (j != -1) {
                    while (true) {
                        qy qyVar = (qy) this.f;
                        if (j >= qyVar.c) {
                            n64 n64 = (n64) this.d;
                            vc vcVar = (vc) qyVar.o;
                            synchronized (n64) {
                                int i = n64.f;
                                n64.f = i + 1;
                                ((vc[]) n64.g)[i] = vcVar;
                                n64.e--;
                                n64.notifyAll();
                            }
                            qy qyVar2 = (qy) this.f;
                            qyVar2.o = null;
                            qyVar2.X = null;
                            this.f = (qy) qyVar2.X;
                        } else if (((qy) this.g).b < qyVar.b) {
                            this.g = qyVar;
                            return;
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            default:
                if (j != -1) {
                    while (true) {
                        qy qyVar3 = (qy) this.f;
                        if (j >= qyVar3.c) {
                            n64 n642 = (n64) this.d;
                            wc wcVar = (wc) qyVar3.o;
                            synchronized (n642) {
                                int i2 = n642.f;
                                n642.f = i2 + 1;
                                ((wc[]) n642.g)[i2] = wcVar;
                                n642.e--;
                                n642.notifyAll();
                            }
                            qy qyVar4 = (qy) this.f;
                            qyVar4.o = null;
                            qyVar4.X = null;
                            this.f = (qy) qyVar4.X;
                        } else if (((qy) this.g).b < qyVar3.b) {
                            this.g = qyVar3;
                            return;
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
        }
    }

    public final int d(int i) {
        vc vcVar;
        wc wcVar;
        switch (this.a) {
            case 0:
                qy qyVar = (qy) this.h;
                if (((vc) qyVar.o) == null) {
                    n64 n64 = (n64) this.d;
                    synchronized (n64) {
                        try {
                            int i2 = n64.e + 1;
                            n64.e = i2;
                            int i3 = n64.f;
                            if (i3 > 0) {
                                int i4 = i3 - 1;
                                n64.f = i4;
                                vcVar = ((vc[]) n64.g)[i4];
                                vcVar.getClass();
                                ((vc[]) n64.g)[n64.f] = null;
                            } else {
                                vc vcVar2 = new vc(0, new byte[n64.c]);
                                vc[] vcVarArr = (vc[]) n64.g;
                                if (i2 > vcVarArr.length) {
                                    n64.g = (vc[]) Arrays.copyOf(vcVarArr, vcVarArr.length * 2);
                                }
                                vcVar = vcVar2;
                            }
                        } catch (Throwable th) {
                            while (true) {
                                throw th;
                                break;
                            }
                        }
                    }
                    qy qyVar2 = new qy(this.b, 4, ((qy) this.h).c);
                    qyVar.o = vcVar;
                    qyVar.X = qyVar2;
                }
                return Math.min(i, (int) (((qy) this.h).c - this.c));
            default:
                qy qyVar3 = (qy) this.h;
                if (((wc) qyVar3.o) == null) {
                    n64 n642 = (n64) this.d;
                    synchronized (n642) {
                        try {
                            int i5 = n642.e + 1;
                            n642.e = i5;
                            int i6 = n642.f;
                            if (i6 > 0) {
                                int i7 = i6 - 1;
                                n642.f = i7;
                                wcVar = ((wc[]) n642.g)[i7];
                                wcVar.getClass();
                                ((wc[]) n642.g)[n642.f] = null;
                            } else {
                                wc wcVar2 = new wc(0, new byte[n642.c]);
                                wc[] wcVarArr = (wc[]) n642.g;
                                if (i5 > wcVarArr.length) {
                                    n642.g = (wc[]) Arrays.copyOf(wcVarArr, wcVarArr.length * 2);
                                }
                                wcVar = wcVar2;
                            }
                        } catch (Throwable th2) {
                            while (true) {
                                throw th2;
                                break;
                            }
                        }
                    }
                    qy qyVar4 = new qy(this.b, 5, ((qy) this.h).c);
                    qyVar3.o = wcVar;
                    qyVar3.X = qyVar4;
                }
                return Math.min(i, (int) (((qy) this.h).c - this.c));
        }
    }

    public xqc(n64 n64, byte b2) {
        this.d = n64;
        int i = n64.c;
        this.b = i;
        this.e = new wpa(32);
        qy qyVar = new qy(i, 5, 0);
        this.f = qyVar;
        this.g = qyVar;
        this.h = qyVar;
    }
}
