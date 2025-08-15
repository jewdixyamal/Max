package defpackage;

/* renamed from: ig3  reason: default package */
public final class ig3 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jg3 b;
    public final /* synthetic */ gg3 c;

    public /* synthetic */ ig3(jg3 jg3, gg3 gg3, int i) {
        this.a = i;
        this.b = jg3;
        this.c = gg3;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                m56 onAnimationEnded = this.b.getOnAnimationEnded();
                if (onAnimationEnded != null) {
                    onAnimationEnded.invoke(this.c);
                }
                return e5f.a;
            case 1:
                m56 onAnimationEnded2 = this.b.getOnAnimationEnded();
                if (onAnimationEnded2 != null) {
                    onAnimationEnded2.invoke(this.c);
                }
                return e5f.a;
            default:
                jg3 jg3 = this.b;
                jg3.L0();
                m56 onAnimationEnded3 = jg3.getOnAnimationEnded();
                if (onAnimationEnded3 != null) {
                    onAnimationEnded3.invoke(this.c);
                }
                return e5f.a;
        }
    }
}
