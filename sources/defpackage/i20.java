package defpackage;

/* renamed from: i20  reason: default package */
public final class i20 {
    public mqb a;
    public float b;
    public float c;
    public boolean d;

    public i20(int i) {
        switch (i) {
            case 1:
                this.a = mqb.P_2160;
                this.b = 0.0f;
                this.c = 1.0f;
                this.d = false;
                return;
            default:
                this.a = mqb.P_2160;
                return;
        }
    }

    public ref a() {
        return new ref(this);
    }
}
