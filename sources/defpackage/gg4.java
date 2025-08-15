package defpackage;

import java.util.zip.Deflater;

/* renamed from: gg4  reason: default package */
public final class gg4 implements ksd {
    public final /* synthetic */ int a = 0;
    public boolean b;
    public final Object c;
    public final Object o;

    public gg4(bt0 bt0, Deflater deflater) {
        this.c = new x7c(bt0);
        this.o = deflater;
    }

    public final void N(bt0 bt0, long j) {
        Object obj = this.o;
        switch (this.a) {
            case 0:
                hm9.g(bt0.b, 0, j);
                while (j > 0) {
                    k2d k2d = bt0.a;
                    int min = (int) Math.min(j, (long) (k2d.c - k2d.b));
                    ((Deflater) obj).setInput(k2d.a, k2d.b, min);
                    a(false);
                    long j2 = (long) min;
                    bt0.b -= j2;
                    int i = k2d.b + min;
                    k2d.b = i;
                    if (i == k2d.c) {
                        bt0.a = k2d.a();
                        b3d.a(k2d);
                    }
                    j -= j2;
                }
                return;
            default:
                if (!this.b) {
                    long j3 = bt0.b;
                    byte[] bArr = naf.a;
                    if (j < 0 || 0 > j3 || j3 < j) {
                        throw new ArrayIndexOutOfBoundsException();
                    }
                    ((eu0) ((x8) obj).Y).N(bt0, j);
                    return;
                }
                throw new IllegalStateException("closed".toString());
        }
    }

    public void a(boolean z) {
        k2d r0;
        int i;
        eu0 eu0 = (eu0) this.c;
        bt0 buffer = eu0.getBuffer();
        while (true) {
            r0 = buffer.r0(1);
            Deflater deflater = (Deflater) this.o;
            byte[] bArr = r0.a;
            if (z) {
                int i2 = r0.c;
                i = deflater.deflate(bArr, i2, 8192 - i2, 2);
            } else {
                int i3 = r0.c;
                i = deflater.deflate(bArr, i3, 8192 - i3);
            }
            if (i > 0) {
                r0.c += i;
                buffer.b += (long) i;
                eu0.E();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (r0.b == r0.c) {
            buffer.a = r0.a();
            b3d.a(r0);
        }
    }

    public final void close() {
        switch (this.a) {
            case 0:
                Deflater deflater = (Deflater) this.o;
                if (!this.b) {
                    try {
                        deflater.finish();
                        a(false);
                        th = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        deflater.end();
                    } catch (Throwable th2) {
                        if (th == null) {
                            th = th2;
                        }
                    }
                    try {
                        ((eu0) this.c).close();
                    } catch (Throwable th3) {
                        if (th == null) {
                            th = th3;
                        }
                    }
                    this.b = true;
                    if (th != null) {
                        throw th;
                    }
                    return;
                }
                return;
            default:
                if (!this.b) {
                    this.b = true;
                    x8 x8Var = (x8) this.o;
                    x8Var.getClass();
                    t06 t06 = (t06) this.c;
                    oue oue = t06.e;
                    t06.e = oue.d;
                    oue.a();
                    oue.b();
                    x8Var.a = 3;
                    return;
                }
                return;
        }
    }

    public final void flush() {
        switch (this.a) {
            case 0:
                a(true);
                ((eu0) this.c).flush();
                return;
            default:
                if (!this.b) {
                    ((eu0) ((x8) this.o).Y).flush();
                    return;
                }
                return;
        }
    }

    public final oue p() {
        switch (this.a) {
            case 0:
                return ((eu0) this.c).p();
            default:
                return (t06) this.c;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "DeflaterSink(" + ((eu0) this.c) + ')';
            default:
                return super.toString();
        }
    }

    public gg4(x8 x8Var) {
        this.o = x8Var;
        this.c = new t06(((eu0) x8Var.Y).p());
    }
}
