package defpackage;

import com.fasterxml.jackson.core.exc.StreamReadException;

/* renamed from: bb7  reason: default package */
public final class bb7 extends fb7 {
    public final bb7 c;
    public final m5d d;
    public bb7 e;
    public String f;
    public int g;
    public int h;

    public bb7(bb7 bb7, m5d m5d, int i, int i2, int i3) {
        this.c = bb7;
        this.d = m5d;
        this.a = i;
        this.g = i2;
        this.h = i3;
        this.b = -1;
    }

    public final String a() {
        return this.f;
    }

    public final bb7 f(int i, int i2) {
        bb7 bb7 = this.e;
        m5d m5d = null;
        if (bb7 == null) {
            m5d m5d2 = this.d;
            if (m5d2 != null) {
                m5d = new m5d(8, m5d2.c);
            }
            bb7 = new bb7(this, m5d, 1, i, i2);
            this.e = bb7;
        } else {
            bb7.a = 1;
            bb7.b = -1;
            bb7.g = i;
            bb7.h = i2;
            bb7.f = null;
            m5d m5d3 = bb7.d;
            if (m5d3 != null) {
                m5d3.b = null;
                m5d3.o = null;
                m5d3.X = null;
            }
        }
        return bb7;
    }

    public final bb7 g(int i, int i2) {
        bb7 bb7 = this.e;
        m5d m5d = null;
        if (bb7 == null) {
            m5d m5d2 = this.d;
            if (m5d2 != null) {
                m5d = new m5d(8, m5d2.c);
            }
            bb7 bb72 = new bb7(this, m5d, 2, i, i2);
            this.e = bb72;
            return bb72;
        }
        bb7.a = 2;
        bb7.b = -1;
        bb7.g = i;
        bb7.h = i2;
        bb7.f = null;
        m5d m5d3 = bb7.d;
        if (m5d3 != null) {
            m5d3.b = null;
            m5d3.o = null;
            m5d3.X = null;
        }
        return bb7;
    }

    public final void h(String str) {
        this.f = str;
        m5d m5d = this.d;
        if (m5d != null && m5d.F(str)) {
            Object obj = m5d.c;
            throw new StreamReadException(obj instanceof ab7 ? (ab7) obj : null, zr6.i("Duplicate field '", str, "'"));
        }
    }
}
