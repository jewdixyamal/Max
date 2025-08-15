package defpackage;

/* renamed from: b75  reason: default package */
public final /* synthetic */ class b75 implements jm7, km7, pj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;

    public /* synthetic */ b75(int i, float f) {
        this.a = i;
        this.b = f;
    }

    public void accept(Object obj) {
        x4b x4b = (x4b) obj;
        switch (this.a) {
            case 3:
                x4b.setPlaybackSpeed(this.b);
                return;
            default:
                x4b.g(this.b);
                return;
        }
    }

    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((m3b) obj).f(this.b);
                return;
            case 1:
                ((n3b) obj).f(this.b);
                return;
            default:
                ((n3b) obj).f(this.b);
                return;
        }
    }
}
