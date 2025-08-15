package defpackage;

/* renamed from: n07  reason: default package */
public final class n07 extends qw8 {
    public m07[] a;

    public n07() {
        if (m07.u == null) {
            synchronized (y37.b) {
                try {
                    if (m07.u == null) {
                        m07.u = new m07[0];
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.a = m07.u;
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        m07[] m07Arr = this.a;
        int i = 0;
        if (m07Arr == null || m07Arr.length <= 0) {
            return 0;
        }
        int i2 = 0;
        while (true) {
            m07[] m07Arr2 = this.a;
            if (i >= m07Arr2.length) {
                return i2;
            }
            m07 m07 = m07Arr2[i];
            if (m07 != null) {
                i2 = y43.i(1, m07) + i2;
            }
            i++;
        }
    }

    public final qw8 mergeFrom(x43 x43) {
        while (true) {
            int s = x43.s();
            if (s == 0) {
                break;
            } else if (s == 10) {
                int w = nd7.w(x43, 10);
                m07[] m07Arr = this.a;
                int length = m07Arr == null ? 0 : m07Arr.length;
                int i = w + length;
                m07[] m07Arr2 = new m07[i];
                if (length != 0) {
                    System.arraycopy(m07Arr, 0, m07Arr2, 0, length);
                }
                while (length < i - 1) {
                    m07 m07 = new m07();
                    m07Arr2[length] = m07;
                    x43.j(m07);
                    x43.s();
                    length++;
                }
                m07 m072 = new m07();
                m07Arr2[length] = m072;
                x43.j(m072);
                this.a = m07Arr2;
            } else if (!x43.u(s)) {
                break;
            }
        }
        return this;
    }

    public final void writeTo(y43 y43) {
        m07[] m07Arr = this.a;
        if (m07Arr != null && m07Arr.length > 0) {
            int i = 0;
            while (true) {
                m07[] m07Arr2 = this.a;
                if (i < m07Arr2.length) {
                    m07 m07 = m07Arr2[i];
                    if (m07 != null) {
                        y43.y(1, m07);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }
}
