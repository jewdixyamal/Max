package defpackage;

import android.media.MediaMuxer;
import java.io.IOException;

/* renamed from: lh4  reason: default package */
public final class lh4 implements b66, cj9, lxd {
    public long a;

    public lh4(int i) {
        switch (i) {
            case 4:
                this.a = -9223372036854775807L;
                return;
            default:
                this.a = -1;
                return;
        }
    }

    public fj9 D(String str) {
        try {
            return new h36(new MediaMuxer(str, 0), this.a);
        } catch (IOException e) {
            throw new Exception("Error creating muxer", e);
        }
    }

    public kxd Q() {
        return new wva(this);
    }

    public long a(long j) {
        if (j == -1) {
            this.a = -1;
            return -1;
        }
        long j2 = this.a;
        if (j2 == -1 || j < j2) {
            this.a = j;
            return 0;
        }
        long j3 = j - j2;
        this.a = j;
        return j3;
    }

    public Object apply(Object obj) {
        xlc a2 = xlc.a(1, "SELECT * FROM draft_uploads WHERE chat_id = ?");
        a2.j(1, this.a);
        return new t28(new sp4((tp4) obj, a2, 1));
    }

    public zw6 w(int i) {
        if (i == 2) {
            return h36.s0;
        }
        if (i == 1) {
            return h36.t0;
        }
        ls5 ls5 = zw6.b;
        return ffc.X;
    }
}
