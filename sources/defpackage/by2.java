package defpackage;

import android.os.Bundle;

/* renamed from: by2  reason: default package */
public final class by2 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wm9 b;

    public /* synthetic */ by2(wm9 wm9, int i) {
        this.a = i;
        this.b = wm9;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                tr3 tr3 = tr3.c;
                fyd fyd = (fyd) this.b;
                tr3.Z1(fyd.b, fyd.c);
                return e5f.a;
            case 1:
                ckb ckb = ckb.c;
                mkb mkb = (mkb) this.b;
                long j = mkb.b;
                f64 P1 = ckb.P1();
                P1.b(":call-user?opponent_id=" + j + "&video_enabled=" + mkb.d, (Bundle) null);
                return e5f.a;
            case 2:
                ckb.c.P1().b(":call-join-link?link=".concat(((mkb) this.b).e), (Bundle) null);
                return e5f.a;
            default:
                ckb ckb2 = ckb.c;
                mkb mkb2 = (mkb) this.b;
                long j2 = mkb2.b;
                f64 P12 = ckb2.P1();
                P12.b(":call-chat?chat_id=" + j2 + "&video_enabled=" + mkb2.d, (Bundle) null);
                return e5f.a;
        }
    }
}
