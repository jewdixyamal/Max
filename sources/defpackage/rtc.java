package defpackage;

/* renamed from: rtc  reason: default package */
public final class rtc extends rd7 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ je7 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rtc(int i, je7 je7) {
        super(0);
        this.a = i;
        this.b = je7;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return ((ynf) this.b.getValue()).w();
            default:
                ynf ynf = (ynf) this.b.getValue();
                pi6 pi6 = ynf instanceof pi6 ? (pi6) ynf : null;
                return pi6 != null ? pi6.p() : jz3.b;
        }
    }
}
