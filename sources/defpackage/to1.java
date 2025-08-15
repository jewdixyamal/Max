package defpackage;

/* renamed from: to1  reason: default package */
public final class to1 {
    public static final to1 i = new to1(true, nnf.a, 224);
    public final gg1 a;
    public final gg1 b;
    public final gg1 c;
    public final boolean d;
    public final nnf e;
    public final boolean f;
    public final u9f g;
    public final long h;

    public to1(gg1 gg1, gg1 gg12, gg1 gg13, boolean z, nnf nnf, boolean z2, u9f u9f, long j) {
        this.a = gg1;
        this.b = gg12;
        this.c = gg13;
        this.d = z;
        this.e = nnf;
        this.f = z2;
        this.g = u9f;
        this.h = j;
    }

    public static to1 a(to1 to1, gg1 gg1, gg1 gg12, gg1 gg13, nnf nnf, boolean z, u9f u9f, long j, int i2) {
        to1 to12 = to1;
        int i3 = i2;
        gg1 gg14 = (i3 & 1) != 0 ? to12.a : gg1;
        gg1 gg15 = (i3 & 2) != 0 ? to12.b : gg12;
        gg1 gg16 = (i3 & 4) != 0 ? to12.c : gg13;
        boolean z2 = (i3 & 8) != 0 ? to12.d : false;
        nnf nnf2 = (i3 & 16) != 0 ? to12.e : nnf;
        boolean z3 = (i3 & 32) != 0 ? to12.f : z;
        u9f u9f2 = (i3 & 64) != 0 ? to12.g : u9f;
        long j2 = (i3 & 128) != 0 ? to12.h : j;
        to1.getClass();
        return new to1(gg14, gg15, gg16, z2, nnf2, z3, u9f2, j2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof to1)) {
            return false;
        }
        to1 to1 = (to1) obj;
        return tpa.f(this.a, to1.a) && tpa.f(this.b, to1.b) && tpa.f(this.c, to1.c) && this.d == to1.d && this.e == to1.e && this.f == to1.f && this.g == to1.g && this.h == to1.h;
    }

    public final int hashCode() {
        int i2 = 0;
        gg1 gg1 = this.a;
        int hashCode = (gg1 == null ? 0 : gg1.hashCode()) * 31;
        gg1 gg12 = this.b;
        int hashCode2 = (hashCode + (gg12 == null ? 0 : gg12.hashCode())) * 31;
        gg1 gg13 = this.c;
        if (gg13 != null) {
            i2 = gg13.hashCode();
        }
        return Long.hashCode(this.h) + ((this.g.hashCode() + ms2.d((this.e.hashCode() + ms2.d((hashCode2 + i2) * 31, 31, this.d)) * 31, 31, this.f)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallUserState(pinnedOpponentId=");
        sb.append(this.a);
        sb.append(", pipOpponentIdState=");
        sb.append(this.b);
        sb.append(", selectedOpponentId=");
        sb.append(this.c);
        sb.append(", canShowInviteBanner=");
        sb.append(this.d);
        sb.append(", modeView=");
        sb.append(this.e);
        sb.append(", raiseHandOnce=");
        sb.append(this.f);
        sb.append(", vpnNotification=");
        sb.append(this.g);
        sb.append(", lastShowWaitingRoomNotificationTs=");
        return zr6.k(sb, this.h, ")");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ to1(boolean z, nnf nnf, int i2) {
        this((gg1) null, (gg1) null, (gg1) null, (i2 & 8) != 0 ? true : z, (i2 & 16) != 0 ? nnf.a : nnf, false, u9f.o, 0);
    }
}
