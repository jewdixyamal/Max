package defpackage;

/* renamed from: f74  reason: default package */
public final /* synthetic */ class f74 implements jm7 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ ilf b;

    public /* synthetic */ f74(ed edVar, ilf ilf) {
        this.b = ilf;
    }

    public final void invoke(Object obj) {
        ilf ilf = this.b;
        switch (this.a) {
            case 0:
                u65 u65 = (u65) obj;
                u65.getClass();
                hm9.m("u65", "videoDebugListener.onVideoSizeChanged: %s", ilf);
                int i = ilf.c;
                int i2 = ilf.b;
                int i3 = ilf.a;
                if (i == 90 || i == 270) {
                    u65.u0 = i2;
                    u65.v0 = i3;
                } else {
                    u65.u0 = i3;
                    u65.v0 = i2;
                }
                u65.w0 = i;
                if (u65.Z != null) {
                    float f = u65.s0 - (1.0f / (((float) i3) / ((float) i2)));
                    if (f == 0.0f || ((double) Math.abs(f)) <= 1.0E-4d) {
                        u65.u0 = i2;
                        u65.v0 = i3;
                    }
                }
                bq7 bq7 = u65.Y;
                if (bq7 != null) {
                    int i4 = u65.u0;
                    int i5 = u65.v0;
                    int i6 = u65.w0;
                    ve8 ve8 = bq7.e;
                    if (ve8 != null) {
                        ve8.P(i4, i5, i6);
                        return;
                    }
                    return;
                }
                return;
            default:
                ((m3b) obj).z(ilf);
                return;
        }
    }

    public /* synthetic */ f74(ilf ilf) {
        this.b = ilf;
    }
}
