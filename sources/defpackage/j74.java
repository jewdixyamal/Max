package defpackage;

import java.nio.ByteBuffer;

/* renamed from: j74  reason: default package */
public final class j74 {
    public long a;
    public final j60 b;
    public final f42 c;
    public final /* synthetic */ k74 d;

    public j74(k74 k74, j60 j60, f42 f42, long j) {
        this.d = k74;
        this.b = j60;
        this.a = j;
        this.c = f42;
    }

    public final void a(long j, ByteBuffer byteBuffer) {
        fm9.f(j >= this.a);
        byteBuffer.position((((int) (j - this.a)) * this.b.d) + byteBuffer.position());
        this.a = j;
    }
}
