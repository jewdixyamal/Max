package defpackage;

/* renamed from: v36  reason: default package */
public final /* synthetic */ class v36 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ die b;

    public /* synthetic */ v36(die die, int i) {
        this.a = i;
        this.b = die;
    }

    public final Object invoke() {
        die die = this.b;
        switch (this.a) {
            case 0:
                return ((iba) ((je7) die.a).getValue()).c();
            case 1:
                return ((iba) ((je7) die.a).getValue()).a();
            case 2:
                return ((iba) ((je7) die.a).getValue()).a();
            default:
                int availableProcessors = Runtime.getRuntime().availableProcessors();
                iba iba = (iba) ((je7) die.a).getValue();
                bc7[] bc7Arr = iba.p;
                return iba.h(iba.f(availableProcessors, "frsc-sch", availableProcessors, 5), "frsc-sch");
        }
    }
}
