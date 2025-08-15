package defpackage;

import com.facebook.imagepipeline.memory.MemoryPooledByteBufferOutputStream$InvalidStreamException;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: rq8  reason: default package */
public final class rq8 extends OutputStream {
    public final pq8 a;
    public v84 b;
    public int c;

    public rq8(pq8 pq8, int i) {
        if (i > 0) {
            this.a = pq8;
            this.c = 0;
            this.b = o43.p0(pq8.get(i), pq8, o43.Y);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final void close() {
        o43.S(this.b);
        this.b = null;
        this.c = -1;
        m();
    }

    public final void m() {
        try {
            super.close();
        } catch (IOException e) {
            nu0.H(e);
            throw null;
        }
    }

    public final qq8 n() {
        if (o43.n0(this.b)) {
            v84 v84 = this.b;
            if (v84 != null) {
                return new qq8(this.c, v84);
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
        throw new MemoryPooledByteBufferOutputStream$InvalidStreamException();
    }

    public final void write(int i) {
        write(new byte[]{(byte) i});
    }

    public final void write(byte[] bArr, int i, int i2) {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            StringBuilder j = wg0.j("length=", bArr.length, "; regionStart=", i, "; regionLength=");
            j.append(i2);
            throw new ArrayIndexOutOfBoundsException(j.toString());
        } else if (o43.n0(this.b)) {
            int i3 = this.c + i2;
            if (o43.n0(this.b)) {
                v84 v84 = this.b;
                if (v84 != null) {
                    if (i3 > ((oq8) v84.e0()).getSize()) {
                        pq8 pq8 = this.a;
                        oq8 oq8 = (oq8) pq8.get(i3);
                        v84 v842 = this.b;
                        if (v842 != null) {
                            ((oq8) v842.e0()).n(oq8, this.c);
                            this.b.close();
                            this.b = o43.p0(oq8, pq8, o43.Y);
                        } else {
                            throw new IllegalStateException("Required value was null.".toString());
                        }
                    }
                    v84 v843 = this.b;
                    if (v843 != null) {
                        ((oq8) v843.e0()).U(this.c, i, i2, bArr);
                        this.c += i2;
                        return;
                    }
                    throw new IllegalStateException("Required value was null.".toString());
                }
                throw new IllegalStateException("Required value was null.".toString());
            }
            throw new MemoryPooledByteBufferOutputStream$InvalidStreamException();
        } else {
            throw new MemoryPooledByteBufferOutputStream$InvalidStreamException();
        }
    }

    public rq8(pq8 pq8) {
        this(pq8, pq8.v0[0]);
    }
}
