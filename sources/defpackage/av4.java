package defpackage;

import java.util.List;

/* renamed from: av4  reason: default package */
public final /* synthetic */ class av4 implements k56 {
    public final /* synthetic */ List X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ List Z;
    public final /* synthetic */ bv4 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ vx8 s0;

    public /* synthetic */ av4(bv4 bv4, long j, long j2, boolean z, List list, String str, List list2, vx8 vx8) {
        this.a = bv4;
        this.b = j;
        this.c = j2;
        this.o = z;
        this.X = list;
        this.Y = str;
        this.Z = list2;
        this.s0 = vx8;
    }

    public final Object invoke() {
        bv4 bv4 = this.a;
        au8 au8 = bv4.a;
        long j = this.c;
        long j2 = this.b;
        au8.A(j2, j);
        if (this.o) {
            ((k24) au8.a).c.n(j2, new z72(19, this.X));
        }
        bv4.a.z(j2, this.Y, this.Z, bv4.b, this.s0);
        return null;
    }
}
