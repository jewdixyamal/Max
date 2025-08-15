package defpackage;

import java.nio.ByteBuffer;

/* renamed from: dt3  reason: default package */
public interface dt3 {
    static long a(dt3 dt3) {
        byte[] bArr = (byte[]) ((b94) dt3).b.get("exo_len");
        if (bArr != null) {
            return ByteBuffer.wrap(bArr).getLong();
        }
        return -1;
    }
}
