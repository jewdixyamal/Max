package defpackage;

import java.nio.ByteBuffer;

/* renamed from: ct3  reason: default package */
public interface ct3 {
    static long a(ct3 ct3) {
        byte[] bArr = (byte[]) ((a94) ct3).b.get("exo_len");
        if (bArr != null) {
            return ByteBuffer.wrap(bArr).getLong();
        }
        return -1;
    }
}
