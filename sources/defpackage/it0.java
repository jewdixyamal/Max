package defpackage;

import java.nio.ByteBuffer;

/* renamed from: it0  reason: default package */
public final class it0 {
    public static final khe h = new khe(new m(23));
    public final String a;
    public final boolean b;
    public final ct0 c;
    public final int d = 17408;
    public final String e;
    public ByteBuffer f;
    public int g;

    public it0(String str, boolean z, ct0 ct0) {
        this.a = str;
        this.b = z;
        this.c = ct0;
        this.e = rh4.j(it0.class.getName(), "/", str);
        this.g = 4096;
    }

    public final boolean a() {
        if (this.f == null) {
            return false;
        }
        this.c.b(e());
        this.f = null;
        return true;
    }

    public final void b() {
        if (this.f != null) {
            ByteBuffer e2 = e();
            int capacity = e2.capacity();
            String str = this.a;
            int i = this.d;
            if (capacity < i) {
                int min = Math.min(e2.capacity() * 2, i);
                int capacity2 = e2.capacity();
                hm9.m(this.e, "enlarging buffer " + str + ", increasing from " + capacity2 + " to " + min, new Object[0]);
                ct0 ct0 = this.c;
                ByteBuffer a2 = ct0.a(min);
                ByteBuffer e3 = e();
                e3.flip();
                a2.put(e3);
                if (this.b) {
                    f(0);
                }
                ct0.b(e3);
                this.f = a2;
                this.g = min;
                return;
            }
            int capacity3 = e2.capacity();
            throw new IllegalStateException((str + " buffer insufficient despite having capacity of " + capacity3).toString());
        }
    }

    public final void c() {
        if (this.f == null) {
            this.f = this.c.a(this.g);
        }
    }

    public final boolean d() {
        ByteBuffer byteBuffer = this.f;
        if (byteBuffer == null || byteBuffer.position() != 0) {
            return false;
        }
        return a();
    }

    public final ByteBuffer e() {
        ByteBuffer byteBuffer = this.f;
        if (byteBuffer != null) {
            return byteBuffer;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final void f(int i) {
        if (this.f != null) {
            ByteBuffer e2 = e();
            e2.mark();
            e2.position(i);
            int remaining = e2.remaining();
            khe khe = h;
            int min = Math.min(remaining, ((byte[]) khe.getValue()).length);
            int i2 = 0;
            while (min > 0) {
                e2.put((byte[]) khe.getValue(), 0, min);
                i2 += min;
                min = Math.min(remaining - i2, ((byte[]) khe.getValue()).length);
            }
            e2.reset();
        }
    }

    public final String toString() {
        ByteBuffer byteBuffer = this.f;
        int i = this.g;
        StringBuilder sb = new StringBuilder("BufferHolder{name='");
        sb.append(this.a);
        sb.append("', allocator=");
        sb.append(this.c);
        sb.append(", plainData=");
        sb.append(this.b);
        sb.append(", maxSize=");
        sb.append(this.d);
        sb.append(", buffer=");
        sb.append(byteBuffer);
        sb.append(", lastSize=");
        return zr6.j(sb, i, "}");
    }
}
